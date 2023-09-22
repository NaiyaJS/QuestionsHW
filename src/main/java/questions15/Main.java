package questions15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //Question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //    Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }


    // Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }


    //    Question 4
    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }

//    public static void main(String[] args) {
//      String names[] = {"one", "two","three"};
//      System.out.println(getLastElement(names));
//    }
//}
//    Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length -2];
    }
//    Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for(int i : ints){ //for each element i in array ints
            sum += i; //sum = sum +i   --> sum is equal to current sum + new element number (i)
        }
        return sum;
    }
//
//    Question 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for(int i : ints){
            sum = sum + i;

        }
        int average = sum / ints.length ;
        return average;
        //return sum / ints.length; --> simpler way
    }
//    Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String oddNumbers = "";

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0){
               oddNumbers += numbers[i];
            }
        }
        return oddNumbers;
    }

//    public static void main(String[] args) {
//        int anArray[] = {1,2,3,4,5,6,7};
//        System.out.println(extractAllOddNumbers(anArray));
//    }

//    Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNumbers ="";
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                evenNumbers += numbers[i];
            }
        }
        return evenNumbers;
    }
//    Question 10
    public static boolean contains(String[] names, String element) {
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(element)){
                return true;
            }
        }
        return false;
    }

//    Question 11
    public static int getIndexByElement(String[] names, String element) {
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(element)){
                return i;
            }
        }
       return -1; // doesn't exist as an index
    }

//    Question 12
    public static void printOddNumbersInRange(int start, int end){
        for(int i = start; i <= end; i++){
            if( i %2 != 0 ){
                System.out.println(i);
            }
        }
    }
//    Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
       // return str + "*" + n;
        String strBuilder = "";
        for (int i = 0; i < n; i++) {
           strBuilder += str + " ";
        }
        return strBuilder;
    }

    //    Question 14 --> test to see which index number will give 3 letters
    public static String repeatFirstThreeLetters(String str, int n) {
        String strLetters = "";
        for (int i = 0; i < n; i++) {
            strLetters += str.substring(0,2);
        }
        return strLetters;
    }

    //    Question 15
 // Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str){
//there is a cat --> there are 4 word 3 spaces
        int totalWords = 0;  //word counter
        String regex = " ";   //regex uses spaces to identify number of words
        Pattern pattern = Pattern.compile(regex); //use the regex to make a new pattern, which we will use to identify the num of spaces in a string
        Matcher matcher = pattern.matcher(str);  //matcher allows us to observe the string and use the pattern on the string

        while (matcher.find()) {  //will keep looping the method matcher.find --> uses the pattern on the string
            totalWords++;         // to complete the code block
        }

        return totalWords + 1;  //the remainder word is +1
    }


}
