package network.common;

import java.awt.*;

public class LightChange implements Command {
    public Color color;
    public int volume;

    public LightChange(Color color, int volumePercentage) {
        this.color = color;
        this.volume = volumePercentage;
    }

    @Override
    public String toString(){
        return volume + "% " + color;
    }
}
