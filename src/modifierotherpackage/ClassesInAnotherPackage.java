package modifierotherpackage;

import modifierdemo.ModifierDemo;

public class ClassesInAnotherPackage {
    //just an empty class
}

class MyClassC extends ModifierDemo {
    public void printMessages() {
        //this is ok
        System.out.println(publicNum);

        //this is ok
        System.out.println(protectedNum);

        //this is not ok
    }
}
