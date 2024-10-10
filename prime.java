 import java.util.Scanner;
 class prime {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number but remember first should be smaller than other");
          
      // int num1 = sc.nextInt();int num2 = sc.nextInt();
      /*   System.out.format("Small(num1) = %d , Largest(num2) = %d\n",num1,num2); 
        int GCD = 0 ;
        for(int i = 2 ; i <= num1 ; i++){
    
           
            if(num1 % i == 0 && num2 % i == 0 && i > GCD){
             GCD = i;
            System.out.format("GCD = %d\n",GCD);}
            }
    System.out.format("GCD of %d and %d is %d",num1,num2,GCD);*/

/*  int LCM = 1 ;int i = 2; int p = num1;  int q = num2 ;
    while(p > 1 ||q > 1){

      if(p % i == 0 || q % i == 0)
      LCM = LCM * i;
               if(p % i == 0)
            p = p / i ;
              
               if(q % i == 0 )
                q = q / i ;

                
                if(p % i != 0 || q % i != 0)
                i++ ;

                }
                System.out.format("LCM = %d",LCM);
      }*/

      int arr[] = new int[6] ;
      for(int i = 0  ; i < arr.length ; i++)
      arr[i] = sc.nextInt();
  
  printArray(arr);
  
  if(arrayIsSorted(arr))
     System.out.println("Array is sorted");
     else
     System.out.println("Array is nit sorted");
  
   }

 static void printArray(int arr1[]) {
   for(int i = 0  ; i < arr1.length ; i++)
   System.out.format("%d\t",arr1[i]);
System.out.println();}
 

static boolean arrayIsSorted(int arr2[]){

boolean a = true ;
for(int i = 0 ; i < arr2.length-1 ; i++){
   if(arr2[i] < arr2[i+1])
   continue;
   else
   a = false; 
   break;}



if(a)
return a;
else
return a;}




}