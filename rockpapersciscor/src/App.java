import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            // Instantiate a Rockpaper object
            @Override
            public void run() {
                Rockpaper rockpaper = new Rockpaper();
                // Display the GUI
                rockpaper.setVisible(true);
            }
        });
    }
}
