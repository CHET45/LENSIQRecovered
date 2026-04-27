package p000;

/* JADX INFO: loaded from: classes6.dex */
public enum a72 implements nt2 {
    CODEC_ENCODE(0),
    CODEC_DECODE(1);


    /* JADX INFO: renamed from: a */
    public final int f528a;

    a72(int i) {
        this.f528a = i;
    }

    public static a72 valueOf(int i) {
        if (i == 0) {
            return CODEC_ENCODE;
        }
        if (i == 1) {
            return CODEC_DECODE;
        }
        return null;
    }

    @Override // p000.nt2
    public int getValue() {
        return this.f528a;
    }
}
