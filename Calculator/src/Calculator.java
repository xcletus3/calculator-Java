import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
//-----------------Buttons-----------------
    private JPanel panel;
    private JTextField display;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton BSbutton;
    private JButton ACbutton;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton DECbutton;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton MULbutton;
    private JButton ADDbutton;
    private JButton DIVbutton;
    private JButton SUBbutton;
    private JButton EQLbutton;
    private JTextField TextField;

//--------------------UI--------------------
    public Calculator(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
//-----------------Actions-----------------
        ACbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                TextField.setText("");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"0");
            }
        });
        DECbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+".");
            }
        });
        MULbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num = Double.parseDouble(display.getText());
                    calculation = 3;
                    display.setText("");
                    TextField.setText(num + "*");
                } catch (Exception e4){
                    String screenTxt = TextField.getText();
                    if (screenTxt.length() > 0){
                        screenTxt = screenTxt.substring(0, screenTxt.length()-1);
                        TextField.setText(screenTxt + "*");
                    }
                }
            }
        });
        DIVbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num = Double.parseDouble(display.getText());
                    calculation = 4;
                    display.setText("");
                    TextField.setText(num + "/");
                } catch (Exception e1) {
                    String screenTxt = TextField.getText();
                    if (screenTxt.length() > 0){
                        screenTxt = screenTxt.substring(0, screenTxt.length()-1);
                        TextField.setText(screenTxt + "/");
                    }
                }
            }
        });
        ADDbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num = Double.parseDouble(display.getText());
                    calculation = 1;
                    display.setText("");
                    TextField.setText(num + "+");
                } catch (Exception e2){
                    String screenTxt = TextField.getText();
                    if (screenTxt.length() > 0){
                        screenTxt = screenTxt.substring(0, screenTxt.length()-1);
                        TextField.setText(screenTxt + "+");
                    }
                }
            }
        });
        SUBbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num = Double.parseDouble(display.getText());
                    calculation = 2;
                    display.setText("");
                    TextField.setText(num + "-");
                } catch (Exception e3){
                    String screenTxt = TextField.getText();
                    if (screenTxt.length() > 0){
                        screenTxt = screenTxt.substring(0, screenTxt.length()-1);
                        TextField.setText(screenTxt + "-");
                    }
                }
            }
        });
        EQLbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    TextField.setText(display.getText());
                    operation();
                } catch (Exception e1) {
                    display.setText("ERROR");
                    TextField.setText("");
                }
            }
        });
        BSbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String screen = display.getText();
                if (screen.length() > 0){
                    screen = screen.substring(0, screen.length()-1);
                    display.setText(screen);
                }
            }
        });
    }

//-----------------Operations-----------------
    double num, ans;
    int calculation;
    public void operation() {
        switch (calculation)
        {
            case 1:
                ans = num + Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;

            case 2:
                ans = num - Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;

            case 3:
                ans = num * Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;

            case 4:
                ans = num / Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;
        }
    }

//-----------------Initialization-----------------
    public static void main(String[] args) {
        JFrame frame = new Calculator("Calculator");
        frame.setVisible(true);
    }
}
