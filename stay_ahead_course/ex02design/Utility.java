package ex02design;
import java.util.List;

import ex02design.fi.Test;

import java.util.ArrayList;
public class Utility{
    public static <T> List<T> filter(List<T> list, Test<T> test){
        List<T> filtered = new ArrayList<>();
        for(T t : list){
            if(test.test(t)){
                filtered.add(t);
            }
        }
        return filtered;
    }
}
