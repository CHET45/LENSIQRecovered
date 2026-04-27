package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class pde {

    /* JADX INFO: renamed from: pde$a */
    public static final class RunnableC10923a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<bth> f70499a;

        public RunnableC10923a(ny6<bth> ny6Var) {
            this.f70499a = ny6Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f70499a.invoke();
        }
    }

    @yfb
    public static final Runnable Runnable(@yfb ny6<bth> ny6Var) {
        return new RunnableC10923a(ny6Var);
    }
}
