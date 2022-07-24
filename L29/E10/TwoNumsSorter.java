package lecturesHomework.L29.E10;

import java.util.Comparator;
import java.util.List;

public class TwoNumsSorter {

    public List<TwoNums> sortAll(List<TwoNums> twoNumsList){
        twoNumsList.sort(new Comparator<TwoNums>() {
            @Override
            public int compare(TwoNums o1, TwoNums o2) {
                return TwoNumsRes(o2)-TwoNumsRes(o1);
            }
        });
        return twoNumsList;
    }

    public String getValue(TwoNums sortedList) {
        return "TwoNums("+sortedList.int1+", "+sortedList.int2+")";
    }

    private int TwoNumsRes(TwoNums twoNums) {
        if (twoNums.int1>0 && twoNums.int2>0) return 2;
        if (twoNums.int1<0 && twoNums.int2<0) return 1;
        return 0;
    }


}
