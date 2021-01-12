public class Radix{

  public static int nth(int n, int col){
    double temp = Math.pow(10, col);
    return Math.abs(Math.round((n/temp)%10));
  }

  public static int length(int n){
    n = Math.abs(n);
    return (Integer.toString(n)).length();
  }

  public static void merge(MyLinkedList original, MyLinkedList[] buckets){
  }
}
