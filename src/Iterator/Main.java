package Iterator;

import Iterator.model.Catalog;
import Iterator.model.Seller;

public class Main {

    public static void main(String[] args) {
        Catalog geekyStoreCatalog = new GeekyStoreCatalog();
        Catalog devStoreCatalog = new DevStoreCatalog();
        Seller seller = new Seller(devStoreCatalog, geekyStoreCatalog);
        seller.printCatalog();

//        //loop through dev Catalog - Array
//        for (int i = 0; i < devCatalog.length; i++) {
//            Product product = devCatalog[i];
//            System.out.print(product.getName() + " ");
//            System.out.print(product.getDescription() + " ");
//            System.out.println(product.getPrice());
//        }
//
//        System.out.println("---------");
//        //loop through geeky catalog - ArrayList
//        for (int i = 0; i < geekyCatalog.size(); i++) {
//            Product product = (Product)geekyCatalog.get(i);
//            System.out.print(product.getName() + " ");
//            System.out.print(product.getDescription() + " ");
//            System.out.println(product.getPrice());
//
//        }
    }
}
//Printing Dev Catalog:
//Superman Comic, The best in town 12.99
//Batman Comic, Okay, but still good 11.99
//Star Wars, Can't live without it 39.99
//Jedi T-Shirt, Gotta Have it 29.99
//Printing Geeky Catalog:
//C++ is NOT dead. Yet!, T-Shirt 39.99
//Java Rocks. Yes, Silky mouse-pad 19.99
//Java Design Patterns, Book - A must! 139.99
//Web Development Cookbook, The best Web Development cookbook - 2018 49.99