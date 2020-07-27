package UnionFind;

public class QuickUnionUF {
    private int id[];
    
    // C => N accesses
    public QuickUnionUF(int N){
        id = new int[N];
        
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }
    
    // Se calcula la raiz de determinado elemento buscando quien sea padre de si mismo.
    // C => Depth of i array accesses.
    private int root(int i) {
        while(i != id[i]) i = id[i];
        return i;
    }
    
    // Si comparten raiz estan conectados. C => depth of p and q array accesses.
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    
    // C => depth of p and q array acceses.
    public void union (int p,  int q) {
        int root_p = root(p);
        int root_q = root(q);
        
        id[root_p] = root_q;
    }
}
