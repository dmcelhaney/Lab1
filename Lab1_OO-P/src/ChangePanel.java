import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ChangePanel extends javax.swing.JPanel {
    Purse purse = new Purse();
    private BufferedImage hundred;
    private BufferedImage fifty;
    private BufferedImage twenty;
    private BufferedImage ten;
    private BufferedImage five;
    private BufferedImage one;
    private BufferedImage quarter;
    private BufferedImage dime;
    private BufferedImage nickel;
    private BufferedImage penny;

    public void SetPurse(Purse purse1) {
        purse = purse1;
    }

    public ChangePanel(Purse purse1) {
        purse = purse1;
        try{
            hundred = ImageIO.read(new File("./src/hundred_note.png"));
            fifty = ImageIO.read(new File("./src/fifty_note.png"));
            twenty = ImageIO.read(new File("./src/twenty_note.png"));
            ten = ImageIO.read(new File("./src/ten_note.png"));
            five = ImageIO.read(new File("./src/five_note.png"));
            one = ImageIO.read(new File("./src/one_note.png"));
            quarter = ImageIO.read(new File("./src/quarter.png"));
            dime = ImageIO.read(new File("./src/dime.png"));
            nickel = ImageIO.read(new File("./src/nickel.png"));
            penny = ImageIO.read(new File("./src/penny.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        double amt = purse.getValue();
        double tempAmt = 0.0;
        int x = 0;
        int y = 0;

        while(amt >= 0) {
            if (amt >= 100) {
                amt -= 100;
                g.drawImage(hundred, x, y, 200, 100, null);
                x += 210;
                if (x > 800) {
                    x = 0;
                    y += 110;
                }
            } else if (amt >= 50) {
                amt -= 50;
                g.drawImage(fifty, x, y, 200, 100, null);
                x += 210;
                if (x > 800) {
                    x = 0;
                    y += 110;
                }
            } else if (amt >= 20) {
                amt -= 20;
                g.drawImage(twenty, x, y, 200, 100, null);
                x += 210;
                if (x > 800) {
                    x = 0;
                    y += 110;
                }
            } else if (amt >= 10) {
                amt -= 10;
                g.drawImage(ten, x, y, 200, 100, null);
                x += 210;
                if (x > 800) {
                    x = 0;
                    y += 110;
                }
            } else if (amt >= 5) {
                amt -= 5;
                g.drawImage(five, x, y, 200, 100, null);
                x += 210;
                if (x > 800) {
                    x = 0;
                    y += 110;
                }
            } else if (amt >= 1) {
                amt -= 1;
                g.drawImage(one, x, y, 200, 100, null);
                x += 210;
                if (x > 800) {
                    x = 0;
                    y += 110;
                }
            } else if (amt >= 0.25) {
                amt *= 100;
                tempAmt = (int) amt;
                tempAmt -= 25;
                amt = tempAmt / 100;
                g.drawImage(quarter, x, y, 200, 100, null);
                x += 210;
                if (x > 800) {
                    x = 0;
                    y += 110;
                }
            } else if (amt >= 0.1) {
                amt *= 100;
                tempAmt = (int) amt;
                tempAmt -= 10;
                amt = tempAmt / 100;
                g.drawImage(dime, x, y, 200, 100, null);
                x += 210;
                if (x > 800) {
                    x = 0;
                    y += 110;
                }
            } else if (amt >= 0.05) {
                amt *= 100;
                tempAmt = (int) amt;
                tempAmt -= 5;
                amt = tempAmt / 100;
                g.drawImage(nickel, x, y, 200, 100, null);
                x += 210;
                if (x > 800) {
                    x = 0;
                    y += 110;
                }
            } else if (amt >= 0.01) {
                amt *= 100;
                tempAmt = (int) amt;
                tempAmt -= 1;
                amt = tempAmt / 100;
                g.drawImage(penny, x, y, 200, 100, null);
                x += 210;
                if (x > 800) {
                    x = 0;
                    y += 110;
                }
            } else {
                break;
            }
        }
    }
}
