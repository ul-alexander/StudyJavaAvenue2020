package Lesson7.Praktika;

public class Tovar {

    private int article;
    private String name;
    private int fullPrice;
    private int discount;
    private Photo[] photos = new Photo[20];
    private Otzuv[] otzuvs = new Otzuv[2000];

    public Tovar() {
    }

    public Tovar(int article, String name, int fullPrice, int discount) {
        this.article = article;
        this.name = name;
        this.fullPrice = fullPrice;
        this.discount = discount;
    }

    public void addPhoto(Photo photo) {
        for (int i = 0; i < this.photos.length; i++) {

            if (this.photos[i] == null) {
                this.photos[i] = photo;
                break;
            }
        }
    }

    public void addOtzuv(Otzuv otzuv) {
        for (int i = 0; i < this.otzuvs.length; i++) {
            if (this.otzuvs[i] == null) {
                this.otzuvs[i] = otzuv;
                break;
            }
        }
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public Otzuv[] getOtzuvs() {
        return otzuvs;
    }

    public void setOtzuvs(Otzuv[] otzuvs) {
        this.otzuvs = otzuvs;
    }


    public void printTovar() {

        System.out.printf("Товар: %s , цена : %d , скидка : %d", this.name, this.fullPrice, this.discount);
        System.out.println();
        for (Photo val : this.photos) {
            if (val != null) {
                System.out.printf("foto1: %s, foto2: %s", val.getPathToSmallPhoto(), val.getPathToBigPhoto());
                System.out.println();
            }
        }
        for (Otzuv val : this.otzuvs) {
            if (val != null) {
                System.out.printf("Otzuv ID: %s, Otzuv Date: %s Otzuv comment: %s", val.getId(),val.getDatePublish(), val.getComment());
                System.out.println();
            }
        }
    }
}
