
import java.util.*;
public class SimpleDiceNotation
{
    //number of dices
    private int x;
    //the number of slides of a dices
    private int n;
    private Random rand= new Random();
    public SimpleDiceNotation(){
        //1D6
        this.x =1;
        this.n = 6;
       
        
    }
    public SimpleDiceNotation(String format){
        //Format of String should be writen like so: '1D6'
        int i = Integer.parseInt(format.substring(0,1));
        this.x = i;
        
        int i2 = Integer.parseInt(format.substring(format.length()-1,format.length()));
        this.n = i2;
    }
    public SimpleDiceNotation(SimpleDiceNotation copy){
        
         x = copy.getX();
         n = copy.getN();
        
        
    }
    public int roll(){
        int sum = 0;
        for(int i = 0; i < x; i++){
            int cur = rand.nextInt(n);
            sum += cur;
            
           System.out.println("At: "+cur);
        }
        
        
        
        return sum;
    }
    public String toString(){
        
        
        return x+"D"+n;
        
    }
    public boolean equals(SimpleDiceNotation simp){
        
        
        if(simp.getX() == this.x && simp.getN() == this.n){
            
            
            return true;
            
            
        }else{
            return false;
            
        }
        
        
    }
    public int getX(){
        
        
        return this.x;
        
    }
    public int getN(){
        
        
        return this.n;
        
    }
}
