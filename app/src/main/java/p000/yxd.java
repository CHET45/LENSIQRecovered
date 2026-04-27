package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface yxd extends Executor {

    /* JADX INFO: renamed from: yxd$a */
    public class C15874a implements yxd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Executor f103281a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qu2 f103282b;

        public C15874a(Executor executor, qu2 qu2Var) {
            this.f103281a = executor;
            this.f103282b = qu2Var;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f103281a.execute(runnable);
        }

        @Override // p000.yxd
        public void release() {
            this.f103282b.accept(this.f103281a);
        }
    }

    static <T extends Executor> yxd from(T t, qu2<T> qu2Var) {
        return new C15874a(t, qu2Var);
    }

    void release();
}
