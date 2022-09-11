package dev.carlos.designpatters.creational.abstract_method.exemplo_02.movel;

import dev.carlos.designpatters.creational.abstract_method.exemplo_02.cadeira.Cadeira;
import dev.carlos.designpatters.creational.abstract_method.exemplo_02.mesa.Mesa;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movel {
    private Mesa mesa;
    private Cadeira cadeira;
}
