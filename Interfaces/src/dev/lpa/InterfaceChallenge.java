package dev.lpa;

import java.awt.*;

public class InterfaceChallenge {
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