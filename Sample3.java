class Sample3{
    int emp_Id, emp_Age; 
    String emp_dept; 
 
    Sample3(int emp_Id, int emp_Age, String emp_dept){
        this.emp_Id = emp_Id;
        this.emp_Age = emp_Age; 
        this.emp_dept = emp_dept;
    }   

    public int getId(){
        return emp_Id;
    }

    public int getAge(){
        return emp_Age;
    }

    public String getDept(){
        return emp_dept;
    }
}