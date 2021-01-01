package auto;

public class NewTest {
   public static void main(String[] args) {
      //Creating an integer array with size 5
      int inpuArray[] = new int[5];
      //Populating the array
      inpuArray[0] = 41;
      inpuArray[1] = 98;
      inpuArray[2] = 43;
      inpuArray[3] = 26;
      inpuArray[4] = 79;
      //Accessing index greater than the size of the array
      System.out.println( inpuArray[3]);
   }
}