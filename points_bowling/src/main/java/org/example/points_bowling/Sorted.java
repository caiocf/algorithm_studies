package org.example.points_bowling;

import java.util.ArrayList;
import java.util.List;

public class Sorted {
    public List<Integer> sort(List<Integer> list) {
        if(list != null && list.size() > 1){

            for(int limit = list.size() -1; limit > 0; limit-- ) {
                for (int firstIndex=0; firstIndex < limit; firstIndex++) {
                    int secondIndex = firstIndex +1;
                    if (list.get(firstIndex) > list.get(secondIndex)) {
                        int first = list.get(firstIndex);
                        int second = list.get(secondIndex);
                        list.set(firstIndex, second);
                        list.set(secondIndex, first);
                    }
                }
            }
        }
        return list;
    }
}
