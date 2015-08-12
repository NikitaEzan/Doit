/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doit.core.entites;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


// REVIEW DATE: 12.08.2015
// REVIEWER: ALMAZ


/**
 * Абстрактный класс, описывающий общие поля и методы, для работы с задачами
 * @author Anatoly
 */
@XmlRootElement
public abstract class DoitAbstractTask {
    /** Имя */
    protected String name;
    /** Описание */
    protected String description;
    /** Дата начала */
    protected Date startDate;
    /** Дата завершения */
    protected Date finishDate;

    protected List<DoitAttachment> attachmentList;

    // TODO: Describe this function here, please
    protected void addAttachment(DoitAttachment attachment){
        this.attachmentList.add(attachment);
    }
    // TODO: Describe this function here, please
    protected void removeAttachment(DoitAttachment attachment){
        this.attachmentList.remove(attachment);
    }
    // TODO: Describe this function here, please
    protected List<DoitAttachment> getAttachments(){
        return attachmentList;
    }


    protected DoitAbstractTask() {
        this.attachmentList = new ArrayList<DoitAttachment>();
    }

    /**
     * Редактирование
     *
     * TODO: O_o - и как собрался редактировать таску?
     */
    public void editTask(){
        
    }
    
    /**
     * Изменение имени
     * final - для невозможности переопределния в дочерних классах
     * @param name Новое имя
     *
     * TODO: а если я null передам, то что будет?
     */
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получение имени
     * final - для невозможности переопределния в дочерних классах
     * @return Имя
     *
     * TODO: О_о почему final ?
     */
    public String getName() {
        return this.name;
    }

    /**
     * Возвращает описание
     * final - для невозможности переопределния в дочерних классах
     * @return Описание
     *
     * TODO: О_о почему final ?
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Позволяет именить описание ({@link DoitAbstractTask#description})
     * final - для невозможности переопределния в дочерних классах
     * @param descr Новое описание
     *
     * TODO: О_о почему final ?
     * TODO: а если я null передам, то что будет?
     */
    @XmlElement
    public void setDescription(String descr) {
        this.description = descr;
    }

    /**
     * Возвращает объект Date - дата начала
     * final - для невозможности переопределния в дочерних классах
     * @return Дата начала
     * TODO: О_о почему final ?
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Возвращает объект Date - дата завершения
     * final - для невозможности переопределния в дочерних классах
     * @return Дата завершения
     *
     * TODO: О_о почему final ?
     */
    public Date getFinishDate() {
        return this.finishDate;
    }


    /**
     * Позволяет изменить дату завершения
     * final - для невозможности переопределния в дочерних классах
     * @param finish Дата завершения
     *
     * TODO: О_о почему final ?
     * TODO: а если я null передам, то что будет?
     */
    @XmlElement
    public void setFinishDate(Date finish) {
        this.finishDate = finish;
    }


}
