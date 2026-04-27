package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public class aoh {

    /* JADX INFO: renamed from: aoh$a */
    public static final class C1532a extends AbstractC7110i2<woh> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int[] f11470a;

        public C1532a(int[] iArr) {
            this.f11470a = iArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof woh) {
                return m27823containsWZ4Q5Ns(((woh) obj).m33056unboximpl());
            }
            return false;
        }

        /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
        public boolean m27823containsWZ4Q5Ns(int i) {
            return fph.m29586containsWZ4Q5Ns(this.f11470a, i);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return woh.m32998boximpl(m27824getpVg5ArA(i));
        }

        /* JADX INFO: renamed from: get-pVg5ArA, reason: not valid java name */
        public int m27824getpVg5ArA(int i) {
            return fph.m29590getpVg5ArA(this.f11470a, i);
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return fph.m29591getSizeimpl(this.f11470a);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof woh) {
                return m27825indexOfWZ4Q5Ns(((woh) obj).m33056unboximpl());
            }
            return -1;
        }

        /* JADX INFO: renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
        public int m27825indexOfWZ4Q5Ns(int i) {
            return e80.indexOf(this.f11470a, i);
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return fph.m29593isEmptyimpl(this.f11470a);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof woh) {
                return m27826lastIndexOfWZ4Q5Ns(((woh) obj).m33056unboximpl());
            }
            return -1;
        }

        /* JADX INFO: renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
        public int m27826lastIndexOfWZ4Q5Ns(int i) {
            return e80.lastIndexOf(this.f11470a, i);
        }
    }

    /* JADX INFO: renamed from: aoh$b */
    public static final class C1533b extends AbstractC7110i2<oph> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long[] f11471a;

        public C1533b(long[] jArr) {
            this.f11471a = jArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof oph) {
                return m27827containsVKZWuLQ(((oph) obj).m31585unboximpl());
            }
            return false;
        }

        /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
        public boolean m27827containsVKZWuLQ(long j) {
            return pph.m31839containsVKZWuLQ(this.f11471a, j);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return oph.m31527boximpl(m27828getsVKNKU(i));
        }

        /* JADX INFO: renamed from: get-s-VKNKU, reason: not valid java name */
        public long m27828getsVKNKU(int i) {
            return pph.m31843getsVKNKU(this.f11471a, i);
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return pph.m31844getSizeimpl(this.f11471a);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof oph) {
                return m27829indexOfVKZWuLQ(((oph) obj).m31585unboximpl());
            }
            return -1;
        }

        /* JADX INFO: renamed from: indexOf-VKZWuLQ, reason: not valid java name */
        public int m27829indexOfVKZWuLQ(long j) {
            return e80.indexOf(this.f11471a, j);
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return pph.m31846isEmptyimpl(this.f11471a);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof oph) {
                return m27830lastIndexOfVKZWuLQ(((oph) obj).m31585unboximpl());
            }
            return -1;
        }

        /* JADX INFO: renamed from: lastIndexOf-VKZWuLQ, reason: not valid java name */
        public int m27830lastIndexOfVKZWuLQ(long j) {
            return e80.lastIndexOf(this.f11471a, j);
        }
    }

    /* JADX INFO: renamed from: aoh$c */
    public static final class C1534c extends AbstractC7110i2<goh> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byte[] f11472a;

        public C1534c(byte[] bArr) {
            this.f11472a = bArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof goh) {
                return m27831contains7apg3OU(((goh) obj).m29836unboximpl());
            }
            return false;
        }

        /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
        public boolean m27831contains7apg3OU(byte b) {
            return hoh.m30084contains7apg3OU(this.f11472a, b);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return goh.m29780boximpl(m27832getw2LRezQ(i));
        }

        /* JADX INFO: renamed from: get-w2LRezQ, reason: not valid java name */
        public byte m27832getw2LRezQ(int i) {
            return hoh.m30088getw2LRezQ(this.f11472a, i);
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return hoh.m30089getSizeimpl(this.f11472a);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof goh) {
                return m27833indexOf7apg3OU(((goh) obj).m29836unboximpl());
            }
            return -1;
        }

        /* JADX INFO: renamed from: indexOf-7apg3OU, reason: not valid java name */
        public int m27833indexOf7apg3OU(byte b) {
            return e80.indexOf(this.f11472a, b);
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return hoh.m30091isEmptyimpl(this.f11472a);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof goh) {
                return m27834lastIndexOf7apg3OU(((goh) obj).m29836unboximpl());
            }
            return -1;
        }

        /* JADX INFO: renamed from: lastIndexOf-7apg3OU, reason: not valid java name */
        public int m27834lastIndexOf7apg3OU(byte b) {
            return e80.lastIndexOf(this.f11472a, b);
        }
    }

    /* JADX INFO: renamed from: aoh$d */
    public static final class C1535d extends AbstractC7110i2<iqh> implements RandomAccess {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ short[] f11473a;

        public C1535d(short[] sArr) {
            this.f11473a = sArr;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof iqh) {
                return m27835containsxj2QHRw(((iqh) obj).m30374unboximpl());
            }
            return false;
        }

        /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
        public boolean m27835containsxj2QHRw(short s) {
            return jqh.m30547containsxj2QHRw(this.f11473a, s);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return iqh.m30318boximpl(m27836getMh2AYeg(i));
        }

        /* JADX INFO: renamed from: get-Mh2AYeg, reason: not valid java name */
        public short m27836getMh2AYeg(int i) {
            return jqh.m30551getMh2AYeg(this.f11473a, i);
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return jqh.m30552getSizeimpl(this.f11473a);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof iqh) {
                return m27837indexOfxj2QHRw(((iqh) obj).m30374unboximpl());
            }
            return -1;
        }

        /* JADX INFO: renamed from: indexOf-xj2QHRw, reason: not valid java name */
        public int m27837indexOfxj2QHRw(short s) {
            return e80.indexOf(this.f11473a, s);
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return jqh.m30554isEmptyimpl(this.f11473a);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof iqh) {
                return m27838lastIndexOfxj2QHRw(((iqh) obj).m30374unboximpl());
            }
            return -1;
        }

        /* JADX INFO: renamed from: lastIndexOf-xj2QHRw, reason: not valid java name */
        public int m27838lastIndexOfxj2QHRw(short s) {
            return e80.lastIndexOf(this.f11473a, s);
        }
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: asList--ajY-9A, reason: not valid java name */
    public static final List<woh> m27783asListajY9A(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$asList");
        return new C1532a(iArr);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final List<goh> m27784asListGBYM_sE(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$asList");
        return new C1534c(bArr);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final List<oph> m27785asListQwZRm1k(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$asList");
        return new C1533b(jArr);
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final List<iqh> m27786asListrL5Bavg(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$asList");
        return new C1535d(sArr);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m27787binarySearch2fe2U9s(@yfb int[] iArr, int i, int i2, int i3) {
        md8.checkNotNullParameter(iArr, "$this$binarySearch");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, fph.m29591getSizeimpl(iArr));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iUintCompare = kvh.uintCompare(iArr[i5], i);
            if (iUintCompare < 0) {
                i2 = i5 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m27788binarySearch2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = fph.m29591getSizeimpl(iArr);
        }
        return m27787binarySearch2fe2U9s(iArr, i, i2, i3);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m27789binarySearchEtDCXyQ(@yfb short[] sArr, short s, int i, int i2) {
        md8.checkNotNullParameter(sArr, "$this$binarySearch");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, jqh.m30552getSizeimpl(sArr));
        int i3 = s & iqh.f48007d;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int iUintCompare = kvh.uintCompare(sArr[i5], i3);
            if (iUintCompare < 0) {
                i = i5 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m27790binarySearchEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jqh.m30552getSizeimpl(sArr);
        }
        return m27789binarySearchEtDCXyQ(sArr, s, i, i2);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m27791binarySearchK6DWlUc(@yfb long[] jArr, long j, int i, int i2) {
        md8.checkNotNullParameter(jArr, "$this$binarySearch");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, pph.m31844getSizeimpl(jArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iUlongCompare = kvh.ulongCompare(jArr[i4], j);
            if (iUlongCompare < 0) {
                i = i4 + 1;
            } else {
                if (iUlongCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m27792binarySearchK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = pph.m31844getSizeimpl(jArr);
        }
        return m27791binarySearchK6DWlUc(jArr, j, i, i2);
    }

    @jjf(version = "1.3")
    @yh5
    /* JADX INFO: renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m27793binarySearchWpHrYlw(@yfb byte[] bArr, byte b, int i, int i2) {
        md8.checkNotNullParameter(bArr, "$this$binarySearch");
        AbstractC7110i2.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, hoh.m30089getSizeimpl(bArr));
        int i3 = b & 255;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int iUintCompare = kvh.uintCompare(bArr[i5], i3);
            if (iUintCompare < 0) {
                i = i5 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m27794binarySearchWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = hoh.m30089getSizeimpl(bArr);
        }
        return m27793binarySearchWpHrYlw(bArr, b, i, i2);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m27795elementAtPpDY95g(byte[] bArr, int i) {
        md8.checkNotNullParameter(bArr, "$this$elementAt");
        return hoh.m30088getw2LRezQ(bArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m27796elementAtnggk6HY(short[] sArr, int i) {
        md8.checkNotNullParameter(sArr, "$this$elementAt");
        return jqh.m30551getMh2AYeg(sArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m27797elementAtqFRl0hI(int[] iArr, int i) {
        md8.checkNotNullParameter(iArr, "$this$elementAt");
        return fph.m29590getpVg5ArA(iArr, i);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m27798elementAtr7IrZao(long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "$this$elementAt");
        return pph.m31843getsVKNKU(jArr, i);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    @yh5
    /* JADX INFO: renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ woh m27799maxajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$max");
        return foh.m29244maxOrNullajY9A(iArr);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    @yh5
    /* JADX INFO: renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ goh m27800maxGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$max");
        return foh.m29245maxOrNullGBYM_sE(bArr);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    @yh5
    /* JADX INFO: renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ oph m27801maxQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$max");
        return foh.m29246maxOrNullQwZRm1k(jArr);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    @yh5
    /* JADX INFO: renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ iqh m27802maxrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$max");
        return foh.m29247maxOrNullrL5Bavg(sArr);
    }

    @jjf(version = "1.3")
    @t28
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> goh m27803maxByJOV_ifY(byte[] bArr, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$maxBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        if (lastIndex != 0) {
            R rInvoke = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                    R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        bM30088getw2LRezQ = bM30088getw2LRezQ2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @jjf(version = "1.3")
    @t28
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> oph m27804maxByMShoTSo(long[] jArr, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$maxBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        if (lastIndex != 0) {
            R rInvoke = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                    R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        jM31843getsVKNKU = jM31843getsVKNKU2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @jjf(version = "1.3")
    @t28
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> woh m27805maxByjgv0xPQ(int[] iArr, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$maxBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex != 0) {
            R rInvoke = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                    R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        iM29590getpVg5ArA = iM29590getpVg5ArA2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @jjf(version = "1.3")
    @t28
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> iqh m27806maxByxTcfx_M(short[] sArr, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$maxBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        if (lastIndex != 0) {
            R rInvoke = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                    R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        sM30551getMh2AYeg = sM30551getMh2AYeg2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ goh m27807maxWithXMRcp5o(byte[] bArr, Comparator comparator) {
        md8.checkNotNullParameter(bArr, "$this$maxWith");
        md8.checkNotNullParameter(comparator, "comparator");
        return foh.m29252maxWithOrNullXMRcp5o(bArr, comparator);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ woh m27808maxWithYmdZ_VM(int[] iArr, Comparator comparator) {
        md8.checkNotNullParameter(iArr, "$this$maxWith");
        md8.checkNotNullParameter(comparator, "comparator");
        return foh.m29253maxWithOrNullYmdZ_VM(iArr, comparator);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ iqh m27809maxWitheOHTfZs(short[] sArr, Comparator comparator) {
        md8.checkNotNullParameter(sArr, "$this$maxWith");
        md8.checkNotNullParameter(comparator, "comparator");
        return foh.m29254maxWithOrNulleOHTfZs(sArr, comparator);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ oph m27810maxWithzrEWJaI(long[] jArr, Comparator comparator) {
        md8.checkNotNullParameter(jArr, "$this$maxWith");
        md8.checkNotNullParameter(comparator, "comparator");
        return foh.m29255maxWithOrNullzrEWJaI(jArr, comparator);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    @yh5
    /* JADX INFO: renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ woh m27811minajY9A(int[] iArr) {
        md8.checkNotNullParameter(iArr, "$this$min");
        return foh.m29300minOrNullajY9A(iArr);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    @yh5
    /* JADX INFO: renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ goh m27812minGBYM_sE(byte[] bArr) {
        md8.checkNotNullParameter(bArr, "$this$min");
        return foh.m29301minOrNullGBYM_sE(bArr);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    @yh5
    /* JADX INFO: renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ oph m27813minQwZRm1k(long[] jArr) {
        md8.checkNotNullParameter(jArr, "$this$min");
        return foh.m29302minOrNullQwZRm1k(jArr);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    @yh5
    /* JADX INFO: renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ iqh m27814minrL5Bavg(short[] sArr) {
        md8.checkNotNullParameter(sArr, "$this$min");
        return foh.m29303minOrNullrL5Bavg(sArr);
    }

    @jjf(version = "1.3")
    @t28
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> goh m27815minByJOV_ifY(byte[] bArr, qy6<? super goh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$minBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (hoh.m30091isEmptyimpl(bArr)) {
            return null;
        }
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, 0);
        int lastIndex = e80.getLastIndex(bArr);
        if (lastIndex != 0) {
            R rInvoke = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                    R rInvoke2 = qy6Var.invoke(goh.m29780boximpl(bM30088getw2LRezQ2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        bM30088getw2LRezQ = bM30088getw2LRezQ2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return goh.m29780boximpl(bM30088getw2LRezQ);
    }

    @jjf(version = "1.3")
    @t28
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> oph m27816minByMShoTSo(long[] jArr, qy6<? super oph, ? extends R> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$minBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (pph.m31846isEmptyimpl(jArr)) {
            return null;
        }
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, 0);
        int lastIndex = e80.getLastIndex(jArr);
        if (lastIndex != 0) {
            R rInvoke = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                    R rInvoke2 = qy6Var.invoke(oph.m31527boximpl(jM31843getsVKNKU2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        jM31843getsVKNKU = jM31843getsVKNKU2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return oph.m31527boximpl(jM31843getsVKNKU);
    }

    @jjf(version = "1.3")
    @t28
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> woh m27817minByjgv0xPQ(int[] iArr, qy6<? super woh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$minBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (fph.m29593isEmptyimpl(iArr)) {
            return null;
        }
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, 0);
        int lastIndex = e80.getLastIndex(iArr);
        if (lastIndex != 0) {
            R rInvoke = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                    R rInvoke2 = qy6Var.invoke(woh.m32998boximpl(iM29590getpVg5ArA2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        iM29590getpVg5ArA = iM29590getpVg5ArA2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return woh.m32998boximpl(iM29590getpVg5ArA);
    }

    @jjf(version = "1.3")
    @t28
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> iqh m27818minByxTcfx_M(short[] sArr, qy6<? super iqh, ? extends R> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$minBy");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (jqh.m30554isEmptyimpl(sArr)) {
            return null;
        }
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, 0);
        int lastIndex = e80.getLastIndex(sArr);
        if (lastIndex != 0) {
            R rInvoke = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                    R rInvoke2 = qy6Var.invoke(iqh.m30318boximpl(sM30551getMh2AYeg2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        sM30551getMh2AYeg = sM30551getMh2AYeg2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return iqh.m30318boximpl(sM30551getMh2AYeg);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ goh m27819minWithXMRcp5o(byte[] bArr, Comparator comparator) {
        md8.checkNotNullParameter(bArr, "$this$minWith");
        md8.checkNotNullParameter(comparator, "comparator");
        return foh.m29308minWithOrNullXMRcp5o(bArr, comparator);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ woh m27820minWithYmdZ_VM(int[] iArr, Comparator comparator) {
        md8.checkNotNullParameter(iArr, "$this$minWith");
        md8.checkNotNullParameter(comparator, "comparator");
        return foh.m29309minWithOrNullYmdZ_VM(iArr, comparator);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ iqh m27821minWitheOHTfZs(short[] sArr, Comparator comparator) {
        md8.checkNotNullParameter(sArr, "$this$minWith");
        md8.checkNotNullParameter(comparator, "comparator");
        return foh.m29310minWithOrNulleOHTfZs(sArr, comparator);
    }

    @jjf(version = "1.3")
    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yh5
    /* JADX INFO: renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ oph m27822minWithzrEWJaI(long[] jArr, Comparator comparator) {
        md8.checkNotNullParameter(jArr, "$this$minWith");
        md8.checkNotNullParameter(comparator, "comparator");
        return foh.m29311minWithOrNullzrEWJaI(jArr, comparator);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    @yh5
    private static final BigDecimal sumOfBigDecimal(int[] iArr, qy6<? super woh, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    @yh5
    private static final BigInteger sumOfBigInteger(int[] iArr, qy6<? super woh, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(iArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i = 0; i < iM29591getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(woh.m32998boximpl(fph.m29590getpVg5ArA(iArr, i))));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    @yh5
    private static final BigDecimal sumOfBigDecimal(long[] jArr, qy6<? super oph, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    @yh5
    private static final BigInteger sumOfBigInteger(long[] jArr, qy6<? super oph, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(jArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(oph.m31527boximpl(pph.m31843getsVKNKU(jArr, i))));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    @yh5
    private static final BigDecimal sumOfBigDecimal(byte[] bArr, qy6<? super goh, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    @yh5
    private static final BigInteger sumOfBigInteger(byte[] bArr, qy6<? super goh, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(bArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(goh.m29780boximpl(hoh.m30088getw2LRezQ(bArr, i))));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    @yh5
    private static final BigDecimal sumOfBigDecimal(short[] sArr, qy6<? super iqh, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    @yh5
    private static final BigInteger sumOfBigInteger(short[] sArr, qy6<? super iqh, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(sArr, "$this$sumOf");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(iqh.m30318boximpl(jqh.m30551getMh2AYeg(sArr, i))));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }
}
