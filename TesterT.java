public class TesterT{
  public static void main(String[] args){

    System.out.println(Radix.nth(123, 1));

    System.out.println(Radix.length(5112));

    SortableLinkedList first = new SortableLinkedList();
    SortableLinkedList second = new SortableLinkedList();
    SortableLinkedList third = new SortableLinkedList();
    SortableLinkedList fourth = new SortableLinkedList();

    SortableLinkedList[] buckets = {second, third, fourth};

    first.add(1);
    first.add(2);
    first.add(3);
    int i = 0;
    while (i<buckets.length){
      buckets[i].add(1);
      buckets[i].add(2);
      buckets[i].add(3);
      i += 1;
    }
    Radix.merge(first, buckets);
    System.out.println(first.toString());
    System.out.println(second.toString());
    System.out.println(third.toString());
    System.out.println(fourth.toString());

    Radix.radixSortSimple(first);
    System.out.println(first.toString());

  }


}
