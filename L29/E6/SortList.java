package lecturesHomework.L29.E6;

import java.util.Comparator;
import java.util.List;

public class SortList {

    private List<String> sortFun(List<String> list){
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {return o1.length()-o2.length();}
        });
        return list;
    }

    public List<String> sortListToLength(List<String> list){
        return sortFun(list);
    }
    public void printSortListToLength(List<String> list){
        System.out.println(sortFun(list));
    }

}
