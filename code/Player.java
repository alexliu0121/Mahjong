import java.util.*;

public class Player {
    public String name;
    public Majang majang=new Majang();
    private static List handcard=new ArrayList<>();
    /*private int handcardindex=0;*/
    public static Shuffle shuffle=new Shuffle();
    public static void Hit(int index){
        int handcardindex=0;
        handcard.add(handcardindex,shuffle.getMajang(index));
        handcardindex++;
        shuffle.removeMajang(index);
    }
    public void Abandon(int index){
        if((index>handcard.size())||index<0){
            System.out.println("su3y94jd ul su4");;
        }else{
            int temp=Integer.parseInt( handcard.get(index).toString());
            shuffle.addpool(shuffle.getpoolindex(),temp);
            shuffle.poolindexplus();
            handcard.remove(index);
            /*return handcard.get(index);*/
        }
    }
    public Object gethandcard(int index){
        return handcard.get(index);
    }
    public List getfullhandcard(){
        return handcard;
    }
    /*public static void main(String[] args){
        Player.Hit(1);
        System.out.println(handcard.get(0));
    }*/
}
