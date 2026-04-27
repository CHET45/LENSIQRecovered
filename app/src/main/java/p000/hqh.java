package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class hqh {
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfUByte")
    public static final int sumOfUByte(@yfb vye<goh> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<goh> it = vyeVar.iterator();
        int iM33004constructorimpl = 0;
        while (it.hasNext()) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + woh.m33004constructorimpl(it.next().m29836unboximpl() & 255));
        }
        return iM33004constructorimpl;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfUInt")
    public static final int sumOfUInt(@yfb vye<woh> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<woh> it = vyeVar.iterator();
        int iM33004constructorimpl = 0;
        while (it.hasNext()) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + it.next().m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfULong")
    public static final long sumOfULong(@yfb vye<oph> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<oph> it = vyeVar.iterator();
        long jM31533constructorimpl = 0;
        while (it.hasNext()) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + it.next().m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfUShort")
    public static final int sumOfUShort(@yfb vye<iqh> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        Iterator<iqh> it = vyeVar.iterator();
        int iM33004constructorimpl = 0;
        while (it.hasNext()) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + woh.m33004constructorimpl(it.next().m30374unboximpl() & iqh.f48007d));
        }
        return iM33004constructorimpl;
    }
}
