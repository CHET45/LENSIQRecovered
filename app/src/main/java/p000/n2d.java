package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public abstract class n2d {

    /* JADX INFO: renamed from: c */
    public static final int f63064c = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public mv8 f63065a;

    /* JADX INFO: renamed from: b */
    public boolean f63066b;

    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    @gib
    public final mv8 getLayoutCoordinates$ui_release() {
        return this.f63065a;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m31118getSizeYbymL2g() {
        mv8 mv8Var = this.f63065a;
        return mv8Var != null ? mv8Var.mo30031getSizeYbymL2g() : r78.f77324b.m32092getZeroYbymL2g();
    }

    public final boolean isAttached$ui_release() {
        return this.f63066b;
    }

    public abstract void onCancel();

    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public abstract void mo31119onPointerEventH0pRuoY(@yfb t1d t1dVar, @yfb v1d v1dVar, long j);

    public final void setAttached$ui_release(boolean z) {
        this.f63066b = z;
    }

    public final void setLayoutCoordinates$ui_release(@gib mv8 mv8Var) {
        this.f63065a = mv8Var;
    }
}
