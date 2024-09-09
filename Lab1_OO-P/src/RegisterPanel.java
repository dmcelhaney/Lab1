import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegisterPanel extends javax.swing.JPanel {
    JLabel inputLabel = new JLabel();
    JTextField input = new JTextField(15);
    ChangePanel pursePanel;

    public RegisterPanel(){

        JPanel inputPanel = new JPanel();
        inputPanel.setPreferredSize(new Dimension(900,100));

        inputLabel.setText("Enter the total amount of money: ");
        inputPanel.add(inputLabel);
        inputPanel.add(input);

        add(inputPanel);

        pursePanel = new ChangePanel(new Purse());
        pursePanel.setPreferredSize(new Dimension(900,800));
        add(pursePanel);

        TextListener listener = new TextListener();
        input.addActionListener(listener);
    }

    class TextListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double amt = Double.parseDouble(input.getText());

            Purse purse = new Purse();
            purse = new Register().makeChange(amt);

            pursePanel.SetPurse(purse);

            revalidate();
            repaint();
        }
    }
}