package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v22 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final u8i f89719a;

    /* JADX INFO: renamed from: b */
    public int f89720b;

    /* JADX INFO: renamed from: c */
    @gib
    public h2d f89721c;

    public v22(@yfb u8i u8iVar) {
        this.f89719a = u8iVar;
    }

    public final int getClicks() {
        return this.f89720b;
    }

    @gib
    public final h2d getPrevClick() {
        return this.f89721c;
    }

    public final boolean positionIsTolerable(@yfb h2d h2dVar, @yfb h2d h2dVar2) {
        return rwe.distanceIsTolerable(this.f89719a, h2dVar, h2dVar2);
    }

    public final void setClicks(int i) {
        this.f89720b = i;
    }

    public final void setPrevClick(@gib h2d h2dVar) {
        this.f89721c = h2dVar;
    }

    public final boolean timeIsTolerable(@yfb h2d h2dVar, @yfb h2d h2dVar2) {
        return h2dVar2.getUptimeMillis() - h2dVar.getUptimeMillis() < this.f89719a.getDoubleTapTimeoutMillis();
    }

    public final void update(@yfb t1d t1dVar) {
        h2d h2dVar = this.f89721c;
        h2d h2dVar2 = t1dVar.getChanges().get(0);
        if (h2dVar != null && timeIsTolerable(h2dVar, h2dVar2) && positionIsTolerable(h2dVar, h2dVar2)) {
            this.f89720b++;
        } else {
            this.f89720b = 1;
        }
        this.f89721c = h2dVar2;
    }
}
