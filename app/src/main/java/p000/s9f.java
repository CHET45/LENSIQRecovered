package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
public final class s9f {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public static final qhg f81015a = new qhg("NO_VALUE");

    @yfb
    public static final <T> v6b<T> MutableSharedFlow(int i, int i2, @yfb gf1 gf1Var) {
        if (i < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        if (i > 0 || i2 > 0 || gf1Var == gf1.f39657a) {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            return new r9f(i, i3, gf1Var);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + gf1Var).toString());
    }

    public static /* synthetic */ v6b MutableSharedFlow$default(int i, int i2, gf1 gf1Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            gf1Var = gf1.f39657a;
        }
        return MutableSharedFlow(i, i2, gf1Var);
    }

    @yfb
    public static final <T> y56<T> fuseSharedFlow(@yfb q9f<? extends T> q9fVar, @yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return ((i == 0 || i == -3) && gf1Var == gf1.f39657a) ? q9fVar : new ku1(q9fVar, e13Var, i, gf1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBufferAt(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBufferAt(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
