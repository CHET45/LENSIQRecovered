package p000;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class pt4 extends djf {

    /* JADX INFO: renamed from: o */
    public final rt4 f71985o;

    public pt4(List<byte[]> list) {
        super("DvbDecoder");
        ihc ihcVar = new ihc(list.get(0));
        this.f71985o = new rt4(ihcVar.readUnsignedShort(), ihcVar.readUnsignedShort());
    }

    @Override // p000.djf
    /* JADX INFO: renamed from: l */
    public xdg mo9213l(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f71985o.reset();
        }
        return new st4(this.f71985o.decode(bArr, i));
    }
}
