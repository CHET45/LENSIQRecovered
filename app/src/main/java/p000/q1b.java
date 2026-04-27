package p000;

import androidx.media3.common.C1213a;
import p000.ckh;
import p000.r1b;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class q1b implements dy4 {

    /* JADX INFO: renamed from: A */
    public static final int f72896A = 2;

    /* JADX INFO: renamed from: B */
    public static final int f72897B = 15;

    /* JADX INFO: renamed from: w */
    public static final int f72898w = 0;

    /* JADX INFO: renamed from: x */
    public static final int f72899x = 1;

    /* JADX INFO: renamed from: y */
    public static final int f72900y = 2;

    /* JADX INFO: renamed from: z */
    public static final int f72901z = 3;

    /* JADX INFO: renamed from: a */
    public final String f72902a;

    /* JADX INFO: renamed from: f */
    public String f72907f;

    /* JADX INFO: renamed from: g */
    public q6h f72908g;

    /* JADX INFO: renamed from: j */
    public boolean f72911j;

    /* JADX INFO: renamed from: l */
    public int f72913l;

    /* JADX INFO: renamed from: m */
    public int f72914m;

    /* JADX INFO: renamed from: o */
    public int f72916o;

    /* JADX INFO: renamed from: p */
    public int f72917p;

    /* JADX INFO: renamed from: t */
    public int f72921t;

    /* JADX INFO: renamed from: v */
    public boolean f72923v;

    /* JADX INFO: renamed from: e */
    public int f72906e = 0;

    /* JADX INFO: renamed from: b */
    public final jhc f72903b = new jhc(new byte[15], 2);

    /* JADX INFO: renamed from: c */
    public final hhc f72904c = new hhc();

    /* JADX INFO: renamed from: d */
    public final jhc f72905d = new jhc();

    /* JADX INFO: renamed from: q */
    public r1b.C11845b f72918q = new r1b.C11845b();

    /* JADX INFO: renamed from: r */
    public int f72919r = -2147483647;

    /* JADX INFO: renamed from: s */
    public int f72920s = -1;

    /* JADX INFO: renamed from: u */
    public long f72922u = -1;

    /* JADX INFO: renamed from: k */
    public boolean f72912k = true;

    /* JADX INFO: renamed from: n */
    public boolean f72915n = true;

    /* JADX INFO: renamed from: h */
    public double f72909h = -9.223372036854776E18d;

    /* JADX INFO: renamed from: i */
    public double f72910i = -9.223372036854776E18d;

    public q1b(String str) {
        this.f72902a = str;
    }

    private void copyData(jhc jhcVar, jhc jhcVar2, boolean z) {
        int position = jhcVar.getPosition();
        int iMin = Math.min(jhcVar.bytesLeft(), jhcVar2.bytesLeft());
        jhcVar.readBytes(jhcVar2.getData(), jhcVar2.getPosition(), iMin);
        jhcVar2.skipBytes(iMin);
        if (z) {
            jhcVar.setPosition(position);
        }
    }

    @g5e({"output"})
    private void finalizeFrame() {
        int i;
        if (this.f72923v) {
            this.f72912k = false;
            i = 1;
        } else {
            i = 0;
        }
        double d = (((double) (this.f72920s - this.f72921t)) * 1000000.0d) / ((double) this.f72919r);
        long jRound = Math.round(this.f72909h);
        if (this.f72911j) {
            this.f72911j = false;
            this.f72909h = this.f72910i;
        } else {
            this.f72909h += d;
        }
        this.f72908g.sampleMetadata(jRound, i, this.f72917p, 0, null);
        this.f72923v = false;
        this.f72921t = 0;
        this.f72917p = 0;
    }

    @g5e({"output"})
    private void parseConfig(hhc hhcVar) throws yhc {
        r1b.C11846c mpegh3daConfig = r1b.parseMpegh3daConfig(hhcVar);
        this.f72919r = mpegh3daConfig.f76774b;
        this.f72920s = mpegh3daConfig.f76775c;
        long j = this.f72922u;
        long j2 = this.f72918q.f76771b;
        if (j != j2) {
            this.f72922u = j2;
            String str = "mhm1";
            if (mpegh3daConfig.f76773a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(mpegh3daConfig.f76773a));
            }
            byte[] bArr = mpegh3daConfig.f76776d;
            this.f72908g.format(new C1213a.b().setId(this.f72907f).setContainerMimeType(this.f72902a).setSampleMimeType("audio/mhm1").setSampleRate(this.f72919r).setCodecs(str).setInitializationData((bArr == null || bArr.length <= 0) ? null : kx7.m15112of(t0i.f83321f, bArr)).build());
        }
        this.f72923v = true;
    }

    private boolean parseHeader() throws yhc {
        int iLimit = this.f72903b.limit();
        this.f72904c.reset(this.f72903b.getData(), iLimit);
        boolean mhasPacketHeader = r1b.parseMhasPacketHeader(this.f72904c, this.f72918q);
        if (mhasPacketHeader) {
            this.f72916o = 0;
            this.f72917p += this.f72918q.f76772c + iLimit;
        }
        return mhasPacketHeader;
    }

    private boolean shouldParsePacket(int i) {
        return i == 1 || i == 17;
    }

    private boolean skipToNextSync(jhc jhcVar) {
        int i = this.f72913l;
        if ((i & 2) == 0) {
            jhcVar.setPosition(jhcVar.limit());
            return false;
        }
        if ((i & 4) != 0) {
            return true;
        }
        while (jhcVar.bytesLeft() > 0) {
            int i2 = this.f72914m << 8;
            this.f72914m = i2;
            int unsignedByte = i2 | jhcVar.readUnsignedByte();
            this.f72914m = unsignedByte;
            if (r1b.isSyncWord(unsignedByte)) {
                jhcVar.setPosition(jhcVar.getPosition() - 3);
                this.f72914m = 0;
                return true;
            }
        }
        return false;
    }

    @g5e({"output"})
    private void writeSampleData(jhc jhcVar) {
        int iMin = Math.min(jhcVar.bytesLeft(), this.f72918q.f76772c - this.f72916o);
        this.f72908g.sampleData(jhcVar, iMin);
        this.f72916o += iMin;
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) throws yhc {
        v80.checkStateNotNull(this.f72908g);
        while (jhcVar.bytesLeft() > 0) {
            int i = this.f72906e;
            if (i != 0) {
                if (i == 1) {
                    copyData(jhcVar, this.f72903b, false);
                    if (this.f72903b.bytesLeft() != 0) {
                        this.f72915n = false;
                    } else if (parseHeader()) {
                        this.f72903b.setPosition(0);
                        q6h q6hVar = this.f72908g;
                        jhc jhcVar2 = this.f72903b;
                        q6hVar.sampleData(jhcVar2, jhcVar2.limit());
                        this.f72903b.reset(2);
                        this.f72905d.reset(this.f72918q.f76772c);
                        this.f72915n = true;
                        this.f72906e = 2;
                    } else if (this.f72903b.limit() < 15) {
                        jhc jhcVar3 = this.f72903b;
                        jhcVar3.setLimit(jhcVar3.limit() + 1);
                        this.f72915n = false;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    if (shouldParsePacket(this.f72918q.f76770a)) {
                        copyData(jhcVar, this.f72905d, true);
                    }
                    writeSampleData(jhcVar);
                    int i2 = this.f72916o;
                    r1b.C11845b c11845b = this.f72918q;
                    if (i2 == c11845b.f76772c) {
                        int i3 = c11845b.f76770a;
                        if (i3 == 1) {
                            parseConfig(new hhc(this.f72905d.getData()));
                        } else if (i3 == 17) {
                            this.f72921t = r1b.parseAudioTruncationInfo(new hhc(this.f72905d.getData()));
                        } else if (i3 == 2) {
                            finalizeFrame();
                        }
                        this.f72906e = 1;
                    }
                }
            } else if (skipToNextSync(jhcVar)) {
                this.f72906e = 1;
            }
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        this.f72907f = c2372e.getFormatId();
        this.f72908g = bk5Var.track(c2372e.getTrackId(), 1);
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        this.f72913l = i;
        if (!this.f72912k && (this.f72917p != 0 || !this.f72915n)) {
            this.f72911j = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f72911j) {
                this.f72910i = j;
            } else {
                this.f72909h = j;
            }
        }
    }

    @Override // p000.dy4
    public void seek() {
        this.f72906e = 0;
        this.f72914m = 0;
        this.f72903b.reset(2);
        this.f72916o = 0;
        this.f72917p = 0;
        this.f72919r = -2147483647;
        this.f72920s = -1;
        this.f72921t = 0;
        this.f72922u = -1L;
        this.f72923v = false;
        this.f72911j = false;
        this.f72915n = true;
        this.f72912k = true;
        this.f72909h = -9.223372036854776E18d;
        this.f72910i = -9.223372036854776E18d;
    }
}
