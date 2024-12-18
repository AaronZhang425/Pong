import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    private Dimension size;

    public Window() {
        size = Toolkit.getDefaultToolkit().getScreenSize();

        setTitle("Pong Game");
        setSize(size);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setIconImage(new ImageIcon("res/pongIcon.png").getImage());

        getContentPane().setBackground(Color.black);
    }

}
