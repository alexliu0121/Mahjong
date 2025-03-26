import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Label {

    public static HashMap<Integer,Image> allpic = new HashMap<Integer,Image>();

    private Image image1 = new ImageIcon("picture/buttonop.png").getImage();
    private Image newimg1 = image1.getScaledInstance(33,45, java.awt.Image.SCALE_SMOOTH);

    private Image image3 = new ImageIcon("picture/buttonEast.png").getImage();
    private Image newimg3 = image3.getScaledInstance(33,45, java.awt.Image.SCALE_SMOOTH);

    public static void getPic(HashMap<Integer, Image> allpic){
    // public static void main(String[] args){
    	// HashMap<Integer,String> allpic = new HashMap<Integer,String>();
        for(int i=1;i<=34;i++){
            Image img = new ImageIcon("picture/"+i+".png").getImage();
            allpic.put(i,img);
            // allpic.put(i,"Resource/"+i+".png");
            // System.out.println(allpic.get(i));
        }
    }
    public HashMap getallpic(){
    	return this.allpic;
    }

}