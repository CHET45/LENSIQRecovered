package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public final class rc2 {

    /* JADX INFO: renamed from: a */
    public static final byte f77764a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f77765b = 5;

    /* JADX INFO: renamed from: c */
    public static final int f77766c = 32;

    /* JADX INFO: renamed from: d */
    public static final int f77767d = 31;

    /* JADX INFO: renamed from: e */
    public static final int f77768e = 1073741823;

    /* JADX INFO: renamed from: f */
    public static final int f77769f = 3;

    /* JADX INFO: renamed from: g */
    public static final int f77770g = 4;

    /* JADX INFO: renamed from: h */
    public static final int f77771h = 256;

    /* JADX INFO: renamed from: i */
    public static final int f77772i = 255;

    /* JADX INFO: renamed from: j */
    public static final int f77773j = 65536;

    /* JADX INFO: renamed from: k */
    public static final int f77774k = 65535;

    private rc2() {
    }

    /* JADX INFO: renamed from: a */
    public static Object m21141a(int buckets) {
        if (buckets >= 2 && buckets <= 1073741824 && Integer.highestOneBit(buckets) == buckets) {
            return buckets <= 256 ? new byte[buckets] : buckets <= 65536 ? new short[buckets] : new int[buckets];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + buckets);
    }

    /* JADX INFO: renamed from: b */
    public static int m21142b(int value, int mask) {
        return value & (~mask);
    }

    /* JADX INFO: renamed from: c */
    public static int m21143c(int entry, int mask) {
        return entry & mask;
    }

    /* JADX INFO: renamed from: d */
    public static int m21144d(int prefix, int suffix, int mask) {
        return (prefix & (~mask)) | (suffix & mask);
    }

    /* JADX INFO: renamed from: e */
    public static int m21145e(int mask) {
        return (mask < 32 ? 4 : 2) * (mask + 1);
    }

    /* JADX INFO: renamed from: f */
    public static int m21146f(@wx1 Object key, @wx1 Object value, int mask, Object table, int[] entries, Object[] keys, @wx1 Object[] values) {
        int i;
        int i2;
        int iM25912d = yh7.m25912d(key);
        int i3 = iM25912d & mask;
        int iM21148h = m21148h(table, i3);
        if (iM21148h == 0) {
            return -1;
        }
        int iM21142b = m21142b(iM25912d, mask);
        int i4 = -1;
        while (true) {
            i = iM21148h - 1;
            i2 = entries[i];
            if (m21142b(i2, mask) == iM21142b && okb.equal(key, keys[i]) && (values == null || okb.equal(value, values[i]))) {
                break;
            }
            int iM21143c = m21143c(i2, mask);
            if (iM21143c == 0) {
                return -1;
            }
            i4 = i;
            iM21148h = iM21143c;
        }
        int iM21143c2 = m21143c(i2, mask);
        if (i4 == -1) {
            m21149i(table, i3, iM21143c2);
        } else {
            entries[i4] = m21144d(entries[i4], iM21143c2, mask);
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static void m21147g(Object table) {
        if (table instanceof byte[]) {
            Arrays.fill((byte[]) table, (byte) 0);
        } else if (table instanceof short[]) {
            Arrays.fill((short[]) table, (short) 0);
        } else {
            Arrays.fill((int[]) table, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m21148h(Object table, int index) {
        return table instanceof byte[] ? ((byte[]) table)[index] & 255 : table instanceof short[] ? ((short[]) table)[index] & iqh.f48007d : ((int[]) table)[index];
    }

    /* JADX INFO: renamed from: i */
    public static void m21149i(Object table, int index, int entry) {
        if (table instanceof byte[]) {
            ((byte[]) table)[index] = (byte) entry;
        } else if (table instanceof short[]) {
            ((short[]) table)[index] = (short) entry;
        } else {
            ((int[]) table)[index] = entry;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m21150j(int expectedSize) {
        return Math.max(4, yh7.m25909a(expectedSize + 1, 1.0d));
    }
}
