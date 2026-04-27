package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class rj8 extends lh9 implements yf4, iz7 {

    /* JADX INFO: renamed from: d */
    public sj8 f78455d;

    @Override // p000.yf4
    public void dispose() {
        getJob().removeNode$kotlinx_coroutines_core(this);
    }

    @yfb
    public final sj8 getJob() {
        sj8 sj8Var = this.f78455d;
        if (sj8Var != null) {
            return sj8Var;
        }
        md8.throwUninitializedPropertyAccessException("job");
        return null;
    }

    @Override // p000.iz7
    @gib
    public meb getList() {
        return null;
    }

    public abstract boolean getOnCancelling();

    public abstract void invoke(@gib Throwable th);

    @Override // p000.iz7
    public boolean isActive() {
        return true;
    }

    public final void setJob(@yfb sj8 sj8Var) {
        this.f78455d = sj8Var;
    }

    @Override // p000.lh9
    @yfb
    public String toString() {
        return kk3.getClassSimpleName(this) + '@' + kk3.getHexAddress(this) + "[job@" + kk3.getHexAddress(getJob()) + C4584d2.f28243l;
    }
}
