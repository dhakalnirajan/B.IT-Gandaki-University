import java.awt.event.*;
import javax.swing.*;

public class MyEvent extends JFrame {

  JButton b1;

  public static void main(String[] args) {
    new MyEvent();
  }

  public MyEvent() {
    super("Event Handling");
    b1 = new JButton("Click Me!");
    getContentPane().add(b1);

    // Register the listener for the button
    ButtonListener listen = new ButtonListener();
    b1.addActionListener(listen);

    // Add window close event listener
    addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          // Perform any cleanup or actions needed before closing the window
          dispose(); // Close the window
          System.exit(0); // Exit the application
        }
      }
    );

    setVisible(true);
    setSize(200, 200);
  }

  // The Listener Class
  class ButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent evt) {
      JButton source = (JButton) evt.getSource();
      source.setText("Button Clicked!");
    }
  }
}
