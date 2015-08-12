package entities;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ

/**
 * Информация о пользователе
 * @author Anatoly
 */
public class User {
    /** Имя */
    private String name;
    /** Пароль */
    private String pass;
    /** E-mail */
    private String e_mail;

    /**
     * Установка основной информации о пользователе
     * @param pass Пароль
     * @param name Имя
     * @param e_mail E-mail
     */
    public User(String pass, String name, String e_mail) {
        this.name = name;
        this.pass = pass;
        this.e_mail = e_mail;
    }
    
    /**
     * Редактирование информации о пользователе
     */
    public void editUser(){
        
    }
}
