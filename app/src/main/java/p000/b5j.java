package p000;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b5j {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BigDecimal m2945a(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
