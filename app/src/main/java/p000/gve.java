package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class gve<R> extends ove<R> {

    /* JADX INFO: renamed from: m */
    @yfb
    public final fq1<R> f41484m;

    /* JADX INFO: renamed from: gve$a */
    @ck3(m4009c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", m4010f = "SelectOld.kt", m4011i = {}, m4012l = {39}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C6595a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f41485a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gve<R> f41486b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6595a(gve<R> gveVar, zy2<? super C6595a> zy2Var) {
            super(2, zy2Var);
            this.f41486b = gveVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C6595a(this.f41486b, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C6595a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f41485a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    gve<R> gveVar = this.f41486b;
                    this.f41485a = 1;
                    obj = gveVar.doSelect(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                wve.resumeUndispatched(this.f41486b.f41484m, obj);
                return bth.f14751a;
            } catch (Throwable th) {
                wve.resumeUndispatchedWithException(this.f41486b.f41484m, th);
                return bth.f14751a;
            }
        }
    }

    public gve(@yfb zy2<? super R> zy2Var) {
        super(zy2Var.getContext());
        this.f41484m = new fq1<>(od8.intercepted(zy2Var), 1);
    }

    @gib
    @yjd
    public final Object getResult() {
        if (this.f41484m.isCompleted()) {
            return this.f41484m.getResult();
        }
        fg1.launch$default(y13.CoroutineScope(getContext()), null, b23.f12444d, new C6595a(this, null), 1, null);
        return this.f41484m.getResult();
    }

    @yjd
    public final void handleBuilderException(@yfb Throwable th) {
        fq1<R> fq1Var = this.f41484m;
        v7e.C13927a c13927a = v7e.f90266b;
        fq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(th)));
    }
}
