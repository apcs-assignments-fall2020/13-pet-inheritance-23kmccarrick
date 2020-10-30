# Dog Class

In this assignment, you'll be practicing inheritance and implementing a Dog class to represent dogs.

You should first out the [Pet.java](src/main/java/Pet.java) file. This class will be the superclass (parent class) of your Dog class. 

The Pet Class has the following components:
* Private instance variables for name and age
* Two constructors to create a Pet (one default and one with two parameters)
* makeNoise(): a non-static method that just prints out an animal noise
* toString() method to print out the Pet's name and age
* Getters and setters for all two variables

Now, check add code to [Dog.java](src/main/java/Dog.java). This class will inherit the instance variables and methods from the Pet class. Your Dog class should have the following components (note that it will inherit many of these components):
* Private instance variables for name, age, and **breed**
* Two constructors to create a Dog (one default and one with three parameters)
* makeNoise(): a non-static method that just prints out **an appropriate animal noise for a Dog**
* toString() method to print out the Dog's name, age, and **breed**
* Getters and setters for all **three** variables

You should code to [Dog.java](src/main/java/Dog.java) to define the class, and then add code to [DogClient.java](src/main/java/DogClient.java) to test your code

## Run your client code with:
```shell script
make run
```