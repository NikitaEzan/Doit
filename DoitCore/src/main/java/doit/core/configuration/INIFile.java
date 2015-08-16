package doit.core.configuration;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Класс для работы с файлами формата ***.ini
 * @author ekaterina
 */
public class INIFile {
    /**
     * Храним все данные
     */
    Properties iniProperty = new Properties();


    /**
     * Конструктор класса
     * Передаем путь к файлу в формате: src/main/java/resources/***.ini
     *
     * @param fileName путь к файлу в формате "src/main/java/resources/***.ini"
     *
     */
    public INIFile(String fileName) throws IOException{
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName))); //Читаем файл в формате src/main/java/resources/file.ini

        try{
            String section = "";
            String line;

            while((line = br.readLine()) != null){//До тех пор пока что-то есть читаем по строчке
                if(line.startsWith(";")) continue; //Комментарии в формате .ini ставятся за ';'

                if(line.startsWith("[")){ //Если с [
                    section = line.substring(1, line.lastIndexOf("]")).trim();//Обрезаем line с [ до ] и убираем пробелы
                    continue;
                }
                addProperty(section,line);
            }
        }finally {
            br.close();
        }
    }

    /**
     *
     * @param section Имя секции
     * @param line Данные этой секции
     */
    private void addProperty(String section, String line) {
        int equalIndex = line.indexOf("=");//Получаем ближайший индекс "="

        if(equalIndex > 0){
            String name = section + '.' + line.substring(0,equalIndex).trim();//Получаем данные в формате SECTION.PROPERTY
            String value = line.substring(equalIndex + 1).trim();//Получаем значение
            iniProperty.put(name, value);//Заносим значения
        }
    }

    /**
     * Для String переменных в .ini файле (С стандартным значением)
     * @param section Секция
     * @param var Переменная
     * @param def Если нет значения то вернуть (Стандартно)
     * @return String значение переменной в этой секции
     */
    public String getProperty(String section, String var, String def){//Format: Section, Variable, ifNotFound
        return iniProperty.getProperty(section + '.' + var, def);
    }


    /**
     * Для Integer переменных в .ini файле (С стандартным значением)
     * @param section Секция
     * @param var Переменная
     * @param def Стандартно
     * @return int значение переменной в этой секции
     */
    public int getProperty(String section, String var, int def){
        String sVal = iniProperty.getProperty(section + '.' + var, Integer.toString(def));

        return Integer.decode(sVal).intValue();
    }


    /**
     * @param section Секция
     * @param var Переменная
     * @param def Стандартное значение
     * @return boolean значение
     */
    public boolean getProperty(String section, String var, boolean def){
        String sVal = iniProperty.getProperty(section + '.' + var, def ? "True" : "False");

        return sVal.equalsIgnoreCase("Yes") || sVal.equalsIgnoreCase("True");//Если equals то возвратит true
    }

    /**
     * Для переменных в .ini файле (Без стандартного значения)
     * @param section Секция
     * @param var Переменная
     * @return Значения переменной в этой секции
     */
    public String getProperty(String section, String var){
        return iniProperty.getProperty(section + '.' + var);
    }
}
