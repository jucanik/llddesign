package chainofresponsibility;

public abstract class Employee {

    public Employee supervisor;

    public void setSupervisor(final Employee nextSupervisor){
        this.supervisor = nextSupervisor;
    }

    public abstract void processLeave(final String employeeName, final int leaveDays);
}


