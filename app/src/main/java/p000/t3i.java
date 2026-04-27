package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
public interface t3i<V extends AbstractC16313zy> {

    /* JADX INFO: renamed from: t3i$a */
    public static final class C12906a {
        @yfb
        @Deprecated
        public static <V extends AbstractC16313zy> V getEndVelocity(@yfb t3i<V> t3iVar, @yfb V v, @yfb V v2, @yfb V v3) {
            return (V) t3i.super.getEndVelocity(v, v2, v3);
        }
    }

    long getDurationNanos(@yfb V v, @yfb V v2, @yfb V v3);

    @yfb
    default V getEndVelocity(@yfb V v, @yfb V v2, @yfb V v3) {
        return (V) getVelocityFromNanos(getDurationNanos(v, v2, v3), v, v2, v3);
    }

    @yfb
    V getValueFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3);

    @yfb
    V getVelocityFromNanos(long j, @yfb V v, @yfb V v2, @yfb V v3);

    boolean isInfinite();
}
