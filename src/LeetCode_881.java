/*
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0, r = people.length - 1;
        int count = 0;
        while(l <= r){
            if(people[l] + people[r] <= limit){
                count++;
                l++;
                r--;
            }else{
                count++;
                r--;
            }
        }
        return count;
    }
}
 */
public class LeetCode_881 {
    public static void main (String[] args) {
        System.out.println("LeetCode_881_救生艇 看注释咯");
    }
}
