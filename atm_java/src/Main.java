
import org.w3c.dom.events.Event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main (String [] args)
    {
        JFrame frame = new JFrame("ATM");
        Dimension size = new Dimension(800,600);
        frame.setSize(size);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,800,600);
        panel1.setBackground(Color.CYAN);
        panel1.setLayout(null);
        frame.add(panel1);
        JLabel l1 = new JLabel ("Please choose your language:");
        JLabel l2 = new JLabel ("لطفا زبان خود را انتخاب کنید:");
        l1.setBounds(50,50,300,25);
        l2.setBounds(550,50,300,25);
        JButton b1 = new JButton("English");
        JButton b2 = new JButton("فارسی");

        panel1.add(l1);
        panel1.add(l2);
        b1.setBounds(50,400,100,50);
        b2.setBounds(650,400,100,50);
        panel1.add(b1);
        panel1.add(b2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel2 = new JPanel();
                panel2.setBackground(Color.GREEN);
                panel2.setLayout(null);
                frame.remove(panel1);
                frame.add(panel2);
                JLabel passLabel = new JLabel("Please enter your password:");
                passLabel.setBounds(300,50,200,50);
                panel2.add(passLabel);
                JTextField passText = new JTextField();
                passText.setBounds(300,300,150,50);
                panel2.add(passText);

                JButton passButton1 = new JButton("Confirm");
                passButton1.setBounds(300,500,150,50);
                panel2.add(passButton1);
                frame.revalidate();
                frame.repaint();
                passButton1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JPanel sorryPanel = new JPanel();
                        frame.remove(panel2);
                        frame.add(sorryPanel);
                        JLabel sorryLabel = new JLabel("Sorry this service did not work in your current location!");
                        sorryPanel.setLayout(null);
                        sorryPanel.setBackground(Color.red);
                        sorryLabel.setBounds(100,250,600,100);
                        sorryPanel.add(sorryLabel);
                        frame.revalidate();
                        frame.repaint();
                    }
                });
            }
        });


        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JPanel panel2 = new JPanel();
                panel2.setBackground(Color.GREEN);
                panel2.setLayout(null);
                frame.remove(panel1);
                frame.add(panel2);


                JLabel passLabel = new JLabel("لطفا رمز خود را وارد کنید:");
                passLabel.setBounds(300,50,150,50);
                panel2.add(passLabel);


                JTextField passText = new JTextField();
                passText.setBounds(300,300,150,50);
                panel2.add(passText);

                JButton passButton2 = new JButton("ثبت");
                passButton2.setBounds(300,500,150,50);
                panel2.add(passButton2);



                frame.revalidate();
                frame.repaint();

                passButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JPanel mainPanel = new JPanel();
                        mainPanel.setBackground(Color.GRAY);
                        frame.remove(panel2);
                        frame.add(mainPanel);
                        mainPanel.setLayout(null);

                        JButton withdrawalButton = new JButton("برداشت وجه");
                        withdrawalButton.setBounds(15,200,100,50);
                        mainPanel.add(withdrawalButton);

                        withdrawalButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel withdrawalPanel = new JPanel();
                                withdrawalPanel.setBackground(Color.GRAY);
                                frame.remove(mainPanel);
                                frame.add(withdrawalPanel);
                                withdrawalPanel.setLayout(null);
                                JLabel withdrawLabel = new JLabel("لطفا مبلغ مورد نظر خود را انتخاب کنید.");
                                withdrawLabel.setBounds(350,50,300,75);
                                withdrawalPanel.add(withdrawLabel);
                                JButton b5 = new JButton( "50`000 IRR");
                                b5.setBounds(15,200,200,50);
                                withdrawalPanel.add(b5);

                                b5.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(withdrawalPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(250,200,150,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                JButton b15 = new JButton("150`000 IRR");
                                b15.setBounds(15,400,200,50);
                                withdrawalPanel.add(b15);

                                b15.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(withdrawalPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(250,200,150,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                JButton b100 = new JButton("100`000`000 IRR");
                                b100.setBounds(550,200,200,50);
                                withdrawalPanel.add(b100);

                                b100.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(withdrawalPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(250,200,200,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                JButton b150 = new JButton("150`000`000 IRR");
                                b150.setBounds(550,400,200,50);
                                withdrawalPanel.add(b150);

                                b150.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(withdrawalPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(250,200,150,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });



                                frame.revalidate();
                                frame.repaint();
                            }
                        });

                        JButton cardByCardButton = new JButton("انتقال وجه");
                        cardByCardButton.setBounds(15,380,100,50);
                        mainPanel.add(cardByCardButton);

                        cardByCardButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel cardByCardPanel = new JPanel();
                                cardByCardPanel.setBackground(Color.GRAY);
                                frame.remove(mainPanel);
                                frame.add(cardByCardPanel);
                                cardByCardPanel.setLayout(null);

                                JLabel cardLabel = new JLabel("مبلغ مورد نظر را وارد کنید:");
                                cardLabel.setBounds(350,200,150,20);
                                cardByCardPanel.add(cardLabel);


                                JTextField cardText = new JTextField();
                                cardText.setBounds(350,250,150,40);
                                cardByCardPanel.add(cardText);

                                JLabel cardLabel2 = new JLabel("شماره کارت مقصد وارد کنید:");
                                cardLabel2.setBounds(350,50,150,20);
                                cardByCardPanel.add(cardLabel2);


                                JTextField cardText2 = new JTextField();
                                cardText2.setBounds(350,200,150,40);
                                cardByCardPanel.add(cardText2);

                                JButton cardButton = new JButton("ثبت");
                                cardButton.setBounds(350,400,150,50);
                                cardByCardPanel.add(cardButton);


                                cardButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(cardByCardPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(350,200,150,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                frame.revalidate();
                                frame.repaint();

                            }
                        });

                        JButton changePassButton = new JButton("عملیات رمز");
                        changePassButton.setBounds(650,200,100,50);
                        mainPanel.add(changePassButton);

                        changePassButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel changePassPanel = new JPanel();
                                changePassPanel.setBackground(Color.GRAY);
                                frame.remove(mainPanel);
                                frame.add(changePassPanel);
                                changePassPanel.setLayout(null);


                                JLabel passLabel = new JLabel("رمز جدید را وارد کنید:");
                                passLabel.setBounds(350,200,150,20);
                                changePassPanel.add(passLabel);


                                JTextField passText = new JTextField();
                                passText.setBounds(350,250,150,40);
                                changePassPanel.add(passText);

                                JButton passButton = new JButton("ثبت");
                                passButton.setBounds(350,400,150,50);
                                changePassPanel.add(passButton);

                                passButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(changePassPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(350,200,150,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });



                                frame.revalidate();
                                frame.repaint();
                            }
                        });

                        JButton balanceButton = new JButton("اعلام موجودی");
                        balanceButton.setBounds(650,380,100,50);
                        mainPanel.add(balanceButton);

                        balanceButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel balancePanel = new JPanel();
                                balancePanel.setBackground(Color.GRAY);
                                frame.remove(mainPanel);
                                frame.add(balancePanel);
                                balancePanel.setLayout(null);


                                JLabel balanceLabel = new JLabel("مشترکین گرامی شما به دلیل عدم موجودی کافی صلاحیت رؤیت موجودی خود را ندارید");
                                balanceLabel.setBounds(200,200,500,20);
                                balancePanel.setBackground(Color.red);
                                balancePanel.add(balanceLabel);


                                frame.revalidate();
                                frame.repaint();

                            }
                        });

                        frame.revalidate();
                        frame.repaint();
                    }
                });

                frame.revalidate();
                frame.repaint();

            }
        });


        frame.setVisible(true);

    }
}
