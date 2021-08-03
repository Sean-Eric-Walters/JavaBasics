import java.util.Arrays;
import java.util.ArrayList;

public class  BasicJava {

    // method that prints all the numbers from 1 to 255
    public void print255() {
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    //a method that prints all the odd numbers from 1 to 255
    public void print255Odd() {
        for(int i = 1; i <= 255; i = i + 2){
            System.out.println(i);
        }
    }

    //a method that creates and eventually returns a sum variable that adds 
    // up all the numbers from 1 to 255
    public int sigma255() {
        int sum = 0;
        for(int i = 1; i  <= 255; i++){
            sum += i;
        }
        return sum;
    }

    // Given an array X,write a method that would iterate through each member 
    // of the array and print each value on the screen
    public void iterArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    //a method that takes any array and prints the maximum value in the array.
    public void findMax(int[] arr){
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    //a method that creates an array 'y' that contains all the odd numbers 
    //between 1 to 255
    public void oddArray255() {
    ArrayList<Integer> results = new ArrayList<Integer>();
    for(int i=1; i<255; i=i+2){
        results.add(i);
        }
        System.out.println(results);
    }

    
}




