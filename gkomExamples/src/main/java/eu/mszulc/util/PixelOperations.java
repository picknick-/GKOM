package eu.mszulc.util;

import eu.mszulc.datasources.Pixel;

public class PixelOperations
{
    public static Pixel add(Pixel a, Pixel b)
    {
        Pixel result = new Pixel(
                ColorOperations.add(a.getColor(), b.getColor()),
                PositionOperations.add(a.getPosition(), b.getPosition()));
        return result;
    }

    public static Pixel multiplyColor(float a, Pixel b)
    {
        Pixel result = new Pixel(
                ColorOperations.multiplyColor(a, b.getColor()), b.getPosition());
        return result;
    }
}
