import ComplementarySet.Logic;

public class MainPoint {
    public static void main(String[] args) {// universal Set //your Set
        Logic logic = new Logic(new int[]{0, 1, 2, 3,8}, new int[]{4, 5, 6,1,2,3});
        System.out.println(logic.complementset());
        
    }
}
