package p000;

import p000.dz2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ju1<S, T> extends fu1<T> {

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public final y56<S> f51828d;

    /* JADX INFO: renamed from: ju1$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m4010f = "ChannelFlow.kt", m4011i = {}, m4012l = {148}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C8084a extends ugg implements gz6<t66<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f51829a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f51830b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ju1<S, T> f51831c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8084a(ju1<S, T> ju1Var, zy2<? super C8084a> zy2Var) {
            super(2, zy2Var);
            this.f51831c = ju1Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C8084a c8084a = new C8084a(this.f51831c, zy2Var);
            c8084a.f51830b = obj;
            return c8084a;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            return ((C8084a) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f51829a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66<? super T> t66Var = (t66) this.f51830b;
                ju1<S, T> ju1Var = this.f51831c;
                this.f51829a = 1;
                if (ju1Var.mo14309g(t66Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ju1(@yfb y56<? extends S> y56Var, @yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        super(e13Var, i, gf1Var);
        this.f51828d = y56Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectWithContextUndispatched(t66<? super T> t66Var, e13 e13Var, zy2<? super bth> zy2Var) {
        return hu1.withContextUndispatched$default(e13Var, hu1.withUndispatchedContextCollector(t66Var, zy2Var.getContext()), null, new C8084a(this, null), zy2Var, 4, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ <S, T> Object m14307e(ju1<S, T> ju1Var, t66<? super T> t66Var, zy2<? super bth> zy2Var) {
        if (ju1Var.f37755b == -3) {
            e13 context = zy2Var.getContext();
            e13 e13VarNewCoroutineContext = j13.newCoroutineContext(context, ju1Var.f37754a);
            if (md8.areEqual(e13VarNewCoroutineContext, context)) {
                Object objMo14309g = ju1Var.mo14309g(t66Var, zy2Var);
                return objMo14309g == pd8.getCOROUTINE_SUSPENDED() ? objMo14309g : bth.f14751a;
            }
            dz2.C5021b c5021b = dz2.f31343s;
            if (md8.areEqual(e13VarNewCoroutineContext.get(c5021b), context.get(c5021b))) {
                Object objCollectWithContextUndispatched = ju1Var.collectWithContextUndispatched(t66Var, e13VarNewCoroutineContext, zy2Var);
                return objCollectWithContextUndispatched == pd8.getCOROUTINE_SUSPENDED() ? objCollectWithContextUndispatched : bth.f14751a;
            }
        }
        Object objCollect = super.collect(t66Var, zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ <S, T> Object m14308f(ju1<S, T> ju1Var, vdd<? super T> vddVar, zy2<? super bth> zy2Var) {
        Object objMo14309g = ju1Var.mo14309g(new tye(vddVar), zy2Var);
        return objMo14309g == pd8.getCOROUTINE_SUSPENDED() ? objMo14309g : bth.f14751a;
    }

    @Override // p000.fu1
    @gib
    /* JADX INFO: renamed from: c */
    public Object mo8700c(@yfb vdd<? super T> vddVar, @yfb zy2<? super bth> zy2Var) {
        return m14308f(this, vddVar, zy2Var);
    }

    @Override // p000.fu1, p000.y56
    @gib
    public Object collect(@yfb t66<? super T> t66Var, @yfb zy2<? super bth> zy2Var) {
        return m14307e(this, t66Var, zy2Var);
    }

    @gib
    /* JADX INFO: renamed from: g */
    public abstract Object mo14309g(@yfb t66<? super T> t66Var, @yfb zy2<? super bth> zy2Var);

    @Override // p000.fu1
    @yfb
    public String toString() {
        return this.f51828d + " -> " + super.toString();
    }
}
