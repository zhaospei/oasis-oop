import java.util.List;

public class ShapeUtil {
    /**
     * Comment.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String str = "Circle:\n";
        for (GeometricObject shape: shapes) {
            if (shape instanceof Circle) {
                str += shape.getInfo() + "\n";
            }
        }
        str += "Triangle:\n";
        for (GeometricObject shape: shapes) {
            if (shape instanceof Triangle) {
                str += shape.getInfo() + "\n";
            }
        }
        return str;
    }
}