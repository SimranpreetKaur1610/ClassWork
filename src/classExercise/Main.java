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

        System.out.println("\n After Sorting the array in Ascending order:");
        for(int i = 0 ; i < myArray.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(myArray[i] < myArray[j]){
                    int a = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = a;
                }
            }
        }
        for (int x : myArray) {
            System.out.print(x + "  ");
        }

    }
}
