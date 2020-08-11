public abstract class Animal {

        protected String name;
        protected int age;
        protected String color;

        protected Animal(String name, String color, int age) {
            this.color = color;
            this.age = age;
            this.name = name;
        }


    public void move() {
        System.out.println(this.name + " walks on paws");
    }

    protected abstract void voice();

    protected abstract void  run(int dist);

    protected abstract void swim(int dist);

    protected abstract void jump(int dist);





}
