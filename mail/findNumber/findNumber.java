package mail.findNumber;

/**
 * 정렬(sort)된 정수 배열과 정수 n이 주어지면, 배열안에 n이 있는지 체크하시오. 시간복잡도를 최대한 최적화하시오.
 * Given a sorted integer array and an integer N, check if N exists in the array.
 * 예제)
 * Input: [1, 2, 3, 7, 10], 7
 * Output: true
 * 
 * Input: [-5, -3, 0, 1], 0
 * Output: true
 * 
 * Input: [1, 4, 5, 6, 8, 9], 10
 * Output: false
 */
public class findNumber {
    static boolean findNum(int[] arr, int start, int end, int num){
        if (start > end){
            return false;
        }
        if (arr[(start+end) / 2] < num){
            return findNum(arr, ((start+end) / 2)+1, end, num);
        }else if (arr[(start+end) / 2] > num){
            return findNum(arr, start, ((start+end) / 2)-1, num);
        }else {
            return true;
        }
    }

    public static void main(String args[]) {
        int[] arr = {1, 4, 5, 6, 8, 9};
        int k = 9;
        
        System.out.println(findNum(arr, 0, arr.length-1, k));
    }

}
