package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class wf4 {

    /* JADX INFO: renamed from: a */
    public static final int f94074a = 0;

    /* JADX INFO: renamed from: wf4$a */
    @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n*L\n1#1,497:1\n*E\n"})
    public static final class C14570a implements vf4 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<bth> f94075a;

        public C14570a(ny6<bth> ny6Var) {
            this.f94075a = ny6Var;
        }

        @Override // p000.vf4
        public void dispose() {
            this.f94075a.invoke();
        }
    }

    @yfb
    public final vf4 onDispose(@yfb ny6<bth> ny6Var) {
        return new C14570a(ny6Var);
    }
}
