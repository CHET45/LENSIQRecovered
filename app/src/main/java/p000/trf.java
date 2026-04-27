package p000;

import java.util.BitSet;
import p000.yv1;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@by4
public final class trf extends yv1.AbstractC15843v {

    /* JADX INFO: renamed from: C */
    public static final int f85680C = 461845907;

    /* JADX INFO: renamed from: F */
    public static final double f85681F = 0.5d;

    /* JADX INFO: renamed from: f */
    public static final int f85682f = 1023;

    /* JADX INFO: renamed from: m */
    public static final int f85683m = -862048943;

    /* JADX INFO: renamed from: c */
    public final char[] f85684c;

    /* JADX INFO: renamed from: d */
    public final boolean f85685d;

    /* JADX INFO: renamed from: e */
    public final long f85686e;

    private trf(char[] table, long filter, boolean containsZero, String description) {
        super(description);
        this.f85684c = table;
        this.f85686e = filter;
        this.f85685d = containsZero;
    }

    private boolean checkFilter(int c) {
        return 1 == ((this.f85686e >> c) & 1);
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public static int m22756d(int setSize) {
        if (setSize == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(setSize - 1) << 1;
        while (((double) iHighestOneBit) * 0.5d < setSize) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: e */
    public static yv1 m22757e(BitSet chars, String description) {
        int i;
        int iCardinality = chars.cardinality();
        boolean z = chars.get(0);
        int iM22756d = m22756d(iCardinality);
        char[] cArr = new char[iM22756d];
        int i2 = iM22756d - 1;
        int iNextSetBit = chars.nextSetBit(0);
        long j = 0;
        while (iNextSetBit != -1) {
            long j2 = (1 << iNextSetBit) | j;
            int iM22758f = m22758f(iNextSetBit);
            while (true) {
                i = iM22758f & i2;
                if (cArr[i] == 0) {
                    break;
                }
                iM22758f = i + 1;
            }
            cArr[i] = (char) iNextSetBit;
            iNextSetBit = chars.nextSetBit(iNextSetBit + 1);
            j = j2;
        }
        return new trf(cArr, j, z, description);
    }

    /* JADX INFO: renamed from: f */
    public static int m22758f(int hashCode) {
        return Integer.rotateLeft(hashCode * (-862048943), 15) * 461845907;
    }

    @Override // p000.yv1
    /* JADX INFO: renamed from: c */
    public void mo22759c(BitSet table) {
        if (this.f85685d) {
            table.set(0);
        }
        for (char c : this.f85684c) {
            if (c != 0) {
                table.set(c);
            }
        }
    }

    @Override // p000.yv1
    public boolean matches(char c) {
        if (c == 0) {
            return this.f85685d;
        }
        if (!checkFilter(c)) {
            return false;
        }
        int length = this.f85684c.length - 1;
        int iM22758f = m22758f(c) & length;
        int i = iM22758f;
        do {
            char c2 = this.f85684c[i];
            if (c2 == 0) {
                return false;
            }
            if (c2 == c) {
                return true;
            }
            i = (i + 1) & length;
        } while (i != iM22758f);
        return false;
    }
}
