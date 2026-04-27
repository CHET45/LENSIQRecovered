package p000;

/* JADX INFO: loaded from: classes4.dex */
@gd7
@w01
public enum sjd {
    PRIVATE(':', C4584d2.f28238g),
    REGISTRY('!', '?');


    /* JADX INFO: renamed from: a */
    public final char f82040a;

    /* JADX INFO: renamed from: b */
    public final char f82041b;

    sjd(char innerNodeCode, char leafNodeCode) {
        this.f82040a = innerNodeCode;
        this.f82041b = leafNodeCode;
    }

    /* JADX INFO: renamed from: a */
    public static sjd m22059a(char code) {
        for (sjd sjdVar : values()) {
            if (sjdVar.m22060b() == code || sjdVar.m22061c() == code) {
                return sjdVar;
            }
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + code);
    }

    /* JADX INFO: renamed from: b */
    public char m22060b() {
        return this.f82040a;
    }

    /* JADX INFO: renamed from: c */
    public char m22061c() {
        return this.f82041b;
    }
}
