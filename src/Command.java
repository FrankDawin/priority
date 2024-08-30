import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class Command {

    public static void show_input(int count, JPanel container) {
        for (int i = 0; i < count; i++) {
            Data_input a = new Data_input();
            container.add(a, BorderLayout.WEST);

            // change color of background when clicked
            a.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Change background color to a random color when panel is clicked
                    if (a.getBackground().equals(Color.WHITE)) {
                        a.setBackground(Color.BLACK);
                    } else {
                        a.setBackground(Color.WHITE);
                    }
                }
            });

        }}

    

}
