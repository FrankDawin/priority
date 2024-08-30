import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class GUI {

    public void Make_window() {

        // Main window
        JFrame frame = new JFrame("Priority");
        frame.setSize(400, 400);

        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tool frame
        JPanel tool_frame = new JPanel();
        tool_frame.setBackground(Color.red);
        tool_frame.setPreferredSize(new Dimension(200, 50));
        frame.add(tool_frame, BorderLayout.NORTH);

        // feed panel
        JPanel Feed_panel = new JPanel();
        Feed_panel.setBackground(Color.green);
        Feed_panel.setPreferredSize(new Dimension(650, 100));
        frame.add(Feed_panel, BorderLayout.WEST);

        // RSS Feed into JPanel
        // command.showRSS(5, Feed_panel);


        // Buttons for tool frame

        ActionListener actionListener1 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // To fill with new action
                }};

        JButton button1 = new JButton("New");
        button1.addActionListener(actionListener1);
        tool_frame.add(button1);

        ActionListener actionListener2 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // To fill with action 2
            }
        };

        JButton button2 = new JButton("Add");
        button2.addActionListener(actionListener2);
        tool_frame.add(button2);

        // Button 3

        JButton button3 = new JButton("Remove");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // command.new_RSS();
            }
        });

        tool_frame.add(button3);

        Command b = new Command();
        b.show_input(5, Feed_panel);

        // Make Gui appear
        frame.setVisible(true);



    }



}
