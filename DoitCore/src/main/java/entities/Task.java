package entities;

import java.util.Date;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * Класс для хранения и работы с задачей
 * @author Anatoly
 */
public class Task extends AbstractTask {
    /** Степень важности задачи */
    private short impDeg;
    /** Статус завершения задачи */
    private boolean complete = false;
    /** Прикрепление */
    private Attachment attachment;

    /**
     * Инициализация полей {@link Task#name}, {@link Task#startDate}, {@link Task#attachment}
     * @param name Имя
     * @param start Дата начала
     * @param attch Прикрепление
     */
    public Task(String name, Date start, Attachment attch) {
        super(name, start);
        //this.setImportance();
        this.addAttachment(attch);
    }

    /**
     * Изменение степени важности задачи
     * @param imDeg 
     */
    public void setImportance(short imDeg) {
        this.impDeg = imDeg;
    }

    /**
     * Возвращает степень важности задачи
     * @param imDeg
     * @return Целое число - степень важности
     */
    public short getImportance(short imDeg) {
        return this.impDeg;
    }

    /**
     * Статус завершения задачи
     * @return false - не завершена, true - завершена
     */
    public boolean isComplete() {
        return this.complete;
    }

    /**
     * Изменение статуса завершения задачи
     */
    public void switchComplete() {
        this.complete = !this.complete;
    }

    /**
     * Удаление прикрепления
     */
    public final void deleteAttachment() {

    }

    /**
     * Добавление прикрепления
     * @param attch 
     */
    public final void addAttachment(Attachment attch) {
        attachment = attch;
    }
    
    /**
     * Редактирование задачи
     */
    @Override
    public void editTask(){
        
    }
}
