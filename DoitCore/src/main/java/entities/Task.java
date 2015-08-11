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

//TODO: ??? JavaDoc!!!
//TODO: зачем? О_о
enum ImportanceDeg {
    ONE, TWO, THREE, FOUR
}


public class Task extends AbstractTask {
    private ImportanceDeg impDeg;
    private boolean complete = false;
    private Attachment attachment;

    //TODO: ??? JavaDoc!!!
    //TODO: зачем? Какая область видимости?
    Task(String name, Date dS, Attachment attch) {
        super(name, dS);
        //this.setImportance();
        this.addAttachment(attch);
    }

    //TODO: ??? JavaDoc!!!
    public void setImportance(ImportanceDeg imDeg) {
        this.impDeg = imDeg;
    }

    //TODO: ??? JavaDoc!!!
    public String getImportance(ImportanceDeg imDeg) {
        return imDeg.name();
    }

    //TODO: ??? JavaDoc!!!
    public boolean isComplete() {
        return this.complete;
    }

    //TODO: ??? JavaDoc!!!
    public void switchComplete() {
        this.complete = !this.complete;
    }

    //TODO: ??? JavaDoc!!!
    public void delete() {

    }

    //TODO: ??? JavaDoc!!!
    public void addAttachment(Attachment attch) {
        attachment = attch;
    }
}
