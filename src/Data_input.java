import javax.swing.*;
import java.awt.*;

// CustomPanel class that extends JPanel
class Data_input extends JPanel {

    // Constructor for CustomPanel
    public Data_input() {
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(400, 40));

        // Panel with up and down button
        JPanel mover_panel = new JPanel();
        mover_panel.setBackground(Color.WHITE);
        //mover_panel.setPreferredSize(new Dimension(40, 40));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(mover_panel);

        // Up down button
        JButton button4 = new JButton("UP");
        JButton button5 = new JButton("DOWN");

        this.add(button4);
        this.add(button5);



    }}