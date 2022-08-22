package farm;

public class Cow extends Horse{

    public Cow(int weight, int age, String nicName) {
        super(weight, age, nicName);
    }
    @Override
    public String toString() {
        return "Cow:" +
                "Weight:" + getWeight() + " " +
                "age:" + getAge() + " " +
                "nicName:" + getNicName()+"\n";
    }
}
