package p000;

import androidx.media3.common.C1213a;
import java.util.Collections;
import p000.C7091i;
import p000.ckh;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class pu8 implements dy4 {

    /* JADX INFO: renamed from: A */
    public static final int f72099A = 3;

    /* JADX INFO: renamed from: B */
    public static final int f72100B = 1024;

    /* JADX INFO: renamed from: C */
    public static final int f72101C = 86;

    /* JADX INFO: renamed from: D */
    public static final int f72102D = 224;

    /* JADX INFO: renamed from: x */
    public static final int f72103x = 0;

    /* JADX INFO: renamed from: y */
    public static final int f72104y = 1;

    /* JADX INFO: renamed from: z */
    public static final int f72105z = 2;

    /* JADX INFO: renamed from: a */
    @hib
    public final String f72106a;

    /* JADX INFO: renamed from: b */
    public final int f72107b;

    /* JADX INFO: renamed from: c */
    public final String f72108c;

    /* JADX INFO: renamed from: d */
    public final jhc f72109d;

    /* JADX INFO: renamed from: e */
    public final hhc f72110e;

    /* JADX INFO: renamed from: f */
    public q6h f72111f;

    /* JADX INFO: renamed from: g */
    public String f72112g;

    /* JADX INFO: renamed from: h */
    public C1213a f72113h;

    /* JADX INFO: renamed from: i */
    public int f72114i;

    /* JADX INFO: renamed from: j */
    public int f72115j;

    /* JADX INFO: renamed from: k */
    public int f72116k;

    /* JADX INFO: renamed from: l */
    public int f72117l;

    /* JADX INFO: renamed from: m */
    public long f72118m;

    /* JADX INFO: renamed from: n */
    public boolean f72119n;

    /* JADX INFO: renamed from: o */
    public int f72120o;

    /* JADX INFO: renamed from: p */
    public int f72121p;

    /* JADX INFO: renamed from: q */
    public int f72122q;

    /* JADX INFO: renamed from: r */
    public boolean f72123r;

    /* JADX INFO: renamed from: s */
    public long f72124s;

    /* JADX INFO: renamed from: t */
    public int f72125t;

    /* JADX INFO: renamed from: u */
    public long f72126u;

    /* JADX INFO: renamed from: v */
    public int f72127v;

    /* JADX INFO: renamed from: w */
    @hib
    public String f72128w;

    public pu8(@hib String str, int i, String str2) {
        this.f72106a = str;
        this.f72107b = i;
        this.f72108c = str2;
        jhc jhcVar = new jhc(1024);
        this.f72109d = jhcVar;
        this.f72110e = new hhc(jhcVar.getData());
        this.f72118m = -9223372036854775807L;
    }

    private static long latmGetValue(hhc hhcVar) {
        return hhcVar.readBits((hhcVar.readBits(2) + 1) * 8);
    }

    @g5e({"output"})
    private void parseAudioMuxElement(hhc hhcVar) throws yhc {
        if (!hhcVar.readBit()) {
            this.f72119n = true;
            parseStreamMuxConfig(hhcVar);
        } else if (!this.f72119n) {
            return;
        }
        if (this.f72120o != 0) {
            throw yhc.createForMalformedContainer(null, null);
        }
        if (this.f72121p != 0) {
            throw yhc.createForMalformedContainer(null, null);
        }
        parsePayloadMux(hhcVar, parsePayloadLengthInfo(hhcVar));
        if (this.f72123r) {
            hhcVar.skipBits((int) this.f72124s);
        }
    }

    private int parseAudioSpecificConfig(hhc hhcVar) throws yhc {
        int iBitsLeft = hhcVar.bitsLeft();
        C7091i.c audioSpecificConfig = C7091i.parseAudioSpecificConfig(hhcVar, true);
        this.f72128w = audioSpecificConfig.f45333c;
        this.f72125t = audioSpecificConfig.f45331a;
        this.f72127v = audioSpecificConfig.f45332b;
        return iBitsLeft - hhcVar.bitsLeft();
    }

    private void parseFrameLength(hhc hhcVar) {
        int bits = hhcVar.readBits(3);
        this.f72122q = bits;
        if (bits == 0) {
            hhcVar.skipBits(8);
            return;
        }
        if (bits == 1) {
            hhcVar.skipBits(9);
            return;
        }
        if (bits == 3 || bits == 4 || bits == 5) {
            hhcVar.skipBits(6);
        } else {
            if (bits != 6 && bits != 7) {
                throw new IllegalStateException();
            }
            hhcVar.skipBits(1);
        }
    }

    private int parsePayloadLengthInfo(hhc hhcVar) throws yhc {
        int bits;
        if (this.f72122q != 0) {
            throw yhc.createForMalformedContainer(null, null);
        }
        int i = 0;
        do {
            bits = hhcVar.readBits(8);
            i += bits;
        } while (bits == 255);
        return i;
    }

    @g5e({"output"})
    private void parsePayloadMux(hhc hhcVar, int i) {
        int position = hhcVar.getPosition();
        if ((position & 7) == 0) {
            this.f72109d.setPosition(position >> 3);
        } else {
            hhcVar.readBits(this.f72109d.getData(), 0, i * 8);
            this.f72109d.setPosition(0);
        }
        this.f72111f.sampleData(this.f72109d, i);
        v80.checkState(this.f72118m != -9223372036854775807L);
        this.f72111f.sampleMetadata(this.f72118m, 1, i, 0, null);
        this.f72118m += this.f72126u;
    }

    @g5e({"output"})
    private void parseStreamMuxConfig(hhc hhcVar) throws yhc {
        boolean bit;
        int bits = hhcVar.readBits(1);
        int bits2 = bits == 1 ? hhcVar.readBits(1) : 0;
        this.f72120o = bits2;
        if (bits2 != 0) {
            throw yhc.createForMalformedContainer(null, null);
        }
        if (bits == 1) {
            latmGetValue(hhcVar);
        }
        if (!hhcVar.readBit()) {
            throw yhc.createForMalformedContainer(null, null);
        }
        this.f72121p = hhcVar.readBits(6);
        int bits3 = hhcVar.readBits(4);
        int bits4 = hhcVar.readBits(3);
        if (bits3 != 0 || bits4 != 0) {
            throw yhc.createForMalformedContainer(null, null);
        }
        if (bits == 0) {
            int position = hhcVar.getPosition();
            int audioSpecificConfig = parseAudioSpecificConfig(hhcVar);
            hhcVar.setPosition(position);
            byte[] bArr = new byte[(audioSpecificConfig + 7) / 8];
            hhcVar.readBits(bArr, 0, audioSpecificConfig);
            C1213a c1213aBuild = new C1213a.b().setId(this.f72112g).setContainerMimeType(this.f72108c).setSampleMimeType("audio/mp4a-latm").setCodecs(this.f72128w).setChannelCount(this.f72127v).setSampleRate(this.f72125t).setInitializationData(Collections.singletonList(bArr)).setLanguage(this.f72106a).setRoleFlags(this.f72107b).build();
            if (!c1213aBuild.equals(this.f72113h)) {
                this.f72113h = c1213aBuild;
                this.f72126u = 1024000000 / ((long) c1213aBuild.f8267H);
                this.f72111f.format(c1213aBuild);
            }
        } else {
            hhcVar.skipBits(((int) latmGetValue(hhcVar)) - parseAudioSpecificConfig(hhcVar));
        }
        parseFrameLength(hhcVar);
        boolean bit2 = hhcVar.readBit();
        this.f72123r = bit2;
        this.f72124s = 0L;
        if (bit2) {
            if (bits == 1) {
                this.f72124s = latmGetValue(hhcVar);
            } else {
                do {
                    bit = hhcVar.readBit();
                    this.f72124s = (this.f72124s << 8) + ((long) hhcVar.readBits(8));
                } while (bit);
            }
        }
        if (hhcVar.readBit()) {
            hhcVar.skipBits(8);
        }
    }

    private void resetBufferForSize(int i) {
        this.f72109d.reset(i);
        this.f72110e.reset(this.f72109d.getData());
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) throws yhc {
        v80.checkStateNotNull(this.f72111f);
        while (jhcVar.bytesLeft() > 0) {
            int i = this.f72114i;
            if (i != 0) {
                if (i == 1) {
                    int unsignedByte = jhcVar.readUnsignedByte();
                    if ((unsignedByte & 224) == 224) {
                        this.f72117l = unsignedByte;
                        this.f72114i = 2;
                    } else if (unsignedByte != 86) {
                        this.f72114i = 0;
                    }
                } else if (i == 2) {
                    int unsignedByte2 = ((this.f72117l & (-225)) << 8) | jhcVar.readUnsignedByte();
                    this.f72116k = unsignedByte2;
                    if (unsignedByte2 > this.f72109d.getData().length) {
                        resetBufferForSize(this.f72116k);
                    }
                    this.f72115j = 0;
                    this.f72114i = 3;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(jhcVar.bytesLeft(), this.f72116k - this.f72115j);
                    jhcVar.readBytes(this.f72110e.f43646a, this.f72115j, iMin);
                    int i2 = this.f72115j + iMin;
                    this.f72115j = i2;
                    if (i2 == this.f72116k) {
                        this.f72110e.setPosition(0);
                        parseAudioMuxElement(this.f72110e);
                        this.f72114i = 0;
                    }
                }
            } else if (jhcVar.readUnsignedByte() == 86) {
                this.f72114i = 1;
            }
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        this.f72111f = bk5Var.track(c2372e.getTrackId(), 1);
        this.f72112g = c2372e.getFormatId();
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        this.f72118m = j;
    }

    @Override // p000.dy4
    public void seek() {
        this.f72114i = 0;
        this.f72118m = -9223372036854775807L;
        this.f72119n = false;
    }
}
