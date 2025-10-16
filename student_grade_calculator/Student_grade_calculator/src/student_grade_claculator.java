import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class student_grade_claculator extends JFrame implements ActionListener {
    JPanel panel1,panel2,panel3;
    JButton btn1,btn2;
    JLabel heading,label2,label3,label4,label5,label6,label7,avg,total,grade,feedback;
    JTextField textField1,textField2,textField3,textField4,textField5;

    /*public int getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public int getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    JTextField textField1;
    JTextField textField2;

    public int getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    JTextField textField3;

    public int getTextField4() {
        return textField4;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    JTextField textField4;

    public int getTextField5() {
        return textField5;
    }

    public void setTextField5(JTextField textField5) {
        this.textField5 = textField5;
    }

    JTextField textField5;

    public int getTextField6() {
        return textField6;
    }*/


    JTextField textField6;
    student_grade_claculator(){

        panel1 = new JPanel();
        panel1.setBounds(5,5,1525,150);
        panel1.setBackground(new Color(161, 225, 191, 242));
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(("icons/header.png")));
        Image image = i1.getImage().getScaledInstance(1250,120,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(110,20,1250,120);
        add(label);

        add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(5,160,1525,940);
        panel2.setBackground(new Color(236, 235, 148, 242));

        panel3 = new JPanel();
        panel3.setBounds(5,5,800,500);
        panel3.setBackground(new Color(161, 225, 191, 242));
        panel3.setLocation(300,250);;
        panel3.setLayout(null);

        heading = new JLabel("Enter the Marks of Subjects:");
        heading.setBounds(80,30,660,53);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        panel3.add(heading);

        label2 = new JLabel(" First Language: ");
        label2.setBounds(80,110,200,25);
        label2.setFont(new Font("Tahoma",Font.BOLD,18));
        panel3.add(label2);

        textField1 = new JTextField();
        textField1.setBounds(250,117,150,20);
        panel3.add(textField1);

        label3 = new JLabel("Second Language:");
        label3.setBounds(80,150,200,25);
        label3.setFont(new Font("Tahoma",Font.BOLD,18));
        panel3.add(label3);

        textField2 = new JTextField();
        textField2.setBounds(250,157,150,20);
        panel3.add(textField2);


        label4 = new JLabel("English:");
        label4.setBounds(80,190,200,25);
        label4.setFont(new Font("Tahoma",Font.BOLD,18));
        panel3.add(label4);

        textField3 = new JTextField();
        textField3.setBounds(250,197,150,20);
        panel3.add(textField3);


        label5 = new JLabel("Mathematics:");
        label5.setBounds(80,230,200,25);
        label5.setFont(new Font("Tahoma",Font.BOLD,18));
        panel3.add(label5);

        textField4 = new JTextField();
        textField4.setBounds(250,237,150,20);
        panel3.add(textField4);


        label6 = new JLabel("Science:");
        label6.setBounds(80,270,200,25);
        label6.setFont(new Font("Tahoma",Font.BOLD,18));
        panel3.add(label6);

        textField5 = new JTextField();
        textField5.setBounds(250,277,150,20);
        panel3.add(textField5);


        label7 = new JLabel("Social:");
        label7.setBounds(80,310,200,25);
        label7.setFont(new Font("Tahoma",Font.BOLD,18));
        panel3.add(label7);

        textField6 = new JTextField();
        textField6.setBounds(250,317,150,20);
        panel3.add(textField6);


        btn1 = new JButton(" Check ");
        btn1.setBounds(250,350,100,30);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.white);
        btn1.addActionListener(e -> grades(textField1.getText(),textField2.getText(),textField3.getText(),textField4.getText(),textField5.getText(),textField6.getText()));
        panel3.add(btn1);


        btn2 = new JButton(" Back ");
        btn2.setBounds(80,350,100,30);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.white);
        btn2.addActionListener(e ->setVisible(false) );
        panel3.add(btn2);


        avg = new JLabel(" ");
        avg.setBounds(450,150,250,20);
        avg.setFont(new Font("Tahoma",Font.BOLD,18));
        panel3.add(avg);

        total = new JLabel(" ");
        total.setBounds(450,200,250,20);
        total.setFont(new Font("Tahoma",Font.BOLD,18));
        panel3.add(total);

        grade = new JLabel(" ");
        grade.setBounds(450,250,250,20);
        grade.setFont(new Font("Tahoma",Font.BOLD,18));
        panel3.add(grade);

        feedback = new JLabel("");
        feedback.setBounds(100,400,500,20);
        feedback.setFont(new Font("Tahoma",Font.BOLD,18));
        panel3.add(feedback);
        add(panel3);
        add(panel2);

        setSize(1950,1090);
        setLayout(null);
        setVisible(true);

    }

    void grades(String sub1, String sub2, String sub3, String sub4, String sub5, String sub6){
        int one  = Integer.parseInt(sub1);
        int two  = Integer.parseInt(sub1);
        int three  = Integer.parseInt(sub1);
        int four  = Integer.parseInt(sub1);
        int five  = Integer.parseInt(sub1);
        int six  = Integer.parseInt(sub1);

        double Total_marks = one+two+three+four+five+six;
        feedback.setText(" ");
        if (Total_marks>600){
            feedback.setText("please enter marks below 100 for each subject");
            avg.setText(" ");
            total.setText(" ");
            grade.setText(" ");
            return;
        }
        double Average_marks = (double)Total_marks/5;
        String Grade;
        if (Average_marks >= 90) {
            Grade = "A+";
        } else if (Average_marks >= 80) {
            Grade = "A";
        } else if (Average_marks >= 70) {
            Grade = "B";
        } else if (Average_marks >= 60) {
            Grade = "C";
        } else if (Average_marks >= 50) {
            Grade = "D";
        } else {
            Grade = "F";
        }



        avg.setText("Average Marks :"+Average_marks);
        total.setText("Total Marks :"+Total_marks);
        grade.setText("grade:"+Grade);




    }

    public static void main(String[] args) {
        new student_grade_claculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
