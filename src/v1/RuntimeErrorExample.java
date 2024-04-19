package v1;

/**
 * 예제 2: 런타임 에러
 * 런타임 에러를 경험해 보기 위한 코드입니다.
 * 배열의 범위를 넘어가는 접근을 시도하여 ArrayIndexOutOfBoundsException을 발생시킵니다.
 */
public class RuntimeErrorExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        // 일부러 배열의 범위를 넘어가는 접근을 시도합니다.
        System.out.println(numbers[3]);
    }
}
