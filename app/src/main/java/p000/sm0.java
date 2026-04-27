package p000;

import java.util.ArrayList;
import java.util.List;
import p000.n8b;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class sm0 {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f82197a;

    /* JADX INFO: renamed from: b */
    public final int f82198b;

    /* JADX INFO: renamed from: c */
    public final int f82199c;

    /* JADX INFO: renamed from: d */
    public final int f82200d;

    /* JADX INFO: renamed from: e */
    public final int f82201e;

    /* JADX INFO: renamed from: f */
    public final int f82202f;

    /* JADX INFO: renamed from: g */
    public final int f82203g;

    /* JADX INFO: renamed from: h */
    public final int f82204h;

    /* JADX INFO: renamed from: i */
    public final int f82205i;

    /* JADX INFO: renamed from: j */
    public final int f82206j;

    /* JADX INFO: renamed from: k */
    public final float f82207k;

    /* JADX INFO: renamed from: l */
    @hib
    public final String f82208l;

    private sm0(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, @hib String str) {
        this.f82197a = list;
        this.f82198b = i;
        this.f82199c = i2;
        this.f82200d = i3;
        this.f82201e = i4;
        this.f82202f = i5;
        this.f82203g = i6;
        this.f82204h = i7;
        this.f82205i = i8;
        this.f82206j = i9;
        this.f82207k = f;
        this.f82208l = str;
    }

    private static byte[] buildNalUnitForChild(jhc jhcVar) {
        int unsignedShort = jhcVar.readUnsignedShort();
        int position = jhcVar.getPosition();
        jhcVar.skipBytes(unsignedShort);
        return d72.buildNalUnit(jhcVar.getData(), position, unsignedShort);
    }

    public static sm0 parse(jhc jhcVar) throws yhc {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        String strBuildAvcCodecString;
        int i8;
        try {
            jhcVar.skipBytes(4);
            int unsignedByte = (jhcVar.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = jhcVar.readUnsignedByte() & 31;
            for (int i9 = 0; i9 < unsignedByte2; i9++) {
                arrayList.add(buildNalUnitForChild(jhcVar));
            }
            int unsignedByte3 = jhcVar.readUnsignedByte();
            for (int i10 = 0; i10 < unsignedByte3; i10++) {
                arrayList.add(buildNalUnitForChild(jhcVar));
            }
            if (unsignedByte2 > 0) {
                n8b.C9740m spsNalUnit = n8b.parseSpsNalUnit((byte[]) arrayList.get(0), n8b.f63496C.length, ((byte[]) arrayList.get(0)).length);
                int i11 = spsNalUnit.f63591f;
                int i12 = spsNalUnit.f63592g;
                int i13 = spsNalUnit.f63594i + 8;
                int i14 = spsNalUnit.f63595j + 8;
                int i15 = spsNalUnit.f63602q;
                int i16 = spsNalUnit.f63603r;
                int i17 = spsNalUnit.f63604s;
                int i18 = spsNalUnit.f63605t;
                float f2 = spsNalUnit.f63593h;
                strBuildAvcCodecString = d72.buildAvcCodecString(spsNalUnit.f63586a, spsNalUnit.f63587b, spsNalUnit.f63588c);
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                f = 1.0f;
                strBuildAvcCodecString = null;
                i8 = 16;
            }
            return new sm0(arrayList, unsignedByte, i, i2, i3, i4, i5, i6, i7, i8, f, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw yhc.createForMalformedContainer("Error parsing AVC config", e);
        }
    }
}
