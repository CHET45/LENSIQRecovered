package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fe8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ssd f36285a;

    /* JADX INFO: renamed from: b */
    public final int f36286b;

    /* JADX INFO: renamed from: c */
    @gib
    public Object f36287c;

    public fe8(@yfb ssd ssdVar, int i, @gib Object obj) {
        this.f36285a = ssdVar;
        this.f36286b = i;
        this.f36287c = obj;
    }

    @gib
    public final Object getInstances() {
        return this.f36287c;
    }

    public final int getLocation() {
        return this.f36286b;
    }

    @yfb
    public final ssd getScope() {
        return this.f36285a;
    }

    public final boolean isInvalid() {
        return this.f36285a.isInvalidFor(this.f36287c);
    }

    public final void setInstances(@gib Object obj) {
        this.f36287c = obj;
    }
}
