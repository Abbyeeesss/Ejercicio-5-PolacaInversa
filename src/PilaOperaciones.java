import javax.swing.*;
import java.util.Stack;

public class PilaOperaciones {

    public void calcularPolacaInversa(String operacion, JTextArea textArea) {

        Stack <Double> pila = new Stack<>();
        String[] separacion = operacion.split(" ");

        double num1;
        double num2;
        double result = 0;

        for(String elemento : separacion){
            if(elemento.equals("+")||elemento.equals("-")||elemento.equals("*")||elemento.equals("/")){
                num2 = pila.pop();
                num1 = pila.pop();

                result = switch (elemento) {
                    case "+" -> num1 + num2;
                    case "-" -> num1 - num2;
                    case "*" -> num1 * num2;
                    case "/" -> num1 / num2;
                    default -> result;
                };
                pila.push(result);
            }else{
                pila.push(Double.parseDouble(elemento));
            }
        }
        result = pila.pop();
        textArea.setText(Double.toString(result));
    }
}
