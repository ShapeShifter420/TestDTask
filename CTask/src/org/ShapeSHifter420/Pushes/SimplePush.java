package org.ShapeSHifter420.Pushes;

public class SimplePush implements IPush{
    String Text;
    @Override
    public String getText() {
        return Text;
    }

    public SimplePush(String Text){
        this.Text = Text;
    }
}
