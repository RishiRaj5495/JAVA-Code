//  class assmnt2 {

//     public static void main(String args[]){
//  int positive,negative;

 
//     int[] arr = {3,4,2,8,9,1,6,5};                                                   
//         negative = 0;
          
 
// for(int i = 0 ; i < arr.length ; i++){
// if(arr[m] - arr[i] == 1) 
//     positive = 1 ;

// if(arr[m] - arr[i] == -1) 
//     negative = -1 ;

//                                     }
//                                     int a = arr[m]+positive+negative;
// if (positive != 1 && negative != -1){
//      System.out.println("Missing numberm is "+a);
//      break;}
    
    
//                                        }
//                             }


//                         }


 
// class assmnt2 {

//     public static void main(String args[]){
//         int[] arr = {1,0,1,1,1,0,1,1,1,1};
// ;

// int m = 0; int n = 1 ; 
//    for(int i = 0 ; i < arr.length-1 ; i++){
//     boolean a = true;             
 
// if(arr[i+1] == arr[i]){
//     n = n+1;
//     a = false;        }
//     if(a || i == arr.length-2){
//     if (n>m) 
//         m = n;
//         n = 1;        
//                               }
        
    
//                                            }
// System.out.println("Consecutive number = " +m);

//     }
//  }
                    
                
//import java.util.Scanner;
// class assmnt2 {
//     public static void main(String args[]){
//          int m = 42;
//          int n = 101010;
//          decimalToBinary(m,m);

//         System.out.println("\n");
//          System.out.println(" binaryToDecimal = "+ binaryToDecimal(n,0,0));    }

//      static  void decimalToBinary(int m,int n){
//       if (m == 1) {
//         System.out.print("1"+"\t");
//          return;
//          }
//       n = m % 2;
//       m = m / 2; 
      
//       decimalToBinary(m, n);
//       System.out.format("%d\t",n);   }
  
//    static double  binaryToDecimal(int n,int a,double s){
         
//       if (n == 0) 
//       return s;
      
//        s =  s  + (n % 10) * Math.pow(2,a);

//        return   binaryToDecimal(n / 10,++a,s);  }
//        }


// class assmnt2 {
//    public static void main(String args[]){
// int[] arr = {3,0,66,1,6,12,11,10};

//  printIncreasing(arr,0,arr.length);
//  for(int i = 0 ; i < arr.length ; i++){
//       System.out.print(arr[i]+"\t");
//  }
// }


// static void  printIncreasing(int[] arr,int i ,int length){

// if (length == 0) // base case.
// return ;
    
// if (i < length-1) {
// if(arr[i] > arr[i+1]) {   // swap elements
      
//       int temp = arr[i];   
//       arr[i] =arr[i+1];
//       arr[i+1] = temp ;}

//        printIncreasing(arr,i+1,length);  //  recursive call for next element
// }
// else  
// printIncreasing(arr, 0, length-1);}  //   similar start but length reduced by 1 in every  recursive call.

//}


class assmnt2 {
   public static void main(String args[]){
//       int[] arr = {1,5,2,1,2,5,4,100,6,4,6};int j = 0; 

//       int i = 0;
// while (i < arr.length) {
   
//    if (arr[j] == arr[i] && i != j) {
  
//       j++;
//       i = 0;
//       continue;
//    }
   
// i++;
// } 

//    System.out.println("Single number = "+arr[j]);
// }


// }



// System.out.println(printSort(arr,arr.length-1));
//  printArray(arr,arr.length);}


//  static void printArray(int[] arr,int length ){

// if (length < 1)
// return ;   


//    printArray(arr,length-1) ; 
// System.out.print(arr[length]+"\t");


//  }



// static int[] printSort(int[] arr,int length){

// while (length > 0) {
// int temp ;
// for(int i = 0 ; i < length ; i++){


//    if (arr[i] > arr[i+1]) {

//      temp = arr[i+1];
//      arr[i+1] = arr[i];
//       arr[i] =  temp; 
//    }
   
   
// }
// length-- ;     
// }
//  return arr ;
// int[] arr = {7,8,3,5,6} ;
// for(int i = 0 ; i < 5 ; i++ ){
//    for(int j = i ; j < 5 ; j++){
//       for(int k = i ; k <= j ; k++){
//          System.out.print(arr[k]);
//       }
//       System.out.print("\t");
//    }
//    System.out.println();
// }

//    }}

//int[]  arr = {-3,4,5,-4,-1,-7,-8};
// int currentSum = 0 ; int maxSum = Integer.MIN_VALUE;


// for(int i = 0 ; i < arr.length ;i++){



//    currentSum = currentSum + arr[i];
//    maxSum = Math.max(maxSum, currentSum);
//    if (currentSum < 0) 
//       currentSum = 0;
      
//    }

// System.out.println(maxSum);




// int[] arr = {7,11,34,56};
// int target  = 11, i = 0,j = arr.length-1,ps;
// while (i < j) {2@
//     ps = arr[i] + arr[j];
//    if (ps > target)
//    j--;
//    else if(ps < target)
//    i++;
//    else{
//    System.out.format("%d pair is %d , %d",ps, i,j);
//    return;}
// }



int[] arr1 = {1,1,2,2,3,3,3,3,5,5,5};
int fre = 0;int m = 0;
   //  int fre = 1;int num = arr1[0];int n = arr1.length;      
for(int i = 1; i < arr1.length ; i++){


  

   // if (arr1[i] == arr1[i-1]) {
   //    fre++;}
      
   // else{
   // fre = 1;
   // num = arr1[i];}


   // if (fre > n/2 && n%2 != 0 || fre >= n/2 && n%2 == 0){
   //    System.out.format("%d,%d",fre,num);
   //  return;}

    
   if(fre == 0)
   m = arr1[i];


if(m == arr1[i])
fre++;
else
fre--;



}

System.out.println("Majority number  = "+m);
   
}


}









