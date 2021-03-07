package classExercise;

public class Main {

    public static void main(String[] args)
    {
        int[] myArray = {67,99,34,90,27,10,33};
        System.out.println("Array :");
        for (int x : myArray)
        {
            System.out.print(x + "  ");
        }
        System.out.println("\nArray in reverse order:");
        for (int i = myArray.length - 1 ; i >= 0 ; i-- )
        {
            System.out.print(myArray[i] + "  ");
        }
    }
}
