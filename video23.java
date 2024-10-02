package Chapterall;

public class video23 {
    public static void main(String[] args) {
        System.out.println("runmain");
        Student st1 = new Student();
        st1.age =20;
        st1.name = "eric";
        System.out.println("student with name = "+st1.name +" and age = "+st1.age);
        Student st2 = new Student("hung",19);
        System.out.println("student with name = "+st2.name +" and age = "+st2.age);


    }
    
}
