public class Dog extends Pet {
    // Instance variable(s)
    private String breed;
    private String name;
    private int age;

    // Constructors
    public Dog(){
        this.name = "mayrock";
        this.breed = "German Shepard";
        this.age = 8;
    }
    public Dog(String name, int age, String breed){
        this.name = name;
        this.breed = breed;
        this.age = age;

    }

    // makeNoise() method
    public void makeNoise(){
        System.out.println("beep beep");
    }

    // toString method
    public String toString(){
        return name + " " + age + " " + breed;
    }

    // Getter
    public String getName(){
        return this.name;
    }
    public String getBreed(){
        return this.breed;
    }
    public int getAge(){
        return this.age;
    }

    // Setter
    public void setName(String name) {
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
    public void setBreed(String breed){
        if(breed.trim().length() != 0){
            this.breed = breed;
        }
    }
}