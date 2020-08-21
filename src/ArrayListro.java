import java.util.*;

class mappro {
    public static void main(String[] args) {

        List<Integer> list = null;
        Map<String, List<Integer>> map = new HashMap<>();
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        for (int i = 0; i < c; ++i) {
            String input = s.next();
            list = new ArrayList<Integer>();
            map.put(input, list);
        }
        while (true) {
            System.out.println("enter name");
            String name = s.next();

            if (name.equals("0")) break;
            int v = s.nextInt();
            if (!map.containsKey(name)) {
                System.out.println("not found X_X");
            }
            list.add(v);
            map.put(name, list);

        }
        System.out.println(map);
    }


}










