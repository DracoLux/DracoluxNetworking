package network.common;

public class Coordinate implements Command {
    public float x;
    public float y;
    public float z;

    public Coordinate(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float calculateDistanceTo(Coordinate other){
        return (float) Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2) + Math.pow((other.y - this.y), 2));
    }

    @Override
    public String toString(){
        return "(" + x + ";" + y + ";" + z + ")";
    }
}
