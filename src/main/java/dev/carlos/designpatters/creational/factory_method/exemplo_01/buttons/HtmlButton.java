package dev.carlos.designpatters.creational.factory_method.exemplo_01.buttons;

public class HtmlButton implements Button{
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
