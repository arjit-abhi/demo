public class ArrayAvg {
    public static void main(String args[]){
        int[] array = {4,2,5,1,5,6,7,2};
        if (array.length == 0){
            System.out.println("Array is empty");
            return;
        }

        float sum = 0; 
        float avg = 0;

        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }

        avg = sum/array.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
