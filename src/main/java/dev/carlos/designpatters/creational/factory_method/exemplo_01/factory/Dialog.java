package dev.carlos.designpatters.creational.factory_method.exemplo_01.factory;


import dev.carlos.designpatters.creational.factory_method.exemplo_01.buttons.Button;

/**
 * Classe de fábrica básica. Observe que "factory" é apenas uma função para a classe. Isto
 * deve ter alguma lógica de negócios principal que precisa de produtos diferentes para serem
 * criada.
 */

public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}