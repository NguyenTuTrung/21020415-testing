public class Person {
    private int age;
    private String pos;

    public Person(int age, String pos) {
        this.age = age;
        this.pos = pos;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.pos = pos;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return pos;
    }

    public String decide(Person person) {
        if (person.pos.equals("Junior")) {
            if (person.age < 1)
                return "Dau vao khong hop le";
            else if (person.age <= 18)
                return "Khong thue";
            else if (person.age <= 22)
                return "Thue ban thoi gian";
            else if (person.age <= 50)
                return "Thue toan thoi gian";
            else
                return "Khong thue";
        }
        else if (person.pos.equals("Senior")) {
            if (person.age < 1)
                return "Dau vao khong hop le";
            else if (person.age <= 18)
                return "Khong thue";
            else if (person.age <= 22)
                return "Thue toan thoi gian";
            else if (person.age <= 50)
                return "Thue toan thoi gian";
            else
                return "Khong thue";
        }
        return "Dau vao khong hop le";
    }
}
