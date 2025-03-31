import javax.swing.JOptionPane;

public class Task5 {
    public static void main(String[] args) {
        String N = JOptionPane.showInputDialog("Enter the number of hair:");
        String L = JOptionPane.showInputDialog("Enter the average length of hair:");

        int numHair = Integer.parseInt(N);
        double AverageL = Integer.parseInt(L);

        double Cm = AverageL * numHair;
        double km = Cm / 100000;
        double Miles = km * 0.62;

        JOptionPane.showMessageDialog(null, "Hair length in km" + km);
        JOptionPane.showMessageDialog(null, "Hair length in Miles" + Miles);

        //By Jeric Mata
    }
}
