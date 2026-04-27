package p000;

import p000.ckh;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class xte implements ckh {

    /* JADX INFO: renamed from: j */
    public static final int f99240j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f99241k = 32;

    /* JADX INFO: renamed from: l */
    public static final int f99242l = 4098;

    /* JADX INFO: renamed from: d */
    public final vte f99243d;

    /* JADX INFO: renamed from: e */
    public final jhc f99244e = new jhc(32);

    /* JADX INFO: renamed from: f */
    public int f99245f;

    /* JADX INFO: renamed from: g */
    public int f99246g;

    /* JADX INFO: renamed from: h */
    public boolean f99247h;

    /* JADX INFO: renamed from: i */
    public boolean f99248i;

    public xte(vte vteVar) {
        this.f99243d = vteVar;
    }

    @Override // p000.ckh
    public void consume(jhc jhcVar, int i) {
        boolean z = (i & 1) != 0;
        int position = z ? jhcVar.getPosition() + jhcVar.readUnsignedByte() : -1;
        if (this.f99248i) {
            if (!z) {
                return;
            }
            this.f99248i = false;
            jhcVar.setPosition(position);
            this.f99246g = 0;
        }
        while (jhcVar.bytesLeft() > 0) {
            int i2 = this.f99246g;
            if (i2 < 3) {
                if (i2 == 0) {
                    int unsignedByte = jhcVar.readUnsignedByte();
                    jhcVar.setPosition(jhcVar.getPosition() - 1);
                    if (unsignedByte == 255) {
                        this.f99248i = true;
                        return;
                    }
                }
                int iMin = Math.min(jhcVar.bytesLeft(), 3 - this.f99246g);
                jhcVar.readBytes(this.f99244e.getData(), this.f99246g, iMin);
                int i3 = this.f99246g + iMin;
                this.f99246g = i3;
                if (i3 == 3) {
                    this.f99244e.setPosition(0);
                    this.f99244e.setLimit(3);
                    this.f99244e.skipBytes(1);
                    int unsignedByte2 = this.f99244e.readUnsignedByte();
                    int unsignedByte3 = this.f99244e.readUnsignedByte();
                    this.f99247h = (unsignedByte2 & 128) != 0;
                    this.f99245f = (((unsignedByte2 & 15) << 8) | unsignedByte3) + 3;
                    int iCapacity = this.f99244e.capacity();
                    int i4 = this.f99245f;
                    if (iCapacity < i4) {
                        this.f99244e.ensureCapacity(Math.min(4098, Math.max(i4, this.f99244e.capacity() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(jhcVar.bytesLeft(), this.f99245f - this.f99246g);
                jhcVar.readBytes(this.f99244e.getData(), this.f99246g, iMin2);
                int i5 = this.f99246g + iMin2;
                this.f99246g = i5;
                int i6 = this.f99245f;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f99247h) {
                        this.f99244e.setLimit(i6);
                    } else {
                        if (t0i.crc32(this.f99244e.getData(), 0, this.f99245f, -1) != 0) {
                            this.f99248i = true;
                            return;
                        }
                        this.f99244e.setLimit(this.f99245f - 4);
                    }
                    this.f99244e.setPosition(0);
                    this.f99243d.consume(this.f99244e);
                    this.f99246g = 0;
                }
            }
        }
    }

    @Override // p000.ckh
    public void init(h2h h2hVar, bk5 bk5Var, ckh.C2372e c2372e) {
        this.f99243d.init(h2hVar, bk5Var, c2372e);
        this.f99248i = true;
    }

    @Override // p000.ckh
    public void seek() {
        this.f99248i = true;
    }
}
