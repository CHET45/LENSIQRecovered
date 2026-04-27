package p000;

import androidx.media3.common.C1213a;
import p000.slg;

/* JADX INFO: loaded from: classes3.dex */
public final class d8i extends slg {

    /* JADX INFO: renamed from: h */
    public static final int f28759h = 7;

    /* JADX INFO: renamed from: i */
    public static final int f28760i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f28761j = 5;

    /* JADX INFO: renamed from: k */
    public static final int f28762k = 0;

    /* JADX INFO: renamed from: l */
    public static final int f28763l = 1;

    /* JADX INFO: renamed from: b */
    public final jhc f28764b;

    /* JADX INFO: renamed from: c */
    public final jhc f28765c;

    /* JADX INFO: renamed from: d */
    public int f28766d;

    /* JADX INFO: renamed from: e */
    public boolean f28767e;

    /* JADX INFO: renamed from: f */
    public boolean f28768f;

    /* JADX INFO: renamed from: g */
    public int f28769g;

    public d8i(q6h q6hVar) {
        super(q6hVar);
        this.f28764b = new jhc(n8b.f63496C);
        this.f28765c = new jhc(4);
    }

    @Override // p000.slg
    /* JADX INFO: renamed from: a */
    public boolean mo8983a(jhc jhcVar) throws slg.C12653a {
        int unsignedByte = jhcVar.readUnsignedByte();
        int i = (unsignedByte >> 4) & 15;
        int i2 = unsignedByte & 15;
        if (i2 == 7) {
            this.f28769g = i;
            return i != 5;
        }
        throw new slg.C12653a("Video format not supported: " + i2);
    }

    @Override // p000.slg
    /* JADX INFO: renamed from: b */
    public boolean mo8984b(jhc jhcVar, long j) throws yhc {
        int unsignedByte = jhcVar.readUnsignedByte();
        long int24 = j + (((long) jhcVar.readInt24()) * 1000);
        if (unsignedByte == 0 && !this.f28767e) {
            jhc jhcVar2 = new jhc(new byte[jhcVar.bytesLeft()]);
            jhcVar.readBytes(jhcVar2.getData(), 0, jhcVar.bytesLeft());
            sm0 sm0Var = sm0.parse(jhcVar2);
            this.f28766d = sm0Var.f82198b;
            this.f82196a.format(new C1213a.b().setContainerMimeType("video/x-flv").setSampleMimeType("video/avc").setCodecs(sm0Var.f82208l).setWidth(sm0Var.f82199c).setHeight(sm0Var.f82200d).setPixelWidthHeightRatio(sm0Var.f82207k).setInitializationData(sm0Var.f82197a).build());
            this.f28767e = true;
            return false;
        }
        if (unsignedByte != 1 || !this.f28767e) {
            return false;
        }
        int i = this.f28769g == 1 ? 1 : 0;
        if (!this.f28768f && i == 0) {
            return false;
        }
        byte[] data = this.f28765c.getData();
        data[0] = 0;
        data[1] = 0;
        data[2] = 0;
        int i2 = 4 - this.f28766d;
        int i3 = 0;
        while (jhcVar.bytesLeft() > 0) {
            jhcVar.readBytes(this.f28765c.getData(), i2, this.f28766d);
            this.f28765c.setPosition(0);
            int unsignedIntToInt = this.f28765c.readUnsignedIntToInt();
            this.f28764b.setPosition(0);
            this.f82196a.sampleData(this.f28764b, 4);
            this.f82196a.sampleData(jhcVar, unsignedIntToInt);
            i3 = i3 + 4 + unsignedIntToInt;
        }
        this.f82196a.sampleMetadata(int24, i, i3, 0, null);
        this.f28768f = true;
        return true;
    }

    @Override // p000.slg
    public void seek() {
        this.f28768f = false;
    }
}
