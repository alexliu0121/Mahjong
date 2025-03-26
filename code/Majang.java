import java.util.*;
import java.lang.*;

public class Majang {
    private int type;

    public int getType(){
        return type;
    }
    public void setType(int type){
        this.type =type;
    }

    /*@Override 
    public String getString(){
        return "現在的牌是："+type;
    }*/

    public int Num=0;
    public String Number(){
    
   
    /*@Override*/
    /*public String getString(){*/
        String NumString="";

        /*if(this.getType()=="萬"){
           NumString+=this.getNum()+"萬";
           break;
        }
        if else(this.getType()=="條"){
           NumString+=this.getNum()+"條";
           break;
        }
        if else(this.getType()=="筒"){
           NumString+=this.getNum()+"筒";
           break;   
        }*/
        NumString+=this.getType();
        NumString+="";

        return NumString;
   /* }*/
    }
public int getNum(){
    return Num;
}
   
public void setNum(int Num){
    this.Num = Num ;
}


public String Wind(){
    /*@Override*/
    /*public String getString(){*/
        String WindString="";

        /*if(this.getType()=="東"){
            WindString+="東";
        }
        else if(this.getType()=="南"){
            WindString+="南";
        }
        else if(this.getType()=="西"){
            WindString+="西";
        }
        else if(this.getType()=="北"){
            WindString+="北";
        }
        else if(this.getType()=="中"){
            WindString+="中";
        }
        else if(this.getType()=="發"){
            WindString+="發";
        }
        else if(this.getType()=="白板"){
            WindString+="白板";
        }*/
        WindString+=this.getType();
        WindString+="";
        
        return WindString;
    /*}*/
}

public String Word()  {
    /*@Override*/
    /*public String getString(){*/
        String WordString="";

        /*if(this.getType()=="中"){
            WordString+="中";
        }
        else if(this.getType()=="發"){
            WordString+="發";
        }
        else if(this.getType()=="白板"){
            WordString+="白板";
        }*/
        WordString+=this.getType();
        WordString+="";
        
        return WordString;
    /*}*/
}

/*public class MajangProducer {*/
    public Majang Create(int type){
       Majang ma = null;

       if(type>=5 && type<=31){
           ma = new Majang();
           ma.setType(type);
       }
       else if(type==32||type==33||type==34){
           ma = new Majang();
           ma.setType(type);
       }
       else if(type==1||type==2||type==3||type==4){
           ma = new Majang();
           ma.setType(type);
       }
       return ma;
    }
/*}*/
}