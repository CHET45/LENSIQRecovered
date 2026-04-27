package p000;

import java.util.concurrent.CancellationException;
import p000.lo1;

/* JADX INFO: loaded from: classes3.dex */
public final class c13 {

    /* JADX INFO: renamed from: c13$a */
    public static final class C2146a extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ lo1.C8911a<T> f15456a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ a34<T> f15457b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2146a(lo1.C8911a<T> c8911a, a34<? extends T> a34Var) {
            super(1);
            this.f15456a = c8911a;
            this.f15457b = a34Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th == null) {
                this.f15456a.set((T) this.f15457b.getCompleted());
            } else if (th instanceof CancellationException) {
                this.f15456a.setCancelled();
            } else {
                this.f15456a.setException(th);
            }
        }
    }

    @yfb
    public static final <T> ja9<T> asListenableFuture(@yfb final a34<? extends T> a34Var, @gib final Object obj) {
        md8.checkNotNullParameter(a34Var, "<this>");
        ja9<T> future = lo1.getFuture(new lo1.InterfaceC8913c() { // from class: b13
            @Override // p000.lo1.InterfaceC8913c
            public final Object attachCompleter(lo1.C8911a c8911a) {
                return c13.asListenableFuture$lambda$0(a34Var, obj, c8911a);
            }
        });
        md8.checkNotNullExpressionValue(future, "getFuture { completer ->…      }\n        tag\n    }");
        return future;
    }

    public static /* synthetic */ ja9 asListenableFuture$default(a34 a34Var, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(a34Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asListenableFuture$lambda$0(a34 a34Var, Object obj, lo1.C8911a c8911a) {
        md8.checkNotNullParameter(a34Var, "$this_asListenableFuture");
        md8.checkNotNullParameter(c8911a, "completer");
        a34Var.invokeOnCompletion(new C2146a(c8911a, a34Var));
        return obj;
    }
}
