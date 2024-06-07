package chainofresponsibility;

public class TeamLeader extends Employee{

    private static int MAX_LEAVE_APPROVAL_LIMIT = 10;

    private void sendApprovalToNextLevel(final String employeeName, final int leaveDays){
        supervisor.processLeave(employeeName, leaveDays);
    }

    private void approveLeave() {
        System.out.println("Leave Approved by TeamLeader");
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
