package p000;

import com.watchfun.trans.C4035R;

/* JADX INFO: loaded from: classes6.dex */
public enum xyb {
    BASE("base", C4035R.string.res_name_base),
    CN("cn", C4035R.string.res_name_cn),
    EN(ufh.f87916c, C4035R.string.res_name_en),
    JA(ufh.f87917d, C4035R.string.res_name_ja),
    KO(ufh.f87918e, C4035R.string.res_name_ko),
    ES(ufh.f87920g, C4035R.string.res_name_es),
    PT(ufh.f87925l, C4035R.string.res_name_pt),
    FR(ufh.f87919f, C4035R.string.res_name_fr),
    AR("ar", C4035R.string.res_name_ar),
    DE(ufh.f87922i, C4035R.string.res_name_de),
    RU(ufh.f87921h, C4035R.string.res_name_ru),
    TH(ufh.f87924k, C4035R.string.res_name_th),
    VI(ufh.f87923j, C4035R.string.res_name_vi),
    HI(ufh.f87927n, C4035R.string.res_name_hi);


    /* JADX INFO: renamed from: a */
    public String f99694a;

    /* JADX INFO: renamed from: b */
    public int f99695b;

    xyb(String resourceCode, int resNameId) {
        this.f99694a = resourceCode;
        this.f99695b = resNameId;
    }

    public int getResNameId() {
        return this.f99695b;
    }

    public String getResourceCode() {
        return this.f99694a;
    }
}
