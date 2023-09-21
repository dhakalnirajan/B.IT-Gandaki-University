import java.awt.*;

public class AWTDemo extends Frame {

  AWTDemo() {
    Label empName = new Label("Emp Name");
    empName.setBounds(20, 50, 80, 20);
    Label post = new Label("Post");
    post.setBounds(20, 80, 80, 20);
    Label salary = new Label("Salary");
    salary.setBounds(20, 110, 80, 20);
    TextField empNameTF = new TextField();
    empNameTF.setBounds(120, 50, 100, 20);
    TextField postTF = new TextField();
    postTF.setBounds(120, 80, 100, 20);
    TextField salaryTF = new TextField();
    salaryTF.setBounds(120, 110, 100, 20);
    Button sbmt = new Button("Submit");
    sbmt.setBounds(20, 160, 100, 30);
    Button reset = new Button("Reset");
    reset.setBounds(120, 160, 100, 30);
    add(empName);
    add(post);
    add(salary);
    argsdd(empNameTF);
    add(salaryTF);
    add(postTF);
    add(sbmt);
    add(reset);
    setSize(250, 250);
    setLayout(null);
    setVisible(true);
  }

  public static void main(String[] args) {
    AWTDemo demo = new AWTDemo();
  }
}
