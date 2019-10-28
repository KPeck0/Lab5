public class ArrayNumberArgument {
    
    public static int [] greaterNumbers(int [] integerArray, int number) {
        int [] greaterNumbersReturned = new int [integerArray.length];
        int greaterNumbersReturnedIndex = 0;
        
        for(int index = 0; index < integerArray.length; index++){
            if(integerArray[index] > number) {
                greaterNumbersReturned[greaterNumbersReturnedIndex] = integerArray[index];
                greaterNumbersReturnedIndex = greaterNumbersReturnedIndex + 1;    
            }
            
        }
        return greaterNumbersReturned;
    }
    
    public static void main(String[] args) {
        int[] integerArray = {1,2,3,4,5,6,7,8,9,10};
        int number = 5;
        int [] greaterNumbersReturned = greaterNumbers(integerArray, number);
        
        for(int index = 0; index < greaterNumbersReturned.length; index++) {
            if(greaterNumbersReturned[index] != 0){
                System.out.println(greaterNumbersReturned[index]);
            }
            
        }
    }
}
