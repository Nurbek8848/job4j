package ru.job4j.inheritance;

public class HTMLReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" + '\n' + "<br/>" + '\n' + "<span>" + body + "</span>";
    }
    public static void main(String[] args) {
        HTMLReport report = new HTMLReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
