package p000;

import java.util.concurrent.CancellationException;
import p000.jj8;
import p000.jvd;
import p000.nye;

/* JADX INFO: loaded from: classes.dex */
public final class u1c {

    /* JADX INFO: renamed from: a */
    public final boolean f86556a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final au1<on0> f86557b = nu1.Channel$default(-2, gf1.f39657a, null, 4, null);

    /* JADX INFO: renamed from: c */
    @yfb
    public final jj8 f86558c;

    /* JADX INFO: renamed from: u1c$a */
    @ck3(m4009c = "androidx.activity.compose.OnBackInstance$job$1", m4010f = "PredictiveBackHandler.kt", m4011i = {0}, m4012l = {154}, m4013m = "invokeSuspend", m4014n = {"completed"}, m4015s = {"L$0"})
    public static final class C13319a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f86559a;

        /* JADX INFO: renamed from: b */
        public int f86560b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<y56<on0>, zy2<? super bth>, Object> f86561c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ u1c f86562d;

        /* JADX INFO: renamed from: u1c$a$a */
        @ck3(m4009c = "androidx.activity.compose.OnBackInstance$job$1$1", m4010f = "PredictiveBackHandler.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements kz6<t66<? super on0>, Throwable, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f86563a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jvd.C8114a f86564b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jvd.C8114a c8114a, zy2<? super a> zy2Var) {
                super(3, zy2Var);
                this.f86564b = c8114a;
            }

            @Override // p000.kz6
            @gib
            public final Object invoke(@yfb t66<? super on0> t66Var, @gib Throwable th, @gib zy2<? super bth> zy2Var) {
                return new a(this.f86564b, zy2Var).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f86563a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                this.f86564b.f52103a = true;
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13319a(gz6<? super y56<on0>, ? super zy2<? super bth>, ? extends Object> gz6Var, u1c u1cVar, zy2<? super C13319a> zy2Var) {
            super(2, zy2Var);
            this.f86561c = gz6Var;
            this.f86562d = u1cVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C13319a(this.f86561c, this.f86562d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13319a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            jvd.C8114a c8114a;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f86560b;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                jvd.C8114a c8114a2 = new jvd.C8114a();
                gz6<y56<on0>, zy2<? super bth>, Object> gz6Var = this.f86561c;
                y56<on0> y56VarOnCompletion = c76.onCompletion(c76.consumeAsFlow(this.f86562d.getChannel()), new a(c8114a2, null));
                this.f86559a = c8114a2;
                this.f86560b = 1;
                if (gz6Var.invoke(y56VarOnCompletion, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c8114a = c8114a2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8114a = (jvd.C8114a) this.f86559a;
                y7e.throwOnFailure(obj);
            }
            if (c8114a.f52103a) {
                return bth.f14751a;
            }
            throw new IllegalStateException("You must collect the progress flow");
        }
    }

    public u1c(@yfb x13 x13Var, boolean z, @yfb gz6<? super y56<on0>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        this.f86556a = z;
        this.f86558c = fg1.launch$default(x13Var, null, null, new C13319a(gz6Var, this, null), 3, null);
    }

    public final void cancel() {
        this.f86557b.cancel(new CancellationException("onBack cancelled"));
        jj8.C7916a.cancel$default(this.f86558c, (CancellationException) null, 1, (Object) null);
    }

    public final boolean close() {
        return nye.C10119a.close$default(this.f86557b, null, 1, null);
    }

    @yfb
    public final au1<on0> getChannel() {
        return this.f86557b;
    }

    @yfb
    public final jj8 getJob() {
        return this.f86558c;
    }

    public final boolean isPredictiveBack() {
        return this.f86556a;
    }

    @yfb
    /* JADX INFO: renamed from: send-JP2dKIU, reason: not valid java name */
    public final Object m32522sendJP2dKIU(@yfb on0 on0Var) {
        return this.f86557b.mo28705trySendJP2dKIU(on0Var);
    }
}
