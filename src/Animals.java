public class Animals {

    public static void main (String[] args){

//Creating new Cat object
        Cat c = new Cat();
        c.setName("Fred the cat");
        c.setSpeaks("This animal likes to Purr");
        System.out.println( c.getName()+c.getSpeaks());
        System.out.println(c.getName()+c.scratch());

         Animal u = new Animal();//Making Unicorn Animal
         u.setName("Unicorn");
        System.out.println(u.getName()+u.getSpeaks());

    }


}
