package eu.mszulc.util;

import eu.mszulc.datasources.Position;

public class PositionOperations
{

    public static Position add(Position position, Position position2)
    {
        float x = position.getX() + position2.getX();
        float y = position.getY() + position2.getY();
        Position position3 = new Position(x, y);
        return position3;
    }

}
