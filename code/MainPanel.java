import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;

public class MainPanel extends JFrame{

    private int WIDTH = 1000;
    private int HEIGHT = 700;
    
    private ImageIcon imageIcon1 = new ImageIcon("picture/buttonop.png");
    private Image image1 = imageIcon1.getImage();
    private Image newimg1 = image1.getScaledInstance(38,28, java.awt.Image.SCALE_SMOOTH);

    private ImageIcon imageIcon2 = new ImageIcon("picture/buttonback1.png");
    private Image image2 = imageIcon2.getImage();
    private Image newimg2 = image2.getScaledInstance(38,28, java.awt.Image.SCALE_SMOOTH);

    private ImageIcon imageIcon3 = new ImageIcon("picture/7.png");
    private Image image3 = imageIcon3.getImage();
    private Image newimg3 = image3.getScaledInstance(30,45, java.awt.Image.SCALE_SMOOTH);


    public MainPanel() {

        setTitle("Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(1,1));

        java.awt.Dimension scr_size =java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((scr_size.width - WIDTH) / 2,(scr_size.height - HEIGHT) / 2);//視窗置中

        JPanel first= new JPanel();
        first.setBackground(Color.BLACK);
        CardLayout card=new CardLayout();
        first.setLayout(card);

        ImageIcon imageIcon = new ImageIcon("picture/Start.JPG"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(1000,550, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way 
        imageIcon = new ImageIcon(newimg); // transform it back
        Icon icon=imageIcon;

        JLabel start=new JLabel();
        start.setIcon(icon);

        start.setLayout(new GridBagLayout());
        GridBagConstraints gc1 = new GridBagConstraints();

        gc1.gridx        = 0;
        gc1.gridy        = 0;
        gc1.gridwidth    = 1;
        gc1.gridheight   = 1;
        gc1.anchor       = gc1.CENTER;
        gc1.fill         = gc1.BOTH;

        JButton startbutton=new JButton("START");
        startbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                card.next(first);
                startbutton.setVisible(false);
            }
        });
        gc1.gridx= 24;
        gc1.gridy= 24;
        start.add(startbutton,gc1);

        first.add(start);
        first.add(this.table());

        add(first);
    }

