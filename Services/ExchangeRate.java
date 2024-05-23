package Services;

public class ExchangeRate {
    private Conversion_rates conversionRates;

    public Conversion_rates getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(Conversion_rates conversionRates) {
        this.conversionRates = conversionRates;
    }

    public static class Application {
        private String result;
        private String documentation;
        private String terms_of_use;
        private float time_last_update_unix;
        private String time_last_update_utc;
        private float time_next_update_unix;
        private String time_next_update_utc;
        private String base_code;
        Conversion_rates Conversion_ratesObject;


        // Getter Methods

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

        public Conversion_rates getConversion_rates() {
            return Conversion_ratesObject;
        }

        // Setter Methods

        public void setResult( String result ) {
            this.result = result;
        }

        public void setDocumentation( String documentation ) {
            this.documentation = documentation;
        }

        public void setTerms_of_use( String terms_of_use ) {
            this.terms_of_use = terms_of_use;
        }

        public void setTime_last_update_unix( float time_last_update_unix ) {
            this.time_last_update_unix = time_last_update_unix;
        }

        public void setTime_last_update_utc( String time_last_update_utc ) {
            this.time_last_update_utc = time_last_update_utc;
        }

        public void setTime_next_update_unix( float time_next_update_unix ) {
            this.time_next_update_unix = time_next_update_unix;
        }

        public void setTime_next_update_utc( String time_next_update_utc ) {
            this.time_next_update_utc = time_next_update_utc;
        }

        public void setBase_code( String base_code ) {
            this.base_code = base_code;
        }

        public void setConversion_rates( Conversion_rates conversion_ratesObject ) {
            this.Conversion_ratesObject = conversion_ratesObject;
        }
    }

    public static class Conversion_rates {
        private float USD;
        private float AED;
        private float AFN;
        private float ALL;
        private float AMD;
        private float ANG;
        private float AOA;
        private float ARS;
        private float AUD;
        private float AWG;
        private float AZN;
        private float BAM;
        private float BBD;
        private float BDT;
        private float BGN;
        private float BHD;
        private float BIF;
        private float BMD;
        private float BND;
        private float BOB;
        private float BRL;
        private float BSD;
        private float BTN;
        private float BWP;
        private float BYN;
        private float BZD;
        private float CAD;
        private float CDF;
        private float CHF;
        private float CLP;
        private float CNY;
        private float COP;
        private float CRC;
        private float CUP;
        private float CVE;
        private float CZK;
        private float DJF;
        private float DKK;
        private float DOP;
        private float DZD;
        private float EGP;
        private float ERN;
        private float ETB;
        private float EUR;
        private float FJD;
        private float FKP;
        private float FOK;
        private float GBP;
        private float GEL;
        private float GGP;
        private float GHS;
        private float GIP;
        private float GMD;
        private float GNF;
        private float GTQ;
        private float GYD;
        private float HKD;
        private float HNL;
        private float HRK;
        private float HTG;
        private float HUF;
        private float IDR;
        private float ILS;
        private float IMP;
        private float INR;
        private float IQD;
        private float IRR;
        private float ISK;
        private float JEP;
        private float JMD;
        private float JOD;
        private float JPY;
        private float KES;
        private float KGS;
        private float KHR;
        private float KID;
        private float KMF;
        private float KRW;
        private float KWD;
        private float KYD;
        private float KZT;
        private float LAK;
        private float LBP;
        private float LKR;
        private float LRD;
        private float LSL;
        private float LYD;
        private float MAD;
        private float MDL;
        private float MGA;
        private float MKD;
        private float MMK;
        private float MNT;
        private float MOP;
        private float MRU;
        private float MUR;
        private float MVR;
        private float MWK;
        private float MXN;
        private float MYR;
        private float MZN;
        private float NAD;
        private float NGN;
        private float NIO;
        private float NOK;
        private float NPR;
        private float NZD;
        private float OMR;
        private float PAB;
        private float PEN;
        private float PGK;
        private float PHP;
        private float PKR;
        private float PLN;
        private float PYG;
        private float QAR;
        private float RON;
        private float RSD;
        private float RUB;
        private float RWF;
        private float SAR;
        private float SBD;
        private float SCR;
        private float SDG;
        private float SEK;
        private float SGD;
        private float SHP;
        private float SLE;
        private float SLL;
        private float SOS;
        private float SRD;
        private float SSP;
        private float STN;
        private float SYP;
        private float SZL;
        private float THB;
        private float TJS;
        private float TMT;
        private float TND;
        private float TOP;
        private float TRY;
        private float TTD;
        private float TVD;
        private float TWD;
        private float TZS;
        private float UAH;
        private float UGX;
        private float UYU;
        private float UZS;
        private float VES;
        private float VND;
        private float VUV;
        private float WST;
        private float XAF;
        private float XCD;
        private float XDR;
        private float XOF;
        private float XPF;
        private float YER;
        private float ZAR;
        private float ZMW;
        private float ZWL;


