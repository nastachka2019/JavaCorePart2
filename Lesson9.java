public class Lesson9 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        ArrayList<String> animals = new ArrayList<>();
        zoo.add(new Bear("White Bear"));
        zoo.add(new Bear("Black Bear"));
        zoo.add(new Tiger("White Tiger"));
        zoo.add(new Tiger("Bengal Tiger"));
        zoo.add(new Crocodile("Alligator"));
        zoo.add(new Crocodile("Cayman"));
        System.out.println("In the Zoo are" + " " + zoo.getQuantityOfAllAnimals() + " " + "animals");
        Bear bear = new Bear();
        System.out.print("If we feed bears this food, " + " ");
        bear.food("meat");
        System.out.print("If bears sleep such time," + " ");
        bear.hoursOfSleeping(5);

        Tiger tiger = new Tiger();
        System.out.print("If we feed tigers this food," + " ");
        tiger.food("apple");
        System.out.print("If tigers sleep such time," + " ");
        tiger.hoursOfSleeping(9);

        Crocodile crocodile = new Crocodile();
        System.out.print("If we feed crocodiles this food," + " ");
        crocodile.food("meat");
        System.out.print("If crocodiles sleep such time," + " ");
        crocodile.hoursOfSleeping(5);


    }
}
public class Zoo {

    ArrayList<Animal> animals = new ArrayList<>();


    public void add(Bear bear) {
        animals.add(bear);
    }

    public void add(Tiger tiger) {
        animals.add(tiger);
    }

    public void add(Crocodile crocodile) {
        animals.add(crocodile);
    }

    public int getQuantityOfAllAnimals() {
        return animals.size();
    }


    public void add(String bear) {
    }
}
public abstract class Animal extends Zoo {
    String meat;

    int hoursOfSleeping;

    public void food(String food) {
        if (food == meat) {

            System.out.println("they say, that they are lucky");
        } else {
            System.out.println("they are in anger");
        }

    }

    public void hoursOfSleeping (int hoursOfSleeping){
        if(hoursOfSleeping > 7){
            System.out.println("animals are active");
        }else{
            System.out.println("animals are tired");
        }
    }

}

public class Bear extends Animal {
    String food;
    int hoursOfSleeping;

    public Bear(String bear) {
        super();
    }

    public Bear() {

    }

    @Override
    public void food(String food) {
        super.food(food);
    }

    @Override
    public void hoursOfSleeping(int hoursOfSleeping) {
        super.hoursOfSleeping(hoursOfSleeping);
    }
}

public class Crocodile extends Animal {
    String food;
    int hoursOfSleeping;

    public Crocodile(String crocodile) {
        super();
    }

    Crocodile() {

    }

    @Override
    public void food(String food) {
        super.food(food);
    }

    @Override
    public void hoursOfSleeping(int hoursOfSleeping) {
        super.hoursOfSleeping(hoursOfSleeping);
    }
}

public class Tiger extends Animal {
    String food;
    int hoursOfSleeping;
    public Tiger(String tiger) {
        super();
    }

    public Tiger() {

    }

    @Override
    public void food(String food) {
        super.food(food);
    }

    @Override
    public void hoursOfSleeping(int hoursOfSleeping) {
        super.hoursOfSleeping(hoursOfSleeping);
    }
}

