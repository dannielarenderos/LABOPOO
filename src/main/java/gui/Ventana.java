/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Aritmetica.Operaciones;
import Convertidor.Convertir;
import ProductorFabrica.Productor;
import ProductorFabrica.ProductordeOperaciones;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author uca
 */
public class Ventana extends JFrame {

    String regex = "^[0-9]+";

    private JTextField caja1, caja2, caja3, caja4;
    private JButton suma, resta, dividir, multi, binario;

    ProductordeOperaciones factory;

    public Ventana() {
        super("CÁLCULADORA");
        initComponent();
    }

    public void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        caja1 = new JTextField();
        caja1.setBounds(50, 50, 120, 50);
        caja3 = new JTextField();
        caja3.setBounds(180, 50, 120, 50);
        caja4 = new JTextField("RESULTADO ");
        caja4.setBounds(50, 120, 250, 30);
        caja4.setEditable(false);
        caja2 = new JTextField();
        caja2.setBounds(50, 150, 250, 30);
        caja2.setEditable(false);
        suma = new JButton("+");
        suma.setBounds(50, 200, 50, 100);
        resta = new JButton("-");
        resta.setBounds(100, 200, 50, 100);
        multi = new JButton("x");
        multi.setBounds(150, 200, 50, 100);
        dividir = new JButton("%");
        dividir.setBounds(200, 200, 50, 100);
        binario = new JButton("BI");
        binario.setBounds(250, 200, 50, 100);

        Container contenedor = getContentPane();

        contenedor.add(caja1);
        contenedor.add(caja2);
        contenedor.add(caja3);
        contenedor.add(suma);
        contenedor.add(resta);
        contenedor.add(multi);
        contenedor.add(dividir);
        contenedor.add(binario);
        contenedor.add(caja4);

        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = Productor.getProductor("aritmetica");
                Operaciones oper = factory.getOperaciones("suma");
//                if data.matches(regex);
//                int a = Integer.parseInt(caja1.getText());
//                int b = Integer.parseInt(caja3.getText());

                String aa = caja1.getText();
                String bb = caja3.getText();

                boolean n = aa.matches(regex);
                boolean m = bb.matches(regex);
                if (n && m) {
                    int a = Integer.parseInt(aa);
                    int b = Integer.parseInt(bb);

                    caja2.setText(oper.operar(a, b));
                } else {

                    JOptionPane.showMessageDialog(rootPane, "SINTAXIS INCORRECTA, INGRESE ENTEROS");
                }

            }
        });

        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = Productor.getProductor("aritmetica");
                Operaciones oper = factory.getOperaciones("restar");
                String aa = caja1.getText();
                String bb = caja3.getText();

                boolean n = aa.matches(regex);
                boolean m = bb.matches(regex);
                if (n && m) {
                    int a = Integer.parseInt(aa);
                    int b = Integer.parseInt(bb);

                    caja2.setText(oper.operar(a, b));
                } else {

                    JOptionPane.showMessageDialog(rootPane, "SINTAXIS INCORRECTA, INGRESE ENTEROS");
                }
            }
        });

        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = Productor.getProductor("aritmetica");
                Operaciones oper = factory.getOperaciones("multiplicar");
                String aa = caja1.getText();
                String bb = caja3.getText();

                boolean n = aa.matches(regex);
                boolean m = bb.matches(regex);
                if (n && m) {
                    int a = Integer.parseInt(aa);
                    int b = Integer.parseInt(bb);

                    caja2.setText(oper.operar(a, b));
                } else {

                    JOptionPane.showMessageDialog(rootPane, "SINTAXIS INCORRECTA, INGRESE ENTEROS");
                }

            }
        });

        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = Productor.getProductor("aritmetica");
                Operaciones oper = factory.getOperaciones("dividir");
                String aa = caja1.getText();
                String bb = caja3.getText();

                boolean n = aa.matches(regex);
                boolean m = bb.matches(regex);
                if (n && m) {
                    int a = Integer.parseInt(aa);
                    int b = Integer.parseInt(bb);

                    caja2.setText(oper.operar(a, b));
                } else {

                    JOptionPane.showMessageDialog(rootPane, "SINTAXIS INCORRECTA, INGRESE ENTEROS");
                }
            }
        });

        binario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = Productor.getProductor("convertir");
                Convertir conver = factory.getConvertir("binario");

                String aa = caja1.getText();

                boolean n = aa.matches(regex);

                if (n) {
                    int a = Integer.parseInt(aa);

                    caja2.setText(conver.convertidor(a));
                } else {

                    JOptionPane.showMessageDialog(rootPane, "SINTAXIS INCORRECTA, INGRESE ENTERO EN PRIMERA CAJA");
                }

            }
        });

//        suma.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                factory = Productor.getProductor("aritmetica");
//                Operaciones oper = factory.getOperaciones("suma");
//                int a = Integer.parseInt(caja1.getText());
//                int b = Integer.parseInt(caja3.getText());
//                caja2.setText(oper.operar(a, b));
//
//            }
//        });
        setSize(370, 400);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

}
