package p000;

import androidx.lifecycle.AbstractC1158q;
import java.time.Duration;
import p000.a32;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "FlowLiveDataConversions")
public final class c86 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: c86$a */
    @ck3(m4009c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m4010f = "FlowLiveData.kt", m4011i = {0, 1}, m4012l = {107, 112, 114}, m4013m = "invokeSuspend", m4014n = {"observer", "observer"}, m4015s = {"L$0", "L$0"})
    public static final class C2233a<T> extends ugg implements gz6<vdd<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f15951a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f15952b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC1158q<T> f15953c;

        /* JADX INFO: renamed from: c86$a$a */
        @ck3(m4009c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m4010f = "FlowLiveData.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f15954a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC1158q<T> f15955b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qxb<T> f15956c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC1158q<T> abstractC1158q, qxb<T> qxbVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f15955b = abstractC1158q;
                this.f15956c = qxbVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f15955b, this.f15956c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f15954a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                this.f15955b.observeForever((qxb<? super T>) this.f15956c);
                return bth.f14751a;
            }
        }

        /* JADX INFO: renamed from: c86$a$b */
        @ck3(m4009c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", m4010f = "FlowLiveData.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f15957a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC1158q<T> f15958b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ qxb<T> f15959c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC1158q<T> abstractC1158q, qxb<T> qxbVar, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f15958b = abstractC1158q;
                this.f15959c = qxbVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new b(this.f15958b, this.f15959c, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f15957a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                this.f15958b.removeObserver((qxb<? super T>) this.f15959c);
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2233a(AbstractC1158q<T> abstractC1158q, zy2<? super C2233a> zy2Var) {
            super(2, zy2Var);
            this.f15953c = abstractC1158q;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C2233a c2233a = new C2233a(this.f15953c, zy2Var);
            c2233a.f15952b = obj;
            return c2233a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb vdd<? super T> vddVar, @gib zy2<? super bth> zy2Var) {
            return ((C2233a) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [qxb] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) throws Throwable {
            qxb qxbVar;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f15951a;
            try {
                if (r1 == 0) {
                    y7e.throwOnFailure(obj);
                    final vdd vddVar = (vdd) this.f15952b;
                    qxb qxbVar2 = new qxb() { // from class: b86
                        @Override // p000.qxb
                        public final void onChanged(Object obj2) {
                            vddVar.mo28705trySendJP2dKIU(obj2);
                        }
                    };
                    dr9 immediate = df4.getMain().getImmediate();
                    a aVar = new a(this.f15953c, qxbVar2, null);
                    this.f15952b = qxbVar2;
                    this.f15951a = 1;
                    qxbVar = qxbVar2;
                    if (dg1.withContext(immediate, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r1 != 1) {
                        if (r1 == 2) {
                            qxb qxbVar3 = (qxb) this.f15952b;
                            y7e.throwOnFailure(obj);
                            r1 = qxbVar3;
                            throw new us8();
                        }
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.f15952b;
                        y7e.throwOnFailure(obj);
                        throw th;
                    }
                    qxb qxbVar4 = (qxb) this.f15952b;
                    y7e.throwOnFailure(obj);
                    qxbVar = qxbVar4;
                }
                this.f15952b = qxbVar;
                this.f15951a = 2;
                r1 = qxbVar;
                if (p34.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new us8();
            } catch (Throwable th2) {
                e13 e13VarPlus = df4.getMain().getImmediate().plus(web.f94038b);
                b bVar = new b(this.f15953c, r1, null);
                this.f15952b = th2;
                this.f15951a = 3;
                if (dg1.withContext(e13VarPlus, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: c86$b */
    @ck3(m4009c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m4010f = "FlowLiveData.kt", m4011i = {}, m4012l = {78}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C2234b<T> extends ugg implements gz6<lb9<T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f15960a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f15961b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y56<T> f15962c;

        /* JADX INFO: renamed from: c86$b$a */
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ lb9<T> f15963a;

            public a(lb9<T> lb9Var) {
                this.f15963a = lb9Var;
            }

            @Override // p000.t66
            @gib
            public final Object emit(T t, @yfb zy2<? super bth> zy2Var) {
                Object objEmit = this.f15963a.emit(t, zy2Var);
                return objEmit == pd8.getCOROUTINE_SUSPENDED() ? objEmit : bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2234b(y56<? extends T> y56Var, zy2<? super C2234b> zy2Var) {
            super(2, zy2Var);
            this.f15962c = y56Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C2234b c2234b = new C2234b(this.f15962c, zy2Var);
            c2234b.f15961b = obj;
            return c2234b;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb lb9<T> lb9Var, @gib zy2<? super bth> zy2Var) {
            return ((C2234b) create(lb9Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f15960a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                lb9 lb9Var = (lb9) this.f15961b;
                y56<T> y56Var = this.f15962c;
                a aVar = new a(lb9Var);
                this.f15960a = 1;
                if (y56Var.collect(aVar, this) == coroutine_suspended) {
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

    @yfb
    public static final <T> y56<T> asFlow(@yfb AbstractC1158q<T> abstractC1158q) {
        md8.checkNotNullParameter(abstractC1158q, "<this>");
        return c76.conflate(c76.callbackFlow(new C2233a(abstractC1158q, null)));
    }

    @yfb
    @yn8
    public static final <T> AbstractC1158q<T> asLiveData(@yfb y56<? extends T> y56Var) {
        md8.checkNotNullParameter(y56Var, "<this>");
        return asLiveData$default(y56Var, (e13) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ AbstractC1158q asLiveData$default(y56 y56Var, e13 e13Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = a05.f2a;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return asLiveData(y56Var, e13Var, j);
    }

    @yfb
    @yn8
    public static final <T> AbstractC1158q<T> asLiveData(@yfb y56<? extends T> y56Var, @yfb e13 e13Var) {
        md8.checkNotNullParameter(y56Var, "<this>");
        md8.checkNotNullParameter(e13Var, "context");
        return asLiveData$default(y56Var, e13Var, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    @yn8
    public static final <T> AbstractC1158q<T> asLiveData(@yfb y56<? extends T> y56Var, @yfb e13 e13Var, long j) {
        md8.checkNotNullParameter(y56Var, "<this>");
        md8.checkNotNullParameter(e13Var, "context");
        abe abeVar = (AbstractC1158q<T>) t13.liveData(e13Var, j, new C2234b(y56Var, null));
        if (y56Var instanceof l2g) {
            if (a50.getInstance().isMainThread()) {
                abeVar.setValue(((l2g) y56Var).getValue());
            } else {
                abeVar.postValue(((l2g) y56Var).getValue());
            }
        }
        return abeVar;
    }

    public static /* synthetic */ AbstractC1158q asLiveData$default(y56 y56Var, Duration duration, e13 e13Var, int i, Object obj) {
        if ((i & 2) != 0) {
            e13Var = a05.f2a;
        }
        return asLiveData(y56Var, duration, e13Var);
    }

    @c5e(26)
    @yfb
    public static final <T> AbstractC1158q<T> asLiveData(@yfb y56<? extends T> y56Var, @yfb Duration duration, @yfb e13 e13Var) {
        md8.checkNotNullParameter(y56Var, "<this>");
        md8.checkNotNullParameter(duration, a32.C0034g.f248b);
        md8.checkNotNullParameter(e13Var, "context");
        return asLiveData(y56Var, e13Var, n00.f62879a.toMillis(duration));
    }
}
