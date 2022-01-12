package multiplicationtable;




import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MultiplicationTable extends JFrame {

    private Container c;
    private JLabel imgLabel, headingLabel;
    private ImageIcon img, btnImg;
    private Font f;
    private JTextField number;
    private JButton clearBtn;
    private Cursor cursor;
    private JTextArea ta;

    MultiplicationTable(){

        this.setTitle("Multiplication Table");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        img = new ImageIcon(getClass().getResource("bannerImg.jpg"));
        btnImg = new ImageIcon(getClass().getResource("clear.png"));

        cursor = new Cursor(Cursor.HAND_CURSOR);

        f = new Font("Tahoma", Font.BOLD, 20);

        imgLabel = new JLabel(img);
        imgLabel.setBounds(10, 10, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        headingLabel = new JLabel("Enter Any Number:");
        headingLabel.setBounds(10, 265, 200, 40);
        headingLabel.setForeground(Color.ORANGE);
        headingLabel.setFont(f);
        c.add(headingLabel);

        number = new JTextField();
        number.setBounds(215, 265, 160, 40);
        number.setFont(f);
        number.setHorizontalAlignment(JTextField.CENTER);
        c.add(number);

        clearBtn = new JButton(btnImg);
        clearBtn.setBounds(250, 315, 90, 40);
        clearBtn.setCursor(cursor);
        c.add(clearBtn);

        ta = new JTextArea();
        ta.setBounds(10, 370, 360, 280);
        ta.setBackground(Color.LIGHT_GRAY);
        ta.setFont(f);
        c.add(ta);

        number.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String value = number.getText();
                if(value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You Didn't Put Any Valid Number.");
                }
                else {
                    ta.setText("");
                    int num = Integer.parseInt(number.getText());
                    System.out.println("ok");
                    for(int i=1; i<=10; i++){
                        int result = num * i;

                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String incr = String.valueOf(i);

                        ta.append(n + " X " + incr + " = " + r + "\n");
                    }
                }
            }
        });
        clearBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                number.setText("");
                ta.setText("");
            }
        });

    }

    public static void main(String[] args){
        MultiplicationTable frame = new MultiplicationTable();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 700);
        frame.setLocationRelativeTo(null);
    }
}