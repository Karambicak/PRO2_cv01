package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<Pizza> menuItems;
    private LocalDateTime lastupdate;

    public PizzaMenu() {
        menuItems = new ArrayList<>();
    }
    public void addItem(Pizza itemToAdd){
        menuItems.add(itemToAdd);
        lastupdate = LocalDateTime.now();
    }
    public void removeItem(Pizza itemToRemove){
        menuItems.remove(itemToRemove);
        lastupdate = LocalDateTime.now();
    }
    public void removeItem(String name){
        Pizza toDelete = null;
        for (Pizza item : menuItems) {
            if(item.getName().equals(name))
                toDelete = item;
            break;
        }

        if(toDelete!=null)
            menuItems.remove(toDelete);
            lastupdate = LocalDateTime.now();
    }
    public List<Pizza> getMenuItems() {
        return menuItems;
    }
    public int getMenuSize(){
        return menuItems.size();
    }
    public LocalDateTime getLastUpdate(){
        return lastupdate;
    }

    @Override
    public boolean equals(Object obj) {
        return ((PizzaMenu)obj).getMenuSize() == getMenuSize();
    }
}
