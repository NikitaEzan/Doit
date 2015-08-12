package doit.core.entites;

import java.util.Date;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * Класс для хранения и работы с задачей
 * @author Anatoly
 */
public class DoitTask extends DoitAbstractTask {
    /** Степень важности задачи */
    private short impDeg;
    /** Статус завершения задачи */
    private boolean complete = false;
    /** Прикрепление */
    private DoitAttachment attachment;

    /**
     * Инициализация полей {@link DoitTask#name}, {@link DoitTask#startDate}, {@link DoitTask#attachment}
     * @param name Имя
     * @param start Дата начала
     * @param attachment Прикрепление
     */
    public DoitTask(String name, Date start, DoitAttachment attachment) {
        this.name = name;
        this.startDate = start;
        this.attachmentList.add(attachment);
    }
    public DoitTask(String name, Date start) {
        this.name = name;
        this.startDate = start;
    }
    public DoitTask(String description) {
        this.name = description;
    }

    /**
     * Изменение степени важности задачи
     * @param imDeg 
     */
    public void setImportance(short imDeg) {
        this.impDeg = imDeg;
    }

    /**
     * Возвращает степень важности задачи
     * @param imDeg
     * @return Целое число - степень важности
     */
    public short getImportance(short imDeg) {
        return this.impDeg;
    }

    /**
     * Статус завершения задачи
     * @return false - не завершена, true - завершена
     */
    public boolean isComplete() {
        return this.complete;
    }

    /**
     * Изменение статуса завершения задачи
     */
    public void switchComplete() {
        this.complete = !this.complete;
    }

    /**
     * Удаление прикрепления
     */
    public final void deleteAttachment() {

    }

    /**
     * Добавление прикрепления
     * @param attachment
     */
    public final void addAttachment(DoitAttachment attachment) {
        this.attachment = attachment;
    }
    
    /**
     * Редактирование задачи
     */
    @Override
    public void editTask(){
        
    }
}
