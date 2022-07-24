package lecturesHomework.L29.E9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(0);
        list.add(3);
        list.add(-90);

        ListSorter listSorter = new ListSorter();
        System.out.println(listSorter.findMax(list));
        System.out.println(listSorter.findMin(list));
        System.out.println(listSorter.sortToMin(list));
        System.out.println(listSorter.sortToMax(list));
        System.out.println(listSorter.summer(list));
        System.out.println(listSorter.zeroToMax(list));
        System.out.println(listSorter.moreThanElem(list,1));
    }
}
