import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutExample extends Frame {

  public FlowLayoutExample(String title) {
    super(title);
    setLayout(new FlowLayout());

    Button b1 = new Button("Button: 1");
    add(b1);
    Button b2 = new Button("Button: 2");
    add(b2);
    Button b3 = new Button("Button: 3");
    add(b3);
    Button b4 = new Button("Button: 4");
    add(b4);
    Button b5 = new Button("Button: 5");
    add(b5);
    Button b6 = new Button("Button: 6");
    add(b6);
    Button b7 = new Button("Button: 7");
    add(b7);
    Button b8 = new Button("Button: 8");
    add(b8);

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
    FlowLayoutExample f = new FlowLayoutExample("Flow Layout Example");
    f.setSize(400, 150);
    f.setVisible(true);
  }
}
