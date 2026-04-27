package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,130:1\n27#2:131\n27#2:133\n16#3:132\n16#3:134\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n*L\n124#1:131\n126#1:133\n124#1:132\n126#1:134\n*E\n"})
public final class idg extends r9f<Integer> implements l2g<Integer> {
    public idg(int i) {
        super(1, Integer.MAX_VALUE, gf1.f39658b);
        tryEmit(Integer.valueOf(i));
    }

    public final boolean increment(int i) {
        boolean zTryEmit;
        synchronized (this) {
            zTryEmit = tryEmit(Integer.valueOf(m21099j().intValue() + i));
        }
        return zTryEmit;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.l2g
    @yfb
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(m21099j().intValue());
        }
        return numValueOf;
    }
}
