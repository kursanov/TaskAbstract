package farm;

public class Horse {
    private int Weight;
    private int age;
    private String nicName;

    public void san() {
    }

    public Horse(int weight, int age, String nicName) {
        Weight = weight;
        this.age = age;
        this.nicName = nicName;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    @Override
    public String toString() {
        {

        }
        return "Horse:" +
                "Weight:" + Weight + " " +
                "age:" + age + " " +
                "nicName:" + nicName +"\n";

    }
}
