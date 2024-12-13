import javax.swing.*;
import java.awt.*;

public class Background {

    public void draw() {
        JFrame window = new JFrame("Pong Game");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        int screenWidth = (int) size.width;
        int screenHeight = (int) size.height;

        window.setSize(screenWidth, screenHeight);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

}
