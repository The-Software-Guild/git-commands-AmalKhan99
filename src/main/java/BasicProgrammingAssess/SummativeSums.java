package BasicProgrammingAssess;
public class SummativeSums {
    public static void main(String[] args) {
        //initialise arrays
        int[]first ={1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[]second={ 999, -60, -77, 14, 160, 301 };
        int[]third={ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
        //print out array statements
        System.out.print("The first array total is: ");sumArray(first);
        System.out.print("The second array total is: ");sumArray(second);
        System.out.print("The third array total is: ");sumArray(third);
    }
    //sumAnArray function
    public static int sumArray(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x=x+array[i];
        }
        System.out.println(x);
        return x;
    }
}