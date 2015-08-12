/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doit.core.entites;

// REVIEW DATE: 12.08.2015
// REVIEWER: ALMAZ


import java.io.File;

/**
 * Используется для хранения и работы с прикреплением типа File
 * @author Anatoly
 */
public class DoitAttachment extends File{
    /**
     * Ссылка на файл
     */
    private File file;
    private String name;

    /**
     * Инициализирует поля {@link DoitAttachment} и {@link DoitAttachment#file}
     * @param name Имя прикрепления
     * @param file Ссылка на файл-прикрепление
     * @see DoitAttachment
     */
    public DoitAttachment(String name, File file) {
        super(file.toURI());
        this.name = name;
        this.file = file;
    }


    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
