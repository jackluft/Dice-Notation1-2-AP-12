
import java.util.ArrayList;
public class AdvancedDiceNotation
{
    private ArrayList<SimpleDiceNotation> sdnList;
    private int mod;
    public AdvancedDiceNotation(){
        
        sdnList = new ArrayList<SimpleDiceNotation>();
        mod =0;
        
        
    }
    public void parse(String myDice){
        String[] result = myDice.split("\\+");
        for(int i=0; i < result.length; i++){
            
            
            if(result[i].indexOf("D") != -1){
                
                System.out.println("Dice");
                sdnList.add(new SimpleDiceNotation(result[i]));
                
            }else{
                
                mod = Integer.parseInt(result[i]);
            }
            
            
        }
        //System.out.println(r);
        
        
        
    }
    public int roll(){
        int sum =0;
        for(int i= 0; i < sdnList.size(); i++){
            
            
            sum+=sdnList.get(i).roll();
            
            
        }
        sum+=mod;
        
        return sum;
        
        
    }
}
