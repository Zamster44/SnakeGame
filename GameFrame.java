import javax.swing.*;

public class GameFrame extends JFrame {
//    In Java, JFrame is a class that is part of the Swing framework, which is used for creating graphical user interfaces (GUIs).
    GameFrame(){
        this.add(new GamePanel()); // Add a new instance of GamePanel (assuming GamePanel is another class) to the frame
        this.setTitle("Snake");  // Set the title of the frame to "Snake"
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      Sets the default close operation for the frame. In this case, it's set to JFrame.EXIT_ON_CLOSE, meaning the application will exit when the user closes the frame.
        this.setResizable(false);  // Disable frame resizing
        this.pack();  // Automatically adjust the size of the frame based on its components
        this.setVisible(true);   // Make the frame visible
        this.setLocationRelativeTo(null);  // Center the frame on the screen
    }
}
