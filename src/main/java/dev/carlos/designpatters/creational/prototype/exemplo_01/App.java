package dev.carlos.designpatters.creational.prototype.exemplo_01;

public class App {
    public static void main(String[] args) {
        CarroPrototypeConcreto1 carro1 = new CarroPrototypeConcreto1();
        CarroPrototypeConcreto2 carro2 = new CarroPrototypeConcreto2();

        fazAlgo(carro1);
        fazAlgo(carro2);

    }

    private static void fazAlgo(VeiculoPrototype veiculo) {
        VeiculoPrototype veiculoPrototype = veiculo.clone();
        CarroPrototypeConcreto1 v1 = null;
        CarroPrototypeConcreto2 v2 = null;

        if(veiculoPrototype instanceof CarroPrototypeConcreto1){
            v1 = (CarroPrototypeConcreto1) veiculoPrototype;
        }else if(veiculoPrototype instanceof CarroPrototypeConcreto2) {
            v2 = (  CarroPrototypeConcreto2) veiculoPrototype;
        }
        //...
    }
}
