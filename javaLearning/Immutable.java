package javaLearning;

import java.util.ArrayList;
import java.util.List;

public class Immutable {

    private String name;
    private List<Integer> list;

    public Immutable(String name, List<Integer> list) {
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getList() {

        /*
        here we do not directly send list . in that case, client class will be able to modify the list by adding / removing elemnet from the list
        So we send the copy of list . so that original liust do not get modified
        */

        return new ArrayList<>(list);
    }

}
