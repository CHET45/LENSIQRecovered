package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class j0g<T> implements zy2<T>, a23 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final zy2<T> f49316a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final e13 f49317b;

    /* JADX WARN: Multi-variable type inference failed */
    public j0g(@yfb zy2<? super T> zy2Var, @yfb e13 e13Var) {
        this.f49316a = zy2Var;
        this.f49317b = e13Var;
    }

    @Override // p000.a23
    @gib
    public a23 getCallerFrame() {
        zy2<T> zy2Var = this.f49316a;
        if (zy2Var instanceof a23) {
            return (a23) zy2Var;
        }
        return null;
    }

    @Override // p000.zy2
    @yfb
    public e13 getContext() {
        return this.f49317b;
    }

    @Override // p000.a23
    @gib
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p000.zy2
    public void resumeWith(@yfb Object obj) {
        this.f49316a.resumeWith(obj);
    }
}
