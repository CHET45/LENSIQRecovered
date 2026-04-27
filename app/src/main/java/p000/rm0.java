package p000;

import java.util.ArrayList;
import java.util.List;
import p000.o8b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class rm0 {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f78688a;

    /* JADX INFO: renamed from: b */
    public final int f78689b;

    /* JADX INFO: renamed from: c */
    public final int f78690c;

    /* JADX INFO: renamed from: d */
    public final int f78691d;

    /* JADX INFO: renamed from: e */
    public final int f78692e;

    /* JADX INFO: renamed from: f */
    public final int f78693f;

    /* JADX INFO: renamed from: g */
    public final int f78694g;

    /* JADX INFO: renamed from: h */
    public final float f78695h;

    /* JADX INFO: renamed from: i */
    @hib
    public final String f78696i;

    private rm0(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, float f, @hib String str) {
        this.f78688a = list;
        this.f78689b = i;
        this.f78690c = i2;
        this.f78691d = i3;
        this.f78692e = i4;
        this.f78693f = i5;
        this.f78694g = i6;
        this.f78695h = f;
        this.f78696i = str;
    }

    private static byte[] buildNalUnitForChild(ihc ihcVar) {
        int unsignedShort = ihcVar.readUnsignedShort();
        int position = ihcVar.getPosition();
        ihcVar.skipBytes(unsignedShort);
        return c72.buildNalUnit(ihcVar.getData(), position, unsignedShort);
    }

    public static rm0 parse(ihc ihcVar) throws xhc {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        String strBuildAvcCodecString;
        try {
            ihcVar.skipBytes(4);
            int unsignedByte = (ihcVar.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = ihcVar.readUnsignedByte() & 31;
            for (int i6 = 0; i6 < unsignedByte2; i6++) {
                arrayList.add(buildNalUnitForChild(ihcVar));
            }
            int unsignedByte3 = ihcVar.readUnsignedByte();
            for (int i7 = 0; i7 < unsignedByte3; i7++) {
                arrayList.add(buildNalUnitForChild(ihcVar));
            }
            if (unsignedByte2 > 0) {
                o8b.C10227c spsNalUnit = o8b.parseSpsNalUnit((byte[]) arrayList.get(0), unsignedByte, ((byte[]) arrayList.get(0)).length);
                int i8 = spsNalUnit.f66702f;
                int i9 = spsNalUnit.f66703g;
                int i10 = spsNalUnit.f66711o;
                int i11 = spsNalUnit.f66712p;
                int i12 = spsNalUnit.f66713q;
                float f2 = spsNalUnit.f66704h;
                strBuildAvcCodecString = c72.buildAvcCodecString(spsNalUnit.f66697a, spsNalUnit.f66698b, spsNalUnit.f66699c);
                i4 = i11;
                i5 = i12;
                f = f2;
                i = i8;
                i2 = i9;
                i3 = i10;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                f = 1.0f;
                strBuildAvcCodecString = null;
            }
            return new rm0(arrayList, unsignedByte, i, i2, i3, i4, i5, f, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw xhc.createForMalformedContainer("Error parsing AVC config", e);
        }
    }
}
