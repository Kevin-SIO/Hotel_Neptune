package Hotel_neptune.Hotel_neptune;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(Modele.connexionBDD("hotel_neptune"));
        System.out.println(Modele.connexionAdmin("test", "testtest"));
        System.out.println(Modele.connexionClient("kevincarbeti@gmail.com", "testtest"));
        System.out.println(Modele.getChambres().get(0).getDescription());
        Test.main(args);
    }
}
