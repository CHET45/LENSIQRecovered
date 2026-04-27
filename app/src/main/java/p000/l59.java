package p000;

import androidx.lifecycle.AbstractC1143j;

/* JADX INFO: loaded from: classes3.dex */
@e0g(parameters = 0)
public final class l59 implements g59 {

    /* JADX INFO: renamed from: b */
    public static final int f56198b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final AbstractC1143j f56199a;

    /* JADX INFO: renamed from: l59$a */
    @dwf({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleResumePauseEffectScope$onPauseOrDispose$1\n*L\n1#1,747:1\n*E\n"})
    public static final class C8616a implements i59 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<g59, bth> f56200a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l59 f56201b;

        /* JADX WARN: Multi-variable type inference failed */
        public C8616a(qy6<? super g59, bth> qy6Var, l59 l59Var) {
            this.f56200a = qy6Var;
            this.f56201b = l59Var;
        }

        @Override // p000.i59
        public void runPauseOrOnDisposeEffect() {
            this.f56200a.invoke(this.f56201b);
        }
    }

    public l59(@yfb AbstractC1143j abstractC1143j) {
        this.f56199a = abstractC1143j;
    }

    @Override // p000.g59
    @yfb
    public AbstractC1143j getLifecycle() {
        return this.f56199a;
    }

    @yfb
    public final i59 onPauseOrDispose(@yfb qy6<? super g59, bth> qy6Var) {
        return new C8616a(qy6Var, this);
    }
}
