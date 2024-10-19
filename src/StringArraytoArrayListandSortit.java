import java.util.ArrayList;
import java.util.Arrays;

public class StringArraytoArrayListandSortit {

    static String[] getArrayList(String[] inputArray) {

        ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList(inputArray));
   
        myArrayList.sort(null);
        
      
        int half = myArrayList.size() / 2;
        if (myArrayList.size() % 2 != 0) {
            half += 1;
        }

      
        for (int i = 0; i < half; i++) {
            myArrayList.set(i, myArrayList.get(i).toUpperCase());
        }


        return myArrayList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] newArr = {"Sai Kiran", "Lokesh", "Diwakar", "Chandu"};
        String[] printArr = getArrayList(newArr);
        
        for (String s : printArr) {
            System.out.println(s);
        }
    }
}
