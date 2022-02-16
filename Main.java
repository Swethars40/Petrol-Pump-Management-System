package bootathon1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends JFrame {

  JComboBox<String> box = new JComboBox<String>(
      new String[] { "1", "22", "33" });

  public Main() {
    box.setBackground(Color.RED);
    box.addFocusListener(getFocusListener());
    JTextField f = new JTextField();
    add(box, BorderLayout.SOUTH);
    add(f, BorderLayout.NORTH);
    pack();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  private FocusListener getFocusListener() {
    return new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent arg0) {
        super.focusGained(arg0);
        box.setBackground(Color.BLUE);
        validate();
      }

      @Override
      public void focusLost(FocusEvent arg0) {
        super.focusLost(arg0);
        box.setBackground(Color.red);
        validate();
      }
    };
  }

  public static void main(String... s) {
    new Main();
  }
}