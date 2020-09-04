package exemplu2;

public class NumberSortingManager {
    int [] numere;
    int [] sort() {
        for(int i=0;i<numere.length-1;i=i+1) {
            for(int j=i+1;j<numere.length;j=j+1) {
                if(numere[i]>numere[j]) {
                    int A = numere [i];
                    numere [i] = numere [j];
                    numere [j] = A;

                }
            }
        }
        return numere;
    }

}
