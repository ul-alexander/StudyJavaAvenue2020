package Lesson8;

public abstract class Animal {

    private int age;
    private int price;
    private String name;

    public Animal() {
    }

    public Animal(int age, int price, String name) {
        this.age = age;
        this.price = price;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        if (getAge() != animal.getAge()) return false;
        if (getPrice() != animal.getPrice()) return false;
        //Тернарный опратор
        //true / false? true:false;
        return getName() != null ? getName().equals(animal.getName()) : animal.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getAge();
        result = 31 * result + getPrice();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract void voice();
}