    public JLabel table(){
		JLabel table=new JLabel();

        ImageIcon imageIcon = new ImageIcon("picture/table.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(1000,760, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way 
        imageIcon = new ImageIcon(newimg); // transform it back
        Icon icon=imageIcon;

        PlayerPanel pl=new PlayerPanel();
        table.setIcon(icon);
        table.setLayout(new BorderLayout());
        table.add(this.computer1(), BorderLayout.WEST);
        table.add(this.computer2(), BorderLayout.NORTH);
        table.add(this.computer3(), BorderLayout.EAST);
        table.add(pl, BorderLayout.CENTER);

        return table;
    }


    public JPanel computer1() {

        JPanel computer1 = new JPanel();
        computer1.setOpaque(false);
        computer1.setLayout(new GridBagLayout());

        GridBagConstraints gc1 = new GridBagConstraints();

        gc1.gridx        = 0;
        gc1.gridy        = 0;
        gc1.gridwidth    = 1;
        gc1.gridheight   = 1;
        // gc1.insets       = new Insets (5, 5, 5, 5);
        gc1.anchor       = gc1.CENTER;
        gc1.fill         = gc1.BOTH;

        imageIcon1 = new ImageIcon(newimg1); // transform it back
        Icon icon1=imageIcon1;

        imageIcon2 = new ImageIcon(newimg2); // transform it back
        Icon icon2=imageIcon2;

        for(int i=1;i<=19;i++){

            JButton op = new JButton(icon1);
            op.setOpaque(false);
            op.setBorder(null);
            op.setContentAreaFilled(false);
            gc1.gridy=i-1;
            computer1.add(op,gc1);

            JButton back = new JButton(icon2);
            back.setOpaque(false);
            back.setBorder(null);
            back.setContentAreaFilled(false);
            gc1.gridx=1;
            gc1.gridy=i-4;
            computer1.add(back,gc1);

            JButton op2 = new JButton(icon1);
            op2.setOpaque(false);
            op2.setBorder(null);
            op2.setContentAreaFilled(false);
            gc1.gridx=2;
            gc1.gridy=i-1;
            computer1.add(op2,gc1);
        }
        JButton op3 = new JButton(icon2);
        op3.setOpaque(false);
        op3.setBorder(null);
        op3.setContentAreaFilled(false);
        gc1.gridx=1;
        gc1.gridy=16;
        computer1.add(op3,gc1);

        return computer1;
    }

    public JPanel computer2() {
        JPanel computer2 = new JPanel();
        computer2.setOpaque(false);
        computer2.setLayout(new GridBagLayout());

        GridBagConstraints gc2 = new GridBagConstraints();

        gc2.gridx        = 0;
        gc2.gridy        = 0;
        gc2.gridwidth    = 1;
        gc2.gridheight   = 1;
        // gc1.insets       = new Insets (5, 5, 5, 5);
        gc2.anchor       = gc2.CENTER;
        gc2.fill         = gc2.BOTH;

        Image newimg1 = image1.getScaledInstance(30,40, java.awt.Image.SCALE_SMOOTH);
        imageIcon1 = new ImageIcon(newimg1); // transform it back
        Icon icon1=imageIcon1;

        Image newimg2 = image2.getScaledInstance(30,40, java.awt.Image.SCALE_SMOOTH);
        imageIcon2 = new ImageIcon(newimg2); // transform it back
        Icon icon2=imageIcon2;

        for(int i=1;i<=15;i++){

            JButton op = new JButton(icon1);
            op.setOpaque(false);
            op.setBorder(null);
            op.setContentAreaFilled(false);
            gc2.gridx=i-1;
            computer2.add(op,gc2);

            JButton back = new JButton(icon2);
            back.setOpaque(false);
            back.setBorder(null);
            back.setContentAreaFilled(false);
            gc2.gridy=1;
            computer2.add(back,gc2);

            JButton op2 = new JButton(icon1);
            op2.setOpaque(false);
            op2.setBorder(null);
            op2.setContentAreaFilled(false);
            gc2.gridx=2;
            computer2.add(op2,gc2);
        }
        JButton op3 = new JButton(icon2);
        op3.setOpaque(false);
        op3.setBorder(null);
        op3.setContentAreaFilled(false);
        gc2.gridx=15;
        gc2.gridy=1;
        computer2.add(op3,gc2);

        return computer2;
    }

    public JPanel computer3() {
       JPanel computer3 = new JPanel();
        computer3.setOpaque(false);
        computer3.setLayout(new GridBagLayout());

        GridBagConstraints gc3 = new GridBagConstraints();

        gc3.gridx        = 0;
        gc3.gridy        = 0;
        gc3.gridwidth    = 1;
        gc3.gridheight   = 1;
        // gc1.insets       = new Insets (5, 5, 5, 5);
        gc3.anchor       = gc3.CENTER;
        gc3.fill         = gc3.BOTH;

        imageIcon1 = new ImageIcon(newimg1); // transform it back
        Icon icon1=imageIcon1;

        imageIcon2 = new ImageIcon(newimg2); // transform it back
        Icon icon2=imageIcon2;

        JButton op3 = new JButton(icon2);
        op3.setOpaque(false);
        op3.setBorder(null);
        op3.setContentAreaFilled(false);
        gc3.gridx=1;
        gc3.gridy=0;
        computer3.add(op3,gc3);

        for(int i=2;i<=20;i++){

            JButton op = new JButton(icon1);
            op.setOpaque(false);
            op.setBorder(null);
            op.setContentAreaFilled(false);
            gc3.gridy=i-1;
            computer3.add(op,gc3);

            JButton back = new JButton(icon2);
            back.setOpaque(false);
            back.setBorder(null);
            back.setContentAreaFilled(false);
            gc3.gridx=1;
            gc3.gridy=i-4;
            computer3.add(back,gc3);

            JButton op2 = new JButton(icon1);
            op2.setOpaque(false);
            op2.setBorder(null);
            op2.setContentAreaFilled(false);
            gc3.gridx=2;
            gc3.gridy=i-1;
            computer3.add(op2,gc3);
        }


        return computer3;
    }


    public static void main(String[] args) {

        MainPanel ca=new MainPanel();
        ca.setVisible(true);

    }

}
