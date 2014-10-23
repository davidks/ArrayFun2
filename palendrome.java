import java.util.Scanner;
public class palendrome {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
    
    
       
        
        
        int[] arr = new int[6];
        arr[0] = 12;
        arr[1] = 435;
        arr[2] = 23;
        arr[3] = 23;
        arr[4] = 435;
        arr[5] = 12;
        
        int z = arr.length;
        for (int i = 0; i<z; i++){
            
            if(arr[i] == arr[z-i-1]){
              
            }else
            {
                System.out.println("arr is not a palendrome.");
                System.exit(0);
               
            }
                    
        }
        
        
        System.out.println("arr is a palendrome.");
        
    }

}
