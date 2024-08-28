package client;

import javax.swing.*;    
import javax.swing.event.*;  
public class MySpinner {  
    public static void main(String[] args) {    
    JFrame f=new JFrame("Spinner Example");
    final JLabel label = new JLabel();
             label.setHorizontalAlignment(JLabel.CENTER);    
             label.setSize(250,100);    
     
    JSpinner spinner = new JSpinner();   
            spinner.setBounds(100,100,50,30);    
            f.add(spinner);  
            f.add(label);  
           f.setSize(300,300);    
           f.setLayout(null);    
           f.setVisible(true);     
           spinner.addChangeListener(new ChangeListener() {  
        public void stateChanged(ChangeEvent e) {  
        	//getvalue from the spinner
        	int number= (int)((JSpinner)e.getSource()).getValue();
        	label.setText("you are buying " + number + " item "); 
        }  
     });  
}  
}  