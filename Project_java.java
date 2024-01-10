import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project_java{
    public Project_java() {
        Frame frame = new Frame("Java Project");
        frame.setBackground(Color.YELLOW);
        frame.setForeground(Color.RED);

        JLabel piclabel = new JLabel(new ImageIcon("C:\\Users\\RD\\Pictures\\iitm.jpg")); 
        piclabel.setBounds(0, 0, 1000, 310);
        frame.add(piclabel) ;

    
        Label label1 = new Label("Welcome to College Feedback Portal");
        label1.setBounds(400, 320, 250, 40);
        frame.add(label1);
 
        Label label2 = new Label("Enter your first name:");
        label2.setBounds(20, 350, 150, 20);
        frame.add(label2);

        Label label3 = new Label("Enter your last name:");
        label3.setBounds(20, 380, 150, 20);
        frame.add(label3);

        Label label4 = new Label("Enter your Father's name:");
        label4.setBounds(20, 410, 150, 20);
        frame.add(label4);

        Label label5 = new Label("Enter your phone number:");
        label5.setBounds(20, 440, 150, 20);
        frame.add(label5);
 
        TextField textField1 = new TextField();
        textField1.setBounds(200, 350, 200, 20);

        TextField textField2 = new TextField();
        textField2.setBounds(200, 380, 200, 20);

        TextField textField3 = new TextField();
        textField3.setBounds(200, 410, 200, 20);

        TextField textField4 = new TextField();
        textField4.setBounds(200, 440, 200, 20);

        Label mylabel = new Label("Choose your course:");
        mylabel.setBounds(20, 470, 150, 20);
        frame.add(mylabel);

        JRadioButton radioButton1 = new JRadioButton("BBA");
        radioButton1.setBounds(20, 500, 1000, 30);

        JRadioButton radioButton2 = new JRadioButton("BCA");
        radioButton2.setBounds(20, 525, 1000, 30);

        JRadioButton radioButton3 = new JRadioButton("BA");
        radioButton3.setBounds(20, 550, 1000, 30);

        Label mylabel1 = new Label("Please choose the correct option in which field you want to provide feedback :");
        mylabel1.setBounds(20, 585, 500, 30);
        frame.add(mylabel1);

        Checkbox checkbox1 = new Checkbox("Sports");
        checkbox1.setBounds(20, 610, 100, 20);

        Checkbox checkbox2 = new Checkbox("Education");
        checkbox2.setBounds(20, 630, 100, 20);

        Checkbox checkbox3 = new Checkbox("Events and Activities");
        checkbox3.setBounds(20, 660, 150, 20);

        Checkbox checkbox4 = new Checkbox("Management and Infrastructure");
        checkbox4.setBounds(20, 690, 200, 20);

        Checkbox checkbox5 = new Checkbox("Placement and Training");
        checkbox5.setBounds(20, 720, 200, 20);

        Label mylabel2 = new Label("Please provide your feedback according to the option you choose above : ");
        mylabel2.setBounds(20, 750, 500, 30);
        frame.add(mylabel2);

        TextArea textArea = new TextArea("", 5, 5);
        textArea.setBounds(20, 780, 800, 90);

        //Label to confirm submission of the feedback form..
        JLabel l1 = new JLabel();
        l1.setBounds(500, 880, 500, 30);

        Button button1 = new Button("Submit");
        button1.setBounds(350, 880, 50, 30);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                l1.setText("The form is submitted successfully!");
            }
        });

        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(textField4);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);
        frame.add(checkbox4);
        frame.add(checkbox5);
        frame.add(textArea);
        frame.add(button1);
        frame.add(l1);

        frame.setSize(1000, 4000);
        frame.setLayout(null);
        frame.setVisible(true);
    } 

    public static void main(String[] args) {
        Project_java p = new Project_java();
    }
}
