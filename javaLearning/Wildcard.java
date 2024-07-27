package javaLearning;

import java.util.List;

public class Wildcard {

    public void computeList(List<? extends Number> sourceList, List<? extends Number> dfestinationList) {

    }

    public <T extends Number, K extends Number> void computeListWithGenericType(List<T> sourceList, List<T> destinationList) {

    }
    public void computeListWithSuper(List<? super Number> sourceList, List<? extends Number> dfestinationList) {

    }

    public void computeListWithUnbounded(List<?> sourceList, List<? extends Number> dfestinationList) {

    }
    
}
