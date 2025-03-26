import java.util.*;
public class Shuffle{
    public static ArrayList majanglist=new ArrayList<>();
    public static int index=0;
    public static ArrayList pool=new ArrayList<>();
    public static int poolIndex=0;
    public static int PAUSE=100;
    public static Majang majang=new Majang();
    private void random(){
        Collections.shuffle(majanglist);
    }
    public Shuffle() /*throws InterruptedException*/{
        create();
        /*System.out.println("【初始化所有的牌：】");
        printMaJiang(0);*/
        random();
        /*System.out.println("【洗牌后所有的牌：】");
        printMaJiang(0);
        System.out.println("【按照东南西北四个方向输出的牌(牌局里的牌)：】");
        printMaJiang(1);*/
        poolIndex=0;
        index=135;
    }


    private void create() /*throws InterruptedException*/{
        /*MajangProducer majangproducer=new MajangProducer();*/
        String[] a=new String[]{"萬","條","筒","東","南","西","北","中","發","白板"}; 
        int[] d=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34};
        String b="";
        /*for(int i=0;i<=9;i++){
            if(i<=2){
                for(int j=0;j<=8;j++){
                    for(int k=0;k<=3;k++){
                        majang.Number number=(majang.Number) majang.majangproducer.Create(i);
                        number.setNum(j);
                        majanglist.add(index,number);
                        index++;
                    }
                }
            }else{
                for(int l=0;l<=3;l++){
                    majang.Wind word=(majang.Wind) majangproducer.crearwMajang(i);
                    majanglist.add(index,word);
                    index++;
                }
            }
        }*/
        for(int i=0;i<d.length;i++){
            int c=d[i];
            /*if(c.equals("萬")||c.equals("條")||c.equals("筒"))*/
            if(c>=5&&c<=31){
                for(int j=0;j<=8;j++){
                    for(int k=0;k<=3;k++){
                        Majang ma=majang.Create(c);
                        int value=ma.getType();
                        majang.setNum(j);
                        majanglist.add(index,value);
                        index=index+1;
                    }
                }
            }/*else if(c.equals("東")||c.equals("南")||c.equals("西")||c.equals("北"))*/
            else if(c>=1&&c<=4){
                    for(int k=0;k<=3;k++){
                        Majang ma=majang.Create(c);
                        int value=ma.getType();
                        
                        majanglist.add(index,value);
                        index=index+1;
                    }
                
            }else{
                for(int k=0;k<=3;k++){
                    Majang ma=majang.Create(c);
                    int value=ma.getType();
                    
                    majanglist.add(index,value);
                    index=index+1;
                }
            }
        }
        System.out.println();
        /*Thread.sleep(PAUSE);*/
    }

    /*public void printMajang(int direction) throws InterruptedException{
        for(int i=0;i<majanglist.size();i++){
            if(direction==1){
                if(i==0){

                }
            }
        }
    }*/
    
    public int getMajang(int index){
        int temp=Integer.parseInt(majanglist.get(index).toString());
        return temp;
    }
    public void removeMajang(int index){
        majanglist.remove(index);
    }
    public int getpoolindex(){
        return poolIndex;
    }
    public void poolindexplus(){
        this.poolIndex++;
    }
    public void addpool(int index,int poolmajang){
        pool.add(index,poolmajang);
    }
    public ArrayList getpool(){
        return pool;
    }
    /*public static void main(String[] args){
        Shuffle();
        System.out.println(majanglist.get(0));
    }*/
}