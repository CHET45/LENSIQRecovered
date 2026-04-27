package p000;

import p000.a17;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h76 {
    @yfb
    public static final <T> y56<T> buffer(@yfb y56<? extends T> y56Var, int i, @yfb gf1 gf1Var) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        }
        if (i == -1 && gf1Var != gf1.f39657a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == -1) {
            gf1Var = gf1.f39658b;
            i = 0;
        }
        int i2 = i;
        gf1 gf1Var2 = gf1Var;
        if (y56Var instanceof a17) {
            return a17.C0009a.fuse$default((a17) y56Var, null, i2, gf1Var2, 1, null);
        }
        return new ku1(y56Var, null, i2, gf1Var2, 2, null);
    }

    public static /* synthetic */ y56 buffer$default(y56 y56Var, int i, gf1 gf1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            gf1Var = gf1.f39657a;
        }
        return c76.buffer(y56Var, i, gf1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T> y56<T> cancellable(@yfb y56<? extends T> y56Var) {
        return y56Var instanceof kq1 ? y56Var : new lq1(y56Var);
    }

    private static final void checkFlowContext$FlowKt__ContextKt(e13 e13Var) {
        if (e13Var.get(jj8.f50715A) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + e13Var).toString());
    }

    @yfb
    public static final <T> y56<T> conflate(@yfb y56<? extends T> y56Var) {
        return buffer$default(y56Var, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static final <T> y56<T> flowOn(@yfb y56<? extends T> y56Var, @yfb e13 e13Var) {
        checkFlowContext$FlowKt__ContextKt(e13Var);
        if (md8.areEqual(e13Var, a05.f2a)) {
            return y56Var;
        }
        if (y56Var instanceof a17) {
            return a17.C0009a.fuse$default((a17) y56Var, e13Var, 0, null, 6, null);
        }
        return new ku1(y56Var, e13Var, 0, null, 12, null);
    }

    public static /* synthetic */ y56 buffer$default(y56 y56Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return buffer(y56Var, i);
    }

    @q64(level = u64.f86867c, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ y56 buffer(y56 y56Var, int i) {
        return buffer$default(y56Var, i, null, 2, null);
    }
}
