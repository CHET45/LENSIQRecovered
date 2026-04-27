package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xud {
    @f0g
    @yfb
    /* JADX INFO: renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final rud m33301Rect0a9Yr6o(long j, long j2) {
        return new rud(izb.m30429getXimpl(j), izb.m30430getYimpl(j), izb.m30429getXimpl(j2), izb.m30430getYimpl(j2));
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final rud m33302Rect3MmeM6k(long j, float f) {
        return new rud(izb.m30429getXimpl(j) - f, izb.m30430getYimpl(j) - f, izb.m30429getXimpl(j) + f, izb.m30430getYimpl(j) + f);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final rud m33303Recttz77jQw(long j, long j2) {
        return new rud(izb.m30429getXimpl(j), izb.m30430getYimpl(j), izb.m30429getXimpl(j) + wpf.m33069getWidthimpl(j2), izb.m30430getYimpl(j) + wpf.m33066getHeightimpl(j2));
    }

    @f0g
    @yfb
    public static final rud lerp(@yfb rud rudVar, @yfb rud rudVar2, float f) {
        return new rud(m3a.lerp(rudVar.getLeft(), rudVar2.getLeft(), f), m3a.lerp(rudVar.getTop(), rudVar2.getTop(), f), m3a.lerp(rudVar.getRight(), rudVar2.getRight(), f), m3a.lerp(rudVar.getBottom(), rudVar2.getBottom(), f));
    }
}
