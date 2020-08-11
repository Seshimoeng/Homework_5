public class Dog  extends Animal{
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " barks");
    }

    public  void run(int dist) {
        if(dist>=500)
            System.out.println("Please, enter smaller number");
        else
            System.out.println("Dog named" + this.name + " runs"+dist+"m");
    }

    public  void swim(int dist) {
        if(dist>=10)
            System.out.println("Please, enter smaller number");
        else
            System.out.println("Dog named" +this.name + " swims"+dist+"m");
    }

    public  void jump(int dist) {
        if(dist>=0.5)
            System.out.println("Please, enter smaller number");
        else
            System.out.println("Dog named" +this.name + " jumps"+dist+"m");
    }


}
