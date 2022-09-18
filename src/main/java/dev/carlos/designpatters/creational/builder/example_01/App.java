package dev.carlos.designpatters.creational.builder.example_01;

public class App {
    public static void main(String[] args) {
        Person pessoa1 = new Person.PersonBuilder()
                .firstName("Carlos")
                .lastName("Alexandre")
                .username("carlosalexandredev")
                .email("carlosa@gmail.com")
                .build();

        System.out.println(pessoa1.toString());
    }
}
