public class Camera extends Product {

    private Integer pixel;

    public Integer getPixel() {
        return pixel;
    }

    public void setPixel(Integer pixel) {
        this.pixel = pixel;
    }

    public boolean compare(Camera camera) {
        return super.compare(camera)
                && pixel.equals(camera.getPixel());
    }
}
