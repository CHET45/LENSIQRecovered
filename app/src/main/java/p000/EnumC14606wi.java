package p000;

/* JADX INFO: renamed from: wi */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC14606wi implements nt2 {
    AEE_EVENT_UNKNOWN(0),
    AEE_EVENT_START(1),
    AEE_EVENT_END(2),
    AEE_EVENT_TIMEOUT(3),
    AEE_EVENT_PROGRESS(4);


    /* JADX INFO: renamed from: a */
    public final int f94290a;

    EnumC14606wi(int i) {
        this.f94290a = i;
    }

    public static EnumC14606wi valueOf(int i) {
        if (i == 0) {
            return AEE_EVENT_UNKNOWN;
        }
        if (i == 1) {
            return AEE_EVENT_START;
        }
        if (i == 2) {
            return AEE_EVENT_END;
        }
        if (i == 3) {
            return AEE_EVENT_TIMEOUT;
        }
        if (i == 4) {
            return AEE_EVENT_PROGRESS;
        }
        return null;
    }

    @Override // p000.nt2
    public int getValue() {
        return this.f94290a;
    }
}
