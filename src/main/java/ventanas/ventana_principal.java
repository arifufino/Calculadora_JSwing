package ventanas;

import javax.swing.*;
import java.awt.*;

public class ventana_principal extends JFrame {

    //PANEL PRINCIPAL
    private JPanel panel_principal;

    //TITULO
    private JPanel panel_titulo;
    private JLabel lbl_titulo;
    //TEXTO
    private JPanel txt_panel;
    private JTextField txt_a;
    private JTextField txt_b;
    //BOTONES
    private JPanel btn_panel;
    private JButton btn_sumar;
    private JButton btn_restar;
    private JButton btn_dividir;
    private JButton btn_multiplicar;

    public ventana_principal(){
        setTitle("CALCULADORA");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inizializar();
    }

    public void inizializar (){
        //PANEL PRINCIPAL
        panel_principal = new JPanel();
        panel_principal.setLayout(new BorderLayout());
        add(panel_principal);

        //TITULO NORTH
        panel_titulo = new JPanel();
        lbl_titulo = new JLabel("CALCULADORA");
        panel_titulo.add(lbl_titulo);
        panel_principal.add(panel_titulo, BorderLayout.NORTH);

        //TEXTOS CENTER
        txt_panel = new JPanel();
        txt_panel.add(new JLabel("Valor a:"));
        txt_a = new JTextField(5);
        txt_panel.add(txt_a);
        txt_panel.add(new JLabel("Valor b:"));
        txt_b = new JTextField(5);
        txt_panel.add(txt_b);

        panel_principal.add(txt_panel, BorderLayout.CENTER);

        //BOTONES SOUTH
        btn_panel = new JPanel();

        btn_dividir = new JButton("DIVIDIR");
        btn_multiplicar = new JButton("MULTIPLICAR");
        btn_restar = new JButton("RESTAR");
        btn_sumar = new JButton("SUMAR");

        btn_panel.add(btn_dividir);
        btn_panel.add(btn_multiplicar);
        btn_panel.add(btn_restar);
        btn_panel.add(btn_sumar);

        panel_principal.add(btn_panel, BorderLayout.SOUTH);


        btn_sumar.addActionListener(e -> {
            String a = txt_a.getText();
            String b = txt_b.getText();

            if (a.isEmpty()|| b.isEmpty()){
                JOptionPane.showMessageDialog(
                        this,
                        "Campos vacios."
                );
            } else {
                try {
                    double valor1 = Double.parseDouble(txt_a.getText());
                    double valor2 = Double.parseDouble(txt_b.getText());

                    JOptionPane.showMessageDialog(
                            this,
                            "Resultado: " + (valor1 + valor2)
                    );
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }

        });

        btn_restar.addActionListener(e -> {
            String a = txt_a.getText();
            String b = txt_b.getText();

            if (a.isEmpty()||b.isEmpty()){
                JOptionPane.showMessageDialog(
                        this,
                        "Campos vacios."
                );
            } else {
                try {
                    double a1 = Double.parseDouble(txt_a.getText());
                    double b1 = Double.parseDouble(txt_b.getText());

                    JOptionPane.showMessageDialog(
                            this,
                            "Resultado: " + (a1 - b1)
                    );
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        btn_multiplicar.addActionListener(e -> {
            String a = txt_a.getText();
            String b = txt_b.getText();

            if (a.isEmpty()||b.isEmpty()){
                JOptionPane.showMessageDialog(
                        this,
                        "Campos vacios."
                );
            } else {
                try{
                    double a1 = Double.parseDouble(txt_a.getText());
                    double b1 = Double.parseDouble(txt_b.getText());

                    JOptionPane.showMessageDialog(this,
                            "Resultado: " + (a1 * b1)
                    );
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        btn_dividir.addActionListener(e -> {
            String a = txt_a.getText();
            String b = txt_b.getText();

            if (a.isEmpty()||b.isEmpty()){
                JOptionPane.showMessageDialog(
                        this,
                        "Campos vacios."
                );
            } else {
                try{
                    double valor1 = Double.parseDouble(txt_a.getText());
                    double valor2 = Double.parseDouble(txt_b.getText());

                    JOptionPane.showMessageDialog(
                            this,
                            "Resultado: "+ (valor1 / valor2)
                    );
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
