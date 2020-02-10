package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("test2");
        Item item1 = new Item("test3");
        tracker.add(item1);
        tracker.add(item);
        Item[] res = tracker.findAll();
        Item[] exp = new Item[] {item1, item};
        assertThat(res, is(exp));
    }
    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test4");
        Item item1 = new Item("test4");
        tracker.add(item);
        tracker.add(item1);
        Item[] res = tracker.findByName("test4");
        Item[] exp = new Item[] {item, item1};
        assertThat(res, is(exp));

    }
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}