package mail.GCD;

/**
 * 정수 배열이 주어지면 , 배열 안의 모든 정수의 최대 공약수(GCD)를 구하시오. 시간 복잡도 제한 O(n) 
 * Given an integer array, find the greatest common denominator of all elements. 
 * input: [3, 2, 1] output: 1 
 * input: [2, 4, 6, 8] output: 2
 */
public class Gcd {
    /**
     * 유클리드 호제법 사용 
     * a < b
     * b = a*i1 + c1
     * a = x*i2 + c2
     * x = x2*i3 + c3
     * ...
     * r = t*in 
     * t-> GDC
     *  */ 
    
    static int gcdInTwo(int a, int b){
        //Arrays.sort(nums); // nlogn -> n^2
        if (0 == a){
            return b;
        }

        return gcdInTwo(b%a, a);
    }

    static int getGcd(int nums[]){
        int res = nums[0];
        for (int i =1; i<nums.length; i++){
            res = gcdInTwo(nums[i],res);
        }
        return res;
    }
    public static void main(String args[]){
        int[] arr = new int[]{2, 4, 6, 8};
        int res = getGcd(arr);
        System.out.println(res);
    }

}
