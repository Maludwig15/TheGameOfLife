import javax.swing.*;

/**
 * Created by michael_hopps on 11/15/16.
 */
public class ProjectMain extends JFrame {

    public static void main(String[] args) {
        int w = 800;
        int h = 800;
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(500, 0, w, h); //(x, y, w, h)

        ProjectPanel panel = new ProjectPanel(w,h);
        panel.setFocusable(true);
        panel.grabFocus();
        window.add(panel);
        window.setVisible(true);


    }

}
