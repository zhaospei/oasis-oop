import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Comment.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    /**
     * Comment.
     */
    public String getInfo() {
        String info = "Layer of crazy shapes:\n";
        for (int i = 0; i < shapes.size(); i++) {
            info += shapes.get(i).toString() + "\n";
        }
        return info;
    }

    /**
     * Comment.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            List<Integer> boxes = new ArrayList<Integer>();
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    boxes.add(j);
                }
            }

            for (int box : boxes) {
                shapes.remove(box);
            }
        }
    }

}
