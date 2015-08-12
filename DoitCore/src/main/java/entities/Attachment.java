/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * Абстрактный класс, описывает общие поля и методы для работы с прикреплениями
 * @author Anatoly
 */
public abstract class Attachment {
    /**
     * Имя прикрепления
     */
    protected String name;

    /**
     * Инициализирует поле {@link Attachment#name}
     * @param name Имя прикрепления
     * @see Attachment
     */
    protected Attachment(String name) {
        setName(name);
    }

    /**
     * Редактирование прикрепления
     */
    public void editAttachment() {
        
    }
    
    /**
     * Удаление прикрепления
     */
    public void deleteAttachment(){
        
    }
    
    /**
     * Возвращает имя прикрепления
     * @return Имя прикрепления
     */
    public final String getName(){
        return name;
    }
    
    /**
     * Позволяет задать имя прикрепления
     * @param nameString Новое имя прикрепления
     */
    public final void setName(String nameString){
        this.name = nameString;
    }
}

