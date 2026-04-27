package p000;

import p000.dkh;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class qsc implements dkh {

    /* JADX INFO: renamed from: p */
    public static final String f75498p = "PesReader";

    /* JADX INFO: renamed from: q */
    public static final int f75499q = 0;

    /* JADX INFO: renamed from: r */
    public static final int f75500r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f75501s = 2;

    /* JADX INFO: renamed from: t */
    public static final int f75502t = 3;

    /* JADX INFO: renamed from: u */
    public static final int f75503u = 9;

    /* JADX INFO: renamed from: v */
    public static final int f75504v = 10;

    /* JADX INFO: renamed from: w */
    public static final int f75505w = 10;

    /* JADX INFO: renamed from: d */
    public final cy4 f75506d;

    /* JADX INFO: renamed from: e */
    public final ghc f75507e = new ghc(new byte[10]);

    /* JADX INFO: renamed from: f */
    public int f75508f = 0;

    /* JADX INFO: renamed from: g */
    public int f75509g;

    /* JADX INFO: renamed from: h */
    public g2h f75510h;

    /* JADX INFO: renamed from: i */
    public boolean f75511i;

    /* JADX INFO: renamed from: j */
    public boolean f75512j;

    /* JADX INFO: renamed from: k */
    public boolean f75513k;

    /* JADX INFO: renamed from: l */
    public int f75514l;

    /* JADX INFO: renamed from: m */
    public int f75515m;

    /* JADX INFO: renamed from: n */
    public boolean f75516n;

    /* JADX INFO: renamed from: o */
    public long f75517o;

    public qsc(cy4 cy4Var) {
        this.f75506d = cy4Var;
    }

    private boolean continueRead(ihc ihcVar, @hib byte[] bArr, int i) {
        int iMin = Math.min(ihcVar.bytesLeft(), i - this.f75509g);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            ihcVar.skipBytes(iMin);
        } else {
            ihcVar.readBytes(bArr, this.f75509g, iMin);
        }
        int i2 = this.f75509g + iMin;
        this.f75509g = i2;
        return i2 == i;
    }

    private boolean parseHeader() {
        this.f75507e.setPosition(0);
        int bits = this.f75507e.readBits(24);
        if (bits != 1) {
            yh9.m25919w("PesReader", "Unexpected start code prefix: " + bits);
            this.f75515m = -1;
            return false;
        }
        this.f75507e.skipBits(8);
        int bits2 = this.f75507e.readBits(16);
        this.f75507e.skipBits(5);
        this.f75516n = this.f75507e.readBit();
        this.f75507e.skipBits(2);
        this.f75511i = this.f75507e.readBit();
        this.f75512j = this.f75507e.readBit();
        this.f75507e.skipBits(6);
        int bits3 = this.f75507e.readBits(8);
        this.f75514l = bits3;
        if (bits2 == 0) {
            this.f75515m = -1;
        } else {
            int i = (bits2 - 3) - bits3;
            this.f75515m = i;
            if (i < 0) {
                yh9.m25919w("PesReader", "Found negative packet payload size: " + this.f75515m);
                this.f75515m = -1;
            }
        }
        return true;
    }

    @g5e({"timestampAdjuster"})
    private void parseHeaderExtension() {
        this.f75507e.setPosition(0);
        this.f75517o = -9223372036854775807L;
        if (this.f75511i) {
            this.f75507e.skipBits(4);
            long bits = ((long) this.f75507e.readBits(3)) << 30;
            this.f75507e.skipBits(1);
            long bits2 = bits | ((long) (this.f75507e.readBits(15) << 15));
            this.f75507e.skipBits(1);
            long bits3 = bits2 | ((long) this.f75507e.readBits(15));
            this.f75507e.skipBits(1);
            if (!this.f75513k && this.f75512j) {
                this.f75507e.skipBits(4);
                long bits4 = ((long) this.f75507e.readBits(3)) << 30;
                this.f75507e.skipBits(1);
                long bits5 = bits4 | ((long) (this.f75507e.readBits(15) << 15));
                this.f75507e.skipBits(1);
                long bits6 = bits5 | ((long) this.f75507e.readBits(15));
                this.f75507e.skipBits(1);
                this.f75510h.adjustTsTimestamp(bits6);
                this.f75513k = true;
            }
            this.f75517o = this.f75510h.adjustTsTimestamp(bits3);
        }
    }

    private void setState(int i) {
        this.f75508f = i;
        this.f75509g = 0;
    }

    @Override // p000.dkh
    public final void consume(ihc ihcVar, int i) throws xhc {
        u80.checkStateNotNull(this.f75510h);
        if ((i & 1) != 0) {
            int i2 = this.f75508f;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    yh9.m25919w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f75515m != -1) {
                        yh9.m25919w("PesReader", "Unexpected start indicator: expected " + this.f75515m + " more bytes");
                    }
                    this.f75506d.packetFinished();
                }
            }
            setState(1);
        }
        while (ihcVar.bytesLeft() > 0) {
            int i3 = this.f75508f;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (continueRead(ihcVar, this.f75507e.f39834a, Math.min(10, this.f75514l)) && continueRead(ihcVar, null, this.f75514l)) {
                            parseHeaderExtension();
                            i |= this.f75516n ? 4 : 0;
                            this.f75506d.packetStarted(this.f75517o, i);
                            setState(3);
                        }
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException();
                        }
                        int iBytesLeft = ihcVar.bytesLeft();
                        int i4 = this.f75515m;
                        int i5 = i4 != -1 ? iBytesLeft - i4 : 0;
                        if (i5 > 0) {
                            iBytesLeft -= i5;
                            ihcVar.setLimit(ihcVar.getPosition() + iBytesLeft);
                        }
                        this.f75506d.consume(ihcVar);
                        int i6 = this.f75515m;
                        if (i6 != -1) {
                            int i7 = i6 - iBytesLeft;
                            this.f75515m = i7;
                            if (i7 == 0) {
                                this.f75506d.packetFinished();
                                setState(1);
                            }
                        }
                    }
                } else if (continueRead(ihcVar, this.f75507e.f39834a, 9)) {
                    setState(parseHeader() ? 2 : 0);
                }
            } else {
                ihcVar.skipBytes(ihcVar.bytesLeft());
            }
        }
    }

    @Override // p000.dkh
    public void init(g2h g2hVar, ck5 ck5Var, dkh.C4838e c4838e) {
        this.f75510h = g2hVar;
        this.f75506d.createTracks(ck5Var, c4838e);
    }

    @Override // p000.dkh
    public final void seek() {
        this.f75508f = 0;
        this.f75509g = 0;
        this.f75513k = false;
        this.f75506d.seek();
    }
}
