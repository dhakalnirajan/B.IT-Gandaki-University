import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderPanelExample3 extends Frame {

  public BorderPanelExample3(String title) {
    super(title);
    setLayout(new BorderLayout());

    addComponent(BorderLayout.NORTH, new Button("North"));
    addComponent(BorderLayout.SOUTH, new Button("South"));
    addComponent(BorderLayout.EAST, new Button("East"));
    addComponent(BorderLayout.WEST, new Button("West"));
    addComponent(BorderLayout.CENTER, new Button("Center"));

    // Add a WindowListener to handle window close event
    addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
          System.exit(0); // Exit the application when the window is closed
        }
      }
    );
  }

  public void addComponent(String region, Component component) {
    add(region, component);
  }

  public static void main(String[] args) {
    BorderPanelExample3 bpe = new BorderPanelExample3("Border Panel Example");
    bpe.setSize(400, 300);
    bpe.setVisible(true);
  }
}
