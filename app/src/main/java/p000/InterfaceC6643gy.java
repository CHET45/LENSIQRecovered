package p000;

import p000.AbstractC16313zy;

/* JADX INFO: renamed from: gy */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6643gy<T, V extends AbstractC16313zy> {

    /* JADX INFO: renamed from: gy$a */
    public static final class a {
        @Deprecated
        public static <T, V extends AbstractC16313zy> boolean isFinishedFromNanos(@yfb InterfaceC6643gy<T, V> interfaceC6643gy, long j) {
            return InterfaceC6643gy.super.isFinishedFromNanos(j);
        }
    }

    long getDurationNanos();

    T getTargetValue();

    @yfb
    alh<T, V> getTypeConverter();

    T getValueFromNanos(long j);

    @yfb
    V getVelocityVectorFromNanos(long j);

    default boolean isFinishedFromNanos(long j) {
        return j >= getDurationNanos();
    }

    boolean isInfinite();
}