        // Getter Methods

        public float getUSD() {
            return USD;
        }

        public float getAED() {
            return AED;
        }

        public float getAFN() {
            return AFN;
        }

        public float getALL() {
            return ALL;
        }

        public float getAMD() {
            return AMD;
        }

        public float getANG() {
            return ANG;
        }

        public float getAOA() {
            return AOA;
        }

        public float getARS() {
            return ARS;
        }

        public float getAUD() {
            return AUD;
        }

        public float getAWG() {
            return AWG;
        }

        public float getAZN() {
            return AZN;
        }

        public float getBAM() {
            return BAM;
        }

        public float getBBD() {
            return BBD;
        }

        public float getBDT() {
            return BDT;
        }

        public float getBGN() {
            return BGN;
        }

        public float getBHD() {
            return BHD;
        }

        public float getBIF() {
            return BIF;
        }

        public float getBMD() {
            return BMD;
        }

        public float getBND() {
            return BND;
        }

        public float getBOB() {
            return BOB;
        }

        public float getBRL() {
            return BRL;
        }

        public float getBSD() {
            return BSD;
        }

        public float getBTN() {
            return BTN;
        }

        public float getBWP() {
            return BWP;
        }

        public float getBYN() {
            return BYN;
        }

        public float getBZD() {
            return BZD;
        }

        public float getCAD() {
            return CAD;
        }

        public float getCDF() {
            return CDF;
        }

        public float getCHF() {
            return CHF;
        }

        public float getCLP() {
            return CLP;
        }

        public float getCNY() {
            return CNY;
        }

        public float getCOP() {
            return COP;
        }

        public float getCRC() {
            return CRC;
        }

        public float getCUP() {
            return CUP;
        }

        public float getCVE() {
            return CVE;
        }

        public float getCZK() {
            return CZK;
        }

        public float getDJF() {
            return DJF;
        }

        public float getDKK() {
            return DKK;
        }

        public float getDOP() {
            return DOP;
        }

        public float getDZD() {
            return DZD;
        }

        public float getEGP() {
            return EGP;
        }

        public float getERN() {
            return ERN;
        }

        public float getETB() {
            return ETB;
        }

        public float getEUR() {
            return EUR;
        }

        public float getFJD() {
            return FJD;
        }

        public float getFKP() {
            return FKP;
        }

        public float getFOK() {
            return FOK;
        }

        public float getGBP() {
            return GBP;
        }

        public float getGEL() {
            return GEL;
        }

        public float getGGP() {
            return GGP;
        }

        public float getGHS() {
            return GHS;
        }

        public float getGIP() {
            return GIP;
        }

        public float getGMD() {
            return GMD;
        }

        public float getGNF() {
            return GNF;
        }

        public float getGTQ() {
            return GTQ;
        }

        public float getGYD() {
            return GYD;
        }

        public float getHKD() {
            return HKD;
        }

        public float getHNL() {
            return HNL;
        }

        public float getHRK() {
            return HRK;
        }

        public float getHTG() {
            return HTG;
        }

        public float getHUF() {
            return HUF;
        }

        public float getIDR() {
            return IDR;
        }

        public float getILS() {
            return ILS;
        }

        public float getIMP() {
            return IMP;
        }

        public float getINR() {
            return INR;
        }

        public float getIQD() {
            return IQD;
        }

        public float getIRR() {
            return IRR;
        }

        public float getISK() {
            return ISK;
        }

        public float getJEP() {
            return JEP;
        }

        public float getJMD() {
            return JMD;
        }

        public float getJOD() {
            return JOD;
        }

