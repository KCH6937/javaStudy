import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        int size;
        Sort sort = new Sort();
        Scanner sc = new Scanner(System.in);
        
        size = sc.nextInt();
        
        int[] data = new int[size];
        for(int i = 0; i < size; i++) {
            data[i] = sc.nextInt();
        }
        
        sort.selectionSort(data);
 
    }

}
