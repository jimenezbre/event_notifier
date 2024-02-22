/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventnotifier.controllers;


import eventnotifier.models.Account;
import eventnotifier.models.Evento;
import eventnotifier.view.Cli;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 *
 * @author Victor J.B
 */
public class CliController {
    private Cli cli;
    private List<Account> users;
    private List<Evento> eventos; 
    //Controi e inicia o systema de controle;
    public CliController()
    {
        this.cli = new Cli();
        init();
    }
    
    void init()
    {
        var escolhas =
        requestLoginOrSign();
    }
    
    
    public String requestLoginOrSign()
    {
        System.out.print("1.Login /n 2.Cadastro");
        return cli.requestInput();
    }
    
    public String loadData(String path)
    {
        if(Files.exists(Paths.get("/Accounts.data")))
        {
        }else{
        return "";
        }
        
            
    }
    
    public void saveUser()
    {
        
    }
}
