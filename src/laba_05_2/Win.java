package laba_05_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Win extends JFrame {
    private JLabel lLogin = new JLabel("Login");
    private JLabel lPassword = new JLabel("Password");
    private JLabel lBirthDay = new JLabel("Birth day");
    private JLabel lGender = new JLabel("Gender");

    private JTextField tLogin = new JTextField();
    private JTextField tPassword = new JTextField();

    private JRadioButton male = new JRadioButton("Male");
    private JRadioButton female = new JRadioButton("Female");
    private ButtonGroup buttonGroup = new ButtonGroup();

    private JButton bLogin = new JButton("Login");

    static String sDay[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    static String sMonth[] = {"январь","февраль","март","апрель","май","июнь","июль","август","сентябрь","октябрь","ноябрь","декабрь"};
    static String sYear[] = {"1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};

    private JComboBox day = new JComboBox(sDay);
    private JComboBox month = new JComboBox(sMonth);
    private JComboBox year = new JComboBox(sYear);

    public Win(String title) {
        super(title);
        this.setSize(400,250);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Настройки поля логин
        this.lLogin.setSize(100,25);
        this.lLogin.setLocation(15,15);
        this.add(lLogin);

        this.tLogin.setSize(220,25);
        this.tLogin.setLocation(150,15);
        this.add(tLogin);

        // Настройки поля пароль
        this.lPassword.setSize(100,25);
        this.lPassword.setLocation(15,55);
        this.add(lPassword);

        this.tPassword.setSize(220,25);
        this.tPassword.setLocation(150,55);
        this.add(tPassword);

        this.lBirthDay.setSize(100,25);
        this.lBirthDay.setLocation(15,95);
        this.add(lBirthDay);

        // Настройки поля дня рождения
        this.day.setSize(50,25);
        this.day.setLocation(150,95);
        this.add(day);

        this.month.setSize(90,25);
        this.month.setLocation(210,95);
        this.add(month);

        this.year.setSize(60,25);
        this.year.setLocation(310,95);
        this.add(year);

        // Настройки поля гендер
        this.lGender.setSize(100,25);
        this.lGender.setLocation(15,135);
        this.add(lGender);

        this.male.setSize(60,25);
        this.male.setLocation(150,135);
        this.male.setSelected(true);
        this.buttonGroup.add(male);
        this.add(male);

        this.female.setSize(70,25);
        this.female.setLocation(210,135);
        this.buttonGroup.add(female);
        this.add(female);

        // Настройка кнопки
        this.bLogin.setSize(80,25);
        this.bLogin.setLocation(150,170);
        this.add(bLogin);

        this.bLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try(FileWriter fileWriter = new FileWriter("data.txt", true)) {
                    fileWriter.write(tLogin.getText() + " " +
                            tPassword.getText() + " " +
                            day.getSelectedItem() + "." + month.getSelectedItem() + "." + year.getSelectedItem() + " " +
                            (male.isSelected() ? "male" : "female") + "\n");
                    System.exit(0);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }
}
