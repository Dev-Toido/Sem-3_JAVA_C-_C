public class Student {
    private int rollNo;
    private String name;
    private int age;
    private double marks;

    Student(int rollNo, String name, int age, double marks) {
        this.rollNo = rollNo;
        this.name=name;
        this.age=age;
        this.marks=marks;
    }

    void updateMarks(double marks){
        this.marks=marks;
    }

    void studentData(){


        
        System.out.println(this.rollNo+"\t"+this.name+"\t"+this.age+"\t"+this.marks);
    }

}
