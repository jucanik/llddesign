package chainofresponsibility;

public class Manager extends Employee{

    public static int MAX_LEAVE_APPROVAL_LIMIT = 30;

    private void approveLeave() {
        System.out.println("Leave Approved By Manager");
    }

    @Override
    public void processLeave(String employeeName, int leaveDays) {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        if(leaveDays<MAX_LEAVE_APPROVAL_LIMIT){
            approveLeave();
        } else{
            System.out.println("Leave can not be approved . need to contact Manager");
        }
    }

}
