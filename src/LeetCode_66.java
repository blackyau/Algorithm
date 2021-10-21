/*
class Solution {
    public int[] plusOne(int[] digits) {
        boolean step = true;
        int i;
        if(digits.length == 1 && digits[0] < 9){
            digits[0] += 1;
            return digits;
        }
        for(i = digits.length - 1; i > 0; i--){
            if(digits[i] < 9 && step == true){
                digits[i] += 1;
                step = false;
                break;
            }else if(digits[i] == 9 && step == true){
                digits[i] = 0;
            }
        }
        if(step == true && i == 0){
            if(digits[0] < 9){
                digits[0] += 1;
                return digits;
            }
            int arr[] = new int[digits.length + 1];
            arr[0] = 1;
            digits[0] = 0;
            for(int j = 1; j < arr.length; j++){
                arr[j] = digits[j-1];
            }
            return arr;
        }
        return digits;
    }
}
 */
public class LeetCode_66 {
    public static void main (String[] args) {
        System.out.println("LeetCode_66_加一 看注释咯");
    }
}
