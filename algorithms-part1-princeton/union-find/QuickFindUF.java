package UnionFind;

public class QuickFindUF {

    private int id[];

    // Constructor: Set id of each object to itself (N array accesses).
    public QuickFindUF(int N) {
        id = new int[N];

        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }

    }
    
    // Check whether p and q are in the same component (2 array acceses).
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }
    
    // Change all entries with id[p] to id[q] (At most 2N + 2 array acceses).
    public void union (int p, int q) {
        int p_id = id[p];
        int q_id = id[q];
        
        
        // Ciclo ya que debemos coger todas las relacion que tengan p_id y conectarlas con q_id.
        for (int i = 0; i < id.length; i++) {
            if(id[i] == p_id) {
                id[i] = q_id;
            }
        }
        
    }
    
    // Number of components.
    public int count() {
        id = simpliedBubbleSort(id);
        int count = id.length > 0 ? 1 : 0;
        
        for (int i = 1; i < id.length; i++) {
            if(id[i-1] != id[i]){
                count++;
            }
        }
        
        return count;
    }
    
    private int[] simpliedBubbleSort (int arr []){
        boolean ready = false;
        int temp = 0;
        
        while (!ready) {
            ready = true;
            
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] < arr[i-1]){
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    
                    ready = false;
                }
            }
        }
        
        return arr;
    }
    
}


/*
    Suma de complejidades:
    constructor: N accesos.
    connected: 2 accesos.
    union: 2 + 2N accesos.

    Total: 3N + 4
*/