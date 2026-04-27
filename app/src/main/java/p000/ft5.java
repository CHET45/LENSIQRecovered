package p000;

/* JADX INFO: loaded from: classes3.dex */
public enum ft5 {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: a */
    public final long f37667a;

    ft5(long j) {
        this.f37667a = j;
    }

    /* JADX INFO: renamed from: a */
    public static ft5 m11150a(long j) {
        ft5[] ft5VarArrValues = values();
        for (int i = 0; i < ft5VarArrValues.length; i++) {
            if (ft5VarArrValues[i].getValue() == j) {
                return ft5VarArrValues[i];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j);
    }

    public long getValue() {
        return this.f37667a;
    }
}
