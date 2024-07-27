package javaLearning;

class Sum{
    public int sum(int ...n){
        int s=0;
        for(int i: n){
            s=s+i;
        }
        return s;
    }
}

public class Varargs {

    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.sum(3,4,5));
    }
}
