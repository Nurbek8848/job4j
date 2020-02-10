package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }
    public Item[] findAll() {
        Item[] all = new Item[this.items.length];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            Item item = this.items[i];
            if (item != null) {
                all[size] = item;
                size++;
            }
        }
         all = Arrays.copyOf(all, size);
        return all;
    }
    public Item[] findByName(String key) {
        Item[] byName = new Item[this.items.length];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            Item item = this.items[i];
            if (key.equals(item.getName())) {
                byName[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(byName, size);
    }
    public Item findById(String id) {
        Item findId = new Item();
        for (int i = 0; i < this.items.length; i++) {
            Item item = this.items[i];
            if (id.equals(item.getId())) {
                findId = item;
            } else {
                findId = null;
            }
        }
        return findId;
    }
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
    public Item replace(String id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        items[index] = item;
        return items[index];
    }
}