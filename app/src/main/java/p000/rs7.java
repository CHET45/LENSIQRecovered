package p000;

/* JADX INFO: loaded from: classes.dex */
public interface rs7 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C12230a f79192a = C12230a.f79193a;

    /* JADX INFO: renamed from: rs7$a */
    public static final class C12230a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C12230a f79193a = new C12230a();

        private C12230a() {
        }
    }

    /* JADX INFO: renamed from: rs7$b */
    public static final class C12231b {
    }

    static /* synthetic */ void readPixels$default(rs7 rs7Var, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        int i8 = (i7 & 2) != 0 ? 0 : i;
        int i9 = (i7 & 4) != 0 ? 0 : i2;
        int width = (i7 & 8) != 0 ? rs7Var.getWidth() : i3;
        rs7Var.readPixels(iArr, i8, i9, width, (i7 & 16) != 0 ? rs7Var.getHeight() : i4, (i7 & 32) == 0 ? i5 : 0, (i7 & 64) != 0 ? width : i6);
    }

    @yfb
    ia2 getColorSpace();

    /* JADX INFO: renamed from: getConfig-_sVssgQ */
    int mo28693getConfig_sVssgQ();

    boolean getHasAlpha();

    int getHeight();

    int getWidth();

    void prepareToDraw();

    void readPixels(@yfb int[] iArr, int i, int i2, int i3, int i4, int i5, int i6);
}
