/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


// REVIEW DATE: 12.08.2015
// REVIEWER: ALMAZ


/**
 * Абстрактный класс, описывает общие поля и методы для работы с прикреплениями
 * @author Anatoly
 */
public abstract class AbstractAttachment {
    /**
     * Имя прикрепления
     */
    protected String name;

    /**
     * Инициализирует поле {@link AbstractAttachment#name}
     * @param name Имя прикрепления
     * @see AbstractAttachment
     */
    protected AbstractAttachment(String name) {
        setName(name);
    }

    /**
     * Редактирование прикрепления
     */
    public void editAttachment() {
        
    }
    
    /**
     * TODO: Как будет удаляться? По каким критериям?
     * Удаление прикрепления
     */
    public void deleteAttachment(){
        
    }
    
    /**
     * Возвращает имя прикрепления
     * @return Имя прикрепления
     * TODO: О_о почему final ?
     */
    public final String getName(){
        return name;
    }
    
    /**
     * Позволяет задать имя прикрепления
     * @param nameString Новое имя прикрепления
     *
     * TODO: О_о почему final ?
     * TODO: а если я null передам, то что будет?
     */
    public final void setName(String nameString){
        this.name = nameString;
    }
}

