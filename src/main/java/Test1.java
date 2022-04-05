public class Test1 {
    public static void main(String[] args) {
        int ch1 = 5, ch2 = 8;
        boolean result1, result2;

        result1 = (ch1 > 3) && (ch1 < 6); // 왼쪽은 참 오른쪽도 참
        result2 = (ch2 < 9) || (ch2 < 3); // 왼쪽은 참 오른쪽은 거짓

        System.out.println("&& 연상자에 의한 결과 : " + result1);
        System.out.println("|| 연상자에 의한 결과 : " + result2);
        System.out.println("! 연상자에 의한 결과 : " + !result2);
    }
}
