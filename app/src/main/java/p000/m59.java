package p000;

import androidx.lifecycle.AbstractC1143j;

/* JADX INFO: loaded from: classes3.dex */
@e0g(parameters = 0)
public final class m59 implements g59 {

    /* JADX INFO: renamed from: b */
    public static final int f59935b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final AbstractC1143j f59936a;

    /* JADX INFO: renamed from: m59$a */
    @dwf({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleStartStopEffectScope$onStopOrDispose$1\n*L\n1#1,747:1\n*E\n"})
    public static final class C9146a implements n59 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<g59, bth> f59937a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ m59 f59938b;

        /* JADX WARN: Multi-variable type inference failed */
        public C9146a(qy6<? super g59, bth> qy6Var, m59 m59Var) {
            this.f59937a = qy6Var;
            this.f59938b = m59Var;
        }

        @Override // p000.n59
        public void runStopOrDisposeEffect() {
            this.f59937a.invoke(this.f59938b);
        }
    }

    public m59(@yfb AbstractC1143j abstractC1143j) {
        this.f59936a = abstractC1143j;
    }

    @Override // p000.g59
    @yfb
    public AbstractC1143j getLifecycle() {
        return this.f59936a;
    }

    @yfb
    public final n59 onStopOrDispose(@yfb qy6<? super g59, bth> qy6Var) {
        return new C9146a(qy6Var, this);
    }
}
