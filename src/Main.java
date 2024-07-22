import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//task 1
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for(int i = 0; i <array.length; i++){
            System.out.println(array[i]);
        }

//task 2

int [] midPointArray = {13, 5, 7, 68, 2};
        System.out.println(midPointArray[2]);

//task 3

        String[] colorArray = {"red", "green", "blue", "yellow"};
        System.out.println(colorArray.length);

        String[] colorArrayCopy = colorArray.clone();
        System.out.println(Arrays.toString(colorArrayCopy));

//task 4

int[] anotherArray = {40, 28, 33, 23, 94};
        //System.out.println(anotherArray[anotherArray.length]);
        //System.out.println(anotherArray[5]);
        System.out.println(anotherArray[0] + anotherArray.length-1);


//task 5
int [] intArray2 = new int[5];
for(int i = 0; i <intArray2.length; i++){
    intArray2[i] = i;
}
        System.out.println(Arrays.toString(intArray2));
//task 6
int [] intArray3 = new int[5];
        for(int i = 0; i <intArray3.length; i++){
            intArray3[i] = i * 2;
        }
//task 7
String[] anotherString = {"Hey", "What's up?", "How are you?", "Hewwo", "it's me"};
        for (int i = 0; i <anotherString.length; i++){
            if(i != 2){
                System.out.println(anotherString[i]);
            }
        }

//task 8
String placeholder = anotherString[0];
        anotherString[0] = anotherString[2];
        anotherString[2] = placeholder;
        System.out.println(Arrays.toString(anotherString));
        


    }
}
