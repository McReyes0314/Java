class Sample1 {
   String lname, fname, job; 
   int age; 

   Sample1(){
      lname = "Default name"; 
      fname = "Default name";
      job = "Default Job";
      age = 0;
   }

   public void setLname(String lname){
      this.lname = lname;
   }

   public String getLname(){
     return lname;
   }

   public void setFName(String fname){
    this.fname = fname;
   }

   public String getFname(){
    return fname;
   }

   public void setJob(String job){
    this.job = job;
   }

   public String getJob(){
    return job;
   }

   public void setAge(int age){
    this.age = age; 
   }

   public int getAge(){
    return age; 
   }
}