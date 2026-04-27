package p000;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p000.tfd;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ufd {

    /* JADX INFO: renamed from: a */
    public static final int f87898a = 2037673328;

    /* JADX INFO: renamed from: b */
    public static final int f87899b = 1836279920;

    /* JADX INFO: renamed from: c */
    public static final int f87900c = 1918990112;

    /* JADX INFO: renamed from: d */
    public static final int f87901d = 1684433976;

    /* JADX INFO: renamed from: e */
    public static final int f87902e = 1835365224;

    /* JADX INFO: renamed from: f */
    public static final int f87903f = 1886547818;

    /* JADX INFO: renamed from: g */
    public static final int f87904g = 10000;

    /* JADX INFO: renamed from: h */
    public static final int f87905h = 32000;

    /* JADX INFO: renamed from: i */
    public static final int f87906i = 128000;

    private ufd() {
    }

    @hib
    public static tfd decode(byte[] bArr, int i) {
        ArrayList<tfd.C13014b> proj;
        ihc ihcVar = new ihc(bArr);
        try {
            proj = isProj(ihcVar) ? parseProj(ihcVar) : parseMshp(ihcVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            proj = null;
        }
        if (proj == null) {
            return null;
        }
        int size = proj.size();
        if (size == 1) {
            return new tfd(proj.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new tfd(proj.get(0), proj.get(1), i);
    }

    private static int decodeZigZag(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static boolean isProj(ihc ihcVar) {
        ihcVar.skipBytes(4);
        int i = ihcVar.readInt();
        ihcVar.setPosition(0);
        return i == 1886547818;
    }

    @hib
    private static tfd.C13014b parseMesh(ihc ihcVar) {
        int i = ihcVar.readInt();
        if (i > 10000) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = ihcVar.readFloat();
        }
        int i3 = ihcVar.readInt();
        if (i3 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) i) * 2.0d) / dLog);
        ghc ghcVar = new ghc(ihcVar.getData());
        int i4 = 8;
        ghcVar.setPosition(ihcVar.getPosition() * 8);
        float[] fArr2 = new float[i3 * 5];
        int i5 = 5;
        int[] iArr = new int[5];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3) {
            int i8 = 0;
            while (i8 < i5) {
                int iDecodeZigZag = iArr[i8] + decodeZigZag(ghcVar.readBits(iCeil));
                if (iDecodeZigZag >= i || iDecodeZigZag < 0) {
                    return null;
                }
                fArr2[i7] = fArr[iDecodeZigZag];
                iArr[i8] = iDecodeZigZag;
                i8++;
                i7++;
                i5 = 5;
            }
            i6++;
            i5 = 5;
        }
        ghcVar.setPosition((ghcVar.getPosition() + 7) & (-8));
        int i9 = 32;
        int bits = ghcVar.readBits(32);
        tfd.C13015c[] c13015cArr = new tfd.C13015c[bits];
        int i10 = 0;
        while (i10 < bits) {
            int bits2 = ghcVar.readBits(i4);
            int bits3 = ghcVar.readBits(i4);
            int bits4 = ghcVar.readBits(i9);
            if (bits4 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) i3) * d) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 * 2];
            int iDecodeZigZag2 = 0;
            for (int i11 = 0; i11 < bits4; i11++) {
                iDecodeZigZag2 += decodeZigZag(ghcVar.readBits(iCeil2));
                if (iDecodeZigZag2 < 0 || iDecodeZigZag2 >= i3) {
                    return null;
                }
                int i12 = i11 * 3;
                int i13 = iDecodeZigZag2 * 5;
                fArr3[i12] = fArr2[i13];
                fArr3[i12 + 1] = fArr2[i13 + 1];
                fArr3[i12 + 2] = fArr2[i13 + 2];
                int i14 = i11 * 2;
                fArr4[i14] = fArr2[i13 + 3];
                fArr4[i14 + 1] = fArr2[i13 + 4];
            }
            c13015cArr[i10] = new tfd.C13015c(bits2, fArr3, fArr4, bits3);
            i10++;
            i9 = 32;
            d = 2.0d;
            i4 = 8;
        }
        return new tfd.C13014b(c13015cArr);
    }

    @hib
    private static ArrayList<tfd.C13014b> parseMshp(ihc ihcVar) {
        if (ihcVar.readUnsignedByte() != 0) {
            return null;
        }
        ihcVar.skipBytes(7);
        int i = ihcVar.readInt();
        if (i == 1684433976) {
            ihc ihcVar2 = new ihc();
            Inflater inflater = new Inflater(true);
            try {
                if (!x0i.inflate(ihcVar, ihcVar2, inflater)) {
                    return null;
                }
                inflater.end();
                ihcVar = ihcVar2;
            } finally {
                inflater.end();
            }
        } else if (i != 1918990112) {
            return null;
        }
        return parseRawMshpData(ihcVar);
    }

    @hib
    private static ArrayList<tfd.C13014b> parseProj(ihc ihcVar) {
        int i;
        ihcVar.skipBytes(8);
        int position = ihcVar.getPosition();
        int iLimit = ihcVar.limit();
        while (position < iLimit && (i = ihcVar.readInt() + position) > position && i <= iLimit) {
            int i2 = ihcVar.readInt();
            if (i2 == 2037673328 || i2 == 1836279920) {
                ihcVar.setLimit(i);
                return parseMshp(ihcVar);
            }
            ihcVar.setPosition(i);
            position = i;
        }
        return null;
    }

    @hib
    private static ArrayList<tfd.C13014b> parseRawMshpData(ihc ihcVar) {
        ArrayList<tfd.C13014b> arrayList = new ArrayList<>();
        int position = ihcVar.getPosition();
        int iLimit = ihcVar.limit();
        while (position < iLimit) {
            int i = ihcVar.readInt() + position;
            if (i <= position || i > iLimit) {
                return null;
            }
            if (ihcVar.readInt() == 1835365224) {
                tfd.C13014b mesh = parseMesh(ihcVar);
                if (mesh == null) {
                    return null;
                }
                arrayList.add(mesh);
            }
            ihcVar.setPosition(i);
            position = i;
        }
        return arrayList;
    }
}
