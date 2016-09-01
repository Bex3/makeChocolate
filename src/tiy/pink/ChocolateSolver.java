package tiy.pink;

/**
 * Created by bearden-tellez on 8/24/16.
 */
public class ChocolateSolver {
    //private int itemToReturn;


    //public int getItemToReturn() {
    //    return itemToReturn;
    //}

    //public void setItemToReturn(int itemToReturn) {
    //    this.itemToReturn = itemToReturn;
    //}


    public int makeChocolate(int small, int big, int goal) {
        int bigs = big * 5;
        if (small < 0 || big < 0 || goal < 0) {
            System.out.println("Anything less than zero isn't allowed");
            return -1;
        } else if (bigs == goal) {
            return 0;
        } else if (bigs == 0 && small >= goal) {
            return goal;
        } else if (bigs > 0 && small >= (goal % bigs)) {
            //int number = (goal % 5);
            int number = (goal % bigs);
            return number;
        } else if (bigs >= goal && small > 0){
            int tempGoal = goal/5;
            if (goal - tempGoal*5<=small) { 
                return goal - tempGoal*5;
            }
        } else if (small == goal) {
            return small;
        } else if (bigs >= goal && small == 0) {
            return goal;
        } else if (small == 0 && bigs == 0 && goal > 0){
            return -1;
        }
        return -1;

    }

    public int makeChocolateMoreBigsThanNeededEnoughSmalls(int small, int big, int goal){
        int bigs = big * 5;
        if (small == 3 && big == 9){
        } return 3;
    }

    //public void doSomething(String sample) {
    //   System.out.println(sample);
    //}
}
