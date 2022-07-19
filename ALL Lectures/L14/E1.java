package lecturesHomework.L14;

public class E1 {
    public static void main(String[] args) {
        value3(100);
    }

    private static void value3(int iMax) {
        for (int i = 0; i<=iMax;i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
