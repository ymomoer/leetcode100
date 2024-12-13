import java.util.HashSet;
import java.util.Set;

class isHappy1 {
    public boolean isHappy(int n){
        Set<Integer> record = new HashSet<>();
        while(n!=0&&!record.contains(n)){
            record.add(n);
            n = getNextNumber(n);
        }
        return n==1;
    }

    private int getNextNumber(int n){
        int res = 0;
        while (n>0){
            int temp = n%10;
            res = res+temp*temp;
            n=n/10;
        }
        return res;
    }

    public static void main(String[] args) {
        isHappy1 result = new isHappy1();
        System.err.println(result.isHappy(19));
        System.err.println(result.isHappy(-1));
    }
}
