package dev.carlos.designpatters.creational.builder.example_02;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Carro {
    private String modelo;
    private String cor;
    private String placa;
    private String ano;
}
