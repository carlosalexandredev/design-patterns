package dev.carlos.designpatters.creational.factory_method.exemplo_01.factory;

import dev.carlos.designpatters.creational.factory_method.exemplo_01.buttons.Button;
import dev.carlos.designpatters.creational.factory_method.exemplo_01.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
