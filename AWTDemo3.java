import java.awt.*;
 public class AWTDemo3 
 { 
     AWTDemo3() 
     { 
         Frame f= new Frame("Panel Example"); 
         Panel panel=new Panel(); 
         panel.setBounds(40,80,200,200); 
         panel.setBackground(Color.green); 
         Button b1=new Button("Button 1"); 
         b1.setBounds(50,100,80,30); 
         b1.setBackground(Color.red); 
         Button b2=new Button("Button 2"); 
         b2.setBounds(100,100,80,30); 
         b2.setBackground(Color.blue); 
         panel.add(b1); 
         panel.add(b2); 
         f.add(panel); 
         f.setSize(1200,1200); 
         f.setLayout(null); 
         f.setVisible(true); 
        } 
        
        public static void main(String args[]) 
        { 
            AWTDemo3 d = new AWTDemo3(); 
        } 
    }