package Module3.Task3_1;

public class Main {
    public static void main(String[] args) {
        String song1 = "I am walking";
        String song2 = "I am flying";
        String song3 = "I am singing";
        String song4 = "I am Bird";

        Bird bird = new Bird("Parrot", 1);
        bird.sing(song1);
        bird.sing(song2);
        bird.sing(song3);
        bird.sing(song4);
    }
}
