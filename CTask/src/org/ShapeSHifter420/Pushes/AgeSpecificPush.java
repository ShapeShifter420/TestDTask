package org.ShapeSHifter420.Pushes;


public class AgeSpecificPush extends SimplePush implements IAgePush,IExpitity{
    int Age;
    long Expirity;


    public AgeSpecificPush(String text,int age,long exp){
        super(text);
        this.Age = age;
        this.Expirity = exp;
    }

    @Override
    public int GetAge() {
        return Age;
    }

    @Override
    public long GetExpirity() {
        return Expirity;
    }
}
