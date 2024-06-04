
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String[] acceptableValues = {"Mc Donalds", "Burger king", "bob's"};
        String String = (String)JOptionPane.showInputDialog(null,
                "Qual o melhor fast food?",
                "comida",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        //Parse the input as an int.
        //Print its value +1
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}