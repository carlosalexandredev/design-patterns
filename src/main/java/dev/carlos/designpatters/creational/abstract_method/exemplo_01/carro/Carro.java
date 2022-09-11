package dev.carlos.designpatters.creational.abstract_method.exemplo_01.carro;

import dev.carlos.designpatters.creational.abstract_method.exemplo_01.roda.Roda;
import dev.carlos.designpatters.creational.abstract_method.exemplo_01.som.Som;
import lombok.Data;

@Data
public class Carro {
    Roda roda;
    Som som;
}
