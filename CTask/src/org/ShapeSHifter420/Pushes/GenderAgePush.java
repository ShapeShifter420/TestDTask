package org.ShapeSHifter420.Pushes;

public class GenderAgePush extends SimplePush implements IGenderPush,IAgePush{
    String Gender;
    int Age;

    public GenderAgePush(String text,int age,String gender){
        super(text);
        this.Age = age;
        this.Gender = gender;
    }

    @Override
    public int GetAge() {
        return Age;
    }

    @Override
    public String GetGender() {
        return Gender;
    }
}
