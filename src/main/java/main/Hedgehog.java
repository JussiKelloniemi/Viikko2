package main;

public class Hedgehog {


    private String name;
    private int age;


    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(String input) {
        System.out.println(this.name + ": " + input);
    }
    public void speak2() {
        System.out.println("Olen " + this.name + " ja ikäni on " + this.age + " vuotta, mutta antaisitko silti syötteen?");
    }

    public void run(int rounds) {
        for (int i = 0; i < rounds; i++) {
            System.out.println(this.name + " juoksee kovaa vauhtia!");
        }
        
    }
}
