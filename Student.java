public class Student {
    static int schoolcode = 357; //class variable

    int studnum; //instance variable 

    public void throwstudnum(int x){ //instance method
        studnum = x; 
    }

    public int fetchstdnum(){ //instance method 
        return studnum;
    }

    public int fetchschoolcode(){ //instance method
        return schoolcode;
    }
 
    public void changeschoolcode(int y){ //class method
        schoolcode = y;
    }
}
