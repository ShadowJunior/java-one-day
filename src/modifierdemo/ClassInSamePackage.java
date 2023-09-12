package modifierdemo;

public class ClassInSamePackage {
    //just an empty class
}

class ClassA extends ModifierDemo {
    public void printMessages() {
        //this is ok
        System.out.println(publicNum);

        //this is ok
        System.out.println(protectedNum);

        //this is ok
        System.out.println(packagePrivateNum);

        //this is not ok
//        System.out.println(privateNum);
    }
}

class ClassB {
    public void printMessages() {
        ModifierDemo p = new ModifierDemo();

        //this is ok
        System.out.println(p.publicNum);

        //this is ok
        System.out.println(p.protectedNum);

        //this is ok
        System.out.println(p.packagePrivateNum);

        //this is not ok
//        System.out.println(p.privateNum);
    }
}
