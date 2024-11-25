public class Animal{

String name;
int age;
static int year;  // static because accessed by static class
//static means that the method belongs to the Main class and not an object of the Main class.
// static method can be called without creating any object!
//void means no value to return
       static void welcome() {    
              System.out.println("Jungle Mungle!");
            }
//non static or public method can only be called if there is object in main method
       static int setyear(int Year){
       year = Year;
       return year;
       }

       public void animalSound() {
              System.out.println("The animal makes a sound");
            }

       public void Introduce() {
              System.out.println("My name is " + this.name);
       }
       public void PublicInvite() {
              System.out.println(this.name + ": You are welcome to the zoo, public!");
            }
       
       public Animal (String Name){
              this.name = Name;
       }

       }
       public static void main (String[] args){
              welcome();
              System.out.println(setyear(2024));


              Animal monkey = new Animal("Clever Monkey");
             // monkey.name = "Clever Monkey";
              monkey.Introduce();
              monkey.PublicInvite();

              Animal mydog = new Dog();
              mydog.animalSound();


       }
}
class Dog extends Animal {
       public void animalSound(){
       System.out.println("bow bow!");    
       }