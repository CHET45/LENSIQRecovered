package p000;

/* JADX INFO: loaded from: classes.dex */
public interface r97 {

    /* JADX INFO: renamed from: r97$a */
    public static final class C11947a {
        @Deprecated
        public static long getOwnerViewId(@yfb r97 r97Var) {
            return r97.super.getOwnerViewId();
        }
    }

    long getLayerId();

    default long getOwnerViewId() {
        return 0L;
    }
}
