package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xd3<T> implements jmg<T> {

    /* JADX INFO: renamed from: a */
    public final int f97550a;

    /* JADX INFO: renamed from: b */
    public final int f97551b;

    /* JADX INFO: renamed from: c */
    @hib
    public q3e f97552c;

    public xd3() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p000.jmg
    @hib
    public final q3e getRequest() {
        return this.f97552c;
    }

    @Override // p000.jmg
    public final void getSize(@efb gqf gqfVar) {
        gqfVar.onSizeReady(this.f97550a, this.f97551b);
    }

    @Override // p000.e59
    public void onDestroy() {
    }

    @Override // p000.jmg
    public void onLoadFailed(@hib Drawable drawable) {
    }

    @Override // p000.jmg
    public void onLoadStarted(@hib Drawable drawable) {
    }

    @Override // p000.e59
    public void onStart() {
    }

    @Override // p000.e59
    public void onStop() {
    }

    @Override // p000.jmg
    public final void removeCallback(@efb gqf gqfVar) {
    }

    @Override // p000.jmg
    public final void setRequest(@hib q3e q3eVar) {
        this.f97552c = q3eVar;
    }

    public xd3(int i, int i2) {
        if (v0i.isValidDimensions(i, i2)) {
            this.f97550a = i;
            this.f97551b = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
