package lecturesHomework.L18;

public class E2 {
    private static final idUserE2[] idUserE2 = new idUserE2[] {
            new idUserE2(0, "Это Влад"),
            new idUserE2(1, "Это Дима"),
            new idUserE2(2, "Это Артем")
    };
    public static void main(String[] args) {

        for (int i = 0; i < idUserE2.length; i++) {
            System.out.println(idUserE2[i].id+ " -->> " + idUserE2[i].info);
        }

    }
}
