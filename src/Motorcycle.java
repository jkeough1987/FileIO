/**
 * Created by joshuakeough on 9/10/16.
 */
public class Motorcycle {
    private String make;
    private String model;
    private int horsePower;
    private String syle;
    private boolean isReasonablyPriced;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getSyle() {
        return syle;
    }

    public void setSyle(String syle) {
        this.syle = syle;
    }

    public boolean isReasonablyPriced() {
        return isReasonablyPriced;
    }

    public void setReasonablyPriced(boolean reasonablyPriced) {
        isReasonablyPriced = reasonablyPriced;
    }
}
