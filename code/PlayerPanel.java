import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.image.*;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.util.*;

public class PlayerPanel extends JPanel implements ActionListener{

    // private HashMap<Integer,Image> allpic = new HashMap<>();
    private Label piclabel;

    private ImageIcon imageIcon1 = new ImageIcon("picture/buttonop.png");
    private Image image1 = imageIcon1.getImage();
    private Image newimg1 = image1.getScaledInstance(33,45, java.awt.Image.SCALE_SMOOTH);

    private ImageIcon imageIcon3 = new ImageIcon("picture/8.png");
    private Image image3 = imageIcon3.getImage();
    private Image newimg3 = image3.getScaledInstance(33,45, java.awt.Image.SCALE_SMOOTH);

    private int id;
    private Boolean onclick=false;

    private JButton button19,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button18;
    private Player p1=new Player();
    private Player computer1 = new Player();
    private Player computer2 = new Player();
    private Player computer3 = new Player();
    public List handcard=new ArrayList();
    private Shuffle shuffle=new Shuffle();

    public PlayerPanel(){
        this.piclabel=new Label();
        piclabel.getPic(Label.allpic);

        setOpaque(false);

        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gc4 = new GridBagConstraints();
        setLayout(gb);

        gc4.gridx = 0;
        gc4.gridy = 5;
        gc4.weightx=1;
        gc4.weighty=1;
        gc4.fill = GridBagConstraints.BOTH;

        imageIcon1 = new ImageIcon(newimg1); // transform it back
        Icon icon1=imageIcon1;

        imageIcon3 = new ImageIcon(newimg3); // transform it back
        Icon icon3=imageIcon3;


        // ImageIcon imageIcon4 = new ImageIcon(Label.allpic.get(19));
        // Image image4 = imageIcon4.getImage();
        // Image newimg4 = image4.getScaledInstance(33,45, java.awt.Image.SCALE_SMOOTH);

        Image image4 = Label.allpic.get(19);
        Image newimg4 = image4.getScaledInstance(33,45, java.awt.Image.SCALE_SMOOTH);
        
        ImageIcon imageIcon4 = new ImageIcon(newimg4); // transform it back
        Icon icon4=imageIcon4;

        /*handcard=p1.gethandcard();*/
        for (int i = 0; i < 3; i++) {
            //玩家，每次起4张
            for (int j = 0; j < 4; j++) {
                p1.Hit(shuffle.index);
            }
            //电脑1，每次起4张
            for (int j = 0; j < 4; j++) {
                computer1.Hit(shuffle.index);
            }
            //电脑2，每次起4张
            for (int j = 0; j < 4; j++) {
                computer2.Hit(shuffle.index);
            }
            //电脑3，每次起4张
            for (int j = 0; j < 4; j++) {
                computer3.Hit(shuffle.index);
            }
        }
        for(int x=0;x<16;x++){
            int temp=Integer.parseInt( p1.gethandcard(x).toString());
            handcard.add(x,temp);
            System.out.println(handcard.get(x));
        }
        ImageIcon imageIcon5=new ImageIcon("picture/"+handcard.get(0)+".png");
        Image image5 = imageIcon5.getImage();
        Icon icon5=imageIcon5;
        ImageIcon imageIcon6=new ImageIcon("picture/"+handcard.get(1)+".png");
        Image image6 = imageIcon5.getImage();
        Icon icon6=imageIcon6;
        ImageIcon imageIcon7=new ImageIcon("picture/"+handcard.get(2)+".png");
        Image image7 = imageIcon7.getImage();
        Icon icon7=imageIcon7;
        ImageIcon imageIcon8=new ImageIcon("picture/"+handcard.get(3)+".png");
        Image image8 = imageIcon8.getImage();
        Icon icon8=imageIcon8;
        ImageIcon imageIcon9=new ImageIcon("picture/"+handcard.get(4)+".png");
        Image image9 = imageIcon9.getImage();
        Icon icon9=imageIcon9;
        ImageIcon imageIcon10=new ImageIcon("picture/"+handcard.get(5)+".png");
        Image image10 = imageIcon10.getImage();
        Icon icon10=imageIcon10;
        ImageIcon imageIcon11=new ImageIcon("picture/"+handcard.get(6)+".png");
        Image image11 = imageIcon11.getImage();
        Icon icon11=imageIcon11;
        ImageIcon imageIcon12=new ImageIcon("picture/"+handcard.get(7)+".png");
        Image image12 = imageIcon12.getImage();
        Icon icon12=imageIcon12;
        ImageIcon imageIcon13=new ImageIcon("picture/"+handcard.get(8)+".png");
        Image image13 = imageIcon13.getImage();
        Icon icon13=imageIcon13;
        ImageIcon imageIcon14=new ImageIcon("picture/"+handcard.get(9)+".png");
        Image image14 = imageIcon14.getImage();
        Icon icon14=imageIcon14;
        ImageIcon imageIcon15=new ImageIcon("picture/"+handcard.get(10)+".png");
        Image image15 = imageIcon15.getImage();
        Icon icon15=imageIcon15;
        ImageIcon imageIcon16=new ImageIcon("picture/"+handcard.get(11)+".png");
        Image image16 = imageIcon16.getImage();
        Icon icon16=imageIcon16;
        ImageIcon imageIcon17=new ImageIcon("picture/"+handcard.get(12)+".png");
        Image image17 = imageIcon17.getImage();
        Icon icon17=imageIcon17;
        ImageIcon imageIcon18=new ImageIcon("picture/"+handcard.get(13)+".png");
        Image image18 = imageIcon18.getImage();
        Icon icon18=imageIcon18;
        ImageIcon imageIcon19=new ImageIcon("picture/"+handcard.get(14)+".png");
        Image image19 = imageIcon19.getImage();
        Icon icon19=imageIcon19;
        ImageIcon imageIcon20=new ImageIcon("picture/"+handcard.get(15)+".png");
        Image image20 = imageIcon20.getImage();
        Icon icon20=imageIcon20;
        /*for(int k=0;k<=p1.gethandcard().size()-1;k++){
            handcard.get(k);
        }*/

        button1 = new JButton(icon5);
        button1.setOpaque(false);
        button1.setBorder(null);
        button1.setContentAreaFilled(false);
        button1.addActionListener(this);
        button1.setActionCommand("1");
        gc4.gridx = 2;
        add(button1,gc4);


        button2 = new JButton(icon6);
        button2.setOpaque(false);
        button2.setBorder(null);
        button2.setContentAreaFilled(false);
        button2.addActionListener(this);
        button2.setActionCommand("2");
        gc4.gridx = 3;
        add(button2,gc4);

        button3 = new JButton(icon7);
        button3.setOpaque(false);
        button3.setBorder(null);
        button3.setContentAreaFilled(false);
        gc4.gridx = 4;
        add(button3,gc4);


        button4 = new JButton(icon8);
        button4.setOpaque(false);
        button4.setBorder(null);
        button4.setContentAreaFilled(false);
        gc4.gridx = 5;
        add(button4,gc4);

        button5 = new JButton(icon9);
        button5.setOpaque(false);
        button5.setBorder(null);
        button5.setContentAreaFilled(false);
        gc4.gridx = 6;
        add(button5,gc4);

        button6 = new JButton(icon10);
        button6.setOpaque(false);
        button6.setBorder(null);
        button6.setContentAreaFilled(false);
        gc4.gridx = 7;
        add(button6,gc4);

        button7 = new JButton(icon11);
        button7.setOpaque(false);
        button7.setBorder(null);
        button7.setContentAreaFilled(false);
        gc4.gridx = 8;
        add(button7,gc4);

        button8 = new JButton(icon12);
        button8.setOpaque(false);
        button8.setBorder(null);
        button8.setContentAreaFilled(false);
        gc4.gridx = 9;
        add(button8,gc4);

        button9 = new JButton(icon13);
        button9.setOpaque(false);
        button9.setBorder(null);
        button9.setContentAreaFilled(false);
        gc4.gridx = 10;
        add(button9,gc4);

        button10 = new JButton(icon14);
        button10.setOpaque(false);
        button10.setBorder(null);
        button10.setContentAreaFilled(false);
        gc4.gridx = 11;
        add(button10,gc4);

        button11 = new JButton(icon15);
        button11.setOpaque(false);
        button11.setBorder(null);
        button11.setContentAreaFilled(false);
        gc4.gridx = 12;
        add(button11,gc4);

        button12 = new JButton(icon16);
        button12.setOpaque(false);
        button12.setBorder(null);
        button12.setContentAreaFilled(false);
        gc4.gridx = 13;
        add(button12,gc4);

        button13 = new JButton(icon17);
        button13.setOpaque(false);
        button13.setBorder(null);
        button13.setContentAreaFilled(false);
        gc4.gridx = 14;
        add(button13,gc4);

        button14 = new JButton(icon18);
        button14.setOpaque(false);
        button14.setBorder(null);
        button14.setContentAreaFilled(false);
        gc4.gridx = 15;
        add(button14,gc4);

        button15 = new JButton(icon19);
        button15.setOpaque(false);
        button15.setBorder(null);
        button15.setContentAreaFilled(false);
        gc4.gridx = 16;
        add(button15,gc4);

        button16 = new JButton(icon20);
        button16.setOpaque(false);
        button16.setBorder(null);
        button16.setContentAreaFilled(false);
        gc4.gridx = 17;
        add(button16,gc4);

        JLabel button17 = new JLabel(icon1);
        gc4.gridx = 18;
        add(button17,gc4);

        /*button18 = new JButton(icon3);
        button18.setOpaque(false);
        button18.setBorder(null);
        button18.setContentAreaFilled(false);
        gc4.gridx = 19;
        add(button18,gc4);*/

        for(int i=1;i<=22;i++){
            JLabel op = new JLabel(icon1);
            gc4.gridx=i-1;
            gc4.gridy=1;
            add(op,gc4);
        }
        for(int i=1;i<=5;i++){
            JLabel op = new JLabel(icon1);
            gc4.gridx=2;
            gc4.gridy=i-1;
            add(op,gc4);
        }

        /*button19 = new JButton(icon4);
        button19.setVisible(false);
        button19.setOpaque(false);
        button19.setBorder(null);
        button19.setContentAreaFilled(false);
        gc4.gridx = 5;
        gc4.gridy=2;
        add(button19,gc4);*/

    }

    public void actionPerformed(ActionEvent e){
        String buttonString=e.getActionCommand();

        if(buttonString.equals("1")){
            button1.setVisible(false);
            button19.setVisible(true);
            setCardid(1);
            // CenterPanel ce = new CenterPanel();
            // Thread th=new Thread(ce);
            // th.start();
        }else if(buttonString.equals("2")){
            button2.setVisible(false);
            setCardid(2);
            button1.setVisible(true);
        }
    }

    public int getCardid(){
        return this.id;
    }

    public void setCardid(int id){
        this.id=id;
    }

    public boolean getOnclick(){
        return this.onclick;
    }

    public void setOnclick(boolean onclick){
        this.onclick=onclick;
    }

}
    