package guiexamples;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class MLDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 400);
        f.setVisible(true);
        Label l1 = new Label("Name");
        Label l2 = new Label("Age");
        Label l3 = new Label("Subjects");
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        Button b1 = new Button("Save");
        Button b2 = new Button("Cancel");
        Button b3 = new Button("Exit");
        Checkbox c1=new Checkbox("java");
        Checkbox c2=new Checkbox("php");
        
        Panel p=new Panel();
        Panel p1=new Panel();
        Panel p2=new Panel();
        p.setLayout(new FlowLayout(0));
        p1.setLayout(new GridLayout(3,2));
        p2.setLayout(new FlowLayout());
        
        p.add(c1); p.add(c2);
        
        p1.add(l1); p1.add(t1);
        p1.add(l2); p1.add(t2);
        p1.add(l3); p1.add(p);
        
        p2.add(b1); p2.add(b2); p2.add(b3);
        
        
        f.add("North",p1);
        f.add("South",p2);
        
        
        p2.setBackground(Color.pink);
        
        
    }
    
}
