public class Cat extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }


    public  void voice() {
        System.out.println(this.name + " meows");
    }

    public  void run(int dist) {
        if(dist>=200)
            System.out.println("Please, enter smaller number");
        else
            System.out.println("Cat named" + this.name + " runs"+dist+"m");

    }


    public  void swim(int dist) { System.out.println("Cat cannot swim"); }

    public  void jump(int dist) {
        if(dist>=2)
            System.out.println("Please, enter smaller number");
        else
            System.out.println("Cat named" +this.name + " jumps"+dist+"m");
    }
}
