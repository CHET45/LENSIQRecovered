package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
@la8
@dwf({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
public abstract class fu1<T> implements a17<T> {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final e13 f37754a;

    /* JADX INFO: renamed from: b */
    @un8
    public final int f37755b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public final gf1 f37756c;

    /* JADX INFO: renamed from: fu1$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m4010f = "ChannelFlow.kt", m4011i = {}, m4012l = {119}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5981a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f37757a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f37758b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t66<T> f37759c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fu1<T> f37760d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5981a(t66<? super T> t66Var, fu1<T> fu1Var, zy2<? super C5981a> zy2Var) {
            super(2, zy2Var);
            this.f37759c = t66Var;
            this.f37760d = fu1Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C5981a c5981a = new C5981a(this.f37759c, this.f37760d, zy2Var);
            c5981a.f37758b = obj;
            return c5981a;
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C5981a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f37757a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f37758b;
                t66<T> t66Var = this.f37759c;
                hsd<T> hsdVarProduceImpl = this.f37760d.produceImpl(x13Var);
                this.f37757a = 1;
                if (c76.emitAll(t66Var, hsdVarProduceImpl, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: fu1$b */
    @ck3(m4009c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m4010f = "ChannelFlow.kt", m4011i = {}, m4012l = {56}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C5982b extends ugg implements gz6<vdd<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f37761a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f37762b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fu1<T> f37763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5982b(fu1<T> fu1Var, zy2<? super C5982b> zy2Var) {
            super(2, zy2Var);
            this.f37763c = fu1Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C5982b c5982b = new C5982b(this.f37763c, zy2Var);
            c5982b.f37762b = obj;
            return c5982b;
        }

        @Override // p000.gz6
        public final Object invoke(vdd<? super T> vddVar, zy2<? super bth> zy2Var) {
            return ((C5982b) create(vddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f37761a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                vdd<? super T> vddVar = (vdd) this.f37762b;
                fu1<T> fu1Var = this.f37763c;
                this.f37761a = 1;
                if (fu1Var.mo8700c(vddVar, this) == coroutine_suspended) {
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

    public fu1(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        this.f37754a = e13Var;
        this.f37755b = i;
        this.f37756c = gf1Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ <T> Object m11187b(fu1<T> fu1Var, t66<? super T> t66Var, zy2<? super bth> zy2Var) {
        Object objCoroutineScope = y13.coroutineScope(new C5981a(t66Var, fu1Var, null), zy2Var);
        return objCoroutineScope == pd8.getCOROUTINE_SUSPENDED() ? objCoroutineScope : bth.f14751a;
    }

    @gib
    /* JADX INFO: renamed from: a */
    public String mo8699a() {
        return null;
    }

    @gib
    /* JADX INFO: renamed from: c */
    public abstract Object mo8700c(@yfb vdd<? super T> vddVar, @yfb zy2<? super bth> zy2Var);

    @Override // p000.y56
    @gib
    public Object collect(@yfb t66<? super T> t66Var, @yfb zy2<? super bth> zy2Var) {
        return m11187b(this, t66Var, zy2Var);
    }

    @yfb
    /* JADX INFO: renamed from: d */
    public abstract fu1<T> mo8701d(@yfb e13 e13Var, int i, @yfb gf1 gf1Var);

    @gib
    public y56<T> dropChannelOperators() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // p000.a17
    @p000.yfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.y56<T> fuse(@p000.yfb p000.e13 r2, int r3, @p000.yfb p000.gf1 r4) {
        /*
            r1 = this;
            e13 r0 = r1.f37754a
            e13 r2 = r2.plus(r0)
            gf1 r0 = p000.gf1.f39657a
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f37755b
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            gf1 r4 = r1.f37756c
        L25:
            e13 r0 = r1.f37754a
            boolean r0 = p000.md8.areEqual(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f37755b
            if (r3 != r0) goto L36
            gf1 r0 = r1.f37756c
            if (r4 != r0) goto L36
            return r1
        L36:
            fu1 r2 = r1.mo8701d(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fu1.fuse(e13, int, gf1):y56");
    }

    @yfb
    public final gz6<vdd<? super T>, zy2<? super bth>, Object> getCollectToFun$kotlinx_coroutines_core() {
        return new C5982b(this, null);
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
        int i = this.f37755b;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    @yfb
    public hsd<T> produceImpl(@yfb x13 x13Var) {
        return rdd.produce$default(x13Var, this.f37754a, getProduceCapacity$kotlinx_coroutines_core(), this.f37756c, b23.f12443c, null, getCollectToFun$kotlinx_coroutines_core(), 16, null);
    }

    @yfb
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo8699a = mo8699a();
        if (strMo8699a != null) {
            arrayList.add(strMo8699a);
        }
        if (this.f37754a != a05.f2a) {
            arrayList.add("context=" + this.f37754a);
        }
        if (this.f37755b != -3) {
            arrayList.add("capacity=" + this.f37755b);
        }
        if (this.f37756c != gf1.f39657a) {
            arrayList.add("onBufferOverflow=" + this.f37756c);
        }
        return kk3.getClassSimpleName(this) + C4584d2.f28242k + v82.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + C4584d2.f28243l;
    }
}
