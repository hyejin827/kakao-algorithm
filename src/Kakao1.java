public class Kakao1 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        String[] result = new String[n];

        /*
        비트연산
        &연산 => 둘다 1일 경우 1로 변환
        |연산 => 둘중 하나라도 1일 경우 1로 변환
        ^연산 => 두 수의 각 자리수가 다른 경우 1로 변환
        ~연산 => 각 자리수를 반대로 변환
        */

        for (int i=0; i<n; i++) {
            int arr = arr1[i] | arr2[i];
            result[i] = Integer.toBinaryString(arr);
            result[i] = result[i].replace("1","#");
            result[i] = result[i].replace("0"," ");
            System.out.println(result[i]);
        }


    }
}