        public float getJPY() {
            return JPY;
        }

        public float getKES() {
            return KES;
        }

        public float getKGS() {
            return KGS;
        }

        public float getKHR() {
            return KHR;
        }

        public float getKID() {
            return KID;
        }

        public float getKMF() {
            return KMF;
        }

        public float getKRW() {
            return KRW;
        }

        public float getKWD() {
            return KWD;
        }

        public float getKYD() {
            return KYD;
        }

        public float getKZT() {
            return KZT;
        }

        public float getLAK() {
            return LAK;
        }

        public float getLBP() {
            return LBP;
        }

        public float getLKR() {
            return LKR;
        }

        public float getLRD() {
            return LRD;
        }

        public float getLSL() {
            return LSL;
        }

        public float getLYD() {
            return LYD;
        }

        public float getMAD() {
            return MAD;
        }

        public float getMDL() {
            return MDL;
        }

        public float getMGA() {
            return MGA;
        }

        public float getMKD() {
            return MKD;
        }

        public float getMMK() {
            return MMK;
        }

        public float getMNT() {
            return MNT;
        }

        public float getMOP() {
            return MOP;
        }

        public float getMRU() {
            return MRU;
        }

        public float getMUR() {
            return MUR;
        }

        public float getMVR() {
            return MVR;
        }

        public float getMWK() {
            return MWK;
        }

        public float getMXN() {
            return MXN;
        }

        public float getMYR() {
            return MYR;
        }

        public float getMZN() {
            return MZN;
        }

        public float getNAD() {
            return NAD;
        }

        public float getNGN() {
            return NGN;
        }

        public float getNIO() {
            return NIO;
        }

        public float getNOK() {
            return NOK;
        }

        public float getNPR() {
            return NPR;
        }

        public float getNZD() {
            return NZD;
        }

        public float getOMR() {
            return OMR;
        }

        public float getPAB() {
            return PAB;
        }

        public float getPEN() {
            return PEN;
        }

        public float getPGK() {
            return PGK;
        }

        public float getPHP() {
            return PHP;
        }

        public float getPKR() {
            return PKR;
        }

        public float getPLN() {
            return PLN;
        }

        public float getPYG() {
            return PYG;
        }

        public float getQAR() {
            return QAR;
        }

        public float getRON() {
            return RON;
        }

        public float getRSD() {
            return RSD;
        }

        public float getRUB() {
            return RUB;
        }

        public float getRWF() {
            return RWF;
        }

        public float getSAR() {
            return SAR;
        }

        public float getSBD() {
            return SBD;
        }

        public float getSCR() {
            return SCR;
        }

        public float getSDG() {
            return SDG;
        }

        public float getSEK() {
            return SEK;
        }

        public float getSGD() {
            return SGD;
        }

        public float getSHP() {
            return SHP;
        }

        public float getSLE() {
            return SLE;
        }

        public float getSLL() {
            return SLL;
        }

        public float getSOS() {
            return SOS;
        }

        public float getSRD() {
            return SRD;
        }

        public float getSSP() {
            return SSP;
        }

        public float getSTN() {
            return STN;
        }

        public float getSYP() {
            return SYP;
        }

        public float getSZL() {
            return SZL;
        }

        public float getTHB() {
            return THB;
        }

        public float getTJS() {
            return TJS;
        }

        public float getTMT() {
            return TMT;
        }

        public float getTND() {
            return TND;
        }

        public float getTOP() {
            return TOP;
        }

        public float getTRY() {
            return TRY;
        }

        public float getTTD() {
            return TTD;
        }

        public float getTVD() {
            return TVD;
        }

        public float getTWD() {
            return TWD;
        }

        public float getTZS() {
            return TZS;
        }

        public float getUAH() {
            return UAH;
        }

        public float getUGX() {
            return UGX;
        }

        public float getUYU() {
            return UYU;
        }

        public float getUZS() {
            return UZS;
        }

        public float getVES() {
            return VES;
        }

        public float getVND() {
            return VND;
        }

        public float getVUV() {
            return VUV;
        }

        public float getWST() {
            return WST;
        }

        public float getXAF() {
            return XAF;
        }

        public float getXCD() {
            return XCD;
        }

        public float getXDR() {
            return XDR;
        }

        public float getXOF() {
            return XOF;
        }

