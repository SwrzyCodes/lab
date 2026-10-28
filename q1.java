import javax.swing.*;
import java.awt.*;

public class Swingjava extends JFrame {
    JLabel l1, l2;
    JTextField t1;
    ImageIcon ic;

    Swingjava() {
        ic = new ImageIcon("C:\\users\\sing\\Pictures\\Screen Shots\\trump.png");
        l1 = new JLabel("ImgIcon", ic, SwingConstants.CENTER);
        add(l1);
        setLayout(new FlowLayout());
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Swingjava();
    }
}