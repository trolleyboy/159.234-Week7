package exercise7.task2;

public class ISO216Document {

    // attributes
    private int width;
    private int height;

    // constructors
    /**
     * @param width
     * @param height
     */
    public ISO216Document(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public ISO216Document(String size) {
        if (size.equals("A4")) {
            setWidth(210);
            setHeight(297);
        }
        if (size.equals("A3")) {
            setWidth(297);
            setHeight(420);
        } 
    }

    public ISO216Document() {
        this("A4");
    }

    // methods
    // getters/setters
    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }
    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }
    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
}
