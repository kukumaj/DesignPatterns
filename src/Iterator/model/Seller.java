package Iterator.model;

import Iterator.Product;
import java.util.Iterator;

public class Seller {
    Catalog geekyStoreCatalog;
    Catalog devStoreCatalog;

    public Seller(Catalog geekyStoreCatalog, Catalog devStoreCatalog) {
        this.geekyStoreCatalog = geekyStoreCatalog;
        this.devStoreCatalog = devStoreCatalog;
    }


    public void printCatalog() {
        Iterator devStoreIterator = devStoreCatalog.createIterator();
        System.out.println("Printing Dev Catalog: ");
        printCatalog(devStoreIterator);
        Iterator geekyStoreIterator = geekyStoreCatalog.createIterator();
        System.out.println("Printing Geeky Catalog: ");
        printCatalog(geekyStoreIterator);


    }

    private void printCatalog(Iterator iterator) {
        while (iterator.hasNext()) {
            Product product = (Product)iterator.next();
            System.out.print(product.getName() + ", ");
            System.out.print(product.getDescription() + " ");
            System.out.println(product.getPrice());
        }
    }
//    private void printCatalog(GeekyStoreIterator iterator) {
//        while (iterator.hasNext()) {
//            Product product = (Product)iterator.next();
//            System.out.print(product.getName() + ", ");
//            System.out.print(product.getDescription() + " ");
//            System.out.println(product.getPrice());
//        }
//
//    }
}