        public float getXPF() {
            return XPF;
        }

        public float getYER() {
            return YER;
        }

        public float getZAR() {
            return ZAR;
        }

        public float getZMW() {
            return ZMW;
        }

        public float getZWL() {
            return ZWL;
        }

        // Setter Methods

        public void setUSD( float USD ) {
            this.USD = USD;
        }

        public void setAED( float AED ) {
            this.AED = AED;
        }

        public void setAFN( float AFN ) {
            this.AFN = AFN;
        }

        public void setALL( float ALL ) {
            this.ALL = ALL;
        }

        public void setAMD( float AMD ) {
            this.AMD = AMD;
        }

        public void setANG( float ANG ) {
            this.ANG = ANG;
        }

        public void setAOA( float AOA ) {
            this.AOA = AOA;
        }

        public void setARS( float ARS ) {
            this.ARS = ARS;
        }

        public void setAUD( float AUD ) {
            this.AUD = AUD;
        }

        public void setAWG( float AWG ) {
            this.AWG = AWG;
        }

        public void setAZN( float AZN ) {
            this.AZN = AZN;
        }

        public void setBAM( float BAM ) {
            this.BAM = BAM;
        }

        public void setBBD( float BBD ) {
            this.BBD = BBD;
        }

        public void setBDT( float BDT ) {
            this.BDT = BDT;
        }

        public void setBGN( float BGN ) {
            this.BGN = BGN;
        }

        public void setBHD( float BHD ) {
            this.BHD = BHD;
        }

        public void setBIF( float BIF ) {
            this.BIF = BIF;
        }

        public void setBMD( float BMD ) {
            this.BMD = BMD;
        }

        public void setBND( float BND ) {
            this.BND = BND;
        }

        public void setBOB( float BOB ) {
            this.BOB = BOB;
        }

        public void setBRL( float BRL ) {
            this.BRL = BRL;
        }

        public void setBSD( float BSD ) {
            this.BSD = BSD;
        }

        public void setBTN( float BTN ) {
            this.BTN = BTN;
        }

        public void setBWP( float BWP ) {
            this.BWP = BWP;
        }

        public void setBYN( float BYN ) {
            this.BYN = BYN;
        }

        public void setBZD( float BZD ) {
            this.BZD = BZD;
        }

        public void setCAD( float CAD ) {
            this.CAD = CAD;
        }

        public void setCDF( float CDF ) {
            this.CDF = CDF;
        }

        public void setCHF( float CHF ) {
            this.CHF = CHF;
        }

        public void setCLP( float CLP ) {
            this.CLP = CLP;
        }

        public void setCNY( float CNY ) {
            this.CNY = CNY;
        }

        public void setCOP( float COP ) {
            this.COP = COP;
        }

        public void setCRC( float CRC ) {
            this.CRC = CRC;
        }

        public void setCUP( float CUP ) {
            this.CUP = CUP;
        }

        public void setCVE( float CVE ) {
            this.CVE = CVE;
        }

        public void setCZK( float CZK ) {
            this.CZK = CZK;
        }

        public void setDJF( float DJF ) {
            this.DJF = DJF;
        }

        public void setDKK( float DKK ) {
            this.DKK = DKK;
        }

        public void setDOP( float DOP ) {
            this.DOP = DOP;
        }

        public void setDZD( float DZD ) {
            this.DZD = DZD;
        }

        public void setEGP( float EGP ) {
            this.EGP = EGP;
        }

        public void setERN( float ERN ) {
            this.ERN = ERN;
        }

        public void setETB( float ETB ) {
            this.ETB = ETB;
        }

        public void setEUR( float EUR ) {
            this.EUR = EUR;
        }

        public void setFJD( float FJD ) {
            this.FJD = FJD;
        }

        public void setFKP( float FKP ) {
            this.FKP = FKP;
        }

        public void setFOK( float FOK ) {
            this.FOK = FOK;
        }

        public void setGBP( float GBP ) {
            this.GBP = GBP;
        }

        public void setGEL( float GEL ) {
            this.GEL = GEL;
        }

        public void setGGP( float GGP ) {
            this.GGP = GGP;
        }

        public void setGHS( float GHS ) {
            this.GHS = GHS;
        }

        public void setGIP( float GIP ) {
            this.GIP = GIP;
        }

