/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doit.core.entites;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * Класс, реализующий поля и методы для работы с проектом
 * Наследуется от {@link DoitAbstractTask}
 * @author Anatoly
 */
@XmlRootElement
public class DoitProject extends DoitAbstractTask {
    /** 
     * Коллекция задач ({@link DoitTask})
     * @see DoitTask
     */
    protected List<DoitAbstractTask> projectTasks;


    public DoitProject(String projectName) {
        this.name = projectName;
        this.projectTasks = new ArrayList<DoitAbstractTask>();
    }

    public DoitProject(String projectName, String description, Date startDate) {
        this.name = projectName;
        this.description = description;
        this.startDate = startDate;
        this.projectTasks = new ArrayList<DoitAbstractTask>();
    }

    public DoitProject(String projectName, String description, Date startDate, Date finishDate) {
        this.name = projectName;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.projectTasks = new ArrayList<DoitAbstractTask>();
    }



    /**
     * Поле для хранения значения, которое отвечает за доступ к проекту
     * false - создатель, true - группа пользователей
     *
     * TODO: O_o - что тут имелось ввиду?
     */
    private boolean owner;

    /**
     * Устанавливает поля {@link DoitProject#name} и {@link DoitProject#startDate}
     * @param projectName Short project name
     * @param startDate Start date
     */
    public DoitProject(String projectName, Date startDate) {
        this.name = projectName;
        this.startDate = startDate;

        // TODO: O_o - что тут имелось ввиду?
        this.owner = false;//по умолчанию доступ имеет только создатель проекта
    }



    /**
     * Редактирование задачи, прикрепленной к проекту
     * @param t 
     * @see DoitTask
     */
    public void editTask(DoitTask t) {
        t.editTask();
    }
    
    /**
     * Удаление задачи, прикрепленной к проекту
     * @param t 
     * @see DoitTask
     */
    public void deleteTask(DoitTask t){
        
    }
    
    /**
     * Добавление задачи к проекту
     * @param task
     * @see DoitTask
     */
    @XmlElement
    public void addTask(DoitAbstractTask task){
        this.projectTasks.add(task);
    }

    /**
     * @return list of all subtasks in project
     */
    @XmlElementWrapper(name = "subtasks")
    @XmlElement(name = "subtask")
    public List<DoitAbstractTask> getProjectTasks() {
        return projectTasks;
    }
}
