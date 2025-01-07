package AllSet;

import java.util.ArrayList;

public class Logic {
    Data data;

    // Constructor
    public Logic(int[] universalData, int[] yourData) {
        this.data = new Data(universalData, yourData);
    }

    // Method to calculate the complement set
    public ArrayList complementset() {
        int[] yourData = data.yourDatagetter();
        int[] universalData = data.universalDatagetter();

        // Use ArrayList to store complement elements
        ArrayList<Integer> complementSet = new ArrayList<>();

        // Add elements from universalData that are not in yourData
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

    public ArrayList UnionSet() {
        int[] yourData = data.yourDatagetter();
        int[] universalData = data.universalDatagetter();

        // Use ArrayList to store complement elements
        ArrayList<Integer> unionSet = new ArrayList<>();

        // Add elements from universalData that are not in yourData
        for (int element : universalData) {
            unionSet.add(element);
           
        }
        for (int element : yourData) {
            unionSet.add(element);    
        }

        return unionSet;
    }


}
