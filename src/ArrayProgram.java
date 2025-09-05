class Student{
    String Student_name;
    String Student_roll;

    Student(String Student_name,String Student_roll ){
        this.Student_name=Student_name;
        this.Student_roll=Student_roll;
    }
}

public class ArrayProgram {
    public static void main(String[] args) {
        Student[]arr;
        arr=new Student[1];

        arr[0]=new Student("S","1");

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(" "+i+" "+arr[i].Student_roll+" "+arr[i].Student_name);

        }

    }

}
