package q2;

public abstract class Shape {
    private String shapeName;
     
    public Shape(String n) {
        shapeName = n;
    }

    public abstract double area();

    public String toSrting() {
        return shapeName;
    }
}
