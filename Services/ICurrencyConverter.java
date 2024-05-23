
package Services;

public interface ICurrencyConverter {
    /**
     * @param from Currency origin
     * @param to Currency to convert
     * @param amount Amount to convert
     * @retur converted amount
     */
    float getConversion(Currencies from, Currencies to, float amount);
}
