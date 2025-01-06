package ComplementarySet;

import java.util.ArrayList;

public class Logic {
    Data data;

    // Constructor
    public Logic(int[] universalData, int[] yourData) {
        this.data = new Data(universalData, yourData);
    }

   
    public ArrayList complementset() {
        int[] yourData = data.yourDatagetter();
        int[] universalData = data.universalDatagetter();

        ArrayList<Integer> complementSet = new ArrayList<>();

        
        for (int element : universalData) {
            boolean found = false;
            for (int yourElement : yourData) {
                if (element == yourElement) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                complementSet.add(element);
            }
        }

        return complementSet;
    }
}
