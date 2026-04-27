package p000;

import java.nio.ByteBuffer;
import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class oyf extends rif {

    /* JADX INFO: renamed from: d */
    public static final int f69226d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f69227e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f69228f = 5;

    /* JADX INFO: renamed from: g */
    public static final int f69229g = 6;

    /* JADX INFO: renamed from: h */
    public static final int f69230h = 255;

    /* JADX INFO: renamed from: a */
    public final jhc f69231a = new jhc();

    /* JADX INFO: renamed from: b */
    public final hhc f69232b = new hhc();

    /* JADX INFO: renamed from: c */
    public h2h f69233c;

    @Override // p000.rif
    /* JADX INFO: renamed from: a */
    public eta mo2551a(aua auaVar, ByteBuffer byteBuffer) {
        h2h h2hVar = this.f69233c;
        if (h2hVar == null || auaVar.f11889N != h2hVar.getTimestampOffsetUs()) {
            h2h h2hVar2 = new h2h(auaVar.f78610f);
            this.f69233c = h2hVar2;
            h2hVar2.adjustSampleTimestamp(auaVar.f78610f - auaVar.f11889N);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f69231a.reset(bArrArray, iLimit);
        this.f69232b.reset(bArrArray, iLimit);
        this.f69232b.skipBits(39);
        long bits = (((long) this.f69232b.readBits(1)) << 32) | ((long) this.f69232b.readBits(32));
        this.f69232b.skipBits(20);
        int bits2 = this.f69232b.readBits(12);
        int bits3 = this.f69232b.readBits(8);
        this.f69231a.skipBytes(14);
        eta.InterfaceC5464a interfaceC5464aM22308a = bits3 != 0 ? bits3 != 255 ? bits3 != 4 ? bits3 != 5 ? bits3 != 6 ? null : t0h.m22308a(this.f69231a, bits, this.f69233c) : pyf.m19850a(this.f69231a, bits, this.f69233c) : ryf.m21604a(this.f69231a) : ncd.m17844a(this.f69231a, bits2, bits) : new qyf();
        return interfaceC5464aM22308a == null ? new eta(new eta.InterfaceC5464a[0]) : new eta(interfaceC5464aM22308a);
    }
}
