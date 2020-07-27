package UnionFind;

public class Main {
    public static void main(String[] args) {
        QuickFindUF qf_uf = new QuickFindUF(10);
        
        qf_uf.union(1, 3);
        qf_uf.union(3, 5);
        qf_uf.union(8, 9);
       
        System.out.println(qf_uf.count()); 
    }
}
