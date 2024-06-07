package chainofresponsibility;

public class ProjectLeader extends Employee{

    private static int MAX_LEAVE_APPROVAL_LIMIT = 20;

    private void sendApprovalToNextLevel(final String employeeName, final int leaveDays){
        supervisor.processLeave(employeeName, leaveDays);
    }

    private void approveLeave() {
        System.out.println("Leave Approved By ProjectLeader");
    }


    @Override
    public void processLeave(String employeeName, int leaveDays) {
        if(leaveDays<MAX_LEAVE_APPROVAL_LIMIT){
            approveLeave();
        } else{
            sendApprovalToNextLevel(employeeName, leaveDays);
        }
    }

}
