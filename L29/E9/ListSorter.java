package lecturesHomework.L29.E9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorter {

    public Integer findMax(List<Integer> integerList) {
        int maxNum = integerList.get(0);
        for (int item=0;item<integerList.size();item++){
            if (maxNum<integerList.get(item)){
                maxNum=integerList.get(item);
            }
        }
        return maxNum;
    }
    public Integer findMin(List<Integer> integerList) {
        int minNum = integerList.get(0);
        for (int item=0;item<integerList.size();item++){
            if (minNum>integerList.get(item)){
                minNum=integerList.get(item);
            }
        }
        return minNum;
    }

    public List<Integer> sortToMin(List<Integer> integerList){
        List<Integer> list = integerList;
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        return list;
    }
    public List<Integer> sortToMax(List<Integer> integerList){
        integerList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        return integerList;
    }

    public Integer summer(List<Integer> integerList){
        int summ = 0;
        for (int item=0;item<integerList.size();item++){
            summ+=integerList.get(item);
        }
        return summ;
    }
    public List<Integer> zeroToMax(List<Integer> integerList){
        for (int item=0;item<integerList.size();item++){
            if (integerList.get(item)==0)
            integerList.set(item,Integer.MAX_VALUE);
        }
        return integerList;
    }
    public List<Integer> moreThanElem(List<Integer> integerList, Integer elem){
        List<Integer> list= new ArrayList<>();
        for (int value: integerList){
            if (value>elem){
                list.add(value);
            }
        }
        return list;
    }
}
