package farm;

public class Sheep extends Horse{
    public Sheep(int weight, int age, String nicName) {
        super(weight, age, nicName);
    }

    @Override
    public String toString() {
        return "Sheep:" +
                "Weight:" + getWeight() + " " +
                "age:" + getAge() + " " +
                "nicName:" + getNicName()+"\n";
    }
}
