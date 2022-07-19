package lecturesHomework.L14;

public class E2 {
    public static void main(String[] args) {
        value3(4,100);
    }

    private static void value3(int value, int iMax) {
        for (int i = 0; i<=iMax;i++){
            if (i%value==0){
                System.out.println(i);
            }
        }
    }
}
