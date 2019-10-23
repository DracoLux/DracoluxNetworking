package network.common;

import java.awt.*;

public class LightChange implements Command {
    public Color color;
    public LightPattern lightPattern;

    public LightChange(Color color, LightPattern lightPattern) {
        this.color = color;
        this.lightPattern = lightPattern;
    }

    @Override
    public String toString(){
        return color + " " + lightPattern;
    }
}
