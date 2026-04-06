package Inheri_Poly_EX;


//===============Person and Student Inheritance=============
class Person {
     String name;

     void introduce(){
         System.out.println("Asc, My name is : "+ name);

     }
}

//========== Child class ===========

class Student extends Person{
    int grade;

    void showGrade(){
        System.out.println("My java grade is :"+ grade);
    }
}

