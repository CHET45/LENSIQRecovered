package p000;

/* JADX INFO: loaded from: classes6.dex */
public enum iyb {
    CN("cn", 0, 1),
    EN(ufh.f87916c, 0, 1),
    JA(ufh.f87917d, 20, 5),
    KO(ufh.f87918e, 21, 16),
    ES(ufh.f87920g, 24, 23),
    PT(ufh.f87925l, 30, 22),
    FR(ufh.f87919f, 23, 97),
    AR("ar", 28, 88),
    DE(ufh.f87922i, 25, 93),
    RU(ufh.f87921h, 22, 6),
    TH(ufh.f87924k, 27, 27),
    VI(ufh.f87923j, 26, 11),
    HI(ufh.f87927n, 31, 8),
    ID("id", 32, 0);


    /* JADX INFO: renamed from: a */
    public String f48908a;

    /* JADX INFO: renamed from: b */
    public int f48909b;

    /* JADX INFO: renamed from: c */
    public int f48910c;

    iyb(String str, int i, int i2) {
        this.f48908a = str;
        this.f48909b = i;
        this.f48910c = i2;
    }

    public String getCode() {
        return this.f48908a;
    }

    public int getRecognizeLanguageType() {
        return this.f48909b;
    }

    public int getTtsLanguageType() {
        return this.f48910c;
    }
}
