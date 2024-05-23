package models;

import java.util.Map;

public class ExchangeRate {
    private String result;
    private String documentation;
    private String terms_of_use;
    private float time_last_update_unix;
    private String time_last_update_utc;
    private float time_next_update_unix;
    private String time_next_update_utc;
    private String base_code;
    private Map<String, Float> conversion_rates;

    public ExchangeRate() {

    }

    public float getConversionRates(String key){
        return conversion_rates.get(key);
    }
    public void setConversionRates(String key,Float tmp ) {
        this.conversion_rates.put(key,tmp);
    }
    public String getResult() {
        return result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public String getTerms_of_use() {
        return terms_of_use;
    }

    public float getTime_last_update_unix() {
        return time_last_update_unix;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public float getTime_next_update_unix() {
        return time_next_update_unix;
    }

    public String getTime_next_update_utc() {
        return time_next_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }


    // Setter Methods

    public void setResult(String result) {
        this.result = result;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public void setTerms_of_use(String terms_of_use) {
        this.terms_of_use = terms_of_use;
    }

    public void setTime_last_update_unix(float time_last_update_unix) {
        this.time_last_update_unix = time_last_update_unix;
    }

    public void setTime_last_update_utc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    public void setTime_next_update_unix(float time_next_update_unix) {
        this.time_next_update_unix = time_next_update_unix;
    }

    public void setTime_next_update_utc(String time_next_update_utc) {
        this.time_next_update_utc = time_next_update_utc;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public void setConversion_rates(Map<String, Float> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
