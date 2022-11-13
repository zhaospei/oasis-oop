public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    Person() {

    }

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public int compareTo(Person that) {
        if (!this.name.equals(that.name)) {
            return this.name.compareTo(that.name);
        } else {
            Integer a = Integer.valueOf(this.age);
            Integer b = Integer.valueOf(that.age);
            return a.compareTo(b);
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
