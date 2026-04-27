package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ynh {
    @yh5
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m33387partitionnroSd4(long[] jArr, int i, int i2) {
        long jM31843getsVKNKU = pph.m31843getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compareUnsigned(pph.m31843getsVKNKU(jArr, i), jM31843getsVKNKU) < 0) {
                i++;
            }
            while (Long.compareUnsigned(pph.m31843getsVKNKU(jArr, i2), jM31843getsVKNKU) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM31843getsVKNKU2 = pph.m31843getsVKNKU(jArr, i);
                pph.m31848setk8EXiF4(jArr, i, pph.m31843getsVKNKU(jArr, i2));
                pph.m31848setk8EXiF4(jArr, i2, jM31843getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @yh5
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m33388partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM30088getw2LRezQ = hoh.m30088getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = bM30088getw2LRezQ & 255;
                if (md8.compare(hoh.m30088getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (md8.compare(hoh.m30088getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM30088getw2LRezQ2 = hoh.m30088getw2LRezQ(bArr, i);
                hoh.m30093setVurrAj0(bArr, i, hoh.m30088getw2LRezQ(bArr, i2));
                hoh.m30093setVurrAj0(bArr, i2, bM30088getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @yh5
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m33389partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM30551getMh2AYeg = jqh.m30551getMh2AYeg(sArr, i) & iqh.f48007d;
                i3 = sM30551getMh2AYeg & iqh.f48007d;
                if (md8.compare(iM30551getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (md8.compare(jqh.m30551getMh2AYeg(sArr, i2) & iqh.f48007d, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM30551getMh2AYeg2 = jqh.m30551getMh2AYeg(sArr, i);
                jqh.m30556set01HTLdE(sArr, i, jqh.m30551getMh2AYeg(sArr, i2));
                jqh.m30556set01HTLdE(sArr, i2, sM30551getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @yh5
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m33390partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM29590getpVg5ArA = fph.m29590getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compareUnsigned(fph.m29590getpVg5ArA(iArr, i), iM29590getpVg5ArA) < 0) {
                i++;
            }
            while (Integer.compareUnsigned(fph.m29590getpVg5ArA(iArr, i2), iM29590getpVg5ArA) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM29590getpVg5ArA2 = fph.m29590getpVg5ArA(iArr, i);
                fph.m29595setVXSXFK8(iArr, i, fph.m29590getpVg5ArA(iArr, i2));
                fph.m29595setVXSXFK8(iArr, i2, iM29590getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @yh5
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m33391quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM33387partitionnroSd4 = m33387partitionnroSd4(jArr, i, i2);
        int i3 = iM33387partitionnroSd4 - 1;
        if (i < i3) {
            m33391quickSortnroSd4(jArr, i, i3);
        }
        if (iM33387partitionnroSd4 < i2) {
            m33391quickSortnroSd4(jArr, iM33387partitionnroSd4, i2);
        }
    }

    @yh5
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m33392quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM33388partition4UcCI2c = m33388partition4UcCI2c(bArr, i, i2);
        int i3 = iM33388partition4UcCI2c - 1;
        if (i < i3) {
            m33392quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM33388partition4UcCI2c < i2) {
            m33392quickSort4UcCI2c(bArr, iM33388partition4UcCI2c, i2);
        }
    }

    @yh5
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m33393quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM33389partitionAa5vz7o = m33389partitionAa5vz7o(sArr, i, i2);
        int i3 = iM33389partitionAa5vz7o - 1;
        if (i < i3) {
            m33393quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM33389partitionAa5vz7o < i2) {
            m33393quickSortAa5vz7o(sArr, iM33389partitionAa5vz7o, i2);
        }
    }

    @yh5
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m33394quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM33390partitionoBK06Vg = m33390partitionoBK06Vg(iArr, i, i2);
        int i3 = iM33390partitionoBK06Vg - 1;
        if (i < i3) {
            m33394quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM33390partitionoBK06Vg < i2) {
            m33394quickSortoBK06Vg(iArr, iM33390partitionoBK06Vg, i2);
        }
    }

    @yh5
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m33395sortArraynroSd4(@yfb long[] jArr, int i, int i2) {
        md8.checkNotNullParameter(jArr, "array");
        m33391quickSortnroSd4(jArr, i, i2 - 1);
    }

    @yh5
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m33396sortArray4UcCI2c(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "array");
        m33392quickSort4UcCI2c(bArr, i, i2 - 1);
    }

    @yh5
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m33397sortArrayAa5vz7o(@yfb short[] sArr, int i, int i2) {
        md8.checkNotNullParameter(sArr, "array");
        m33393quickSortAa5vz7o(sArr, i, i2 - 1);
    }

    @yh5
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m33398sortArrayoBK06Vg(@yfb int[] iArr, int i, int i2) {
        md8.checkNotNullParameter(iArr, "array");
        m33394quickSortoBK06Vg(iArr, i, i2 - 1);
    }
}
