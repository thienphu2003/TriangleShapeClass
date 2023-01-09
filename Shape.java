public abstract class Shape {
    private String name;
    public Shape()
    {
        this.name="Unknown Shape";
    }
    public Shape(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public abstract void draw();

    public abstract double getArea();

    public abstract double getPerimeter();
    public abstract String toString();

}
