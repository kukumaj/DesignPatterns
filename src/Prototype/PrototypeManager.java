package Prototype;

import java.util.HashMap;
import java.util.Map;

// PrototypeManager class
public class PrototypeManager {
    private Map<String, Shape> shapeMap = new HashMap<>();

    public void registerShape(String shapeName, Shape shape) {
        shapeMap.put(shapeName, shape);
    }

    public Shape getShape(String shapeName) {
        return shapeMap.get(shapeName).clone();
    }
}