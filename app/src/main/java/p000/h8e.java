package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nExecutors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Executors.kt\nkotlinx/coroutines/ResumeUndispatchedRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
public final class h8e implements Runnable {

    /* JADX INFO: renamed from: a */
    @yfb
    public final m13 f42929a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final dq1<bth> f42930b;

    /* JADX WARN: Multi-variable type inference failed */
    public h8e(@yfb m13 m13Var, @yfb dq1<? super bth> dq1Var) {
        this.f42929a = m13Var;
        this.f42930b = dq1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f42930b.resumeUndispatched(this.f42929a, bth.f14751a);
    }
}
