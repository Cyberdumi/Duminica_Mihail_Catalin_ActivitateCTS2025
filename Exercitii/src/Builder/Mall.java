package Builder;

import java.util.Arrays;

public class Mall {
    public static void main(String[] args) throws Exception {
        MagazinBuilder builder = new MagazinBuilder(100, "Cahfu", 1);
        Magazin magazin1 = builder.build();
        Magazin magazin2 = builder.withPodea(new PodeaCiment()).build();
        Magazin magazin3 = builder.withPodea(new PodeaLemn())
                .withDecoratiuni(Arrays.asList(new Decoratiuni(EMaterialDecoratiuni.LEMN), new Decoratiuni(EMaterialDecoratiuni.METAL))).build();
        Magazin magazin4 = builder
                .withDecoratiuni(Arrays.asList(new Decoratiuni(EMaterialDecoratiuni.LEMN), new Decoratiuni(EMaterialDecoratiuni.STICLA))).build();
    }
}
