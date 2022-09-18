package dev.carlos.designpatters.creational.builder.example_02;
public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro.CarroBuilder()
                .modelo("Equinox")
                .cor("CINZA DRAKE")
                .ano("2022")
                .placa("BRA2E19")
                .build();

        System.out.println(carro1.toString());
    }
}
