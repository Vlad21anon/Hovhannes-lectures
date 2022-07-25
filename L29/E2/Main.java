package lecturesHomework.L29.E2;

public class Main {
    public static void main(String[] args) {
        Chain chain1 = new Chain(new NotNull(), new NotEmpty());
        Chain chain2 = new Chain(new MoreThan(5), new HaveNumber());

        Chain allChain = new Chain(chain1,chain2);
        System.out.println(allChain.isValid("444454666"));
    }
}
