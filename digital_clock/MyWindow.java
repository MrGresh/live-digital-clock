import java.awt.*;
import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

public class MyWindow extends JFrame implements ActionListener {

    
    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("",Font.BOLD,35);



    MyWindow(){
        super.setTitle("My Clock");
        super.setSize(400,400);
        super.setLocation(300,50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }

    public void createGUI() {
        heading = new JLabel("My Clock");
        clockLabel = new JLabel("Time");
        heading.setFont(font);
        clockLabel.setFont(font);
        
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);
    }

    public void startClock(){
        Timer timer = new Timer(1000,new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                
                String dateTime = new Date().toLocaleString();
                clockLabel.setText(dateTime);
            }
        });
        timer.start();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         
        // No need to do anything here........ because we have already used this method above in startClock method.
        
    }
   
}