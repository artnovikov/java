package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;

import java.util.concurrent.ThreadLocalRandom;
import javax.imageio.ImageIO;
import javax.swing.*;

import static javax.swing.text.StyleConstants.Background;

public class Main extends JFrame{

    private BufferedImage buffImg1, bufImg2;
    private int cloudWidth = 1000, cloudHeight = 150, driftWidth = 1280, driftHeight = 200, driftY = 550, snowflakeX = 200, snowflakeY = 50,
            snowflakeX1 = 500, snowflakeY1 = 505, snowflakeX2 = 550, snowflakeY2 = 505,snowflakeX3 = 640, snowflakeY3 = 415, snowflakeX4 = 752, snowflakeY4 = 420,
            snowflakeX5 = 670, snowflakeY5 = 385,  snowflakeX6 = 480, snowflakeY6 = 5;

    private static Image background;
    private static Image snowflake;
    private static Image drift;
    private static Image cloud;
    JButton bt;

    public Main() {
        setTitle("Многопоточное окно");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1280, 800);
        setLocationRelativeTo(null); //метод, отвечающий за центрирование окна в центр экрана
        setResizable(false); //метод, отвечающий за выключение функции изменение размеров окна

        setContentPane(new Background());
        Container content = getContentPane();

        bt = new JButton("Старт");
        bt.setPreferredSize(new Dimension(90,40)); //?????
        bt.setBackground(Color.white);
        bt.setForeground(Color.BLACK);
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e ){
                bt.setVisible(false);
                Thread waterMove = new Thread(new waterThread());
                waterMove.start();
                Thread waterMove1 = new Thread(new waterFlakeThread());
                waterMove1.start();

            }

    });
        content.add(bt);
        content.add(new CloudSnowbank());
}

    private static class Background extends JPanel{ // отрисовка нового фона

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            try {
                background = ImageIO.read(new File("background.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(background,0,0,null);
        }
    }

    private class CloudSnowbank extends JPanel {

        public CloudSnowbank() {
            setOpaque(false);
            setPreferredSize(new Dimension(1280, 800));
            try {
                cloud = ImageIO.read(new File("cloud.jpg"));
                drift = ImageIO.read(new File("C:\\Users\\John Дадаев\\Desktop\\lab6\\cugro.png"));
                snowflake = ImageIO.read(new File("C:\\Users\\John Дадаев\\Desktop\\lab6\\snesh.png"));
            } catch (IOException exc) {
            };
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D graphics2D = (Graphics2D)g;
            graphics2D.drawImage(cloud, 200, 0, cloudWidth, cloudHeight, this);
            graphics2D.drawImage(drift, 0,driftY, driftWidth, driftHeight, this);

            graphics2D.drawImage(snowflake, snowflakeX ,snowflakeY, 25, 25, this);
            graphics2D.drawImage(snowflake, snowflakeX1,snowflakeY1, 55, 55, this);
            graphics2D.drawImage(snowflake, snowflakeX2, snowflakeY2, 35, 35, this);
            graphics2D.drawImage(snowflake,  snowflakeX3, snowflakeY3, 45, 45, this);
            graphics2D.drawImage(snowflake,  snowflakeX4, snowflakeY4, 35, 35, this);
            graphics2D.drawImage(snowflake,  snowflakeX5, snowflakeY5,  45, 45, this);
            graphics2D.drawImage(snowflake,  snowflakeX6, snowflakeY6,  25, 25, this);
        }
    }

    public class waterThread implements Runnable{
        @Override
        public void run() {
            while (cloudHeight > 0) {
                cloudHeight -= 2;
                driftHeight+=2;
                driftY-=1;
                repaint();
                try {
                    Thread.sleep(100);
                }
                catch (Exception exc) {};
            }
        }
    }

    public class waterFlakeThread implements Runnable{
        @Override
        public void run() {
            while (cloudHeight > 0) {
                snowflakeX = ThreadLocalRandom.current().nextInt(0, cloudWidth + 1);
                snowflakeY = ThreadLocalRandom.current().nextInt(cloudHeight, driftY + 1);

                snowflakeX1 = ThreadLocalRandom.current().nextInt(0, cloudWidth + 1);
                snowflakeY1 = ThreadLocalRandom.current().nextInt(cloudHeight, driftY + 1);

                snowflakeX2 = ThreadLocalRandom.current().nextInt(0, cloudWidth + 1);
                snowflakeY2 = ThreadLocalRandom.current().nextInt(cloudHeight, driftY + 1);

                snowflakeX3 = ThreadLocalRandom.current().nextInt(0, cloudWidth + 1);
                snowflakeY3 = ThreadLocalRandom.current().nextInt(cloudHeight, driftY + 1);

                snowflakeX4 = ThreadLocalRandom.current().nextInt(0, cloudWidth + 1);
                snowflakeY4 = ThreadLocalRandom.current().nextInt(cloudHeight, driftY + 1);

                snowflakeX5 = ThreadLocalRandom.current().nextInt(0, cloudWidth + 1);
                snowflakeY5 = ThreadLocalRandom.current().nextInt(cloudHeight, driftY + 1);

                snowflakeX6= ThreadLocalRandom.current().nextInt(0, cloudWidth + 1);
                snowflakeY6 = ThreadLocalRandom.current().nextInt(cloudHeight, driftY + 1);
                try {
                    Thread.sleep(150);
                }
                catch (Exception exc) {};
            }
        }
    }
    public static void main(String[] args) throws IOException {
        new Main().setVisible(true);
    }
}