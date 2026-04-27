package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
public interface x3i<V extends AbstractC16313zy> extends t3i<V> {

    /* JADX INFO: renamed from: x3i$a */
    public static final class C14911a {
        @yfb
        @Deprecated
        public static <V extends AbstractC16313zy> V getEndVelocity(@yfb x3i<V> x3iVar, @yfb V v, @yfb V v2, @yfb V v3) {
            return (V) x3i.super.getEndVelocity(v, v2, v3);
        }

        @Deprecated
        public static <V extends AbstractC16313zy> boolean isInfinite(@yfb x3i<V> x3iVar) {
            return x3i.super.isInfinite();
        }
    }

    @Override // p000.t3i
    default boolean isInfinite() {
        return false;
    }
}
