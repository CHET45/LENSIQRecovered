package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class zf8 extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final int f105002a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final C12364ry<Float, C14294vy> f105003b;

    public zf8(int i, @yfb C12364ry<Float, C14294vy> c12364ry) {
        this.f105002a = i;
        this.f105003b = c12364ry;
    }

    public final int getItemOffset() {
        return this.f105002a;
    }

    @yfb
    public final C12364ry<Float, C14294vy> getPreviousAnimation() {
        return this.f105003b;
    }
}
