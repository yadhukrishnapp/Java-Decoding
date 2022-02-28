import java.awt.*; 
import java.awt.event.*; 

public class AWTDemo4 
{ 
    private static Dialog d; 
    AWTDemo4(){ 
        Frame f= new Frame(); 
        d = new Dialog(f , "Dialog Example", true); 
        d.setLayout( new FlowLayout() ); 
        Button b = new Button ("OK"); 
        b.addActionListener ( new ActionListener() 
        { 
            public void actionPerformed( ActionEvent e ) 
            { 
                AWTDemo4.d.setVisible(false); 
            } 
        }); 
        d.add( new Label ("Click button to continue.")); 
        d.add(b); 
        d.setSize(300,300); 
        d.setVisible(true); 
        Panel panel=new Panel(); 
        panel.setBounds(40,80,200,200); 
        panel.setBackground(Color.gray); 
        panel.add(b1); 
        panel.add(b2); 
        f.add(panel); 
        f.setSize(400,400); 
        f.setLayout(null); 
        f.setVisible(true); 
        b1.setBounds(50,100,80,30); 
         b1.setBackground(Color.yellow); 
    } 
    
    public static void main(String args[]) 
    { 
        new AWTDemo4(); 
    } 
}