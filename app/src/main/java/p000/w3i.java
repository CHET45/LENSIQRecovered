package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
public interface w3i<V extends AbstractC16313zy> extends x3i<V> {

    /* JADX INFO: renamed from: w3i$a */
    public static final class C14373a {
        @Deprecated
        public static <V extends AbstractC16313zy> long getDurationNanos(@yfb w3i<V> w3iVar, @yfb V v, @yfb V v2, @yfb V v3) {
            return w3i.super.getDurationNanos(v, v2, v3);
        }

        @yfb
        @Deprecated
        public static <V extends AbstractC16313zy> V getEndVelocity(@yfb w3i<V> w3iVar, @yfb V v, @yfb V v2, @yfb V v3) {
            return (V) w3i.super.getEndVelocity(v, v2, v3);
        }

        @Deprecated
        public static <V extends AbstractC16313zy> boolean isInfinite(@yfb w3i<V> w3iVar) {
            return w3i.super.isInfinite();
        }
    }

    int getDelayMillis();

    int getDurationMillis();

    @Override // p000.t3i
    default long getDurationNanos(@yfb V v, @yfb V v2, @yfb V v3) {
        return ((long) (getDelayMillis() + getDurationMillis())) * 1000000;
    }
}
