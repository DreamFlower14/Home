public class For {
    public static void main(String[] args) {
        /* int i;

        for(i = 0; i < 5; i++){
            System.out.printf("안녕하세요? 빙글빙글 for문을 공부중입니다.\n");
        }

        int hap;

        hap = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 +10;

        System.out.printf("1에서 10까지의 합 : %d \n", hap);*/

        int hap = 0;
        int i;

        for (i = 1; i <= 10 ; i++){
            hap = hap + i;
        }
        System.out.println("1부터 10까지의 합 : " + hap);

        int hap2 = 1;

        for(int j = 5; j >= 1; j--){
            hap2 = hap2 * j;
            System.out.println("hap2 : "+ hap2);
        }
        System.out.println(" 5! = "+ hap2);
    }
}
