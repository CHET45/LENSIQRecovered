package p000;

import java.util.NoSuchElementException;
import okhttp3.internal.p017ws.WebSocketProtocol;
import p000.kph;
import p000.uph;

/* JADX INFO: loaded from: classes7.dex */
public class fqh {
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m29610coerceAtLeast5PvTz6A(short s, short s2) {
        return md8.compare(s & iqh.f48007d, 65535 & s2) < 0 ? s2 : s;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m29611coerceAtLeastJ1ME1BU(int i, int i2) {
        return Integer.compareUnsigned(i, i2) < 0 ? i2 : i;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m29612coerceAtLeastKr8caGY(byte b, byte b2) {
        return md8.compare(b & 255, b2 & 255) < 0 ? b2 : b;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m29613coerceAtLeasteb3DHEI(long j, long j2) {
        return Long.compareUnsigned(j, j2) < 0 ? j2 : j;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m29614coerceAtMost5PvTz6A(short s, short s2) {
        return md8.compare(s & iqh.f48007d, 65535 & s2) > 0 ? s2 : s;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m29615coerceAtMostJ1ME1BU(int i, int i2) {
        return Integer.compareUnsigned(i, i2) > 0 ? i2 : i;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m29616coerceAtMostKr8caGY(byte b, byte b2) {
        return md8.compare(b & 255, b2 & 255) > 0 ? b2 : b;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m29617coerceAtMosteb3DHEI(long j, long j2) {
        return Long.compareUnsigned(j, j2) > 0 ? j2 : j;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m29618coerceInJPwROB0(long j, @yfb a62<oph> a62Var) {
        md8.checkNotNullParameter(a62Var, "range");
        if (a62Var instanceof z52) {
            return ((oph) kpd.coerceIn(oph.m31527boximpl(j), (z52<oph>) a62Var)).m31585unboximpl();
        }
        if (!a62Var.isEmpty()) {
            return Long.compareUnsigned(j, ((oph) a62Var.getStart()).m31585unboximpl()) < 0 ? ((oph) a62Var.getStart()).m31585unboximpl() : Long.compareUnsigned(j, ((oph) a62Var.getEndInclusive()).m31585unboximpl()) > 0 ? ((oph) a62Var.getEndInclusive()).m31585unboximpl() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + a62Var + a18.f100c);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m29619coerceInVKSA0NQ(short s, short s2, short s3) {
        int i = s2 & iqh.f48007d;
        int i2 = s3 & iqh.f48007d;
        if (md8.compare(i, i2) <= 0) {
            int i3 = 65535 & s;
            return md8.compare(i3, i) < 0 ? s2 : md8.compare(i3, i2) > 0 ? s3 : s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) iqh.m30368toStringimpl(s3)) + " is less than minimum " + ((Object) iqh.m30368toStringimpl(s2)) + a18.f100c);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m29620coerceInWZ9TVnA(int i, int i2, int i3) {
        if (Integer.compareUnsigned(i2, i3) <= 0) {
            return Integer.compareUnsigned(i, i2) < 0 ? i2 : Integer.compareUnsigned(i, i3) > 0 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) woh.m33050toStringimpl(i3)) + " is less than minimum " + ((Object) woh.m33050toStringimpl(i2)) + a18.f100c);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m29621coerceInb33U2AM(byte b, byte b2, byte b3) {
        int i = b2 & 255;
        int i2 = b3 & 255;
        if (md8.compare(i, i2) <= 0) {
            int i3 = b & 255;
            return md8.compare(i3, i) < 0 ? b2 : md8.compare(i3, i2) > 0 ? b3 : b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) goh.m29830toStringimpl(b3)) + " is less than minimum " + ((Object) goh.m29830toStringimpl(b2)) + a18.f100c);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m29622coerceInsambcqE(long j, long j2, long j3) {
        if (Long.compareUnsigned(j2, j3) <= 0) {
            return Long.compareUnsigned(j, j2) < 0 ? j2 : Long.compareUnsigned(j, j3) > 0 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) oph.m31579toStringimpl(j3)) + " is less than minimum " + ((Object) oph.m31579toStringimpl(j2)) + a18.f100c);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m29623coerceInwuiCnnA(int i, @yfb a62<woh> a62Var) {
        md8.checkNotNullParameter(a62Var, "range");
        if (a62Var instanceof z52) {
            return ((woh) kpd.coerceIn(woh.m32998boximpl(i), (z52<woh>) a62Var)).m33056unboximpl();
        }
        if (!a62Var.isEmpty()) {
            return Integer.compareUnsigned(i, ((woh) a62Var.getStart()).m33056unboximpl()) < 0 ? ((woh) a62Var.getStart()).m33056unboximpl() : Integer.compareUnsigned(i, ((woh) a62Var.getEndInclusive()).m33056unboximpl()) > 0 ? ((woh) a62Var.getEndInclusive()).m33056unboximpl() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + a62Var + a18.f100c);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m29624contains68kG9v0(@yfb mph mphVar, byte b) {
        md8.checkNotNullParameter(mphVar, "$this$contains");
        return mphVar.m31034containsWZ4Q5Ns(woh.m33004constructorimpl(b & 255));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m29625containsGYNo2lE(wph wphVar, oph ophVar) {
        md8.checkNotNullParameter(wphVar, "$this$contains");
        return ophVar != null && wphVar.m33080containsVKZWuLQ(ophVar.m31585unboximpl());
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m29626containsGab390E(@yfb wph wphVar, int i) {
        md8.checkNotNullParameter(wphVar, "$this$contains");
        return wphVar.m33080containsVKZWuLQ(oph.m31533constructorimpl(((long) i) & 4294967295L));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m29627containsULbyJY(@yfb wph wphVar, byte b) {
        md8.checkNotNullParameter(wphVar, "$this$contains");
        return wphVar.m33080containsVKZWuLQ(oph.m31533constructorimpl(((long) b) & 255));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m29628containsZsK3CEQ(@yfb mph mphVar, short s) {
        md8.checkNotNullParameter(mphVar, "$this$contains");
        return mphVar.m31034containsWZ4Q5Ns(woh.m33004constructorimpl(s & iqh.f48007d));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m29629containsbiwQdVI(mph mphVar, woh wohVar) {
        md8.checkNotNullParameter(mphVar, "$this$contains");
        return wohVar != null && mphVar.m31034containsWZ4Q5Ns(wohVar.m33056unboximpl());
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m29630containsfz5IDCE(@yfb mph mphVar, long j) {
        md8.checkNotNullParameter(mphVar, "$this$contains");
        return oph.m31533constructorimpl(j >>> 32) == 0 && mphVar.m31034containsWZ4Q5Ns(woh.m33004constructorimpl((int) j));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m29631containsuhHAxoY(@yfb wph wphVar, short s) {
        md8.checkNotNullParameter(wphVar, "$this$contains");
        return wphVar.m33080containsVKZWuLQ(oph.m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final kph m29632downTo5PvTz6A(short s, short s2) {
        return kph.f54928d.m30734fromClosedRangeNkh28Cs(woh.m33004constructorimpl(s & iqh.f48007d), woh.m33004constructorimpl(s2 & iqh.f48007d), -1);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final kph m29633downToJ1ME1BU(int i, int i2) {
        return kph.f54928d.m30734fromClosedRangeNkh28Cs(i, i2, -1);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final kph m29634downToKr8caGY(byte b, byte b2) {
        return kph.f54928d.m30734fromClosedRangeNkh28Cs(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(b2 & 255), -1);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final uph m29635downToeb3DHEI(long j, long j2) {
        return uph.f88732d.m32644fromClosedRange7ftBX0g(j, j2, -1L);
    }

    @jjf(version = "1.7")
    public static final int first(@yfb kph kphVar) {
        md8.checkNotNullParameter(kphVar, "<this>");
        if (!kphVar.isEmpty()) {
            return kphVar.m30732getFirstpVg5ArA();
        }
        throw new NoSuchElementException("Progression " + kphVar + " is empty.");
    }

    @gib
    @jjf(version = "1.7")
    public static final woh firstOrNull(@yfb kph kphVar) {
        md8.checkNotNullParameter(kphVar, "<this>");
        if (kphVar.isEmpty()) {
            return null;
        }
        return woh.m32998boximpl(kphVar.m30732getFirstpVg5ArA());
    }

    @jjf(version = "1.7")
    public static final int last(@yfb kph kphVar) {
        md8.checkNotNullParameter(kphVar, "<this>");
        if (!kphVar.isEmpty()) {
            return kphVar.m30733getLastpVg5ArA();
        }
        throw new NoSuchElementException("Progression " + kphVar + " is empty.");
    }

    @gib
    @jjf(version = "1.7")
    public static final woh lastOrNull(@yfb kph kphVar) {
        md8.checkNotNullParameter(kphVar, "<this>");
        if (kphVar.isEmpty()) {
            return null;
        }
        return woh.m32998boximpl(kphVar.m30733getLastpVg5ArA());
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    private static final int random(mph mphVar) {
        md8.checkNotNullParameter(mphVar, "<this>");
        return random(mphVar, tod.f85517a);
    }

    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.5")
    @t28
    private static final woh randomOrNull(mph mphVar) {
        md8.checkNotNullParameter(mphVar, "<this>");
        return randomOrNull(mphVar, tod.f85517a);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    public static final kph reversed(@yfb kph kphVar) {
        md8.checkNotNullParameter(kphVar, "<this>");
        return kph.f54928d.m30734fromClosedRangeNkh28Cs(kphVar.m30733getLastpVg5ArA(), kphVar.m30732getFirstpVg5ArA(), -kphVar.getStep());
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    public static final kph step(@yfb kph kphVar, int i) {
        md8.checkNotNullParameter(kphVar, "<this>");
        jpd.checkStepIsPositive(i > 0, Integer.valueOf(i));
        kph.C8493a c8493a = kph.f54928d;
        int iM30732getFirstpVg5ArA = kphVar.m30732getFirstpVg5ArA();
        int iM30733getLastpVg5ArA = kphVar.m30733getLastpVg5ArA();
        if (kphVar.getStep() <= 0) {
            i = -i;
        }
        return c8493a.m30734fromClosedRangeNkh28Cs(iM30732getFirstpVg5ArA, iM30733getLastpVg5ArA, i);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: until-5PvTz6A, reason: not valid java name */
    public static final mph m29636until5PvTz6A(short s, short s2) {
        return md8.compare(s2 & iqh.f48007d, 0) <= 0 ? mph.f61730e.getEMPTY() : new mph(woh.m33004constructorimpl(s & iqh.f48007d), woh.m33004constructorimpl(woh.m33004constructorimpl(r3) - 1), null);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: until-J1ME1BU, reason: not valid java name */
    public static mph m29637untilJ1ME1BU(int i, int i2) {
        return Integer.compareUnsigned(i2, 0) <= 0 ? mph.f61730e.getEMPTY() : new mph(i, woh.m33004constructorimpl(i2 - 1), null);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: until-Kr8caGY, reason: not valid java name */
    public static final mph m29638untilKr8caGY(byte b, byte b2) {
        return md8.compare(b2 & 255, 0) <= 0 ? mph.f61730e.getEMPTY() : new mph(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(woh.m33004constructorimpl(r3) - 1), null);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: until-eb3DHEI, reason: not valid java name */
    public static wph m29639untileb3DHEI(long j, long j2) {
        return Long.compareUnsigned(j2, 0L) <= 0 ? wph.f95052e.getEMPTY() : new wph(j, oph.m31533constructorimpl(j2 - oph.m31533constructorimpl(((long) 1) & 4294967295L)), null);
    }

    @gib
    @jjf(version = "1.7")
    public static final oph firstOrNull(@yfb uph uphVar) {
        md8.checkNotNullParameter(uphVar, "<this>");
        if (uphVar.isEmpty()) {
            return null;
        }
        return oph.m31527boximpl(uphVar.m32642getFirstsVKNKU());
    }

    @gib
    @jjf(version = "1.7")
    public static final oph lastOrNull(@yfb uph uphVar) {
        md8.checkNotNullParameter(uphVar, "<this>");
        if (uphVar.isEmpty()) {
            return null;
        }
        return oph.m31527boximpl(uphVar.m32643getLastsVKNKU());
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    private static final long random(wph wphVar) {
        md8.checkNotNullParameter(wphVar, "<this>");
        return random(wphVar, tod.f85517a);
    }

    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.5")
    @t28
    private static final oph randomOrNull(wph wphVar) {
        md8.checkNotNullParameter(wphVar, "<this>");
        return randomOrNull(wphVar, tod.f85517a);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    public static final uph reversed(@yfb uph uphVar) {
        md8.checkNotNullParameter(uphVar, "<this>");
        return uph.f88732d.m32644fromClosedRange7ftBX0g(uphVar.m32643getLastsVKNKU(), uphVar.m32642getFirstsVKNKU(), -uphVar.getStep());
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final int random(@yfb mph mphVar, @yfb tod todVar) {
        md8.checkNotNullParameter(mphVar, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        try {
            return dqh.nextUInt(todVar, mphVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @gib
    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.5")
    public static final woh randomOrNull(@yfb mph mphVar, @yfb tod todVar) {
        md8.checkNotNullParameter(mphVar, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (mphVar.isEmpty()) {
            return null;
        }
        return woh.m32998boximpl(dqh.nextUInt(todVar, mphVar));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    public static final uph step(@yfb uph uphVar, long j) {
        md8.checkNotNullParameter(uphVar, "<this>");
        jpd.checkStepIsPositive(j > 0, Long.valueOf(j));
        uph.C13644a c13644a = uph.f88732d;
        long jM32642getFirstsVKNKU = uphVar.m32642getFirstsVKNKU();
        long jM32643getLastsVKNKU = uphVar.m32643getLastsVKNKU();
        if (uphVar.getStep() <= 0) {
            j = -j;
        }
        return c13644a.m32644fromClosedRange7ftBX0g(jM32642getFirstsVKNKU, jM32643getLastsVKNKU, j);
    }

    @jjf(version = "1.7")
    public static final long first(@yfb uph uphVar) {
        md8.checkNotNullParameter(uphVar, "<this>");
        if (!uphVar.isEmpty()) {
            return uphVar.m32642getFirstsVKNKU();
        }
        throw new NoSuchElementException("Progression " + uphVar + " is empty.");
    }

    @jjf(version = "1.7")
    public static final long last(@yfb uph uphVar) {
        md8.checkNotNullParameter(uphVar, "<this>");
        if (!uphVar.isEmpty()) {
            return uphVar.m32643getLastsVKNKU();
        }
        throw new NoSuchElementException("Progression " + uphVar + " is empty.");
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final long random(@yfb wph wphVar, @yfb tod todVar) {
        md8.checkNotNullParameter(wphVar, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        try {
            return dqh.nextULong(todVar, wphVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @gib
    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.5")
    public static final oph randomOrNull(@yfb wph wphVar, @yfb tod todVar) {
        md8.checkNotNullParameter(wphVar, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (wphVar.isEmpty()) {
            return null;
        }
        return oph.m31527boximpl(dqh.nextULong(todVar, wphVar));
    }
}
