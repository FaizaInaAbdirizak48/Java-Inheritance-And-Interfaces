package Inheri_Poly_EX;

// ========= Parent class ========
class Animal {
    String name;

    void eat(){
        System.out.println(name+" is eating");
    }
}


// ======= Child class ======
class Dog extends Animal{
    void bark(){
        System.out.println(name +" is barking");
    }
}