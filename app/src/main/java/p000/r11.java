package p000;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@ay4
public class r11 {

    /* JADX INFO: renamed from: r11$a */
    public static class C11840a extends f3h<BigDecimal> {

        /* JADX INFO: renamed from: a */
        public static final C11840a f76736a = new C11840a();

        private C11840a() {
        }

        @Override // p000.f3h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigDecimal mo10496a(BigDecimal a, BigDecimal b) {
            return a.subtract(b);
        }

        @Override // p000.f3h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public double mo10498c(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        @Override // p000.f3h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int mo10499d(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        @Override // p000.f3h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigDecimal mo10500e(double d, RoundingMode mode) {
            return new BigDecimal(d);
        }
    }

    private r11() {
    }

    public static double roundToDouble(BigDecimal x, RoundingMode mode) {
        return C11840a.f76736a.m10497b(x, mode);
    }
}
