package p000;

import p000.AbstractC16313zy;

/* JADX INFO: renamed from: ny */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 4)
public final class C10113ny<T, V extends AbstractC16313zy> {

    /* JADX INFO: renamed from: c */
    public static final int f65992c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C12364ry<T, V> f65993a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final EnumC7662iy f65994b;

    public C10113ny(@yfb C12364ry<T, V> c12364ry, @yfb EnumC7662iy enumC7662iy) {
        this.f65993a = c12364ry;
        this.f65994b = enumC7662iy;
    }

    @yfb
    public final EnumC7662iy getEndReason() {
        return this.f65994b;
    }

    @yfb
    public final C12364ry<T, V> getEndState() {
        return this.f65993a;
    }

    @yfb
    public String toString() {
        return "AnimationResult(endReason=" + this.f65994b + ", endState=" + this.f65993a + ')';
    }
}
