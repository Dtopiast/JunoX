
package Services;

public interface ICurrencyConverter {
    float getConversion(Currencies from, Currencies to, float amount);
}
