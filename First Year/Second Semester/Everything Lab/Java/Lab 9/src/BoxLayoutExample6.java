import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class BoxLayoutExample6 extends Frame {

  Button buttons[];

  public BoxLayoutExample6() {
    buttons = new Button[5];

    for (int i = 0; i < 5; i++) {
      buttons[i] = new Button("Button" + (i + 1));
      add(buttons[i]); // adding buttons so that they can be displayed
    }

    // Use javax.swing.BoxLayout for Swing-based layout
    setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

    setSize(300, 200);
    setTitle("Box Layout Example 6");
    setVisible(true);

    // Implement Window Close Event
    addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
          System.exit(0); // Exit the application when the window is closed
        }
      }
    );
  }

  public static void main(String[] args) {
    BoxLayoutExample6 b = new BoxLayoutExample6();
  }
}
