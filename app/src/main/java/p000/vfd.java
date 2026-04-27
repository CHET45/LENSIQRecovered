package p000;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p000.sfd;

/* JADX INFO: loaded from: classes3.dex */
public final class vfd {

    /* JADX INFO: renamed from: a */
    public static final int f90877a = 2037673328;

    /* JADX INFO: renamed from: b */
    public static final int f90878b = 1836279920;

    /* JADX INFO: renamed from: c */
    public static final int f90879c = 1918990112;

    /* JADX INFO: renamed from: d */
    public static final int f90880d = 1684433976;

    /* JADX INFO: renamed from: e */
    public static final int f90881e = 1835365224;

    /* JADX INFO: renamed from: f */
    public static final int f90882f = 1886547818;

    /* JADX INFO: renamed from: g */
    public static final int f90883g = 10000;

    /* JADX INFO: renamed from: h */
    public static final int f90884h = 32000;

    /* JADX INFO: renamed from: i */
    public static final int f90885i = 128000;

    private vfd() {
    }

    @hib
    public static sfd decode(byte[] bArr, int i) {
        ArrayList<sfd.C12557b> proj;
        jhc jhcVar = new jhc(bArr);
        try {
            proj = isProj(jhcVar) ? parseProj(jhcVar) : parseMshp(jhcVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            proj = null;
        }
        if (proj == null) {
            return null;
        }
        int size = proj.size();
        if (size == 1) {
            return new sfd(proj.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new sfd(proj.get(0), proj.get(1), i);
    }

    private static int decodeZigZag(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static boolean isProj(jhc jhcVar) {
        jhcVar.skipBytes(4);
        int i = jhcVar.readInt();
        jhcVar.setPosition(0);
        return i == 1886547818;
    }

    @hib
    private static sfd.C12557b parseMesh(jhc jhcVar) {
        int i = jhcVar.readInt();
        if (i > 10000) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = jhcVar.readFloat();
        }
        int i3 = jhcVar.readInt();
        if (i3 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) i) * 2.0d) / dLog);
        hhc hhcVar = new hhc(jhcVar.getData());
        int i4 = 8;
        hhcVar.setPosition(jhcVar.getPosition() * 8);
        float[] fArr2 = new float[i3 * 5];
        int i5 = 5;
        int[] iArr = new int[5];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3) {
            int i8 = 0;
            while (i8 < i5) {
                int iDecodeZigZag = iArr[i8] + decodeZigZag(hhcVar.readBits(iCeil));
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
        hhcVar.setPosition((hhcVar.getPosition() + 7) & (-8));
        int i9 = 32;
        int bits = hhcVar.readBits(32);
        sfd.C12558c[] c12558cArr = new sfd.C12558c[bits];
        int i10 = 0;
        while (i10 < bits) {
            int bits2 = hhcVar.readBits(i4);
            int bits3 = hhcVar.readBits(i4);
            int bits4 = hhcVar.readBits(i9);
            if (bits4 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) i3) * d) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 * 2];
            int iDecodeZigZag2 = 0;
            for (int i11 = 0; i11 < bits4; i11++) {
                iDecodeZigZag2 += decodeZigZag(hhcVar.readBits(iCeil2));
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
            c12558cArr[i10] = new sfd.C12558c(bits2, fArr3, fArr4, bits3);
            i10++;
            i9 = 32;
            d = 2.0d;
            i4 = 8;
        }
        return new sfd.C12557b(c12558cArr);
    }

    @hib
    private static ArrayList<sfd.C12557b> parseMshp(jhc jhcVar) {
        if (jhcVar.readUnsignedByte() != 0) {
            return null;
        }
        jhcVar.skipBytes(7);
        int i = jhcVar.readInt();
        if (i == 1684433976) {
            jhc jhcVar2 = new jhc();
            Inflater inflater = new Inflater(true);
            try {
                if (!t0i.inflate(jhcVar, jhcVar2, inflater)) {
                    return null;
                }
                inflater.end();
                jhcVar = jhcVar2;
            } finally {
                inflater.end();
            }
        } else if (i != 1918990112) {
            return null;
        }
        return parseRawMshpData(jhcVar);
    }

    @hib
    private static ArrayList<sfd.C12557b> parseProj(jhc jhcVar) {
        int i;
        jhcVar.skipBytes(8);
        int position = jhcVar.getPosition();
        int iLimit = jhcVar.limit();
        while (position < iLimit && (i = jhcVar.readInt() + position) > position && i <= iLimit) {
            int i2 = jhcVar.readInt();
            if (i2 == 2037673328 || i2 == 1836279920) {
                jhcVar.setLimit(i);
                return parseMshp(jhcVar);
            }
            jhcVar.setPosition(i);
            position = i;
        }
        return null;
    }

    @hib
    private static ArrayList<sfd.C12557b> parseRawMshpData(jhc jhcVar) {
        ArrayList<sfd.C12557b> arrayList = new ArrayList<>();
        int position = jhcVar.getPosition();
        int iLimit = jhcVar.limit();
        while (position < iLimit) {
            int i = jhcVar.readInt() + position;
            if (i <= position || i > iLimit) {
                return null;
            }
            if (jhcVar.readInt() == 1835365224) {
                sfd.C12557b mesh = parseMesh(jhcVar);
                if (mesh == null) {
                    return null;
                }
                arrayList.add(mesh);
            }
            jhcVar.setPosition(i);
            position = i;
        }
        return arrayList;
    }
}
