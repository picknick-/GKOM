package eu.mszulc.util;

import eu.mszulc.datasources.Color;
import eu.mszulc.datasources.LinearInterpolationData;
import eu.mszulc.datasources.Pixel;

public class LinearInterpolation
{

    public static Color calculatePixel(LinearInterpolationData ds)
    {
        Pixel a1 = PixelOperations.multiplyColor(ds.getAlfa(), ds.getA());
        Pixel b1 = PixelOperations.multiplyColor(1 - ds.getAlfa(), ds.getB());
        Pixel c1 = PixelOperations.multiplyColor(ds.getAlfa(), ds.getC());
        Pixel d1 = PixelOperations.multiplyColor(1 - ds.getAlfa(), ds.getD());
        
        Color help1 = ColorOperations.add(a1.getColor(), b1.getColor());
        Color help2 = ColorOperations.add(c1.getColor(), d1.getColor());
        
        Color p1 = ColorOperations.multiplyColor(ds.getBeta(),help1);
        Color p2 = ColorOperations.multiplyColor(1-ds.getBeta(),help2);
        
        Color result = ColorOperations.add(p1, p2);
        return result;
    }

}
