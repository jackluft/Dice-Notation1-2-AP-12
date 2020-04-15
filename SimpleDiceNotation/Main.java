

public class Main
{
    public static void main(String[] args){
        
        AdvancedDiceNotation a = new AdvancedDiceNotation();
        a.parse("2D4+5");
        
        System.out.println("Result: "+a.roll());
    }
}
