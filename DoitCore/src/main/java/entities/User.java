package entities;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ

/**
 * »нформаци¤ о пользователе
 * @author Anatoly
 */
public class User {
    /** »м¤ */
    private String name;
    /** ѕароль */
    private String pass;
    /** E-mail */
    private String e_mail;

    /**
     * ”становка основной информации о пользователе
     * @param pass ѕароль
     * @param name »м¤
     * @param e_mail E-mail
     */
    public User(String pass, String name, String e_mail) {
        this.name = name;
        this.pass = pass;
        this.e_mail = e_mail;
    }
    
    /**
     * –едактирование информации о пользователе
     */
    public void editUser(){
        
    }
}
