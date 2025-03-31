import javax.swing.JOptionPane;

public class Task4 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first number:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second number:"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Enter third number:"));
        double num4 = Double.parseDouble(JOptionPane.showInputDialog("Enter fourth number:"));
        double num5 = Double.parseDouble(JOptionPane.showInputDialog("Enter fifth number:"));
        double num6 = Double.parseDouble(JOptionPane.showInputDialog("Enter sixth number:"));
        double num7 = Double.parseDouble(JOptionPane.showInputDialog("Enter seventh number:"));
        double num8 = Double.parseDouble(JOptionPane.showInputDialog("Enter eight number:"));
        double num9 = Double.parseDouble(JOptionPane.showInputDialog("Enter ninth number:"));
        double num10 = Double.parseDouble(JOptionPane.showInputDialog("Enter tenth number:"));

        double average = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10;

        // By Jeric Mata

        JOptionPane.showMessageDialog(null, "The average is: " + average, "Average Calculator (By: Jeric Mata)", JOptionPane.INFORMATION_MESSAGE);
    }
}
