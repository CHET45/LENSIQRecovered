package p000;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class ke7 {

    /* JADX INFO: renamed from: ke7$a */
    @dwf({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postAtTime$runnable$1\n*L\n1#1,69:1\n*E\n"})
    public static final class RunnableC8314a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<bth> f53735a;

        public RunnableC8314a(ny6<bth> ny6Var) {
            this.f53735a = ny6Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f53735a.invoke();
        }
    }

    /* JADX INFO: renamed from: ke7$b */
    @dwf({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postDelayed$runnable$1\n*L\n1#1,69:1\n*E\n"})
    public static final class RunnableC8315b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<bth> f53736a;

        public RunnableC8315b(ny6<bth> ny6Var) {
            this.f53736a = ny6Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f53736a.invoke();
        }
    }

    @yfb
    public static final Runnable postAtTime(@yfb Handler handler, long j, @gib Object obj, @yfb ny6<bth> ny6Var) {
        RunnableC8314a runnableC8314a = new RunnableC8314a(ny6Var);
        handler.postAtTime(runnableC8314a, obj, j);
        return runnableC8314a;
    }

    public static /* synthetic */ Runnable postAtTime$default(Handler handler, long j, Object obj, ny6 ny6Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        RunnableC8314a runnableC8314a = new RunnableC8314a(ny6Var);
        handler.postAtTime(runnableC8314a, obj, j);
        return runnableC8314a;
    }

    @yfb
    public static final Runnable postDelayed(@yfb Handler handler, long j, @gib Object obj, @yfb ny6<bth> ny6Var) {
        RunnableC8315b runnableC8315b = new RunnableC8315b(ny6Var);
        if (obj == null) {
            handler.postDelayed(runnableC8315b, j);
        } else {
            de7.postDelayed(handler, runnableC8315b, obj, j);
        }
        return runnableC8315b;
    }

    public static /* synthetic */ Runnable postDelayed$default(Handler handler, long j, Object obj, ny6 ny6Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        RunnableC8315b runnableC8315b = new RunnableC8315b(ny6Var);
        if (obj == null) {
            handler.postDelayed(runnableC8315b, j);
        } else {
            de7.postDelayed(handler, runnableC8315b, obj, j);
        }
        return runnableC8315b;
    }
}
