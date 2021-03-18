package org.ShapeSHifter420.Pushes;

import java.util.ArrayList;
import java.util.List;

public class SystemData implements ISystem {
    float OSVersion;
    float XCoord;
    float YCoord;
    long Time;
    int Age;
    String Gender;
    public SystemData(int age,long time,String gender,float xcoord,float ycoord,float OSVersion){
        this.Age = age;
        this.Time = time;
        this.Gender = gender;
        this.XCoord = xcoord;
        this.YCoord = ycoord;
        this.OSVersion = OSVersion;
    }

    @Override
    public int GetAge() {
        return Age;
    }

    @Override
    public long GetTime() {
        return Time;
    }

    @Override
    public String GetGender() {
        return Gender;
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
    public float GetOSVersion() {
        return OSVersion;
    }
}
