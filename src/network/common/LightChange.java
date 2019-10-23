package network.common;

import java.awt.*;

public class LightChange implements Command {
    public Color lightColor;
    public int lightVolume;

    public LightChange(Color color, int lightVolume) {
        this.lightColor = color;
        this.lightVolume = lightVolume;
    }

    @Override
    public String toString(){
        return lightVolume + "% " + lightColor;
    }
}
