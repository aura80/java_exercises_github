package java_exercises_github.abstractClasses;

import lombok.Data;

@Data
public abstract class ShopAbstractClass {
    String name;
    Boolean isOpen;

    public ShopAbstractClass(String name, Boolean isOpen) {
        this.name = name;
        this.isOpen = isOpen;
    }

    // for unimplemented methods the abstract keyword must be mentioned
    abstract String getInfoName();

    String getInfoOpen(Boolean isOpen) {
        return  "The shop is open: " + this.isOpen;
    }
}
