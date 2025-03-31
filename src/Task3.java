import javax.swing.JOptionPane;

public class Task3  {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Enter first number:");
        String num2 = JOptionPane.showInputDialog("Enter second number:");

        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;

        String text = "Sum = " + sum + "\n" +
                "Difference = " + difference + "\n" +
                "Prouct = " + product + "\n" +
                "Quotient = " + quotient;

        // By Jeric Mata

        JOptionPane.showMessageDialog(null, text, "Results of Operations (By: Jeric Mata)", JOptionPane.INFORMATION_MESSAGE);


    }
}
