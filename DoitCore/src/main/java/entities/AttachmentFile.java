/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * Используется для хранения и работы с прикреплением типа File
 * Наследуется от {@link Attachment}
 * @author Anatoly
 */
public class AttachmentFile extends Attachment {
    /**
     * Ссылка на файл
     */
    private Object filePath;

    /**
     * Инициализирует поля {@link AttachmentFile#name} и {@link AttachmentFile#filePath}
     * @param name Имя прикрепления
     * @param file Ссылка на файл-прикрепление
     * @see AttachmentFile
     */
    public AttachmentFile(String name, Object file) {
        super(name);
        filePath = file;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void editAttachment() {
        
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteAttachment(){
        
    }
    
}
