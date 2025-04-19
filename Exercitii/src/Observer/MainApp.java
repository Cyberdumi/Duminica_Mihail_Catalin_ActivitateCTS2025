package Observer;

import static Observer.Event.*;

public class MainApp {


    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener(""));
        store.getService().subscribe(SALE, new EmailMsgListener(""));
        store.getService().subscribe(SALE, new EmailMsgListener(""));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener(""));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener(""));
        store.salePromotion();

    }

}