package p000;

import p000.kq6;
import p000.tlg;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c8i extends tlg {

    /* JADX INFO: renamed from: h */
    public static final int f15981h = 7;

    /* JADX INFO: renamed from: i */
    public static final int f15982i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f15983j = 5;

    /* JADX INFO: renamed from: k */
    public static final int f15984k = 0;

    /* JADX INFO: renamed from: l */
    public static final int f15985l = 1;

    /* JADX INFO: renamed from: b */
    public final ihc f15986b;

    /* JADX INFO: renamed from: c */
    public final ihc f15987c;

    /* JADX INFO: renamed from: d */
    public int f15988d;

    /* JADX INFO: renamed from: e */
    public boolean f15989e;

    /* JADX INFO: renamed from: f */
    public boolean f15990f;

    /* JADX INFO: renamed from: g */
    public int f15991g;

    public c8i(r6h r6hVar) {
        super(r6hVar);
        this.f15986b = new ihc(o8b.f66670i);
        this.f15987c = new ihc(4);
    }

    @Override // p000.tlg
    /* JADX INFO: renamed from: a */
    public boolean mo3841a(ihc ihcVar) throws tlg.C13099a {
        int unsignedByte = ihcVar.readUnsignedByte();
        int i = (unsignedByte >> 4) & 15;
        int i2 = unsignedByte & 15;
        if (i2 == 7) {
            this.f15991g = i;
            return i != 5;
        }
        throw new tlg.C13099a("Video format not supported: " + i2);
    }

    @Override // p000.tlg
    /* JADX INFO: renamed from: b */
    public boolean mo3842b(ihc ihcVar, long j) throws xhc {
        int unsignedByte = ihcVar.readUnsignedByte();
        long int24 = j + (((long) ihcVar.readInt24()) * 1000);
        if (unsignedByte == 0 && !this.f15989e) {
            ihc ihcVar2 = new ihc(new byte[ihcVar.bytesLeft()]);
            ihcVar.readBytes(ihcVar2.getData(), 0, ihcVar.bytesLeft());
            rm0 rm0Var = rm0.parse(ihcVar2);
            this.f15988d = rm0Var.f78689b;
            this.f85288a.format(new kq6.C8497b().setSampleMimeType("video/avc").setCodecs(rm0Var.f78696i).setWidth(rm0Var.f78690c).setHeight(rm0Var.f78691d).setPixelWidthHeightRatio(rm0Var.f78695h).setInitializationData(rm0Var.f78688a).build());
            this.f15989e = true;
            return false;
        }
        if (unsignedByte != 1 || !this.f15989e) {
            return false;
        }
        int i = this.f15991g == 1 ? 1 : 0;
        if (!this.f15990f && i == 0) {
            return false;
        }
        byte[] data = this.f15987c.getData();
        data[0] = 0;
        data[1] = 0;
        data[2] = 0;
        int i2 = 4 - this.f15988d;
        int i3 = 0;
        while (ihcVar.bytesLeft() > 0) {
            ihcVar.readBytes(this.f15987c.getData(), i2, this.f15988d);
            this.f15987c.setPosition(0);
            int unsignedIntToInt = this.f15987c.readUnsignedIntToInt();
            this.f15986b.setPosition(0);
            this.f85288a.sampleData(this.f15986b, 4);
            this.f85288a.sampleData(ihcVar, unsignedIntToInt);
            i3 = i3 + 4 + unsignedIntToInt;
        }
        this.f85288a.sampleMetadata(int24, i, i3, 0, null);
        this.f15990f = true;
        return true;
    }

    @Override // p000.tlg
    public void seek() {
        this.f15990f = false;
    }
}
