public class Person {
    private int age;
    private String type;

    public Person(int age, String type) {
        this.age = age;
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public int account(Person person) {
        int cost = 0;
        if (person.age < 0)
            return -1;
        else {
            if (person.age <= 5) {
                if (person.type == "NORMAL")
                    cost = 100000;
                else
                    cost = 200000;
            } else {
                if (person.type == "VIP")
                    cost = 1000000;
                else
                    cost = 500000;
            }
        }
        return cost;
    }
}