/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;


// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * ???
 * <p/>
 * Что это?
 * Кто писал?
 * Зачем это писали?
 */
abstract public class AbstractTask {
    protected String name;
    protected String description;
    protected Date startDate;
    protected Date finishDate;


    // Конструктор 0_о Зачем ????
    AbstractTask(String name, Date dS) {
        this.name = name;
        startDate = dS;
    }

    //TODO: ??? JavaDoc!!!
    public void setName(String name) {

    }

    //TODO: ??? JavaDoc!!!
    public String getName() {
        return this.name;
    }

    //TODO: ??? JavaDoc!!!
    public String getDescription() {
        return this.description;
    }

    //TODO: ??? JavaDoc!!!
    public void setDescription(String descr) {

    }

    //TODO: ??? JavaDoc!!!
    public Date getStartDate() {
        return this.startDate;
    }

    //TODO: ??? JavaDoc!!!
    public Date getFinishDate() {
        return this.finishDate;
    }

    //TODO: ??? JavaDoc!!! dE ???
    public void setFinishDate(Date dE) {
        this.finishDate = dE;
    }
}
