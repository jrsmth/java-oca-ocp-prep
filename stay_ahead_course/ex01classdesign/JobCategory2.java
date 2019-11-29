package ex01classdesign;
public enum JobCategory2 {
    DIRECTOR(5), 
    MANAGER(4), 
    SUPERVISOR(3), 
    TECHNICIAN(2), 
    ADMINISTRATOR(1);
    private int grade;
    private JobCategory2(int grade){ 
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }
}