        public void setGMD( float GMD ) {
            this.GMD = GMD;
        }

        public void setGNF( float GNF ) {
            this.GNF = GNF;
        }

        public void setGTQ( float GTQ ) {
            this.GTQ = GTQ;
        }

        public void setGYD( float GYD ) {
            this.GYD = GYD;
        }

        public void setHKD( float HKD ) {
            this.HKD = HKD;
        }

        public void setHNL( float HNL ) {
            this.HNL = HNL;
        }

        public void setHRK( float HRK ) {
            this.HRK = HRK;
        }

        public void setHTG( float HTG ) {
            this.HTG = HTG;
        }

        public void setHUF( float HUF ) {
            this.HUF = HUF;
        }

        public void setIDR( float IDR ) {
            this.IDR = IDR;
        }

        public void setILS( float ILS ) {
            this.ILS = ILS;
        }

        public void setIMP( float IMP ) {
            this.IMP = IMP;
        }

        public void setINR( float INR ) {
            this.INR = INR;
        }

        public void setIQD( float IQD ) {
            this.IQD = IQD;
        }

        public void setIRR( float IRR ) {
            this.IRR = IRR;
        }

        public void setISK( float ISK ) {
            this.ISK = ISK;
        }

        public void setJEP( float JEP ) {
            this.JEP = JEP;
        }

        public void setJMD( float JMD ) {
            this.JMD = JMD;
        }

        public void setJOD( float JOD ) {
            this.JOD = JOD;
        }

        public void setJPY( float JPY ) {
            this.JPY = JPY;
        }

        public void setKES( float KES ) {
            this.KES = KES;
        }

        public void setKGS( float KGS ) {
            this.KGS = KGS;
        }

        public void setKHR( float KHR ) {
            this.KHR = KHR;
        }

        public void setKID( float KID ) {
            this.KID = KID;
        }

        public void setKMF( float KMF ) {
            this.KMF = KMF;
        }

        public void setKRW( float KRW ) {
            this.KRW = KRW;
        }

        public void setKWD( float KWD ) {
            this.KWD = KWD;
        }

        public void setKYD( float KYD ) {
            this.KYD = KYD;
        }

        public void setKZT( float KZT ) {
            this.KZT = KZT;
        }

        public void setLAK( float LAK ) {
            this.LAK = LAK;
        }

        public void setLBP( float LBP ) {
            this.LBP = LBP;
        }

        public void setLKR( float LKR ) {
            this.LKR = LKR;
        }

        public void setLRD( float LRD ) {
            this.LRD = LRD;
        }

        public void setLSL( float LSL ) {
            this.LSL = LSL;
        }

        public void setLYD( float LYD ) {
            this.LYD = LYD;
        }

        public void setMAD( float MAD ) {
            this.MAD = MAD;
        }

        public void setMDL( float MDL ) {
            this.MDL = MDL;
        }

        public void setMGA( float MGA ) {
            this.MGA = MGA;
        }

        public void setMKD( float MKD ) {
            this.MKD = MKD;
        }

        public void setMMK( float MMK ) {
            this.MMK = MMK;
        }

        public void setMNT( float MNT ) {
            this.MNT = MNT;
        }

        public void setMOP( float MOP ) {
            this.MOP = MOP;
        }

        public void setMRU( float MRU ) {
            this.MRU = MRU;
        }

        public void setMUR( float MUR ) {
            this.MUR = MUR;
        }

        public void setMVR( float MVR ) {
            this.MVR = MVR;
        }

        public void setMWK( float MWK ) {
            this.MWK = MWK;
        }

        public void setMXN( float MXN ) {
            this.MXN = MXN;
        }

        public void setMYR( float MYR ) {
            this.MYR = MYR;
        }

        public void setMZN( float MZN ) {
            this.MZN = MZN;
        }

        public void setNAD( float NAD ) {
            this.NAD = NAD;
        }

        public void setNGN( float NGN ) {
            this.NGN = NGN;
        }

        public void setNIO( float NIO ) {
            this.NIO = NIO;
        }

        public void setNOK( float NOK ) {
            this.NOK = NOK;
        }

        public void setNPR( float NPR ) {
            this.NPR = NPR;
        }

        public void setNZD( float NZD ) {
            this.NZD = NZD;
        }

