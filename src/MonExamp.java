class Monkey{
    void jump(){
        System.out.println("Jump Jump..");
    }
    void bite(){
        System.out.println("Bite Bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends  Monkey implements BasicAnimal{
  void speak(){
      System.out.println("Hello sir....");
  }
  public void eat(){
      System.out.println("Eating...");
  }
  public void sleep(){
      System.out.println("Sleeping...");
  }
}

public class MonExamp {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.speak();
        h.bite();
        h.jump();
    }
}
