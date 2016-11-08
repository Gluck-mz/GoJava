package Module3.Task3_1;

public class Bird {

    private String breed;
    private int age;

    public Bird(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public void sing(String song) {
        System.out.println(song);
    }
}
