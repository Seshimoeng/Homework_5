public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("Boris", "Brown", 2);
        Dog d1 = new Dog("Ella", "White", 9);


        Animal[] zoo = {c1, d1};
        for (int i = 0; i < zoo.length; i++) {

            zoo[i].voice();

            System.out.println("Please enter distance for running");
            Scanner sc = new Scanner(System.in); // создание объекта класса Scanner
            int dist1 = sc.nextInt();
            zoo[i].run(dist1);

            System.out.println("Please enter distance for jumpinging");
            int dist2 = sc.nextInt();
            zoo[i].jump(dist2);

            System.out.println("Please enter distance for swimminging");
            int dist3 = sc.nextInt();
            zoo[i].swim(dist3);
        }
    }
}
