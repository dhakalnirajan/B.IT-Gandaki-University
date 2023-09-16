import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChangeButtonBackground {

  public static void main(String[] args) {
    Frame frame = new Frame("ChangeButtonBackground");
    Button b1 = new Button("A");
    b1.setBounds(100, 200, 75, 50);
    Button b2 = new Button("B");

    b1.setBackground(Color.BLUE); // Set the background color of b1 to blue
    frame.setBackground(Color.RED); // Set the background color of the frame to red

    frame.setLayout(new BorderLayout()); // Set the layout manager to BorderLayout
    frame.add(b1, BorderLayout.NORTH); // Add button b1 to the North region of the frame
    frame.pack(); // Automatically adjust the frame size
    frame.setVisible(true); // Make the frame visible

    frame.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0); // Exit the application when the window is closed
        }
      }
    );
  }
}
