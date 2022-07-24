package lecturesHomework.L29.E10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<TwoNums> twoNumsList = new ArrayList<>();
    twoNumsList.add(new TwoNums(1,2));
    twoNumsList.add(new TwoNums(-5,-27));
    twoNumsList.add(new TwoNums(5,7));
    twoNumsList.add(new TwoNums(-5,2));
    twoNumsList.add(new TwoNums(5,-52));
    twoNumsList.add(new TwoNums(-5,-2));

    TwoNumsSorter twoNumsSorter = new TwoNumsSorter();
    List<TwoNums> sortedList = twoNumsSorter.sortAll(twoNumsList);
    for (int i = 0; i <sortedList.size(); i++) {
        System.out.println( twoNumsSorter.getValue(sortedList.get(i)) );
    }



    }
}
