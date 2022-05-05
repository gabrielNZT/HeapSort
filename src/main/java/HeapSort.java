import java.util.ArrayList;
import java.util.Arrays;

public class HeapSort {

    public void descer(int i, int n, ArrayList<Integer> vetor){
        int aux;
        int j = 2*i;
        if(j<=n){
            if(j<n){
                if(vetor.get(j+1) < vetor.get(j)){
                    j++;
                }
            }
            if(vetor.get(i) > vetor.get(j)){
                aux = vetor.get(i);
                vetor.set(i, vetor.get(j));
                vetor.set(j, aux);
                descer(j, n, vetor);
            }
        }
    }

    public ArrayList<Integer> ConstroiHeap(ArrayList<Integer> vetor){
        int n = vetor.size();
        n = n/2;
        for(int i=n; i>=0; i--){
            descer(i,vetor.size()-1, vetor);
        }
        return vetor;
    }

    public ArrayList<Integer> Sort2(ArrayList<Integer> vetor){


        return vetor;
    }

    public ArrayList<Integer> Sort(ArrayList<Integer> vetor){
        ConstroiHeap(vetor);
        int m = vetor.size()-1;
        int aux;
        int k=0;
        ArrayList<Integer> vet2 = new ArrayList<>();
        while (m>=0){
            vet2.add(k, vetor.get(0));
            k++;
            aux = vetor.get(m);
            vetor.set(m, vetor.get(0));
            vetor.set(0, aux);
            m--;
            descer(0, m, vetor);
        }
        return vet2;
    }

    public void main() {

        ArrayList<Integer> vetor = new ArrayList<Integer>();
        Integer[] A = {1,4,1,1,3,10,25};
        vetor.addAll(Arrays.asList(A));

        System.out.println(Sort(vetor));
    }
}
