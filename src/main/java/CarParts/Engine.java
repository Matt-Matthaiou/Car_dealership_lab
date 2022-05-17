package CarParts;

public abstract class Engine {


    private int horsePower;

    public Engine( int horsePower) {
        this.horsePower = horsePower;
    }


    public int getHorsePower() {
        return horsePower;
    }
}
