package exemplu2;

public class Main {
    public static void main(String[] args) {
        NumberSortingManager n = new NumberSortingManager();
        n.numere = new int[] {5,3,1,2,7,9};
        int[] r = n.sort();
        for(int i=0;i<r.length;i=i+1) {
            System.out.println(r[i]);

        }
    }
}
