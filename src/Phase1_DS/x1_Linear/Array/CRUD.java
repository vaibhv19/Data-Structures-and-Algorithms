package Phase1_DS.x1_Linear.Array;

import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) {
    //------Creating an Array------

    //type[] arrayName = new type[size];
    int[] arr = new int[6];
    int[] arr1 = new int[6];
    //type[] arrayName={1,2,3,4,5};
    int[] arr2={1,2,3,4,5};


    //------Updating an element in an array-----

        //Updating an element at a specific index
    arr[0]=1;
    arr[1]=2;
    arr[2]=3;
     //taking user input
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            System.out.println("Enter element at index "+i+":");
            arr1[i]=sc.nextInt();
        }
        System.out.println();
    //-----Reading an element from an array------

    //one element at a time
    System.out.println(arr[0]);
    //whole array using loop
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+",");
        }
        System.out.println();
    //-----Deleting an element from an array------

    // In Java, arrays have a fixed size once initialized,
    // so you cannot remove an element from an array directly.
    // To "delete" an element,
    // you would typically need to create a new, smaller array and copy the desired elements into it,
    // or use a different data structure like an ArrayList.
    //Delete is usually demonstrated by shifting elements left and reducing the logical size
        int[] arr3={1,2,3,4,5,6};
        int size1=arr3.length;
        int deleteIndex=2;
        for(int i=deleteIndex;i<size1-1;i++){
            arr3[i]=arr3[i+1];
        }
        arr3[arr3.length-1]=0;
        size1--;
        for(int i=0;i<size1;i++){
            System.out.print(arr3[i]+",");
        }

        System.out.println();
        //-----inserting an element in the array------
        int[] arr4=new int[10];
        arr4[0]=1;
        arr4[1]=2;
        arr4[2]=4;

        int size=3;

        int insertIndex=2;
        int insertValue=3;
        for(int i=size;i>insertIndex;i--){
            arr4[i]=arr4[i-1];
        }
        arr4[insertIndex]=insertValue;
        size++;
        for(int i=0;i<size;i++){
            System.out.print(arr4[i]+",");
        }

        sc.close();
    }
}
