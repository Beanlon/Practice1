import javax.swing.JOptionPane;

public class Task6 {
    public static void main(String[] args) {
        final double SSS = 175.89;
        final double Philhealth = 300;
        final double Absent = 5.75;
        final double Late = 3.25;

        String ratePerHour = JOptionPane.showInputDialog("Enter hourly rate:");
        String workhrs = JOptionPane.showInputDialog("Enter hours worked:");
        String absences = JOptionPane.showInputDialog("Enter Absences:");
        String late = JOptionPane.showInputDialog("Enter number of late:");

        double ratePerHour2 = Double.parseDouble(ratePerHour);
        double workhrs2 = Double.parseDouble(workhrs);
        double absences2 = Double.parseDouble(absences);
        double late2 = Double.parseDouble(late);
        double gross = ratePerHour2 * workhrs2;
        double totaldeduction = (absences2*Absent) + (Late * late2) + SSS + Philhealth;
        double net = gross - totaldeduction;

        String text = "Rate per hour: " + ratePerHour2 + "\n" +
                "Hours worked: " + workhrs2 + "\n" +
                "Absences: " + absences2 + "\n" +
                "Late: " + late2 + "\n" +
                "Gross: " + gross + "\n" +
                "Total Deduction: " + totaldeduction + "\n" +
                "Total Net: " + net + "\n";

        // By Jeric Mata

        JOptionPane.showMessageDialog(null, text, "Task 6 (By: Jeric Mata)", JOptionPane.INFORMATION_MESSAGE);


    }
}
