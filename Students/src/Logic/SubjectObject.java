package Logic;


public class SubjectObject {

    private String subjectName;

    private int semester;

    private String shedule;

    private String jornada;

    public SubjectObject () {
    }

    public String getSchedule () {
        return shedule;
    }

    public void setSchedule (String val) {
        this.shedule = val;
    }

    public String getJornada () {
        return jornada;
    }

    public void setJornada (String val) {
        this.jornada = val;
    }

    public String getSubjectName () {
        return subjectName;
    }

    public void setSubjectName (String val) {
        this.subjectName = val;
    }

    public int getSemester () {
        return semester;
    }

    public void setSemester (int val) {
        this.semester = val;
    }
    
     public Boolean modificarAsignatura1 () {
        return null;
    }


}

