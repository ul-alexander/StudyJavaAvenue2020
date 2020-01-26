package Lesson7.Praktika;

public class Photo {

    private String pathToSmallPhoto;
    private String pathToBigPhoto;

    public Photo() {

    }

    public Photo(String pathToSmallPhoto, String pathToBigPhoto) {
        this.pathToSmallPhoto = pathToSmallPhoto;
        this.pathToBigPhoto = pathToBigPhoto;
    }

    public String getPathToSmallPhoto() {
        return pathToSmallPhoto;
    }

    public void setPathToSmallPhoto(String pathToSmallPhoto) {
        this.pathToSmallPhoto = pathToSmallPhoto;
    }

    public String getPathToBigPhoto() {
        return pathToBigPhoto;
    }

    public void setPathToBigPhoto(String pathToBigPhoto) {
        this.pathToBigPhoto = pathToBigPhoto;
    }
}
