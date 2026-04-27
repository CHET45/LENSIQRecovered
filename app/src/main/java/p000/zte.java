package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zte {

    /* JADX INFO: renamed from: zte$a */
    public /* synthetic */ class C16253a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f106084a;

        static {
            int[] iArr = new int[yte.values().length];
            try {
                iArr[yte.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yte.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yte.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f106084a = iArr;
        }
    }

    public static final boolean shouldApplySecureFlag(@yfb yte yteVar, boolean z) {
        int i = C16253a.f106084a[yteVar.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        throw new ceb();
    }
}
