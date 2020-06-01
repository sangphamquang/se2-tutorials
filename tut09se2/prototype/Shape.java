package tut09se2.prototype;

// Create the Shape abstract class implementing Cloneable interface.
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    // TO-DO: Declare void abstract method: draw()
    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    // TO-DO: Implement GETTERs & SETTERs methods for given attributes
    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
