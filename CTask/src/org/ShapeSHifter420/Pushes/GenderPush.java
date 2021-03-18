package org.ShapeSHifter420.Pushes;

public class GenderPush extends SimplePush implements IGenderPush {
    String Gender;

    public GenderPush(String text,String gender){
        super(text);
        this.Text = text;
        this.Gender = gender;
    }

    @Override
    public String GetGender() {
        return Gender;
    }
}
