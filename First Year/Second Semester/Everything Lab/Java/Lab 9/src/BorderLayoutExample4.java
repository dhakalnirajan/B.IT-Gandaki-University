import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutExample4 {

  public static void main(String[] args) {
    Frame frame = new Frame("BorderLayout Example");
    frame.setLayout(new BorderLayout());

    Button buttonA = new Button("A");
    buttonA.setBackground(Color.BLUE);
    frame.add(buttonA, BorderLayout.NORTH);

    Button buttonC = new Button("C");
    buttonC.setBackground(Color.CYAN);
    frame.add(buttonC, BorderLayout.WEST);

    Button buttonB = new Button("B");
    buttonB.setBackground(Color.RED);
    frame.add(buttonB, BorderLayout.SOUTH);

    Button buttonD = new Button("D");
    buttonD.setBackground(Color.YELLOW);
    frame.add(buttonD, BorderLayout.EAST);

    Button buttonE = new Button("E");
    buttonE.setBackground(Color.BLACK);
    frame.add(buttonE, BorderLayout.CENTER);

    frame.setSize(400, 300);
    frame.setVisible(true);

    frame.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
        }
      }
    );
  }
}
