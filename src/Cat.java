public class Cat extends Animal {

    private String name;


    public String getName(){
        return name;

    }

    public void setName(String value){
        name = value;
    }
//Unique method for Cat object
    public String scratch(){
        return "Likes to srcatch";
    }

    //Will override method from Animal class
    @Override
    public String getSpeaks(){
        return "This animal likes to Purr";
    }

}
