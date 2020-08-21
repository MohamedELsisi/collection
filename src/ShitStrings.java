import java.util.*;

public class ShitStrings {
    public static void main(String[] args) {

        String s1 = "The Collection in Java is a framework that provides an architecture" +
                " to store and manipulate the group of objects";
        String s2 = "java Collection framework provides many interfaces" +
                " (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet)";
        String s3 = "Any group of individual objects which are represented as a single unit is known" +
                " as the collection of the objects. In Java, a separate framework";
        int n1 = 0, n2 = 0, n3 = 0;
        ArrayList<String> list = new ArrayList<>();
        Set<Integer> set
                = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");
        for (String token : tokens) {
            list.add(token);
        }

        for (String list1 : list) {

            if (s1.contains(list1)) ++n1;
            if (s2.contains(list1)) ++n2;
            if (s3.contains(list1)) ++n3;


        }
        set.add(n1);
        set.add(n2);
        set.add(n3);
        System.out.println(set);
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            int c = i.next();
            if (c == n1) System.out.println("s1 " + c);
            if (c == n2) System.out.println("s2 " + c);
            if (c == n3) System.out.println("s3 " + c);

        }
    }
}
