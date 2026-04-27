package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public final class hrh<R> extends irh<R> {

    /* JADX INFO: renamed from: C */
    @yfb
    public final fq1<R> f44669C;

    /* JADX INFO: renamed from: hrh$a */
    @ck3(m4009c = "kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1", m4010f = "SelectOld.kt", m4011i = {}, m4012l = {67}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C6985a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f44670a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ hrh<R> f44671b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6985a(hrh<R> hrhVar, zy2<? super C6985a> zy2Var) {
            super(2, zy2Var);
            this.f44671b = hrhVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C6985a(this.f44671b, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C6985a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f44670a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    hrh<R> hrhVar = this.f44671b;
                    this.f44670a = 1;
                    obj = hrhVar.doSelect(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                wve.resumeUndispatched(this.f44671b.f44669C, obj);
                return bth.f14751a;
            } catch (Throwable th) {
                wve.resumeUndispatchedWithException(this.f44671b.f44669C, th);
                return bth.f14751a;
            }
        }
    }

    public hrh(@yfb zy2<? super R> zy2Var) {
        super(zy2Var.getContext());
        this.f44669C = new fq1<>(od8.intercepted(zy2Var), 1);
    }

    @yjd
    public final void handleBuilderException(@yfb Throwable th) {
        fq1<R> fq1Var = this.f44669C;
        v7e.C13927a c13927a = v7e.f90266b;
        fq1Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(th)));
    }

    @gib
    @yjd
    public final Object initSelectResult() {
        if (this.f44669C.isCompleted()) {
            return this.f44669C.getResult();
        }
        fg1.launch$default(y13.CoroutineScope(getContext()), null, b23.f12444d, new C6985a(this, null), 1, null);
        return this.f44669C.getResult();
    }
}
