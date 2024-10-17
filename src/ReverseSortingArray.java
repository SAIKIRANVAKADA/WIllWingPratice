import java.util.ArrayList;


public class ReverseSortingArray {

    static int[] getSorted(int[] myArray) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        
        for (int j : myArray) {
            myArrayList.add(j);
        }
        

        myArrayList.sort(null);
        

        int[] outPutArray = new int[myArrayList.size()];
        
        for (int i = 0; i < myArrayList.size(); i++) {
            StringBuffer myBuffer = new StringBuffer(myArrayList.get(i).toString());
            String newNum = myBuffer.reverse().toString();
            outPutArray[i] = Integer.parseInt(newNum);
        }
        
        return outPutArray;
    }

    public static void main(String[] args) {
        int[] inputArray = {12, 25, 36, 48};
        int[] newArray = getSorted(inputArray);
        for (int k : newArray) {
            System.out.println(k);
        }
    }
}
