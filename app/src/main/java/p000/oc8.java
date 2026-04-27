package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class oc8 {

    /* JADX INFO: renamed from: a */
    public static final int f67185a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f67186b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f67187c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f67188d = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: oc8$a */
    @ck3(m4009c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m4010f = "Interruptible.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C10308a<T> extends ugg implements gz6<x13, zy2<? super T>, Object> {

        /* JADX INFO: renamed from: a */
        public int f67189a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f67190b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ny6<T> f67191c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10308a(ny6<? extends T> ny6Var, zy2<? super C10308a> zy2Var) {
            super(2, zy2Var);
            this.f67191c = ny6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C10308a c10308a = new C10308a(this.f67191c, zy2Var);
            c10308a.f67190b = obj;
            return c10308a;
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super T> zy2Var) {
            return ((C10308a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f67189a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return oc8.runInterruptibleInExpectedContext(((x13) this.f67190b).getCoroutineContext(), this.f67191c);
        }
    }

    @gib
    public static final <T> Object runInterruptible(@yfb e13 e13Var, @yfb ny6<? extends T> ny6Var, @yfb zy2<? super T> zy2Var) {
        return dg1.withContext(e13Var, new C10308a(ny6Var, null), zy2Var);
    }

    public static /* synthetic */ Object runInterruptible$default(e13 e13Var, ny6 ny6Var, zy2 zy2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = a05.f2a;
        }
        return runInterruptible(e13Var, ny6Var, zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T runInterruptibleInExpectedContext(e13 e13Var, ny6<? extends T> ny6Var) throws Throwable {
        try {
            pyg pygVar = new pyg();
            pygVar.setup(oj8.getJob(e13Var));
            try {
                return ny6Var.invoke();
            } finally {
                pygVar.clearInterrupt();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
