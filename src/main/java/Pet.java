public class Pet {
    // Instance variables: every Pet has a first name and last name
    private String name;
    private int age;

    // Constructor: creates a Pet with the given first name and last name
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default Constructor: creates a generic Pet
    public Pet() {
        this.name = "Max";
        this.age = 1;
    }

    // makeNoise(): an example of a non-static method for the Pet class.
    //              his method just prints out an animal noise
    public void makeNoise() {
        System.out.println("Growl!");
    }

    // toString(): retuns a String representation of a Pet (their name and age)
    public String toString() {
        String str = "Name: " + name + ", Age: " + age;
        return str;
    }

    // getters: return the values of the instance variables
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // setters: changes the value of the instance variables
    public void setName(String name) {
        // Don't allow blank names
        if (name.trim().length() != 0) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        // Don't allow negative ages
        if (age >= 0) {
            this.age = age;
        }
    }
}