package lecturesHomework.L29.E6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        all();
    }

    private static void all() {
        int counterEditText = 0;
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while(counterEditText<10){
            counterEditText++;
            String input = scanner.nextLine();
            list.add(input);
        }
        SortList sortList = new SortList();

        sortList.printSortListToLength(list);



    }

}
