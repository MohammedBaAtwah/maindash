package ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author Mohammed Ba Atwah
 */
public class Frame extends JFrame{
    Dimension screenres = Toolkit.getDefaultToolkit().getScreenSize();

    JPanel panel = new JPanel(new GridLayout());




    public Frame(){
        super("Test Title");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLocation(screenres.height / 2 , screenres.width / 2 );

        this.addPanels();

    }

    public void addPanels(){
        this.add(panel);
    }









}
