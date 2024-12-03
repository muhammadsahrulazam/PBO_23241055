package src.com.totorial;

import src.com.terminal.Console;

public class Main {
    public static void main(String[] args) {
        //membuat object
        Player player1 = new Player("prabowo hatta");
        Player player2 = new Player("gibran bahlul");
        Player player3 = new Player("anis sedan");
        player1.cetak();
        player2.cetak();
        player3.cetak();

        Console.log("Eror teruss");
    }
    
}
