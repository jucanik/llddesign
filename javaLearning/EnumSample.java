package javaLearning;

public enum EnumSample {

    SUNDAY{
        @Override
        public void dummyMethod() {
            System.out.println("Dummy method for Monday");
        }
    },
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public void dummyMethod() {
        System.out.println("Default dummy method");
    }

    // here the dummyMethod is not associated with class . instead this method is associated with each constant of enum
    // enum can implement interface. Enum constants are internally static final
    // final class can not be inherited by childclass 
    // public final class sample{
    //}

}
