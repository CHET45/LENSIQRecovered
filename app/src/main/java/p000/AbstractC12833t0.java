package p000;

/* JADX INFO: renamed from: t0 */
/* JADX INFO: loaded from: classes7.dex */
@la8
public abstract class AbstractC12833t0<T> extends sj8 implements jj8, zy2<T>, x13 {

    /* JADX INFO: renamed from: c */
    @yfb
    public final e13 f83292c;

    public AbstractC12833t0(@yfb e13 e13Var, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m22033i((jj8) e13Var.get(jj8.f50715A));
        }
        this.f83292c = e13Var.plus(this);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    @Override // p000.sj8
    @yfb
    /* JADX INFO: renamed from: c */
    public String mo22028c() {
        return kk3.getClassSimpleName(this) + " was cancelled";
    }

    @Override // p000.zy2
    @yfb
    public final e13 getContext() {
        return this.f83292c;
    }

    @Override // p000.x13
    @yfb
    public e13 getCoroutineContext() {
        return this.f83292c;
    }

    @Override // p000.sj8
    public final void handleOnCompletionException$kotlinx_coroutines_core(@yfb Throwable th) {
        q13.handleCoroutineException(this.f83292c, th);
    }

    @Override // p000.sj8, p000.jj8
    public boolean isActive() {
        return super.isActive();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.sj8
    /* JADX INFO: renamed from: l */
    public final void mo22035l(@gib Object obj) {
        if (!(obj instanceof ni2)) {
            onCompleted(obj);
        } else {
            ni2 ni2Var = (ni2) obj;
            mo11681p(ni2Var.f64635a, ni2Var.getHandled());
        }
    }

    @Override // p000.sj8
    @yfb
    public String nameString$kotlinx_coroutines_core() {
        String coroutineName = j13.getCoroutineName(this.f83292c);
        if (coroutineName == null) {
            return super.nameString$kotlinx_coroutines_core();
        }
        return '\"' + coroutineName + "\":" + super.nameString$kotlinx_coroutines_core();
    }

    /* JADX INFO: renamed from: o */
    public void mo10224o(@gib Object obj) {
        mo3831a(obj);
    }

    public void onCompleted(T t) {
    }

    /* JADX INFO: renamed from: p */
    public void mo11681p(@yfb Throwable th, boolean z) {
    }

    @Override // p000.zy2
    public final void resumeWith(@yfb Object obj) throws Throwable {
        Object objMakeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(ri2.toState(obj));
        if (objMakeCompletingOnce$kotlinx_coroutines_core == tj8.f85050b) {
            return;
        }
        mo10224o(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    public final <R> void start(@yfb b23 b23Var, R r, @yfb gz6<? super R, ? super zy2<? super T>, ? extends Object> gz6Var) {
        b23Var.invoke(gz6Var, r, this);
    }
}
