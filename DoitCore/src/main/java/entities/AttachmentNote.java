/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


// REVIEW DATE: 12.08.2015
// REVIEWER: ALMAZ


/**
 * Используется для хранения и работы с прикреплением типа Note
 *
 * TODO: "типа Note" - что за тип? Зачем он нужен?
 * Наследуется от {@link AbstractAttachment}
 * @author Anatoly
 */
public class AttachmentNote extends AbstractAttachment {
    /**
     * Объект Note, для хранения заметки
     */
    private Object Note;

    /**
     * Инициализирует поле {@link AttachmentNote#name}
     * @param name 
     * @see entities.AttachmentNote
     */
    public AttachmentNote(String name) {
        super(name);
        editNote();
    }

    /**
     * {@inheritDoc}
     * TODO: O_o - и как собрался редактировать таску?
     */
    @Override
    public void editAttachment() {
        
    }
    
    /**
     * TODO: Как будет удаляться? По каким критериям?
     * TODO: почему пусто тут ?
     * {@inheritDoc}
     */
    @Override
    public void deleteAttachment(){
        // TODO: Тогда стоило вот так сделать?!
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Редактирование заметки
     * TODO: O_o - и как собрался редактировать таску?
     * TODO: О_о почему final ?
     * TODO: почему пусто тут ?
     */
    public final void editNote(){
        // TODO: Тогда стоило вот так сделать?!
        throw new UnsupportedOperationException("Operation not supported yet");
    }
}
