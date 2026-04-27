package p000;

import p000.xu1;

/* JADX INFO: loaded from: classes7.dex */
public final class nu1 {
    @yfb
    public static final <E> au1<E> Channel(int i, @yfb gf1 gf1Var, @gib qy6<? super E, bth> qy6Var) {
        au1<E> kf1Var;
        if (i == -2) {
            kf1Var = gf1Var == gf1.f39657a ? new kf1<>(au1.f11861h.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), qy6Var) : new vq2<>(1, gf1Var, qy6Var);
        } else {
            if (i == -1) {
                if (gf1Var == gf1.f39657a) {
                    return new vq2(1, gf1.f39658b, qy6Var);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i != 0) {
                return i != Integer.MAX_VALUE ? gf1Var == gf1.f39657a ? new kf1(i, qy6Var) : new vq2(i, gf1Var, qy6Var) : new kf1(Integer.MAX_VALUE, qy6Var);
            }
            kf1Var = gf1Var == gf1.f39657a ? new kf1<>(0, qy6Var) : new vq2<>(1, gf1Var, qy6Var);
        }
        return kf1Var;
    }

    public static /* synthetic */ au1 Channel$default(int i, gf1 gf1Var, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            gf1Var = gf1.f39657a;
        }
        if ((i2 & 4) != 0) {
            qy6Var = null;
        }
        return Channel(i, gf1Var, qy6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrElse-WpGqRn0, reason: not valid java name */
    public static final <T> T m31220getOrElseWpGqRn0(@yfb Object obj, @yfb qy6<? super Throwable, ? extends T> qy6Var) {
        return obj instanceof xu1.C15302c ? qy6Var.invoke(xu1.m33276exceptionOrNullimpl(obj)) : obj;
    }

    @yfb
    /* JADX INFO: renamed from: onClosed-WpGqRn0, reason: not valid java name */
    public static final <T> Object m31221onClosedWpGqRn0(@yfb Object obj, @yfb qy6<? super Throwable, bth> qy6Var) {
        if (obj instanceof xu1.C15300a) {
            qy6Var.invoke(xu1.m33276exceptionOrNullimpl(obj));
        }
        return obj;
    }

    @yfb
    /* JADX INFO: renamed from: onFailure-WpGqRn0, reason: not valid java name */
    public static final <T> Object m31222onFailureWpGqRn0(@yfb Object obj, @yfb qy6<? super Throwable, bth> qy6Var) {
        if (obj instanceof xu1.C15302c) {
            qy6Var.invoke(xu1.m33276exceptionOrNullimpl(obj));
        }
        return obj;
    }

    @yfb
    /* JADX INFO: renamed from: onSuccess-WpGqRn0, reason: not valid java name */
    public static final <T> Object m31223onSuccessWpGqRn0(@yfb Object obj, @yfb qy6<? super T, bth> qy6Var) {
        if (!(obj instanceof xu1.C15302c)) {
            qy6Var.invoke(obj);
        }
        return obj;
    }

    public static /* synthetic */ au1 Channel$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return Channel(i);
    }

    @q64(level = u64.f86867c, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ au1 Channel(int i) {
        return Channel$default(i, null, null, 6, null);
    }
}
