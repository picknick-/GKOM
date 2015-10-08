package eu.mszulc.datasources;

public class LinearInterpolationData
{
    private final float alfa, beta;
    private final Pixel a, b, c, d;

    public LinearInterpolationData(Pixel a, Pixel b, Pixel c, Pixel d,
            float alfa, float beta)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.alfa = alfa;
        this.beta = beta;
    }

    public float getAlfa()
    {
        return alfa;
    }

    public float getBeta()
    {
        return beta;
    }

    public Pixel getA()
    {
        return a;
    }

    public Pixel getB()
    {
        return b;
    }

    public Pixel getC()
    {
        return c;
    }

    public Pixel getD()
    {
        return d;
    }

}
