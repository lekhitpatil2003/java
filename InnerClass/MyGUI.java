package InnerClass;

import javax.swing.*;

public class MyGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First GUI");

        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 120, 40);

        frame.add(button);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
