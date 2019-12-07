package models;

public class Grade {
    private int id;
    private Student student;
    private Float absolutePointsScored;
    private String comment;

    public Grade(int id, Student student, Float absolutePointsScored, String comment) {
        this.student = student;
        this.absolutePointsScored = absolutePointsScored;
        this.comment = comment;
    }

    public Grade(int id, Student student) {
        this(id, student, 0f, "");
    }

    public void setAbsolutePointsScored(Float absolutePointsScored) {
        this.absolutePointsScored = absolutePointsScored;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Student getStudent() {
        return student;
    }

    public Float getAbsolutePointsScored() {
        return absolutePointsScored;
    }

    public String getComment() {
        return comment;
    }

    public static String translateGradeToLetter(Float absolutePointsScored, Float totalPointsAvailable){
        Float gradePercentage = absolutePointsScored/totalPointsAvailable;
        if (gradePercentage < 67){
            return "F";
        }else if (gradePercentage < 71){
            return "D";
        }else if (gradePercentage < 74){
            return "C-";
        }else if (gradePercentage < 78){
            return "C";
        }else if (gradePercentage < 81){
            return "C+";
        }else if (gradePercentage < 84){
            return "B-";
        }else if (gradePercentage < 88){
            return "B";
        }else if (gradePercentage < 91){
            return "B+";
        }else if (gradePercentage < 95){
            return "A-";
        }else{
            return "A";
        }
    }
}
