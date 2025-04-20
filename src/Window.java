import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.*;

public class Window {
    private Dimension displaySize = Toolkit.getDefaultToolkit().getScreenSize();
    private Dimension screenSize = new Dimension(
        (int) (2 * displaySize.getWidth() / 3),
        (int) (2 * displaySize.getHeight() / 3)
    );

    public Window() {
        // Dimension displaySize = Toolkit.getDefaultToolkit().getScreenSize();
       
        // Dimension screenSize = new Dimension(
        //     (int) displaySize.getWidth() / 2,
        //     (int) displaySize.getHeight() / 2
        // );

        JFrame window = new JFrame("Pong Game");
        window.setPreferredSize(screenSize);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.setLocationRelativeTo(null);
        window.setLocation(
            (int) (displaySize.getWidth() / 2 - screenSize.getWidth() / 2),
            (int) (displaySize.getHeight() / 2 - screenSize.getHeight() / 2)
        );

        window.setIconImage(new ImageIcon("res/pongIcon.png").getImage());

        JPanel panel = new JPanel(true);
        panel.setBackground(Color.black);
        window.add(panel);
        window.pack();

        window.setVisible(true);
    }

    public Dimension getDisplaySize() {
        return displaySize;
    }

    public Dimension getScreenSize() {
        return screenSize;
    }

}
