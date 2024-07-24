public class Sample4 {
    int stdAge; 
    String stdCourse; 

    Sample4(){
        stdAge = 0;
        stdCourse = "Any course"; 
    }

    public void setAge(int stdage){
        this.stdAge = stdage;
    }

    public void setCourse(String stdCourse){
        this.stdCourse = stdCourse;
    }

    Sample4(int stdAge, String stdCourse){
        this.stdAge = stdAge;
        this.stdCourse = stdCourse;
    }

    public int getAge(){
        return stdAge; 
    }

    public String getCourse(){
        return stdCourse;
    }
}
