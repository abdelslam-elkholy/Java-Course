package dev.lpa;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class InterfaceChallenge {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall" , UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Oper House" , UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia" , UsageType.SPORTS));

        for (var m : mappables)
        {
            Mappable.mapIt(m);
        }

    }
}

enum Geometry {LINE , POINT , POLYGON}
enum PointMarker {CIRCLE , PUSH_PIN , STAR , SQUARE ,TRIANGLE}
enum LineMarker {DASHED , DOTTED ,SOLID}

interface Mappable
{
    String JSON_PROPERTY = """
            "properties": {%s}
            """;

    String getLabel();
    Geometry getShape();
    String getMarker();

    default  String toJSON()
    {
        return """
                "type": "%s" , "label": "%s" , "marker": "%s"
                """.formatted(getShape() , getLabel() , getMarker());
    }

    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}

enum UsageType{ENTERTAINMENT , GOVERNMENT , RESIDENTIAL , SPORTS}
class Building implements Mappable{
    private  String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON()+ """
                 , "name": "%s" , "usage": "%s"
                """.formatted(name , usage);
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> Color.BLACK + " " +PointMarker.CIRCLE;
        };
    }
}