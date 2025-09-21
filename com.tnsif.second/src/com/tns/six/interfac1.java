package com.tns.six;
public interface interfac1 {
    void eat();
    void sleep();

}
interface InterfacExt2 extends interfac1{
    void shout();

}
class Dog implements InterfacExt2{
    public void eat(){
            System.out.println("Dog is eating");
    }
    public void sleep(){
            System.out.println("Dog is sleeping");
    }
    public void shout(){
            System.out.println("Dog is barking");
    }
}

		


