package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class ooh {
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfUByte")
    public static final int sumOfUByte(@yfb Iterable<goh> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<goh> it = iterable.iterator();
        int iM33004constructorimpl = 0;
        while (it.hasNext()) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + woh.m33004constructorimpl(it.next().m29836unboximpl() & 255));
        }
        return iM33004constructorimpl;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfUInt")
    public static final int sumOfUInt(@yfb Iterable<woh> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<woh> it = iterable.iterator();
        int iM33004constructorimpl = 0;
        while (it.hasNext()) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + it.next().m33056unboximpl());
        }
        return iM33004constructorimpl;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfULong")
    public static final long sumOfULong(@yfb Iterable<oph> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<oph> it = iterable.iterator();
        long jM31533constructorimpl = 0;
        while (it.hasNext()) {
            jM31533constructorimpl = oph.m31533constructorimpl(jM31533constructorimpl + it.next().m31585unboximpl());
        }
        return jM31533constructorimpl;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @xn8(name = "sumOfUShort")
    public static final int sumOfUShort(@yfb Iterable<iqh> iterable) {
        md8.checkNotNullParameter(iterable, "<this>");
        Iterator<iqh> it = iterable.iterator();
        int iM33004constructorimpl = 0;
        while (it.hasNext()) {
            iM33004constructorimpl = woh.m33004constructorimpl(iM33004constructorimpl + woh.m33004constructorimpl(it.next().m30374unboximpl() & iqh.f48007d));
        }
        return iM33004constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    public static final byte[] toUByteArray(@yfb Collection<goh> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        byte[] bArrM30082constructorimpl = hoh.m30082constructorimpl(collection.size());
        Iterator<goh> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            hoh.m30093setVurrAj0(bArrM30082constructorimpl, i, it.next().m29836unboximpl());
            i++;
        }
        return bArrM30082constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    public static final int[] toUIntArray(@yfb Collection<woh> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        int[] iArrM29584constructorimpl = fph.m29584constructorimpl(collection.size());
        Iterator<woh> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fph.m29595setVXSXFK8(iArrM29584constructorimpl, i, it.next().m33056unboximpl());
            i++;
        }
        return iArrM29584constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    public static final long[] toULongArray(@yfb Collection<oph> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        long[] jArrM31837constructorimpl = pph.m31837constructorimpl(collection.size());
        Iterator<oph> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            pph.m31848setk8EXiF4(jArrM31837constructorimpl, i, it.next().m31585unboximpl());
            i++;
        }
        return jArrM31837constructorimpl;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    public static final short[] toUShortArray(@yfb Collection<iqh> collection) {
        md8.checkNotNullParameter(collection, "<this>");
        short[] sArrM30545constructorimpl = jqh.m30545constructorimpl(collection.size());
        Iterator<iqh> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jqh.m30556set01HTLdE(sArrM30545constructorimpl, i, it.next().m30374unboximpl());
            i++;
        }
        return sArrM30545constructorimpl;
    }
}
