package p000;

/* JADX INFO: loaded from: classes7.dex */
public class uqe<T> extends AbstractC12833t0<T> implements a23 {

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public final zy2<T> f88815d;

    /* JADX WARN: Multi-variable type inference failed */
    public uqe(@yfb e13 e13Var, @yfb zy2<? super T> zy2Var) {
        super(e13Var, true, true);
        this.f88815d = zy2Var;
    }

    @Override // p000.sj8
    /* JADX INFO: renamed from: a */
    public void mo3831a(@gib Object obj) {
        we4.resumeCancellableWith(od8.intercepted(this.f88815d), ri2.recoverResult(obj, this.f88815d));
    }

    @Override // p000.a23
    @gib
    public final a23 getCallerFrame() {
        zy2<T> zy2Var = this.f88815d;
        if (zy2Var instanceof a23) {
            return (a23) zy2Var;
        }
        return null;
    }

    @Override // p000.a23
    @gib
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p000.sj8
    /* JADX INFO: renamed from: j */
    public final boolean mo3832j() {
        return true;
    }

    @Override // p000.AbstractC12833t0
    /* JADX INFO: renamed from: o */
    public void mo10224o(@gib Object obj) {
        zy2<T> zy2Var = this.f88815d;
        zy2Var.resumeWith(ri2.recoverResult(obj, zy2Var));
    }
}
