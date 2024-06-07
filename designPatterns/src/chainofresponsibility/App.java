package chainofresponsibility;

public class App {

    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        ProjectLeader projectLeader = new ProjectLeader();
        Manager manager = new Manager();
        teamLeader.setSupervisor(projectLeader);
        projectLeader.setSupervisor(manager);
        teamLeader.processLeave("Jadu", 10);
        projectLeader.processLeave("Madhu", 25);
    }

    
}
