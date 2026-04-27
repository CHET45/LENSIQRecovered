package p000;

/* JADX INFO: loaded from: classes.dex */
public enum jn6 implements in6 {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    /* JADX INFO: renamed from: jn6$a */
    public /* synthetic */ class C7987a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51293a;

        static {
            int[] iArr = new int[jn6.values().length];
            try {
                iArr[jn6.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jn6.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jn6.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jn6.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f51293a = iArr;
        }
    }

    @Override // p000.in6
    public boolean getHasFocus() {
        int i = C7987a.f51293a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw new ceb();
    }

    @Override // p000.in6
    public boolean isCaptured() {
        int i = C7987a.f51293a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4) {
            return false;
        }
        throw new ceb();
    }

    @Override // p000.in6
    public boolean isFocused() {
        int i = C7987a.f51293a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new ceb();
    }
}
