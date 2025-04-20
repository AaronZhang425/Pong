
import java.awt.Dimension;
import java.awt.Rectangle;


public class Main {

    public static void main(String[] args) {
        Window window = new Window();
        Dimension size = window.getScreenSize();
        Rectangle rectangle = new Rectangle((int) size.getWidth() / 2, (int) size.getHeight() / 2, 50, 250);

        // window.
        // new Rectangle( size.getHeight() / 2, 50, 250)
        // window.revalidate();
        // window.repaint();
    }
}
