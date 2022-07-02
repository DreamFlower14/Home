package Home;

public class H0703 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int n = (int) (Math.random()*10);
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        System.out.println("셔플된 값은?");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
