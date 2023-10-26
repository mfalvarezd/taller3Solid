public class CloudServicePlatform {
    private int cloudServicePlatform;
    Platform[] plataformas = { new Aws(),new MicrosoftAzure(),new GoogleCloud()};
    public void hostingTo (AppWeb app) {
        System.out.println("Connect to" + plataformas[cloudServicePlatform-1].nombre());
    }

    // More Methods
}
abstract class Platform{
    abstract String nombre();

}
class Aws extends Platform{


    @Override
    String nombre() {
        return "AWS";
    }
}
class MicrosoftAzure extends Platform{

    @Override
    String nombre() {
        return "Microsoft Azure";
    }
}
class GoogleCloud extends Platform{

    @Override
    String nombre() {
        return "Google Cloud";
    }
}
