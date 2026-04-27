package p000;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class iuf {

    /* JADX INFO: renamed from: a */
    public static final int f48527a = 1903435808;

    /* JADX INFO: renamed from: b */
    public static final int f48528b = 1751476579;

    /* JADX INFO: renamed from: c */
    public static final int f48529c = 4096;

    /* JADX INFO: renamed from: d */
    public static final int[] f48530d = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private iuf() {
    }

    private static boolean isCompatibleBrand(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f48530d) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @hib
    public static huf sniffFragmented(ak5 ak5Var) throws IOException {
        return sniffInternal(ak5Var, true, false);
    }

    @hib
    private static huf sniffInternal(ak5 ak5Var, boolean z, boolean z2) throws IOException {
        int i;
        int i2;
        int i3;
        boolean z3;
        int[] iArr;
        long length = ak5Var.getLength();
        long j = -1;
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (length != -1 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = length;
        }
        int i4 = (int) j2;
        jhc jhcVar = new jhc(64);
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (i6 < i4) {
            jhcVar.reset(8);
            if (!ak5Var.peekFully(jhcVar.getData(), i5, 8, true)) {
                break;
            }
            long unsignedInt = jhcVar.readUnsignedInt();
            int i7 = jhcVar.readInt();
            if (unsignedInt == 1) {
                ak5Var.peekFully(jhcVar.getData(), 8, 8);
                i2 = 16;
                jhcVar.setLimit(16);
                unsignedInt = jhcVar.readLong();
            } else {
                if (unsignedInt == 0) {
                    long length2 = ak5Var.getLength();
                    if (length2 != j) {
                        unsignedInt = (length2 - ak5Var.getPeekPosition()) + ((long) 8);
                    }
                }
                i2 = 8;
            }
            long j3 = unsignedInt;
            long j4 = i2;
            if (j3 < j4) {
                return new kb0(i7, j3, i2);
            }
            i6 += i2;
            if (i7 == 1836019574) {
                i4 += (int) j3;
                if (length != -1 && i4 > length) {
                    i4 = (int) length;
                }
            } else {
                if (i7 == 1836019558 || i7 == 1836475768) {
                    i = 1;
                    break;
                }
                long j5 = length;
                if (i7 == 1835295092) {
                    z4 = true;
                }
                if ((((long) i6) + j3) - j4 >= i4) {
                    i = 0;
                    break;
                }
                int i8 = (int) (j3 - j4);
                i6 += i8;
                if (i7 != 1718909296) {
                    i3 = 0;
                    if (i8 != 0) {
                        ak5Var.advancePeekPosition(i8);
                    }
                } else {
                    if (i8 < 8) {
                        return new kb0(i7, i8, 8);
                    }
                    jhcVar.reset(i8);
                    i3 = 0;
                    ak5Var.peekFully(jhcVar.getData(), 0, i8);
                    int i9 = jhcVar.readInt();
                    if (isCompatibleBrand(i9, z2)) {
                        z4 = true;
                    }
                    jhcVar.skipBytes(4);
                    int iBytesLeft = jhcVar.bytesLeft() / 4;
                    if (!z4 && iBytesLeft > 0) {
                        iArr = new int[iBytesLeft];
                        int i10 = 0;
                        while (true) {
                            if (i10 >= iBytesLeft) {
                                z3 = z4;
                                break;
                            }
                            int i11 = jhcVar.readInt();
                            iArr[i10] = i11;
                            if (isCompatibleBrand(i11, z2)) {
                                z3 = true;
                                break;
                            }
                            i10++;
                        }
                    } else {
                        z3 = z4;
                        iArr = null;
                    }
                    if (!z3) {
                        return new qvh(i9, iArr);
                    }
                    z4 = z3;
                }
                i5 = i3;
                length = j5;
            }
            j = -1;
        }
        i = i5;
        if (!z4) {
            return edb.f32707a;
        }
        if (z != i) {
            return i != 0 ? mz7.f62844b : mz7.f62845c;
        }
        return null;
    }

    @hib
    public static huf sniffUnfragmented(ak5 ak5Var, boolean z) throws IOException {
        return sniffInternal(ak5Var, false, z);
    }
}
