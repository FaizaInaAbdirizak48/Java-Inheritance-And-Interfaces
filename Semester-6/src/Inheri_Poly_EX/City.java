package Inheri_Poly_EX;
// ========== Parent class========
class City {
    String name;
    int population;

    void showInfo(){
        System.out.println("City : "+name+ " Population : "+population);
    }
}

// ========== Child class========
class CapitalCity extends City{
    String country;

    void showCapitalCity(){
        System.out.println(name+" is the capital City of " + country);
    }
}
