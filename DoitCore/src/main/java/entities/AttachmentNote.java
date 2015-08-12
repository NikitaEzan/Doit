/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * Используется для хранения и работы с прикреплением типа Note
 * Наследуется от {@link Attachment}
 * @author Anatoly
 */
public class AttachmentNote extends Attachment {
    /**
     * Объект Note, для хранения заметки
     */
    private Object Note;

    /**
     * Инициализирует поле {@link AttachmentNote#name}
     * @param name 
     * @see AttachmentNode
     */
    public AttachmentNote(String name) {
        super(name);
        editNote();
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
    
    /**
     * Редактирование заметки
     */
    public final void editNote(){
        
    }
}
