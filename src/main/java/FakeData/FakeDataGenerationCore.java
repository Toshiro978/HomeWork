package FakeData;

import com.github.javafaker.Faker;

public class FakeDataGenerationCore {
    public static void main(String[] args) {

        Faker faker = new Faker();
        String animal = faker.animal().name();
        String food = faker.food().fruit();

        System.out.println(animal + " Likes "+ food);
    }
}