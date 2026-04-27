package p000;

import p000.ckh;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class rsc implements ckh {

    /* JADX INFO: renamed from: p */
    public static final String f79204p = "PesReader";

    /* JADX INFO: renamed from: q */
    public static final int f79205q = 0;

    /* JADX INFO: renamed from: r */
    public static final int f79206r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f79207s = 2;

    /* JADX INFO: renamed from: t */
    public static final int f79208t = 3;

    /* JADX INFO: renamed from: u */
    public static final int f79209u = 9;

    /* JADX INFO: renamed from: v */
    public static final int f79210v = 10;

    /* JADX INFO: renamed from: w */
    public static final int f79211w = 10;

    /* JADX INFO: renamed from: d */
    public final dy4 f79212d;

    /* JADX INFO: renamed from: e */
    public final hhc f79213e = new hhc(new byte[10]);

    /* JADX INFO: renamed from: f */
    public int f79214f = 0;

    /* JADX INFO: renamed from: g */
    public int f79215g;

    /* JADX INFO: renamed from: h */
    public h2h f79216h;

    /* JADX INFO: renamed from: i */
    public boolean f79217i;

    /* JADX INFO: renamed from: j */
    public boolean f79218j;

    /* JADX INFO: renamed from: k */
    public boolean f79219k;

    /* JADX INFO: renamed from: l */
    public int f79220l;

    /* JADX INFO: renamed from: m */
    public int f79221m;

    /* JADX INFO: renamed from: n */
    public boolean f79222n;

    /* JADX INFO: renamed from: o */
    public long f79223o;

    public rsc(dy4 dy4Var) {
        this.f79212d = dy4Var;
    }

    private boolean continueRead(jhc jhcVar, @hib byte[] bArr, int i) {
        int iMin = Math.min(jhcVar.bytesLeft(), i - this.f79215g);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            jhcVar.skipBytes(iMin);
        } else {
            jhcVar.readBytes(bArr, this.f79215g, iMin);
        }
        int i2 = this.f79215g + iMin;
        this.f79215g = i2;
        return i2 == i;
    }

    private boolean parseHeader() {
        this.f79213e.setPosition(0);
        int bits = this.f79213e.readBits(24);
        if (bits != 1) {
            xh9.m25148w("PesReader", "Unexpected start code prefix: " + bits);
            this.f79221m = -1;
            return false;
        }
        this.f79213e.skipBits(8);
        int bits2 = this.f79213e.readBits(16);
        this.f79213e.skipBits(5);
        this.f79222n = this.f79213e.readBit();
        this.f79213e.skipBits(2);
        this.f79217i = this.f79213e.readBit();
        this.f79218j = this.f79213e.readBit();
        this.f79213e.skipBits(6);
        int bits3 = this.f79213e.readBits(8);
        this.f79220l = bits3;
        if (bits2 == 0) {
            this.f79221m = -1;
        } else {
            int i = (bits2 - 3) - bits3;
            this.f79221m = i;
            if (i < 0) {
                xh9.m25148w("PesReader", "Found negative packet payload size: " + this.f79221m);
                this.f79221m = -1;
            }
        }
        return true;
    }

    @g5e({"timestampAdjuster"})
    private void parseHeaderExtension() {
        this.f79213e.setPosition(0);
        this.f79223o = -9223372036854775807L;
        if (this.f79217i) {
            this.f79213e.skipBits(4);
            long bits = ((long) this.f79213e.readBits(3)) << 30;
            this.f79213e.skipBits(1);
            long bits2 = bits | ((long) (this.f79213e.readBits(15) << 15));
            this.f79213e.skipBits(1);
            long bits3 = bits2 | ((long) this.f79213e.readBits(15));
            this.f79213e.skipBits(1);
            if (!this.f79219k && this.f79218j) {
                this.f79213e.skipBits(4);
                long bits4 = ((long) this.f79213e.readBits(3)) << 30;
                this.f79213e.skipBits(1);
                long bits5 = bits4 | ((long) (this.f79213e.readBits(15) << 15));
                this.f79213e.skipBits(1);
                long bits6 = bits5 | ((long) this.f79213e.readBits(15));
                this.f79213e.skipBits(1);
                this.f79216h.adjustTsTimestamp(bits6);
                this.f79219k = true;
            }
            this.f79223o = this.f79216h.adjustTsTimestamp(bits3);
        }
    }

    private void setState(int i) {
        this.f79214f = i;
        this.f79215g = 0;
    }

    public boolean canConsumeSynthesizedEmptyPusi(boolean z) {
        return this.f79214f == 3 && this.f79221m == -1 && !(z && (this.f79212d instanceof nd7)) && (!z || parseHeader());
    }

    @Override // p000.ckh
    public void consume(jhc jhcVar, int i) throws yhc {
        v80.checkStateNotNull(this.f79216h);
        if ((i & 1) != 0) {
            int i2 = this.f79214f;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    xh9.m25148w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f79221m != -1) {
                        xh9.m25148w("PesReader", "Unexpected start indicator: expected " + this.f79221m + " more bytes");
                    }
                    this.f79212d.packetFinished(jhcVar.limit() == 0);
                }
            }
            setState(1);
        }
        while (jhcVar.bytesLeft() > 0) {
            int i3 = this.f79214f;
            if (i3 == 0) {
                jhcVar.skipBytes(jhcVar.bytesLeft());
            } else if (i3 != 1) {
                if (i3 == 2) {
                    if (continueRead(jhcVar, this.f79213e.f43646a, Math.min(10, this.f79220l)) && continueRead(jhcVar, null, this.f79220l)) {
                        parseHeaderExtension();
                        i |= this.f79222n ? 4 : 0;
                        this.f79212d.packetStarted(this.f79223o, i);
                        setState(3);
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    int iBytesLeft = jhcVar.bytesLeft();
                    int i4 = this.f79221m;
                    int i5 = i4 == -1 ? 0 : iBytesLeft - i4;
                    if (i5 > 0) {
                        iBytesLeft -= i5;
                        jhcVar.setLimit(jhcVar.getPosition() + iBytesLeft);
                    }
                    this.f79212d.consume(jhcVar);
                    int i6 = this.f79221m;
                    if (i6 != -1) {
                        int i7 = i6 - iBytesLeft;
                        this.f79221m = i7;
                        if (i7 == 0) {
                            this.f79212d.packetFinished(false);
                            setState(1);
                        }
                    }
                }
            } else if (continueRead(jhcVar, this.f79213e.f43646a, 9)) {
                setState(parseHeader() ? 2 : 0);
            }
        }
    }

    @Override // p000.ckh
    public void init(h2h h2hVar, bk5 bk5Var, ckh.C2372e c2372e) {
        this.f79216h = h2hVar;
        this.f79212d.createTracks(bk5Var, c2372e);
    }

    @Override // p000.ckh
    public void seek() {
        this.f79214f = 0;
        this.f79215g = 0;
        this.f79219k = false;
        this.f79212d.seek();
    }
}
