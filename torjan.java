import javax.swing.*;
import java.awt.*;

import java.io.*;
import javax.sound.sampled.*;

public class torjan { 
    public static void main(String[] args) {
        ImageIcon I = new ImageIcon(new ImageIcon("heart.png").getImage().getScaledInstance(210, 200,Image.SCALE_DEFAULT));
        JLabel l = new JLabel();
        l.setIcon(I);
        ImageIcon I1 = new ImageIcon(new ImageIcon("duck.png").getImage().getScaledInstance(210, 235, Image.SCALE_DEFAULT));  
        JLabel l1 = new JLabel();
        l1.setIcon(I1);
        ImageIcon I2 = new ImageIcon(new ImageIcon("sword.png").getImage().getScaledInstance(200, 210, Image.SCALE_DEFAULT));
        JLabel l2 = new JLabel();
        l2.setIcon(I2);
        ImageIcon I3 = new ImageIcon(new ImageIcon("fish.png").getImage().getScaledInstance(210, 160, Image.SCALE_SMOOTH));
        JLabel l3 = new JLabel();
        l3.setIcon(I3);

        JPanel rp = new JPanel();
        rp.setBackground(Color.red);
        rp.setBounds(0,0,750/3,750/3);
        rp.add(l1);
        JPanel bp = new JPanel();
        bp.setBackground(Color.blue);
        bp.setBounds(250,250,250,250);
        bp.add(l);
        JPanel gp = new JPanel(); 
        gp.setBackground(Color.green);
        gp.setBounds(0,250,250,250);
        gp.add(l2);
        JPanel yp = new JPanel();
        yp.setBackground(Color.yellow);
        yp.setBounds(250,0,250,250) ;
        yp.add(l3);
        JFrame f = new JFrame();
        ImageIcon i = new ImageIcon("cow.png"); 
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(0x123456));
        f.setSize(516,525);
        f.setLocation(450,100);
        f.setLayout(null);
        f.setTitle("MOOOOO!!!!");
        f.setResizable(false);
        f.add(rp) ; 
        f.add(bp);
        f.add(gp);
        f.add(yp);
        f.setIconImage(i.getImage());
        sound("date.wav");
        
    }
    
    
    public static void sound (String filelocation) {
        Clip c ; 
        try {
            File file = new File(filelocation) ;
            AudioInputStream sound1 = AudioSystem.getAudioInputStream(file);
            c = AudioSystem.getClip();
            c.open(sound1);
            c.setFramePosition(0);
            c.start() ; 
            c.loop(Clip.LOOP_CONTINUOUSLY);
        }catch ( Exception e) {
            
        }
    }
}
