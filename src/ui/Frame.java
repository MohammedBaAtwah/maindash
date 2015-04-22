package ui;


import common.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author Mohammed Ba Atwah
 */
public class Frame extends JFrame{


    JPanel panel = new JPanel(new GridLayout());




    public Frame(){
        super("Test Title");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLocation(Constants.screenres.height / 2 , Constants.screenres.width / 2 );

        addPanels();
    }

    /**
     *  This method is for panel addition and operations.
     */
    private void addPanels(){
        this.add(panel);
    }









}
