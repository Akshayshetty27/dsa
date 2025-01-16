import javax.swing.*;

public class Rockpaper extends JFrame {
    public Rockpaper() {
        // Set the title of the JFrame
        super("ROCK PAPER SCISSORS");

        // Set the size of the GUI
        setSize(700, 400000);

        // Set layout to null to disable layout management
        setLayout(null);

        // Load GUI in the center of the screen every time the application starts
        setLocationRelativeTo(null);

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Additional GUI components can be added here
        JLabel welcomeLabel = new JLabel("Welcome to Rock Paper Scissors!", SwingConstants.CENTER);
        welcomeLabel.setBounds(50, 50, 350, 30); // x, y, width, height
        add(welcomeLabel);
    }
}
