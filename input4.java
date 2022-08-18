class Solution {

    List<List<Integer>> list = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n, int k) {
        if( n == 0 || k == 0){
            return list;
        }

        //回溯递归求解
        backTrack(1,n,new LinkedList<Integer>(),k);

        return list;
    }

    public void backTrack(int index,int n,LinkedList<Integer> list2,int k){

        //长度满足则加入
        if(list2.size() == k){
            list.add(new LinkedList(list2));
        }
        for(int i=index;i<n+1;++i){
            list2.add(i);
            //注意 在这是i+1  若传递i 则会导致StackOverFlow异常
            backTrack(i+1,n,list2,k);

            //需要把加入的值去除  放可进行下一次循环  否则也会异常
            list2.removeLast();
        }
    }
}
