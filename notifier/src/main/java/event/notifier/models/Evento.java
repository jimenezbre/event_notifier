/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event.notifier.models;
import event.notifier.Enums.Enums.EventType;
import java.time.LocalDateTime;
import java.lang.*;

/**
 *
 * @author Victor J.B
 */
public class Evento {
    String name;
    String endereco;
    EventType categoria;
    LocalDateTime data;
    String descrição;
    
    public Evento (String name, String endereco, LocalDateTime date,EventType type,String descrição)
    {
        this.name = name;
        this.endereco = endereco;
        this.data = date;
        this.categoria =  type;
        this.descrição = descrição;
    };
    
}
