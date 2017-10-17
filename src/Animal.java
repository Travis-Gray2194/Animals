public class Animal {

    private String name;
    private String speaks;

    public Animal(){
        System.out.println("An animal has been created the animal is.... ");
    }

    public String getName(){
        return name;

    }

    public void setName(String value){
        name = value;
    }


    public void setSpeaks(String value){
        speaks=value;
    }
//speak method for Unicorn animal
    public String getSpeaks(){
        return " this animal loves to.....use magic";
    }



    }


