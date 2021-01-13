public class Radix{

  public static int nth(int n, int col){
    double temp = Math.pow(10, col);
    return Math.abs(Math.round((n/temp)%10));
  }

  public static int length(int n){
    n = Math.abs(n);
    return (Integer.toString(n)).length();
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
    int i = 0;
    while (i<buckets.length){
      original.extend(buckets[i]);
      i += 1;
    }
  }
  public static void radixSortSimple(SortableLinkedList data){
    int highlength = 0;
    int i = 0;
    while (i< data.size()){
      if (data.get(i) > highlength){
        highlength = data.get(i);
      }
      i += 1;
    }

  }

  public static void radixSort(SortableLinkedList data){

  }
}
