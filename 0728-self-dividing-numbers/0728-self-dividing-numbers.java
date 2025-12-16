class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left;i<=right;i++){
            int num = i;
            boolean flag=true;
            boolean isThereZero=false;
            while(num>0){
                int digit = num%10;
                num/=10;
                if(digit!=0){
                    if(i%digit!=0){
                        flag = false;
                        continue;
                    }
                }
                else{
                    isThereZero =true;
                }
                
            }
            if(flag&&(!isThereZero)){
                list.add(i);
            }
        } 
        return list;
        }
}