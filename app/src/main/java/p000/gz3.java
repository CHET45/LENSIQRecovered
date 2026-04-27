package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gz3 extends zoe {

    /* JADX INFO: renamed from: F */
    @yfb
    public static final gz3 f41852F = new gz3();

    private gz3() {
        super(vng.f91816c, vng.f91817d, vng.f91818e, vng.f91814a);
    }

    @Override // p000.zoe, p000.t85, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.m13
    @yfb
    public m13 limitedParallelism(int i, @gib String str) {
        c69.checkParallelism(i);
        return i >= vng.f91816c ? c69.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    public final void shutdown$kotlinx_coroutines_core() {
        super.close();
    }

    @Override // p000.m13
    @yfb
    public String toString() {
        return "Dispatchers.Default";
    }
}
