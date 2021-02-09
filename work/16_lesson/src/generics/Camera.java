package generics;

public class Camera extends Product {

    private Integer pixel;

    public Integer getPixel() {
        return pixel;
    }

    public void setPixel(Integer pixel) {
        this.pixel = pixel;
    }

    @Override
    public boolean compare(Product product) {
        if (product instanceof Camera) {
            Camera camera = (Camera) product;
            return super.compare(camera)
                    && pixel.equals(camera.getPixel());
        }
        return false;
    }
}
