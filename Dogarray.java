class Dogarray {
    String name;
    
    public static void main(String args[]) {
        //Make a new dog ojbect and access it
        Dogarray dog1 = new Dogarray();
        dog1.bark();
        dog1.name = "Bart";

        //now make a dog array
        Dogarray[] myDogs = new Dogarray[3];
        myDogs[0] = new Dogarray();
        myDogs[1] = new Dogarray();
        myDogs[2] = dog1;

        //now access the Dogs using the array
        //references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //Hmmm. wha is myDogs[2] name ?
        System.out.println("last dogs' name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x=x+1;
        }
    }

    public void bark() {
        System.out.println(name + " says Ruff!");
    }

    public void eat() {

    }

    public void chaseCat() {

    }
}