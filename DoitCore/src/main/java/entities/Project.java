/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Date;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * Класс, реализующий поля и методы для работы с проектом
 * Наследуется от {@link AbstractTask}
 * @author Anatoly
 */
public class Project extends AbstractTask {
    /** 
     * Коллекция задач ({@link Task})
     * @see Task
     */
    private ArrayList<Task> tasks;
    /**
     * Поле для хранения значения, которое отвечает за доступ к проекту
     * false - создатель, true - группа пользователей
     * @see Access
     */
    private boolean owner;

    /**
     * Устанавливает поля {@link Project#name} и {@link Project#startDate}
     * @param name Имя
     * @param start Дата начала
     */
    public Project(String name, Date start) {
        super(name, start);
        this.owner = false;//по умолчанию доступ имеет только создатель проекта
    }

    /**
     * Редактирование задачи, прикрепленной к проекту
     * @param t 
     * @see Task
     */
    public void editTask(Task t) {
        t.editTask();
    }
    
    /**
     * Удаление задачи, прикрепленной к проекту
     * @param t 
     * @see Task
     */
    public void deleteTask(Task t){
        
    }
    
    /**
     * Добавление задачи к проекту
     * @param t 
     * @see Task
     */
    public void addTask(Task t){
        
    }
}
