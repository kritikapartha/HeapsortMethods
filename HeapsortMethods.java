//Name: Kritika Partha  
//Date: 2/10/20
// What I learned: I learned how to create a heap and how a heap works. I learned how to heap down using
//the swap method. I also learned how to sort the heap to make it easier for the heapdown method. 
import java.text.DecimalFormat;
public class HeapsortMethods
{
   public static final int SIZE = 10;
   private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
   public static void main(String[] args)
   {
      
   //Part 1: Given a heap, sort it. Do this part first.   
      double heap[] = {-1,99,80,85,17,30,84,2,16,1};
      display(heap);
      sort(heap);
      display(heap);
      
   //Part 2:  Generate 10 random numbers, make a heap, sort it.
      // double[] heap = new double[SIZE];
      
      // createRandom(heap);
      // display(heap);
      // makeHeap(heap);
      // display(heap); 
      // sort(heap);
      // display(heap);
   }
   
	//******* Part 1 ******************************************
   public static void display(double[] array)
   {
      for(int k = 1; k < array.length; k++)
         System.out.print(array[k] + "    ");
      System.out.println("\n");	
   }
   public static void sort(double[] array)
   {
       int n = array.length; 
  
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapDown(array, n); 
  
        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
  
            // call max heapify on the reduced heap 
            heapDown(array, i); 
        } 
   
   }
   public static void swap(double[] array, int a, int b)
   {
      double t = array[a];
		array[a] = array[b];
		array[b] = t;
   }
   public static void heapDown(double[] array, int size)
   {
         int largest = size; // Initialize largest as root 
        int l = 2*size + 1; // left = 2*i + 1 
        int r = 2*size + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < size && array[l] > array[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < size && array[r] > array[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != size) 
        { 
            array[size] = array[largest]; 
  
            // Recursively heapify the affected sub-tree 
            heapDown(array, size); 
        }   
   
   }
   
   // ****** Part 2 *******************************************
   public static void makeHeap(double[] array)
   {
         int size = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            double e = array[i];
         }
   
   }
   //Generate 100 random numbers (between 1 and 100, formatted to 2 decimal places) 
   public static void createRandom(double[] array)
   {  
    int[] list = new int[100];
    for (int i=0; i<100; i++){
        int n = (int)(Math.random()*100 + 1);
        list[i] = n;

    }
    
   }
}
