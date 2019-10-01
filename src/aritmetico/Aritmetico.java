/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetico;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateo
 */
public class Aritmetico {
    public static void main(String[] args) {
        // TODO code application logic here
       datos();
    }
    public static class numeroInvalidoExcepcion extends RuntimeException{
    protected int valorInvalido;
        public numeroInvalidoExcepcion(int valorInvalido) {
        this.valorInvalido = valorInvalido;
        }
        public int getValorInvalido() {
        return valorInvalido;
        }
    }
    public static void datos() throws numeroInvalidoExcepcion{
        int dividendo=0, divisor=0,resultado;
        try{
            dividendo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dividendo"));
            divisor=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor del divisor "));
            resultado= dividendo/divisor;
            JOptionPane.showMessageDialog(null, "resultado = "+resultado);

        }catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, "NO SE PUEDE DIVIR EN 0 "+ex.getMessage());   
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "INGRESE SOLO NUMEROS "+e.getMessage());
        }catch(numeroInvalidoExcepcion s){
            JOptionPane.showMessageDialog(null, "NUMERO MAYOR A 10 "+s.getMessage());
        }           
    }
}
