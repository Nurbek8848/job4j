package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItems(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findNameItem(input, tracker);
            } else if (select == 6) {
                System.out.println("Good bye");
                run = false;
            } else {
                System.out.println("There is no such item in the menu.");
            }
        }
    }
    private void showMenu() {
        System.out.println("Menu:\n"
                + "0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program");
    }
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String oldName = input.askStr("Enter old name: ");
        String newName = input.askStr("Enter new name: ");
        Item item = new Item(oldName);
        Item item1 = new Item(newName);
        tracker.replace(item.getId(), item1);
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.delete(item.getId());
    }
    public static void findIdItem(Input input, Tracker tracker) {
        System.out.println("=== Find by id ===");
        String id = input.askStr("Enter id: ");
        Item name = tracker.findById(id);
        System.out.println(name);
    }
    public static void findNameItem(Input input, Tracker tracker) {
        System.out.println("=== Find by name ===");
        String key = input.askStr("Enter name: ");
        Item[] name = tracker.findByName(key);
        for (int i = 0; i < name.length; i++) {
            Item item = name[i];
            System.out.println(item);
        }
    }
    public static void findAllItems(Tracker tracker) {
        System.out.println("=== List of items ===");
        Item[] allItems = tracker.findAll();
        for (int i = 0; i < allItems.length; i++) {
            Item items = allItems[i];
            System.out.println(items);
        }
    }
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
