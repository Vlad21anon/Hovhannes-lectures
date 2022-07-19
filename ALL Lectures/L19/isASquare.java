package lecturesHomework.L19;

public class isASquare {
    final int line1;
    final int line2;
    final int line3;
    final int line4;

    public isASquare(int line1, int line2, int line3, int line4) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }
    public boolean isRightSquare () {
        return (line1==line2 && line2==line3 & line3==line4);
    }
}
