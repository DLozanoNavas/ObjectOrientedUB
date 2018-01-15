
package Logic;

import java.util.ArrayList;


public class StudentObject {

    private long identification;

    private String name;

    private String lastName;

    private long code;

    private String adress;

    private long phone;

    private String mail;

    private char gender;
    
    

    public StudentObject () {
    }

    public long getIdentification () {
        return identification;
    }

    public void setIdentification (long val) {
        this.identification = val;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String val) {
        this.lastName = val;
    }

    public long getCode () {
        return code;
    }

    public void setCode (long val) {
        this.code = val;
    }

    public String getMail () {
        return mail;
    }

    public void setMail (String val) {
        this.mail = val;
    }

    public String getAdress () {
        return adress;
    }

    public void setAdress (String val) {
        this.adress = val;
    }

    public char getGender () {
        return gender;
    }

    public void setGender (char val) {
        this.gender = val;
    }

    public String getName () {
        return name;
    }

    public void setName (String val) {
        this.name = val;
    }

    public long getPhone () {
        return phone;
    }

    public void setPhone (long val) {
        this.phone = val;
    }

    public int searchStudent (long code, ArrayList<StudentObject> studentList) {
        int indexOf = 0;
        int query = -1;
        for (StudentObject student : studentList) {
            long codeComparison = student.getCode();
            long codeSearch = code;
            if (codeComparison == codeSearch) {
                query = indexOf;
            }
            indexOf++; 
        }
        return query;
    }

    public String modifyStudents () {
        return null;
    }

    public char academicSituation () {
        return 'a';
    }

    public Boolean academicAverage () {
        return null;
    }

}

