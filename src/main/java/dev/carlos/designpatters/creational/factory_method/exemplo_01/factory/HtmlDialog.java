package dev.carlos.designpatters.creational.factory_method.exemplo_01.factory;

import dev.carlos.designpatters.creational.factory_method.exemplo_01.buttons.Button;
import dev.carlos.designpatters.creational.factory_method.exemplo_01.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