        public void setOMR( float OMR ) {
            this.OMR = OMR;
        }

        public void setPAB( float PAB ) {
            this.PAB = PAB;
        }

        public void setPEN( float PEN ) {
            this.PEN = PEN;
        }

        public void setPGK( float PGK ) {
            this.PGK = PGK;
        }

        public void setPHP( float PHP ) {
            this.PHP = PHP;
        }

        public void setPKR( float PKR ) {
            this.PKR = PKR;
        }

        public void setPLN( float PLN ) {
            this.PLN = PLN;
        }

        public void setPYG( float PYG ) {
            this.PYG = PYG;
        }

        public void setQAR( float QAR ) {
            this.QAR = QAR;
        }

        public void setRON( float RON ) {
            this.RON = RON;
        }

        public void setRSD( float RSD ) {
            this.RSD = RSD;
        }

        public void setRUB( float RUB ) {
            this.RUB = RUB;
        }

        public void setRWF( float RWF ) {
            this.RWF = RWF;
        }

        public void setSAR( float SAR ) {
            this.SAR = SAR;
        }

        public void setSBD( float SBD ) {
            this.SBD = SBD;
        }

        public void setSCR( float SCR ) {
            this.SCR = SCR;
        }

        public void setSDG( float SDG ) {
            this.SDG = SDG;
        }

        public void setSEK( float SEK ) {
            this.SEK = SEK;
        }

        public void setSGD( float SGD ) {
            this.SGD = SGD;
        }

        public void setSHP( float SHP ) {
            this.SHP = SHP;
        }

        public void setSLE( float SLE ) {
            this.SLE = SLE;
        }

        public void setSLL( float SLL ) {
            this.SLL = SLL;
        }

        public void setSOS( float SOS ) {
            this.SOS = SOS;
        }

        public void setSRD( float SRD ) {
            this.SRD = SRD;
        }

        public void setSSP( float SSP ) {
            this.SSP = SSP;
        }

        public void setSTN( float STN ) {
            this.STN = STN;
        }

        public void setSYP( float SYP ) {
            this.SYP = SYP;
        }

        public void setSZL( float SZL ) {
            this.SZL = SZL;
        }

        public void setTHB( float THB ) {
            this.THB = THB;
        }

        public void setTJS( float TJS ) {
            this.TJS = TJS;
        }

        public void setTMT( float TMT ) {
            this.TMT = TMT;
        }

        public void setTND( float TND ) {
            this.TND = TND;
        }

        public void setTOP( float TOP ) {
            this.TOP = TOP;
        }

        public void setTRY( float TRY ) {
            this.TRY = TRY;
        }

        public void setTTD( float TTD ) {
            this.TTD = TTD;
        }

        public void setTVD( float TVD ) {
            this.TVD = TVD;
        }

        public void setTWD( float TWD ) {
            this.TWD = TWD;
        }

        public void setTZS( float TZS ) {
            this.TZS = TZS;
        }

        public void setUAH( float UAH ) {
            this.UAH = UAH;
        }

        public void setUGX( float UGX ) {
            this.UGX = UGX;
        }

        public void setUYU( float UYU ) {
            this.UYU = UYU;
        }

        public void setUZS( float UZS ) {
            this.UZS = UZS;
        }

        public void setVES( float VES ) {
            this.VES = VES;
        }

        public void setVND( float VND ) {
            this.VND = VND;
        }

        public void setVUV( float VUV ) {
            this.VUV = VUV;
        }

        public void setWST( float WST ) {
            this.WST = WST;
        }

        public void setXAF( float XAF ) {
            this.XAF = XAF;
        }

        public void setXCD( float XCD ) {
            this.XCD = XCD;
        }

        public void setXDR( float XDR ) {
            this.XDR = XDR;
        }

        public void setXOF( float XOF ) {
            this.XOF = XOF;
        }

        public void setXPF( float XPF ) {
            this.XPF = XPF;
        }

        public void setYER( float YER ) {
            this.YER = YER;
        }

        public void setZAR( float ZAR ) {
            this.ZAR = ZAR;
        }

        public void setZMW( float ZMW ) {
            this.ZMW = ZMW;
        }

        public void setZWL( float ZWL ) {
            this.ZWL = ZWL;
        }
    }
}
