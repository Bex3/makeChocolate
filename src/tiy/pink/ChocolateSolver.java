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
        } else if (big == goal) {
            return 0;
        } else if (small >= goal - bigs) {
            if (big == 0) {
                return small;
            } else {
                return (small = (goal % bigs));
            }
        }else if (small == goal){
            return small;
        }
        return -1;
    }
    //public void doSomething(String sample) {
    //   System.out.println(sample);
    //}
}
