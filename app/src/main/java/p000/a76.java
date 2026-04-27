package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class a76 {
    @yjd
    public static final int checkIndexOverflow(int i) {
        if (i >= 0) {
            return i;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void checkOwnership(@yfb C8562l c8562l, @yfb Object obj) {
        if (c8562l.f55739a != obj) {
            throw c8562l;
        }
    }
}
