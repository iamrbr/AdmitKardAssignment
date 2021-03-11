import java.util.*;

public class EqualPairs
{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n, x, y, t;
            System.out.print("Enter the value of N:");
            n = sc.nextInt();
            System.out.print("\nEnter the value of X:");
            x = sc.nextInt();
            System.out.print("\nEnter the value of Y:");
            y = sc.nextInt();
            System.out.print("\nEnter the value of T:");
            t = sc.nextInt();
            List<Integer> listA = getListA(n, x);
            List<Integer> listB = getListB(n, y);
            System.out.println("\nElement of List A");
            for (int i : listA) System.out.print(i + " ");
            System.out.println();
            System.out.println("\nElements of List B");
            for (int i : listB) System.out.print(i + " ");

            System.out.println();
            System.out.println("\nEqual Pairs are:");
            HashMap<Integer, Integer> pairs = checkPairSum(listA, listB, t);
            for (Map.Entry<Integer, Integer> entry : pairs.entrySet())
                System.out.println(entry.getKey() +
                        "," + entry.getValue());
        }
        catch (Exception e){
            System.err.println("Invalid Input");
        }
    }
    public static List<Integer> getListA(int n, int x){
        List<Integer> listA = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            if(i%x == 0) listA.add(i);
        }
        return listA;
    }
    public static List<Integer> getListB(int n, int y){
        List<Integer> listB = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            if(i%y == 0) listB.add(i);
        }
        return listB;
    }
    public static HashMap<Integer,Integer> checkPairSum(List<Integer>listA,List<Integer>listB,int t){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: listA){
            for(int j : listB)
                if ((i+j) == t)
                    map.put(i,j);
        }
        return map;
    }
}
