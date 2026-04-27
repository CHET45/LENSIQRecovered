package p000;

import com.watchfun.transcommon.C4201R;

/* JADX INFO: loaded from: classes6.dex */
public enum hyb {
    ZH("zh_name", C4201R.string.ai_trans_zh, iyb.CN),
    EN("en_name", C4201R.string.ai_trans_en, iyb.EN),
    JA("ja_name", C4201R.string.ai_trans_ja, iyb.JA),
    KO("ko_name", C4201R.string.ai_trans_kr, iyb.KO),
    ES("es_name", C4201R.string.ai_trans_es, iyb.ES),
    PT("pt_name", C4201R.string.ai_trans_pt, iyb.PT),
    FR("fr_name", C4201R.string.ai_trans_fr, iyb.FR),
    AR("ar_name", C4201R.string.ai_trans_ar, iyb.AR),
    DE("de_name", C4201R.string.ai_trans_de, iyb.DE),
    RU("ru_name", C4201R.string.ai_trans_ru, iyb.RU),
    TH("th_name", C4201R.string.ai_trans_ti, iyb.TH),
    VI("vi_name", C4201R.string.ai_vi, iyb.VI),
    HI("hi_name", C4201R.string.ai_trans_hi, iyb.HI);


    /* JADX INFO: renamed from: a */
    public String f45259a;

    /* JADX INFO: renamed from: b */
    public int f45260b;

    /* JADX INFO: renamed from: c */
    public iyb f45261c;

    hyb(String code, int languageId, iyb offlineLanguageType) {
        this.f45259a = code;
        this.f45260b = languageId;
        this.f45261c = offlineLanguageType;
    }

    public static hyb fromCode(String code) {
        for (hyb hybVar : values()) {
            if (hybVar.getCode().equals(code)) {
                return hybVar;
            }
        }
        return null;
    }

    public String getCode() {
        return this.f45259a;
    }

    public int getLanguageId() {
        return this.f45260b;
    }

    public iyb getOfflineLanguageType() {
        return this.f45261c;
    }
}
