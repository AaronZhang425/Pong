import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    private Dimension screenSize;

    public Window() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setTitle("Pong Game");
        setSize(screenSize);
        setSize(screenSize.width, screenSize.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setIconImage(new ImageIcon("res/pongIcon.png").getImage());

        getContentPane().setBackground(Color.black);
    }

    public Dimension getScreenSize() {
        return screenSize;
    }

}
