import java.util.Arrays;

class reverseString1 {
    public void reverseString(char[] s){
        int l=0;
        int r=s.length-1;
        while(l<r){
            char temp = s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        reverseString1 solution = new reverseString1();
        char[] input = {'H','e','l','l','o'};
        solution.reverseString(input);
        System.out.println("Test case:"+Arrays.toString(input));

        char[] input2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(input2);
        System.out.println("Test case:" + Arrays.toString(input2));
    }
}
