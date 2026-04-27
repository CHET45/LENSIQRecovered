package p000;

import android.util.SparseArray;
import androidx.media3.common.C1213a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import p000.ckh;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class l24 implements ckh.InterfaceC2370c {

    /* JADX INFO: renamed from: c */
    public static final int f55981c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f55982d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f55983e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f55984f = 8;

    /* JADX INFO: renamed from: g */
    public static final int f55985g = 16;

    /* JADX INFO: renamed from: h */
    public static final int f55986h = 32;

    /* JADX INFO: renamed from: i */
    public static final int f55987i = 64;

    /* JADX INFO: renamed from: j */
    public static final int f55988j = 134;

    /* JADX INFO: renamed from: a */
    public final int f55989a;

    /* JADX INFO: renamed from: b */
    public final List<C1213a> f55990b;

    /* JADX INFO: renamed from: l24$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8582a {
    }

    public l24() {
        this(0);
    }

    private eve buildSeiReader(ckh.C2369b c2369b) {
        return new eve(getClosedCaptionFormats(c2369b), "video/mp2t");
    }

    private yyh buildUserDataReader(ckh.C2369b c2369b) {
        return new yyh(getClosedCaptionFormats(c2369b), "video/mp2t");
    }

    private List<C1213a> getClosedCaptionFormats(ckh.C2369b c2369b) {
        String str;
        int i;
        if (isSet(32)) {
            return this.f55990b;
        }
        jhc jhcVar = new jhc(c2369b.f16849e);
        List<C1213a> arrayList = this.f55990b;
        while (jhcVar.bytesLeft() > 0) {
            int unsignedByte = jhcVar.readUnsignedByte();
            int position = jhcVar.getPosition() + jhcVar.readUnsignedByte();
            if (unsignedByte == 134) {
                arrayList = new ArrayList<>();
                int unsignedByte2 = jhcVar.readUnsignedByte() & 31;
                for (int i2 = 0; i2 < unsignedByte2; i2++) {
                    String string = jhcVar.readString(3);
                    int unsignedByte3 = jhcVar.readUnsignedByte();
                    boolean z = (unsignedByte3 & 128) != 0;
                    if (z) {
                        i = unsignedByte3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte unsignedByte4 = (byte) jhcVar.readUnsignedByte();
                    jhcVar.skipBytes(1);
                    arrayList.add(new C1213a.b().setSampleMimeType(str).setLanguage(string).setAccessibilityChannel(i).setInitializationData(z ? d72.buildCea708InitializationData((unsignedByte4 & 64) != 0) : null).build());
                }
            }
            jhcVar.setPosition(position);
        }
        return arrayList;
    }

    private boolean isSet(int i) {
        return (i & this.f55989a) != 0;
    }

    @Override // p000.ckh.InterfaceC2370c
    public SparseArray<ckh> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    @Override // p000.ckh.InterfaceC2370c
    @p000.hib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.ckh createPayloadReader(int r6, p000.ckh.C2369b r7) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l24.createPayloadReader(int, ckh$b):ckh");
    }

    public l24(int i) {
        this(i, kx7.m15110of());
    }

    public l24(int i, List<C1213a> list) {
        this.f55989a = i;
        this.f55990b = list;
    }
}
