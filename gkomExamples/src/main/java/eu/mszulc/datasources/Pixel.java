package eu.mszulc.datasources;

public class Pixel
{
    private final Color    color;
    private final Position position;

    public Pixel(Color color, Position position)
    {
        this.color = color;
        this.position = position;
    }
    public Color getColor()
    {
        return color;
    }
    public Position getPosition()
    {
        return position;
    }

}
