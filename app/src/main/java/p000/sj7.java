package p000;

import java.util.Collections;
import java.util.List;
import p000.n8b;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class sj7 {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f81964a;

    /* JADX INFO: renamed from: b */
    public final int f81965b;

    /* JADX INFO: renamed from: c */
    public final int f81966c;

    /* JADX INFO: renamed from: d */
    public final int f81967d;

    /* JADX INFO: renamed from: e */
    public final int f81968e;

    /* JADX INFO: renamed from: f */
    public final int f81969f;

    /* JADX INFO: renamed from: g */
    public final int f81970g;

    /* JADX INFO: renamed from: h */
    public final int f81971h;

    /* JADX INFO: renamed from: i */
    public final int f81972i;

    /* JADX INFO: renamed from: j */
    public final int f81973j;

    /* JADX INFO: renamed from: k */
    public final int f81974k;

    /* JADX INFO: renamed from: l */
    public final int f81975l;

    /* JADX INFO: renamed from: m */
    public final int f81976m;

    /* JADX INFO: renamed from: n */
    public final float f81977n;

    /* JADX INFO: renamed from: o */
    public final int f81978o;

    /* JADX INFO: renamed from: p */
    @hib
    public final String f81979p;

    /* JADX INFO: renamed from: q */
    @hib
    public final n8b.C9738k f81980q;

    private sj7(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, int i13, @hib String str, @hib n8b.C9738k c9738k) {
        this.f81964a = list;
        this.f81965b = i;
        this.f81966c = i2;
        this.f81967d = i3;
        this.f81968e = i4;
        this.f81969f = i5;
        this.f81970g = i6;
        this.f81971h = i7;
        this.f81972i = i8;
        this.f81973j = i9;
        this.f81974k = i10;
        this.f81975l = i11;
        this.f81976m = i12;
        this.f81977n = f;
        this.f81978o = i13;
        this.f81979p = str;
        this.f81980q = c9738k;
    }

    public static sj7 parse(jhc jhcVar) throws yhc {
        return parseImpl(jhcVar, false, null);
    }

    private static sj7 parseImpl(jhc jhcVar, boolean z, @hib n8b.C9738k c9738k) throws yhc {
        int i;
        int i2;
        n8b.C9734g h265Sei3dRefDisplayInfo;
        int i3;
        int i4;
        int i5;
        int i6;
        try {
            if (z) {
                jhcVar.skipBytes(4);
            } else {
                jhcVar.skipBytes(21);
            }
            int unsignedByte = jhcVar.readUnsignedByte() & 3;
            int unsignedByte2 = jhcVar.readUnsignedByte();
            int position = jhcVar.getPosition();
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < unsignedByte2; i9++) {
                jhcVar.skipBytes(1);
                int unsignedShort = jhcVar.readUnsignedShort();
                for (int i10 = 0; i10 < unsignedShort; i10++) {
                    int unsignedShort2 = jhcVar.readUnsignedShort();
                    i8 += unsignedShort2 + 4;
                    jhcVar.skipBytes(unsignedShort2);
                }
            }
            jhcVar.setPosition(position);
            byte[] bArr = new byte[i8];
            n8b.C9738k c9738k2 = c9738k;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            float f = 1.0f;
            String strBuildHevcCodecString = null;
            int i23 = 0;
            int i24 = 0;
            while (i23 < unsignedByte2) {
                int unsignedByte3 = jhcVar.readUnsignedByte() & 63;
                int unsignedShort3 = jhcVar.readUnsignedShort();
                int i25 = i7;
                n8b.C9738k h265VpsNalUnit = c9738k2;
                while (i25 < unsignedShort3) {
                    int unsignedShort4 = jhcVar.readUnsignedShort();
                    byte[] bArr2 = n8b.f63496C;
                    int i26 = unsignedByte2;
                    System.arraycopy(bArr2, i7, bArr, i24, bArr2.length);
                    int length = i24 + bArr2.length;
                    System.arraycopy(jhcVar.getData(), jhcVar.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 32 && i25 == 0) {
                        h265VpsNalUnit = n8b.parseH265VpsNalUnit(bArr, length, length + unsignedShort4);
                        i2 = i7;
                        i = unsignedShort3;
                    } else if (unsignedByte3 == 33 && i25 == 0) {
                        n8b.C9735h h265SpsNalUnit = n8b.parseH265SpsNalUnit(bArr, length, length + unsignedShort4, h265VpsNalUnit);
                        int i27 = h265SpsNalUnit.f63558b + 1;
                        int i28 = h265SpsNalUnit.f63564h;
                        int i29 = h265SpsNalUnit.f63565i;
                        int i30 = h265SpsNalUnit.f63566j;
                        int i31 = h265SpsNalUnit.f63567k;
                        i16 = h265SpsNalUnit.f63561e + 8;
                        i17 = h265SpsNalUnit.f63562f + 8;
                        int i32 = h265SpsNalUnit.f63570n;
                        int i33 = h265SpsNalUnit.f63571o;
                        int i34 = h265SpsNalUnit.f63572p;
                        float f2 = h265SpsNalUnit.f63568l;
                        int i35 = h265SpsNalUnit.f63569m;
                        n8b.C9730c c9730c = h265SpsNalUnit.f63559c;
                        if (c9730c != null) {
                            i3 = i35;
                            i4 = i27;
                            i = unsignedShort3;
                            i5 = i29;
                            i6 = i28;
                            strBuildHevcCodecString = d72.buildHevcCodecString(c9730c.f63533a, c9730c.f63534b, c9730c.f63535c, c9730c.f63536d, c9730c.f63537e, c9730c.f63538f);
                        } else {
                            i3 = i35;
                            i4 = i27;
                            i = unsignedShort3;
                            i5 = i29;
                            i6 = i28;
                        }
                        i11 = i4;
                        i12 = i6;
                        i2 = 0;
                        i14 = i30;
                        i13 = i5;
                        i22 = i3;
                        f = f2;
                        i20 = i34;
                        i19 = i33;
                        i18 = i32;
                        i15 = i31;
                    } else {
                        i = unsignedShort3;
                        if (unsignedByte3 != 39 || i25 != 0 || (h265Sei3dRefDisplayInfo = n8b.parseH265Sei3dRefDisplayInfo(bArr, length, length + unsignedShort4)) == null || h265VpsNalUnit == null) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            i21 = h265Sei3dRefDisplayInfo.f63551d == h265VpsNalUnit.f63579b.get(0).f63529b ? 4 : 5;
                        }
                    }
                    i24 = length + unsignedShort4;
                    jhcVar.skipBytes(unsignedShort4);
                    i25++;
                    i7 = i2;
                    unsignedByte2 = i26;
                    unsignedShort3 = i;
                }
                i23++;
                c9738k2 = h265VpsNalUnit;
            }
            return new sj7(i8 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), unsignedByte + 1, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, f, i22, strBuildHevcCodecString, c9738k2);
        } catch (ArrayIndexOutOfBoundsException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing");
            sb.append(z ? "L-HEVC config" : "HEVC config");
            throw yhc.createForMalformedContainer(sb.toString(), e);
        }
    }

    public static sj7 parseLayered(jhc jhcVar, n8b.C9738k c9738k) throws yhc {
        return parseImpl(jhcVar, true, c9738k);
    }
}
