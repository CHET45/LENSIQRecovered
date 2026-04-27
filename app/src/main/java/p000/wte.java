package p000;

import p000.dkh;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class wte implements dkh {

    /* JADX INFO: renamed from: j */
    public static final int f95498j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f95499k = 32;

    /* JADX INFO: renamed from: l */
    public static final int f95500l = 4098;

    /* JADX INFO: renamed from: d */
    public final ute f95501d;

    /* JADX INFO: renamed from: e */
    public final ihc f95502e = new ihc(32);

    /* JADX INFO: renamed from: f */
    public int f95503f;

    /* JADX INFO: renamed from: g */
    public int f95504g;

    /* JADX INFO: renamed from: h */
    public boolean f95505h;

    /* JADX INFO: renamed from: i */
    public boolean f95506i;

    public wte(ute uteVar) {
        this.f95501d = uteVar;
    }

    @Override // p000.dkh
    public void consume(ihc ihcVar, int i) {
        boolean z = (i & 1) != 0;
        int position = z ? ihcVar.getPosition() + ihcVar.readUnsignedByte() : -1;
        if (this.f95506i) {
            if (!z) {
                return;
            }
            this.f95506i = false;
            ihcVar.setPosition(position);
            this.f95504g = 0;
        }
        while (ihcVar.bytesLeft() > 0) {
            int i2 = this.f95504g;
            if (i2 < 3) {
                if (i2 == 0) {
                    int unsignedByte = ihcVar.readUnsignedByte();
                    ihcVar.setPosition(ihcVar.getPosition() - 1);
                    if (unsignedByte == 255) {
                        this.f95506i = true;
                        return;
                    }
                }
                int iMin = Math.min(ihcVar.bytesLeft(), 3 - this.f95504g);
                ihcVar.readBytes(this.f95502e.getData(), this.f95504g, iMin);
                int i3 = this.f95504g + iMin;
                this.f95504g = i3;
                if (i3 == 3) {
                    this.f95502e.setPosition(0);
                    this.f95502e.setLimit(3);
                    this.f95502e.skipBytes(1);
                    int unsignedByte2 = this.f95502e.readUnsignedByte();
                    int unsignedByte3 = this.f95502e.readUnsignedByte();
                    this.f95505h = (unsignedByte2 & 128) != 0;
                    this.f95503f = (((unsignedByte2 & 15) << 8) | unsignedByte3) + 3;
                    int iCapacity = this.f95502e.capacity();
                    int i4 = this.f95503f;
                    if (iCapacity < i4) {
                        this.f95502e.ensureCapacity(Math.min(4098, Math.max(i4, this.f95502e.capacity() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(ihcVar.bytesLeft(), this.f95503f - this.f95504g);
                ihcVar.readBytes(this.f95502e.getData(), this.f95504g, iMin2);
                int i5 = this.f95504g + iMin2;
                this.f95504g = i5;
                int i6 = this.f95503f;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f95505h) {
                        this.f95502e.setLimit(i6);
                    } else {
                        if (x0i.crc32(this.f95502e.getData(), 0, this.f95503f, -1) != 0) {
                            this.f95506i = true;
                            return;
                        }
                        this.f95502e.setLimit(this.f95503f - 4);
                    }
                    this.f95502e.setPosition(0);
                    this.f95501d.consume(this.f95502e);
                    this.f95504g = 0;
                }
            }
        }
    }

    @Override // p000.dkh
    public void init(g2h g2hVar, ck5 ck5Var, dkh.C4838e c4838e) {
        this.f95501d.init(g2hVar, ck5Var, c4838e);
        this.f95506i = true;
    }

    @Override // p000.dkh
    public void seek() {
        this.f95506i = true;
    }
}
