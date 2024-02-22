/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventnotifier.models;

/**
 *
 * @author Victor J.B
 */
public class Account {
    private String login;
    private String senha;
    private String city;
    private String name;
    
    public Account(String login, String senha, String city, String name)
    {
        this.login = login;
        this.senha = senha;
        this.city = city;
        this.name = name;
    }
}
