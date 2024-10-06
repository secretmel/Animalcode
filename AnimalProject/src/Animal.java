public class Animal {
    public int age;
    public String gender;

    public void isMammal() {
        System.out.println("This is a public method isMammal() from class Animal");
    }

    public void mate() {
        System.out.println("This is a public method mate() from class Animal");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.isMammal();
        myAnimal.mate();

        Fish myFish = new Fish();
        myFish.isMammal(); 
        myFish.mate();    

        Zebra myZebra = new Zebra();
        myZebra.isMammal(); 
        myZebra.mate();     
        myZebra.run();
    }
}
