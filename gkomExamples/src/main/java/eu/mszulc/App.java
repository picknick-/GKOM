package eu.mszulc;

import java.util.UUID;

public class App
{

    public static void main(String[] args)
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }

    public String generateUniqueKey()
    {
    
        String id = UUID.randomUUID().toString();
        return id;
    
    }
}
