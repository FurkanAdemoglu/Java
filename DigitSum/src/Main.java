public class Main {
public static void main(String[] args){
    //System.out.println(sumDigits(120));
    //int[] notlar = {0, 1, 1, 1, 0, 1, 1, 1, 0, 1};
    int[] notlar = {0, 0};
    System.out.println(solution(notlar));
}
private static int sumDigits(int number){
    if(number<10){
        return number;
    }
    int sum=0;
    while(number>0){
        int digit=number%10;
        sum+=digit;
        number/=10;
    }
    return sum;
}

    public static int  solution(int[] A) {
        int n = A.length;
        int i = n - 1;
        int result = -1;
        int k = 0, maximal = 0;
        while (i > 0) {
            if (A[i] == 1) {
                k = k + 1;
                if (k >= maximal) {
                    maximal = k;
                    result = i;
                    System.out.println(k+" "+i+" ");
                }
            }
            else
                k = 0;
            i = i - 1;
        }
        if (A[i] == 1 && k + 1 > maximal)
            result = 0;
        return result;
    }
}

