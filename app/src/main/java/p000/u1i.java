package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public abstract class u1i {

    /* JADX INFO: renamed from: b */
    public static final int f86574b = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public qy6<? super u1i, bth> f86575a;

    public /* synthetic */ u1i(jt3 jt3Var) {
        this();
    }

    public abstract void draw(@yfb ip4 ip4Var);

    @gib
    public qy6<u1i, bth> getInvalidateListener$ui_release() {
        return this.f86575a;
    }

    public final void invalidate() {
        qy6<u1i, bth> invalidateListener$ui_release = getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke(this);
        }
    }

    public void setInvalidateListener$ui_release(@gib qy6<? super u1i, bth> qy6Var) {
        this.f86575a = qy6Var;
    }

    private u1i() {
    }
}
