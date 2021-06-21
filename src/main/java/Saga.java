import java.util.ArrayList;
import java.util.List;

public class Saga {
    private String name;
    private String key;
    private String handler;
    private String rejectEvent;
    private List<Object> events = new ArrayList<>();
    private List<String> requireEvents = new ArrayList<>();
}
