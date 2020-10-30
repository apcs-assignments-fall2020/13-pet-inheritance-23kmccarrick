public class PetClient {
    public static void main(String[] args) {
        Pet p1 = new Pet("Luna", 3);
        System.out.println(p1.getName()); // Luna
        System.out.println(p1.getAge()); // 3
        System.out.println(p1); // Name: Luna, Age: 3
        p1.makeNoise(); // Growl!
    }
}
