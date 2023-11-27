package dev.lpa;

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
    GeoMetry getShape();
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
