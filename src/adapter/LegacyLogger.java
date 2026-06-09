package adapter;

public class LegacyLogger {
    void log(String level, String text) {
        System.out.println("[" + level + "] " + text);
    }
}
