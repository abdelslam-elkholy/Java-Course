public class RunTimeTest {
    public static void main(String[] args) {
        Object unkownType = Movie.getMovie("c" , "Star wars");
        if(unkownType.getClass().getSimpleName() == "Adventure")
        {
            Adventure a = (Adventure) unkownType;
                    a.watchAdventure();
        } else if (unkownType instanceof Comedy) {
            ((Comedy) unkownType).watchComedy();
        } else if (unkownType instanceof ScienceFiction scy) {
            scy.watchScienceFiction();
        }
    }
}
