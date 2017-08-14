package task5;

import javafx.scene.control.ProgressIndicator;

import java.time.LocalDate;

/**
 * Created by Lenovo on 14.08.2017.
 */
public class Guarantee {
    private Product product;
    private LocalDate validUntil;

    public Guarantee(Product product, LocalDate validUntil) {
        this.product = product;
        this.validUntil = validUntil;
    }

    public boolean isValid() {
        if(validUntil.isBefore(LocalDate.now())){
            product = null;
            return false;
        }
        return true;
    }
}
