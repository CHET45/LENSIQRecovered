package p000;

import android.util.SparseArray;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import p000.dkh;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m24 implements dkh.InterfaceC4836c {

    /* JADX INFO: renamed from: c */
    public static final int f59713c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f59714d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f59715e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f59716f = 8;

    /* JADX INFO: renamed from: g */
    public static final int f59717g = 16;

    /* JADX INFO: renamed from: h */
    public static final int f59718h = 32;

    /* JADX INFO: renamed from: i */
    public static final int f59719i = 64;

    /* JADX INFO: renamed from: j */
    public static final int f59720j = 134;

    /* JADX INFO: renamed from: a */
    public final int f59721a;

    /* JADX INFO: renamed from: b */
    public final List<kq6> f59722b;

    /* JADX INFO: renamed from: m24$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9103a {
    }

    public m24() {
        this(0);
    }

    private dve buildSeiReader(dkh.C4835b c4835b) {
        return new dve(getClosedCaptionFormats(c4835b));
    }

    private wyh buildUserDataReader(dkh.C4835b c4835b) {
        return new wyh(getClosedCaptionFormats(c4835b));
    }

    private List<kq6> getClosedCaptionFormats(dkh.C4835b c4835b) {
        String str;
        int i;
        if (isSet(32)) {
            return this.f59722b;
        }
        ihc ihcVar = new ihc(c4835b.f29904d);
        List<kq6> arrayList = this.f59722b;
        while (ihcVar.bytesLeft() > 0) {
            int unsignedByte = ihcVar.readUnsignedByte();
            int position = ihcVar.getPosition() + ihcVar.readUnsignedByte();
            if (unsignedByte == 134) {
                arrayList = new ArrayList<>();
                int unsignedByte2 = ihcVar.readUnsignedByte() & 31;
                for (int i2 = 0; i2 < unsignedByte2; i2++) {
                    String string = ihcVar.readString(3);
                    int unsignedByte3 = ihcVar.readUnsignedByte();
                    boolean z = (unsignedByte3 & 128) != 0;
                    if (z) {
                        i = unsignedByte3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte unsignedByte4 = (byte) ihcVar.readUnsignedByte();
                    ihcVar.skipBytes(1);
                    arrayList.add(new kq6.C8497b().setSampleMimeType(str).setLanguage(string).setAccessibilityChannel(i).setInitializationData(z ? c72.buildCea708InitializationData((unsignedByte4 & 64) != 0) : null).build());
                }
            }
            ihcVar.setPosition(position);
        }
        return arrayList;
    }

    private boolean isSet(int i) {
        return (i & this.f59721a) != 0;
    }

    @Override // p000.dkh.InterfaceC4836c
    public SparseArray<dkh> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    @Override // p000.dkh.InterfaceC4836c
    @hib
    public dkh createPayloadReader(int i, dkh.C4835b c4835b) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new qsc(new m1b(c4835b.f29902b));
            }
            if (i == 21) {
                return new qsc(new fr7());
            }
            if (i == 27) {
                if (isSet(4)) {
                    return null;
                }
                return new qsc(new sd7(buildSeiReader(c4835b), isSet(1), isSet(8)));
            }
            if (i == 36) {
                return new qsc(new ud7(buildSeiReader(c4835b)));
            }
            if (i == 89) {
                return new qsc(new tt4(c4835b.f29903c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new qsc(new C14918x5(c4835b.f29902b));
                }
                if (i == 257) {
                    return new wte(new mic("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (isSet(16)) {
                        return null;
                    }
                    return new wte(new mic("application/x-scte35"));
                }
                if (i != 135) {
                    switch (i) {
                        case 15:
                            if (!isSet(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!isSet(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i) {
                                case 130:
                                    if (!isSet(64)) {
                                    }
                                    break;
                            }
                            break;
                    }
                    return null;
                }
                return new qsc(new C10796p5(c4835b.f29902b));
            }
            return new qsc(new ls4(c4835b.f29902b));
        }
        return new qsc(new od7(buildUserDataReader(c4835b)));
    }

    public m24(int i) {
        this(i, kx7.m15110of());
    }

    public m24(int i, List<kq6> list) {
        this.f59721a = i;
        this.f59722b = list;
    }
}
