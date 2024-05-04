package be6_java_homework_day_14;

public class theFeast {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int moneyInitial = 15;
        int costOfABar = 3;
        int numberOfWrapperGetFreeBar = 2;
        int barsEaten = theFeast(moneyInitial, costOfABar, numberOfWrapperGetFreeBar);
        System.out.println(barsEaten);
    }
    
    public static int theFeast(int moneyInitial, int costOfABar, int numberOfWrapperGetFreeBar) {
        int barsEaten = moneyInitial / costOfABar; // Calculate initial bars eaten
        int numWrapper = barsEaten; // Initial number of wrappers
        
        while (numWrapper >= numberOfWrapperGetFreeBar) {
            int freeBars = numWrapper / numberOfWrapperGetFreeBar; // Calculate free bars from wrappers
            barsEaten += freeBars; // Add free bars to the total eaten
            
            int remainingWrapper = numWrapper % numberOfWrapperGetFreeBar; // Calculate remaining wrappers
            numWrapper = freeBars + remainingWrapper; // Calculate new number of wrappers
        }
        
        return barsEaten;
    }
}
