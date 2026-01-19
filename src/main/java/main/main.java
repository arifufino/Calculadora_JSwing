package main;

import ventanas.ventana_principal;

public class main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() ->{
            new ventana_principal().setVisible(true);
        });
    }

}
