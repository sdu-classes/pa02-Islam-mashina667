public class Cat {

    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}