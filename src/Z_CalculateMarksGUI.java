import javax.swing.*;

public class Z_CalculateMarksGUI {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Calculate Marks");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Create JPanel
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Set frame visibility
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Create labels and text fields for each subject
        JLabel[] subjectLabels = new JLabel[5];
        JTextField[] subjectFields = new JTextField[5];

        for (int i = 0; i < 5; i++) {
            subjectLabels[i] = new JLabel("Subject " + (i + 1) + ":");
            subjectLabels[i].setBounds(10, 20 + i * 30, 80, 25);
            panel.add(subjectLabels[i]);

            subjectFields[i] = new JTextField(10);
            subjectFields[i].setBounds(100, 20 + i * 30, 165, 25);
            panel.add(subjectFields[i]);
        }

        // Create button to calculate
        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 300, 80, 25);
        panel.add(calculateButton);

        // Create labels for results
        JLabel totalLabel = new JLabel("Total Marks:");
        totalLabel.setBounds(10, 200, 80, 25);
        panel.add(totalLabel);

        JLabel percentageLabel = new JLabel("Percentage:");
        percentageLabel.setBounds(10, 250, 80, 25);
        panel.add(percentageLabel);

        // Create text fields for results
        JTextField totalField = new JTextField();
        totalField.setBounds(100, 200, 165, 25);
        totalField.setEditable(false);
        panel.add(totalField);

        JTextField percentageField = new JTextField();
        percentageField.setBounds(100, 250, 165, 25);
        percentageField.setEditable(false);
        panel.add(percentageField);

        // Add action listener to the button
        calculateButton.addActionListener(e -> {
            int[] marks = new int[5];
            for (int i = 0; i < 5; i++) {
                marks[i] = Integer.parseInt(subjectFields[i].getText());
            }

            // Calculate total marks
            int totalMarks = 0;
            for (int mark : marks) {
                totalMarks += mark;
            }

            // Calculate percentage
            double percentage = (double) totalMarks / (5 * 100) * 100;

            // Display results
            totalField.setText(Integer.toString(totalMarks));
            percentageField.setText(String.format("%.2f%%", percentage));
        });
    }
}
