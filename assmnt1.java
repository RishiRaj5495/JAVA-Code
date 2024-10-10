 class assmnt1{
  //Rishi Raj Chandra
  //Print the unique number
    public static void main(String args[]){
        int[] arr = {0,0,0,1,1,1,2,3,3,4,9,9,9};

     System.out.println("Unique Number = "+ printNewArray(arr));}
       static void printNewArray1(int[] arr3,int n) {

            for(int i = 0 ; i < arr3.length ; i++){
                if(arr3[i] == 0 && i == n)
                break;
                System.out.format("%d,",arr3[i]);
                
             } System.out.println();
               } 

      static int printNewArray(int[] arr1){
        int n = 0; 
       int[] arr2  = new int[arr1.length];
     int k = arr1[0] ;
     for(int i = 1 ; i < arr1.length ; i++){
   
             if(k != arr1[i]){
                 k = arr1[i];
            arr2[n++] = arr1[i-1];
            }
            if(k == arr1[arr1.length-1] || i == arr1.length-1){
            arr2[n++] = k; 
          break;}
                  } 
                    printNewArray1(arr2,n);
                  return n ;            }
                                 
                                    
                                    
                                    
                                    }