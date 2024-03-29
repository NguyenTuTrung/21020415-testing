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

    public String isRent(Person person) {
        if (person.type.equals("Junior")) {
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
        else if (person.type.equals("Senior")) {
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
