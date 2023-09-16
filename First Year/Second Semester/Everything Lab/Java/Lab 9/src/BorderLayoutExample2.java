import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutExample2 extends Frame {

  public BorderLayoutExample2(String title) {
    super(title);
    add("North", new Button("North"));
    add("South", new Button("South"));
    add("East", new Button("East"));
    add("West", new Button("West"));
    add("Center", new Button("Center"));

    // Add a WindowListener to handle window close event
    addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
          System.exit(0); // Exit the application when the window is closed
        }
      }
    );
  }

  public static void main(String[] args) {
    BorderLayoutExample2 b = new BorderLayoutExample2("Border Layout Example");
    b.setSize(300, 200);
    b.setVisible(true);
  }
}
