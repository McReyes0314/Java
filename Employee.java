class Employee{
    String lname, fname, job;
    int age; 
    
    public void setName(String ln, String fn){
        lname = ln;
        fname = fn; 
    }

    public String getLname(){
        return lname;
    }

    public String getFname(){
        return fname;
    }

    public void setJob(String j){
        job = j; 
    }

    public String getJob(){
        return job;
    }

    public void setAge(int a){
        age = a; 
    }

    public int getAge(){
        return age;
    }
}