// Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabets from a-z)
import java.util.Scanner;

public class PangramNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArr = str.toLowerCase().toCharArray();
        char[] arr = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(char j=0;j<charArr.length;j++){
                if(arr[i]==charArr[j]){
                    count++;
                    break;
                }
            }
        }
        if(count==26){
            System.out.println("Pangram");
        }
        else{
            System.out.println("not a panagram");
        }
    }
}
