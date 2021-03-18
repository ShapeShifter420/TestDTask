package org.ShapeSHifter420.Pushes;

import java.util.ArrayList;
import java.util.List;

public class LocationAgePush extends SimplePush implements ILocationPush,IAgePush{
    float XCoord;
    float YCoord;
    float Radius;
    int Age;


    public LocationAgePush(String text,int age,float xcoord,float ycoord,float radius){
        super(text);
        this.Age = age;
        this.XCoord = xcoord;
        this.YCoord = ycoord;
        this.Radius = radius;
    }

    @Override
    public int GetAge() {
        return Age;
    }

    @Override
    public float getXCoord() {
        return XCoord;
    }

    @Override
    public float getYCoord() {
        return YCoord;
    }

    @Override
    public float getRadius() {
        return Radius;
    }
}
