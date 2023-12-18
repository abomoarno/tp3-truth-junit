package example;

import org.example.Employe;
import org.example.Tax;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class TaxTest {

    @Test
    public void test_calcul_tax_67keuros_zero_enfant() {

        Employe employe = new Employe(
                "ARNO",
                30,
                67000.0,
                0
        );

        Tax tax = new Tax(employe);

        assertThat(tax.calculTax()).isEqualTo(10050.0);

    }

    @Test
    public void test_calcul_tax_26keuros_deux_enfants() {

        Employe employe = new Employe(
                "ARNO",
                30,
                26000.0,
                2
        );

        Tax tax = new Tax(employe);

        assertThat(tax.calculTax()).isEqualTo(0.0);

    }

    @Test
    public void test_calcul_tax_50keuros_deux_enfants() {

        Employe employe = new Employe(
                "ARNO",
                30,
                50000.0,
                2
        );

        Tax tax = new Tax(employe);
        assertThat(tax.calculTax()).isEqualTo(3750.0);
    }
}