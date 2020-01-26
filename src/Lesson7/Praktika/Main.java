package Lesson7.Praktika;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Photo photo1 = new Photo();
        photo1.setPathToSmallPhoto("https://avatars.mds.yandex.net/get-mpic/1865543/img_id7249788661464137528.jpeg/1hq");
        photo1.setPathToBigPhoto("https://avatars.mds.yandex.net/get-mpic/1865543/img_id7249788661464137528.jpeg/1hq2");

        Photo photo2 = new Photo();
        photo2.setPathToSmallPhoto("https://avatars.mds.yandex.net/get-mpic/1865543/img_id7249788661464137528.jpeg/1hq22");
        photo2.setPathToBigPhoto("https://avatars.mds.yandex.net/get-mpic/1865543/img_id7249788661464137528.jpeg/1hq233");


        Date date = new Date();

        Otzuv otzuv1 = new Otzuv();
        otzuv1.setId(1);
        otzuv1.setDatePublish(date);
        otzuv1.setComment("all good");

        Otzuv otzuv2 = new Otzuv();
        otzuv2.setId(2);
        otzuv2.setDatePublish(date);
        otzuv2.setComment("all good");

        Otzuv otzuv3 = new Otzuv();
        otzuv3.setId(3);
        otzuv3.setDatePublish(date);
        otzuv3.setComment("all good");

        Tovar tablet = new Tovar();
        tablet.setFullPrice(8990);
        tablet.setDiscount(22);
        tablet.setName("planshet abc");
        tablet.addPhoto(photo1);
        tablet.addPhoto(photo2);
        tablet.addOtzuv(otzuv1);
        tablet.addOtzuv(otzuv2);
        tablet.addOtzuv(otzuv3);

        tablet.printTovar();
    }
}
