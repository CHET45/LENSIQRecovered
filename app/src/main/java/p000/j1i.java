package p000;

/* JADX INFO: loaded from: classes.dex */
public final class j1i {

    /* JADX INFO: renamed from: a */
    public static final int f49371a = 32;

    /* JADX INFO: renamed from: b */
    public static final int f49372b = 5;

    /* JADX INFO: renamed from: c */
    public static final int f49373c = 31;

    /* JADX INFO: renamed from: d */
    public static final int f49374d = 33;

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    @yfb
    public static final <E> prc<E> persistentVectorOf() {
        return urf.f88879c.getEMPTY();
    }

    @yfb
    public static final Object[] presizedBufferWith(@gib Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int rootSize(int i) {
        return (i - 1) & (-32);
    }
}
