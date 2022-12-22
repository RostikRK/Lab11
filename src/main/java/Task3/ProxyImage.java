package Task3;

public class ProxyImage implements MyImage{
    private String path;
    private RealImage realImage;

    public ProxyImage(String path){
        this.path = path;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(this.path);
        }
        realImage.display();
    }
}