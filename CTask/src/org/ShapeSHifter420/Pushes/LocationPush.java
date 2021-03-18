package org.ShapeSHifter420.Pushes;

public class LocationPush extends SimplePush implements ILocationPush,IExpitity{
    float XCoord;
    float YCoord;
    float Radius;
    long Expirity;

    public LocationPush(String text,long exp,float xcoord,float ycoord,float radius){
        super(text);
        this.Expirity= exp;
        this.XCoord = xcoord;
        this.YCoord = ycoord;
        this.Radius = radius;
    }

    @Override
    public long GetExpirity() {
        return Expirity;
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
