package eu.mszulc.util;

import eu.mszulc.datasources.Color;

public class ColorOperations
{

    public static Color add(Color color, Color color2)
    {
        float r = color.getR() + color2.getR();
        float g = color.getG() + color2.getG();
        float b = color.getB() + color2.getB();
        Color color3 = new Color(r, g, b);
        return color3;
    }

    public static Color multiplyColor(float a, Color color)
    {
        float r = color.getR() * a;
        float g = color.getG() * a;
        float b = color.getB() * a;
        Color color3 = new Color(r, g, b);
        return color3;
    }

}
