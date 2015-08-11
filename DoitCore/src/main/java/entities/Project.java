/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
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
enum Access {
    self, group
}


/**
 * ???
 * <p/>
 * Что это?
 * Кто писал?
 * Зачем это писали?
 */
public class Project extends AbstractTask {
    private List<Task> tasks;
    private Access owner;

    //TODO: ??? JavaDoc!!!
    //TODO: зачем? Какая область видимости?
    Project(String name, Date dS) {
        super(name, dS);
        //this.owner = ;
    }

    //TODO: ??? JavaDoc!!!
    public void addTask(Task t) {

    }
}
