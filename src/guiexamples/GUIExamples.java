package guiexamples;

import java.awt.*;

public class GUIExamples {

    public static void main(String[] args) {

        //create a container
        Frame f=new Frame();
        f.setSize(400,400);
        f.setVisible(true);
        //create components
        Label l1=new Label("Name");
        Label l2=new Label("Age");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("Save");
        //add components on container
        //FlowLayout fL=new FlowLayout();
        //f.setLayout(fL);
        GridLayout gL=new GridLayout(3,2);
        f.setLayout(gL);
        
        
        f.add(l1); 
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        
    }
    
}
