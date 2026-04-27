package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ore {

    /* JADX INFO: renamed from: a */
    @yfb
    public final txe f68395a;

    /* JADX INFO: renamed from: b */
    public final int f68396b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final l78 f68397c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final mv8 f68398d;

    public ore(@yfb txe txeVar, int i, @yfb l78 l78Var, @yfb mv8 mv8Var) {
        this.f68395a = txeVar;
        this.f68396b = i;
        this.f68397c = l78Var;
        this.f68398d = mv8Var;
    }

    @yfb
    public final mv8 getCoordinates() {
        return this.f68398d;
    }

    public final int getDepth() {
        return this.f68396b;
    }

    @yfb
    public final txe getNode() {
        return this.f68395a;
    }

    @yfb
    public final l78 getViewportBoundsInWindow() {
        return this.f68397c;
    }

    @yfb
    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.f68395a + ", depth=" + this.f68396b + ", viewportBoundsInWindow=" + this.f68397c + ", coordinates=" + this.f68398d + ')';
    }
}
