import java.awt.*;
import java.awt.event.*;

public class TextListenerExample extends Frame implements TextListener {

  TextField txt;

  public TextListenerExample() {
    setTitle("Text Listener");
    setLayout(new FlowLayout());
    txt = new TextField(20);
    add(txt);
    txt.addTextListener(this);
    setSize(400, 400);
    setVisible(true);
  }

  public void textValueChanged(TextEvent e) {
    setTitle(txt.getText());
  }

  public static void main(String[] args) {
    new TextListenerExample();
  }
}
