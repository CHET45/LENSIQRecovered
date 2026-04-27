package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1863#2,2:97\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n91#1:97,2\n*E\n"})
public final class ou1<T> extends fu1<T> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final Iterable<y56<T>> f68748d;

    /* JADX INFO: renamed from: ou1$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", m4010f = "Merge.kt", m4011i = {}, m4012l = {92}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C10655a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f68749a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y56<T> f68750b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ tye<T> f68751c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10655a(y56<? extends T> y56Var, tye<T> tyeVar, zy2<? super C10655a> zy2Var) {
            super(2, zy2Var);
            this.f68750b = y56Var;
            this.f68751c = tyeVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C10655a(this.f68750b, this.f68751c, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C10655a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f68749a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                y56<T> y56Var = this.f68750b;
                tye<T> tyeVar = this.f68751c;
                this.f68749a = 1;
                if (y56Var.collect(tyeVar, this) == coroutine_suspended) {
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

    public /* synthetic */ ou1(Iterable iterable, e13 e13Var, int i, gf1 gf1Var, int i2, jt3 jt3Var) {
        this(iterable, (i2 & 2) != 0 ? a05.f2a : e13Var, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? gf1.f39657a : gf1Var);
    }

    @Override // p000.fu1
    @gib
    /* JADX INFO: renamed from: c */
    public Object mo8700c(@yfb vdd<? super T> vddVar, @yfb zy2<? super bth> zy2Var) {
        tye tyeVar = new tye(vddVar);
        Iterator<y56<T>> it = this.f68748d.iterator();
        while (it.hasNext()) {
            fg1.launch$default(vddVar, null, null, new C10655a(it.next(), tyeVar, null), 3, null);
        }
        return bth.f14751a;
    }

    @Override // p000.fu1
    @yfb
    /* JADX INFO: renamed from: d */
    public fu1<T> mo8701d(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return new ou1(this.f68748d, e13Var, i, gf1Var);
    }

    @Override // p000.fu1
    @yfb
    public hsd<T> produceImpl(@yfb x13 x13Var) {
        return rdd.produce(x13Var, this.f37754a, this.f37755b, getCollectToFun$kotlinx_coroutines_core());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ou1(@yfb Iterable<? extends y56<? extends T>> iterable, @yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        super(e13Var, i, gf1Var);
        this.f68748d = iterable;
    }
}
