package ZPO.lab08.zadanie6;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IToolbar {
    private String name;
    private List<IToolbar> submenu;

    public Menu(String name) {
        this.name = name;
        this.submenu = new ArrayList<>();
    }

    public void printSubmenusAndTools() {
        submenu.forEach(IToolbar::printSubmenusAndTools);
    }

    public void addSubmenusAndTools(IToolbar composite_element) {
        submenu.add(composite_element);
    }

}