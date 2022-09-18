package dev.carlos.designpatters.creational.singleton.exemplo_03;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws NoSuchFieldException {
        InstitutoFederal IFG1 = InstitutoFederal.getInstace();
        IFG1.setQuantidadeDiscentes(500);
        IFG1.setQuantidadeDocentes(25);
        System.out.println(IFG1.toString());

        InstitutoFederal IFG2 = InstitutoFederal.getInstace();
        IFG2.setQuantidadeDiscentes(501);
        IFG2.setQuantidadeDocentes(26);
        System.out.println(IFG2.toString());

        InstitutoFederal IFG3 = InstitutoFederal.getInstace();
        IFG3.setQuantidadeDiscentes(360);
        IFG3.setQuantidadeDocentes(22);
        System.out.println(IFG3.toString());

        InstitutoFederal IFG4 = InstitutoFederal.getInstace();
        IFG4.setQuantidadeDiscentes(360);
        IFG4.setQuantidadeDocentes(22);
    }
}
