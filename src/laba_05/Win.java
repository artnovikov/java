package laba_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Win extends JFrame {
    private Object box;
    private String myList[] = {"Element 1",
            "Element 2",
            "Element 3",
            "Element 4",
            "Element 5",
            "Element 6",
            "Element 7",
            "Element 8",
            "Element 9",
            "Element 10",
            "Element 11",
            "Element 12",
            "Element 13",
            "Element 14",
            "Element 15"};
    private JList list = new JList(myList);
    private JScrollPane scrollPane = new JScrollPane();
    private JTextField text = new JTextField();
    private JPanel leftPanel = new JPanel();
    private JPanel rightPanel = new JPanel();

    public Win(String title) {
        super(title);
        this.setSize(450,200);
        this.setResizable(false);
        this.setLayout(new GridLayout(1,2,5,5));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.scrollPane.setViewportView(this.list);
        this.scrollPane.setSize(180,110);
        this.scrollPane.setLocation(15,15);

        this.text.setSize(185,25);
        this.text.setLocation(15,15);

        this.leftPanel.setLayout(null);
        this.leftPanel.add(scrollPane);

        this.rightPanel.setLayout(null);
        this.rightPanel.add(text);

        this.add(leftPanel);
        this.add(rightPanel);


        this.list.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JList list1 = (JList) e.getSource();
                box = list1.getSelectedValuesList();
                text.setText(box.toString());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                JList list1 = (JList) e.getSource();
                box = list1.getSelectedValuesList();
                System.out.println(box.toString());
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }
}
