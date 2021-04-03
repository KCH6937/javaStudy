public class Sort {
    
    public static void selectionSort(int[] arr) {
        int temp;       // 임시 저장 변수
        int minimum;    // 최솟값
        
        for(int i = 0; i < arr.length - 1; i++) {
            minimum = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[minimum] > arr[j]) {
                    minimum = j;
                }                                            
            }
            temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
        
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}