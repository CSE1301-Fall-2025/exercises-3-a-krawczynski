package module07._5this;

public class Cat { // (nouns)
    // has a:
    // tail
    // color
    // breed
    // personality
    // name
    // age
    // voice
    // gender
    // mother

    private String name;
    private String voice;
    private int age;
    
    // methods (verbs/actions/behaviors):
    // meowing
    // running
    // eating
    // sleeping
    // playing
    // die
    // shed
    
    public Cat (String name, String voice) {
        this.name = name;
        this.voice = voice;
        age = 0;
    }

    public static void main(String[] args) {
        Cat mau = new Cat("Mau", "mrow");
        System.out.println(mau);
    } 

}
