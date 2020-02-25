package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
            } else if (select == 1) {
                System.out.println("=== List of Items ===");
                Item[] item = tracker.findAll();
                for (int i = 0; i < item.length; i++) {
                    Item names = item[i];
                    System.out.println(names);
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ===");
                String name = input.askStr("Enter old name: ");
                String newName = input.askStr("Enter new name: ");
                Item item = new Item(name);
                Item item1 = new Item(newName);
                tracker.replace(item.getId(), item1);
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.delete(item.getId());
            } else if (select == 4) {
                System.out.println("=== Find by id ===");
                String id = input.askStr("Enter id: ");
                Item name = tracker.findById(id);
                System.out.println(name);
            } else if (select == 5) {
                System.out.println("=== Find by name ===");
                String name = input.askStr("Enter name: ");
                Item[] name1 = tracker.findByName(name);
                for (int i = 0; i < name1.length; i++) {
                    System.out.println(name1[i]);
                }
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
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
