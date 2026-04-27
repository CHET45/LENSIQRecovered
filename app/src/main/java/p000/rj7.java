package p000;

import java.util.Collections;
import java.util.List;
import p000.o8b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class rj7 {

    /* JADX INFO: renamed from: j */
    public static final int f78445j = 33;

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f78446a;

    /* JADX INFO: renamed from: b */
    public final int f78447b;

    /* JADX INFO: renamed from: c */
    public final int f78448c;

    /* JADX INFO: renamed from: d */
    public final int f78449d;

    /* JADX INFO: renamed from: e */
    public final int f78450e;

    /* JADX INFO: renamed from: f */
    public final int f78451f;

    /* JADX INFO: renamed from: g */
    public final int f78452g;

    /* JADX INFO: renamed from: h */
    public final float f78453h;

    /* JADX INFO: renamed from: i */
    @hib
    public final String f78454i;

    private rj7(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, float f, @hib String str) {
        this.f78446a = list;
        this.f78447b = i;
        this.f78448c = i2;
        this.f78449d = i3;
        this.f78450e = i4;
        this.f78451f = i5;
        this.f78452g = i6;
        this.f78453h = f;
        this.f78454i = str;
    }

    public static rj7 parse(ihc ihcVar) throws xhc {
        int i;
        int i2;
        try {
            ihcVar.skipBytes(21);
            int unsignedByte = ihcVar.readUnsignedByte() & 3;
            int unsignedByte2 = ihcVar.readUnsignedByte();
            int position = ihcVar.getPosition();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < unsignedByte2; i5++) {
                ihcVar.skipBytes(1);
                int unsignedShort = ihcVar.readUnsignedShort();
                for (int i6 = 0; i6 < unsignedShort; i6++) {
                    int unsignedShort2 = ihcVar.readUnsignedShort();
                    i4 += unsignedShort2 + 4;
                    ihcVar.skipBytes(unsignedShort2);
                }
            }
            ihcVar.setPosition(position);
            byte[] bArr = new byte[i4];
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            float f = 1.0f;
            String strBuildHevcCodecString = null;
            int i12 = 0;
            int i13 = 0;
            while (i12 < unsignedByte2) {
                int unsignedByte3 = ihcVar.readUnsignedByte() & 63;
                int unsignedShort3 = ihcVar.readUnsignedShort();
                int i14 = i3;
                while (i14 < unsignedShort3) {
                    int unsignedShort4 = ihcVar.readUnsignedShort();
                    byte[] bArr2 = o8b.f66670i;
                    int i15 = unsignedByte2;
                    System.arraycopy(bArr2, i3, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(ihcVar.getData(), ihcVar.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 33 && i14 == 0) {
                        o8b.C10225a h265SpsNalUnit = o8b.parseH265SpsNalUnit(bArr, length, length + unsignedShort4);
                        int i16 = h265SpsNalUnit.f66688k;
                        i8 = h265SpsNalUnit.f66689l;
                        i9 = h265SpsNalUnit.f66691n;
                        int i17 = h265SpsNalUnit.f66692o;
                        int i18 = h265SpsNalUnit.f66693p;
                        float f2 = h265SpsNalUnit.f66690m;
                        i = unsignedByte3;
                        i2 = unsignedShort3;
                        i7 = i16;
                        strBuildHevcCodecString = c72.buildHevcCodecString(h265SpsNalUnit.f66678a, h265SpsNalUnit.f66679b, h265SpsNalUnit.f66680c, h265SpsNalUnit.f66681d, h265SpsNalUnit.f66685h, h265SpsNalUnit.f66686i);
                        i11 = i18;
                        i10 = i17;
                        f = f2;
                    } else {
                        i = unsignedByte3;
                        i2 = unsignedShort3;
                    }
                    i13 = length + unsignedShort4;
                    ihcVar.skipBytes(unsignedShort4);
                    i14++;
                    unsignedByte2 = i15;
                    unsignedByte3 = i;
                    unsignedShort3 = i2;
                    i3 = 0;
                }
                i12++;
                i3 = 0;
            }
            return new rj7(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), unsignedByte + 1, i7, i8, i9, i10, i11, f, strBuildHevcCodecString);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw xhc.createForMalformedContainer("Error parsing HEVC config", e);
        }
    }
}
