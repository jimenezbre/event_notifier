/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventnotifier.models;

import eventnotifier.Enums.Enums.EventType;
import java.time.LocalDateTime;

/**
 *
 * @author Victor J.B
 */
public class Evento {
    private String name;
    private String endereco;
    private EventType categoria;
    private LocalDateTime data;
    private String descrição;

    public Evento(String name, String endereco, LocalDateTime date, EventType type, String descrição) {
        this.name = name;
        this.endereco = endereco;
        this.data = date;
        this.categoria = type;
        this.descrição = descrição;
    };

    public void exibirEvento() {
        print(this.name);
        print(this.categoria.name());
        print(this.data.toString());
        print(this.endereco);
        print(this.descrição);

    }

    void print(String text) {
        System.out.print(text);
    }
}
