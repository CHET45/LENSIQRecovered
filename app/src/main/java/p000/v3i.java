package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
public interface v3i<V extends AbstractC16313zy> {
    float getAbsVelocityThreshold();

    long getDurationNanos(@yfb V v, @yfb V v2);

    @yfb
    V getTargetValue(@yfb V v, @yfb V v2);

    @yfb
    V getValueFromNanos(long j, @yfb V v, @yfb V v2);

    @yfb
    V getVelocityFromNanos(long j, @yfb V v, @yfb V v2);
}
