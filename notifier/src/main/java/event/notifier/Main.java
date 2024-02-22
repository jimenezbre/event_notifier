package event.notifier;

import event.notifier.view.Cli;
public class Main {
    public static void main(String[] args) {
        Cli cli = new Cli();
        System.out.print("1.login /n 2.cadastro");
        cli.requestInput();
    }
}