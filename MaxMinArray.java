class MaxMinArray {
    
    
    public static void main(String args[]){
        int[] array = {7,4,3,5,2,5,8};
        if (array.length == 0) {
            System.out.print("Array is empty");
            return;
        }
    

    int max = array[0];
    int min = array[0];

    for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
        if (array[i] < min) {
            min = array[i];
        }
    }

    System.out.println("Maximum:" + max);
    System.out.println("Minimum:" + min);
    }
}
