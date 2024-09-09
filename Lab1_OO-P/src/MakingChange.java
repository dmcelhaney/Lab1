import javax.swing.*;
public class MakingChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        RegisterPanel registerPanel = new RegisterPanel();

        frame.setSize(1000, 1000);
        frame.add(registerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
