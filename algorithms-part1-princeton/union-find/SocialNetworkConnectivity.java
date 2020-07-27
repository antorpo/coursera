package UnionFind;

class SocialNetworkConnectivity {
    
    private QuickFindUF unionF;
    private int withoutConection;
 
    public SocialNetworkConnectivity(int n){
        unionF = new QuickFindUF(n);
        withoutConection = n;
    }
    
    public void addFriend(int p, int q) {
        if (!unionF.connected(p, q)) {
            withoutConection--;
        }
        
        unionF.union(p, q);
    }
    
    public boolean allConected(){
        return withoutConection==0;
    }
    
}

class SocialN {
    
    public static void main(String[] args) {
       int n = 100;
       SocialNetworkConnectivity sN = new SocialNetworkConnectivity(n);
       
//     for (int i = 0; i < 10; i++) {
//        get data from timestamp log
//        sN.addFriend(p, q);  
//     }

//     sN.allConected();
       
    }
}

