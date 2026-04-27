package p000;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class kuf {

    /* JADX INFO: renamed from: a */
    public static final int f55386a = 1903435808;

    /* JADX INFO: renamed from: b */
    public static final int f55387b = 1751476579;

    /* JADX INFO: renamed from: c */
    public static final int f55388c = 4096;

    /* JADX INFO: renamed from: d */
    public static final int[] f55389d = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private kuf() {
    }

    private static boolean isCompatibleBrand(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f55389d) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean sniffFragmented(zj5 zj5Var) throws IOException {
        return sniffInternal(zj5Var, true, false);
    }

    private static boolean sniffInternal(zj5 zj5Var, boolean z, boolean z2) throws IOException {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        long length = zj5Var.getLength();
        long j = -1;
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i2 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = length;
        }
        int i3 = (int) j2;
        ihc ihcVar = new ihc(64);
        boolean z8 = false;
        int i4 = 0;
        boolean z9 = false;
        while (i4 < i3) {
            ihcVar.reset(8);
            if (!zj5Var.peekFully(ihcVar.getData(), z8 ? 1 : 0, 8, true)) {
                break;
            }
            long unsignedInt = ihcVar.readUnsignedInt();
            int i5 = ihcVar.readInt();
            if (unsignedInt == 1) {
                zj5Var.peekFully(ihcVar.getData(), 8, 8);
                ihcVar.setLimit(16);
                i = 16;
                unsignedInt = ihcVar.readLong();
            } else {
                if (unsignedInt == 0) {
                    long length2 = zj5Var.getLength();
                    if (length2 != j) {
                        unsignedInt = (length2 - zj5Var.getPeekPosition()) + ((long) 8);
                    }
                }
                i = 8;
            }
            long j3 = i;
            if (unsignedInt < j3) {
                return z8;
            }
            i4 += i;
            if (i5 == 1836019574) {
                i3 += (int) unsignedInt;
                if (i2 != 0 && i3 > length) {
                    i3 = (int) length;
                }
            } else {
                if (i5 == 1836019558 || i5 == 1836475768) {
                    z3 = z8 ? 1 : 0;
                    z4 = true;
                    z5 = true;
                    break;
                }
                int i6 = i2;
                if ((((long) i4) + unsignedInt) - j3 >= i3) {
                    z3 = false;
                    z4 = true;
                    break;
                }
                int i7 = (int) (unsignedInt - j3);
                i4 += i7;
                if (i5 != 1718909296) {
                    z6 = false;
                    z9 = z9;
                    if (i7 != 0) {
                        zj5Var.advancePeekPosition(i7);
                        z9 = z9;
                    }
                } else {
                    if (i7 < 8) {
                        return false;
                    }
                    ihcVar.reset(i7);
                    zj5Var.peekFully(ihcVar.getData(), 0, i7);
                    int i8 = i7 / 4;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= i8) {
                            z7 = z9;
                            break;
                        }
                        if (i9 == 1) {
                            ihcVar.skipBytes(4);
                        } else if (isCompatibleBrand(ihcVar.readInt(), z2)) {
                            z7 = true;
                            break;
                        }
                        i9++;
                    }
                    if (!z7) {
                        return false;
                    }
                    z6 = false;
                    z9 = z7;
                }
                z8 = z6;
                i2 = i6;
            }
            j = -1;
            z9 = z9;
        }
        z3 = z8 ? 1 : 0;
        z4 = true;
        z5 = z3 ? 1 : 0;
        return (z9 && z == z5) ? z4 : z3;
    }

    public static boolean sniffUnfragmented(zj5 zj5Var) throws IOException {
        return sniffInternal(zj5Var, false, false);
    }

    public static boolean sniffUnfragmented(zj5 zj5Var, boolean z) throws IOException {
        return sniffInternal(zj5Var, false, z);
    }
}
