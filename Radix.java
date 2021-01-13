public class Radix{

  public static int nth(int n, int col){
    double temp = Math.pow(10, col);
    return (int) ((n/temp)%10);
  }
  public static int length(int n){
    return (Integer.toString(n).length());
  }
  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
    int i = 0;

    while (i<buckets.length){
      original.extend(buckets[i]);
      i += 1;
    }
  }
  public static void radixSortSimple(SortableLinkedList data){
    int highlength = 1;

    int x = 0;

    int i = 0;

    while (i<highlength){

      SortableLinkedList[] merger = new SortableLinkedList[10];

      x = 0;
      while (x < 10){
        merger[x] = new SortableLinkedList();
        x += 1;
      }

			while(data.size()!=0) {
        if (i == 0){
          int temp = Integer.max(length(data.get(0)), highlength);
          highlength = temp;
        }
        SortableLinkedList merger1 = merger[nth(data.get(0),i)];
				merger1.add(data.get(0));

				data.remove(0);
			}

			merge(data,merger);
      i += 1;
    }

  }
  public static void radixSort(SortableLinkedList data){

  }
}
