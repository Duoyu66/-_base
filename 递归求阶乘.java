 public static int jie(int n){
        int num=1;
        if(n==1){return 1;}
        else{
            num=n*jie(n-1);
        }
        return num;
    }