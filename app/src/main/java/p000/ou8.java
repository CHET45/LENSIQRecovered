package p000;

import java.util.Collections;
import p000.C7696j;
import p000.dkh;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ou8 implements cy4 {

    /* JADX INFO: renamed from: A */
    public static final int f68794A = 86;

    /* JADX INFO: renamed from: B */
    public static final int f68795B = 224;

    /* JADX INFO: renamed from: v */
    public static final int f68796v = 0;

    /* JADX INFO: renamed from: w */
    public static final int f68797w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f68798x = 2;

    /* JADX INFO: renamed from: y */
    public static final int f68799y = 3;

    /* JADX INFO: renamed from: z */
    public static final int f68800z = 1024;

    /* JADX INFO: renamed from: a */
    @hib
    public final String f68801a;

    /* JADX INFO: renamed from: b */
    public final ihc f68802b;

    /* JADX INFO: renamed from: c */
    public final ghc f68803c;

    /* JADX INFO: renamed from: d */
    public r6h f68804d;

    /* JADX INFO: renamed from: e */
    public String f68805e;

    /* JADX INFO: renamed from: f */
    public kq6 f68806f;

    /* JADX INFO: renamed from: g */
    public int f68807g;

    /* JADX INFO: renamed from: h */
    public int f68808h;

    /* JADX INFO: renamed from: i */
    public int f68809i;

    /* JADX INFO: renamed from: j */
    public int f68810j;

    /* JADX INFO: renamed from: k */
    public long f68811k;

    /* JADX INFO: renamed from: l */
    public boolean f68812l;

    /* JADX INFO: renamed from: m */
    public int f68813m;

    /* JADX INFO: renamed from: n */
    public int f68814n;

    /* JADX INFO: renamed from: o */
    public int f68815o;

    /* JADX INFO: renamed from: p */
    public boolean f68816p;

    /* JADX INFO: renamed from: q */
    public long f68817q;

    /* JADX INFO: renamed from: r */
    public int f68818r;

    /* JADX INFO: renamed from: s */
    public long f68819s;

    /* JADX INFO: renamed from: t */
    public int f68820t;

    /* JADX INFO: renamed from: u */
    @hib
    public String f68821u;

    public ou8(@hib String str) {
        this.f68801a = str;
        ihc ihcVar = new ihc(1024);
        this.f68802b = ihcVar;
        this.f68803c = new ghc(ihcVar.getData());
        this.f68811k = -9223372036854775807L;
    }

    private static long latmGetValue(ghc ghcVar) {
        return ghcVar.readBits((ghcVar.readBits(2) + 1) * 8);
    }

    @g5e({"output"})
    private void parseAudioMuxElement(ghc ghcVar) throws xhc {
        if (!ghcVar.readBit()) {
            this.f68812l = true;
            parseStreamMuxConfig(ghcVar);
        } else if (!this.f68812l) {
            return;
        }
        if (this.f68813m != 0) {
            throw xhc.createForMalformedContainer(null, null);
        }
        if (this.f68814n != 0) {
            throw xhc.createForMalformedContainer(null, null);
        }
        parsePayloadMux(ghcVar, parsePayloadLengthInfo(ghcVar));
        if (this.f68816p) {
            ghcVar.skipBits((int) this.f68817q);
        }
    }

    private int parseAudioSpecificConfig(ghc ghcVar) throws xhc {
        int iBitsLeft = ghcVar.bitsLeft();
        C7696j.c audioSpecificConfig = C7696j.parseAudioSpecificConfig(ghcVar, true);
        this.f68821u = audioSpecificConfig.f49195c;
        this.f68818r = audioSpecificConfig.f49193a;
        this.f68820t = audioSpecificConfig.f49194b;
        return iBitsLeft - ghcVar.bitsLeft();
    }

    private void parseFrameLength(ghc ghcVar) {
        int bits = ghcVar.readBits(3);
        this.f68815o = bits;
        if (bits == 0) {
            ghcVar.skipBits(8);
            return;
        }
        if (bits == 1) {
            ghcVar.skipBits(9);
            return;
        }
        if (bits == 3 || bits == 4 || bits == 5) {
            ghcVar.skipBits(6);
        } else {
            if (bits != 6 && bits != 7) {
                throw new IllegalStateException();
            }
            ghcVar.skipBits(1);
        }
    }

    private int parsePayloadLengthInfo(ghc ghcVar) throws xhc {
        int bits;
        if (this.f68815o != 0) {
            throw xhc.createForMalformedContainer(null, null);
        }
        int i = 0;
        do {
            bits = ghcVar.readBits(8);
            i += bits;
        } while (bits == 255);
        return i;
    }

    @g5e({"output"})
    private void parsePayloadMux(ghc ghcVar, int i) {
        int position = ghcVar.getPosition();
        if ((position & 7) == 0) {
            this.f68802b.setPosition(position >> 3);
        } else {
            ghcVar.readBits(this.f68802b.getData(), 0, i * 8);
            this.f68802b.setPosition(0);
        }
        this.f68804d.sampleData(this.f68802b, i);
        long j = this.f68811k;
        if (j != -9223372036854775807L) {
            this.f68804d.sampleMetadata(j, 1, i, 0, null);
            this.f68811k += this.f68819s;
        }
    }

    @g5e({"output"})
    private void parseStreamMuxConfig(ghc ghcVar) throws xhc {
        boolean bit;
        int bits = ghcVar.readBits(1);
        int bits2 = bits == 1 ? ghcVar.readBits(1) : 0;
        this.f68813m = bits2;
        if (bits2 != 0) {
            throw xhc.createForMalformedContainer(null, null);
        }
        if (bits == 1) {
            latmGetValue(ghcVar);
        }
        if (!ghcVar.readBit()) {
            throw xhc.createForMalformedContainer(null, null);
        }
        this.f68814n = ghcVar.readBits(6);
        int bits3 = ghcVar.readBits(4);
        int bits4 = ghcVar.readBits(3);
        if (bits3 != 0 || bits4 != 0) {
            throw xhc.createForMalformedContainer(null, null);
        }
        if (bits == 0) {
            int position = ghcVar.getPosition();
            int audioSpecificConfig = parseAudioSpecificConfig(ghcVar);
            ghcVar.setPosition(position);
            byte[] bArr = new byte[(audioSpecificConfig + 7) / 8];
            ghcVar.readBits(bArr, 0, audioSpecificConfig);
            kq6 kq6VarBuild = new kq6.C8497b().setId(this.f68805e).setSampleMimeType("audio/mp4a-latm").setCodecs(this.f68821u).setChannelCount(this.f68820t).setSampleRate(this.f68818r).setInitializationData(Collections.singletonList(bArr)).setLanguage(this.f68801a).build();
            if (!kq6VarBuild.equals(this.f68806f)) {
                this.f68806f = kq6VarBuild;
                this.f68819s = 1024000000 / ((long) kq6VarBuild.f55009f2);
                this.f68804d.format(kq6VarBuild);
            }
        } else {
            ghcVar.skipBits(((int) latmGetValue(ghcVar)) - parseAudioSpecificConfig(ghcVar));
        }
        parseFrameLength(ghcVar);
        boolean bit2 = ghcVar.readBit();
        this.f68816p = bit2;
        this.f68817q = 0L;
        if (bit2) {
            if (bits == 1) {
                this.f68817q = latmGetValue(ghcVar);
            } else {
                do {
                    bit = ghcVar.readBit();
                    this.f68817q = (this.f68817q << 8) + ((long) ghcVar.readBits(8));
                } while (bit);
            }
        }
        if (ghcVar.readBit()) {
            ghcVar.skipBits(8);
        }
    }

    private void resetBufferForSize(int i) {
        this.f68802b.reset(i);
        this.f68803c.reset(this.f68802b.getData());
    }

    @Override // p000.cy4
    public void consume(ihc ihcVar) throws xhc {
        u80.checkStateNotNull(this.f68804d);
        while (ihcVar.bytesLeft() > 0) {
            int i = this.f68807g;
            if (i != 0) {
                if (i == 1) {
                    int unsignedByte = ihcVar.readUnsignedByte();
                    if ((unsignedByte & 224) == 224) {
                        this.f68810j = unsignedByte;
                        this.f68807g = 2;
                    } else if (unsignedByte != 86) {
                        this.f68807g = 0;
                    }
                } else if (i == 2) {
                    int unsignedByte2 = ((this.f68810j & (-225)) << 8) | ihcVar.readUnsignedByte();
                    this.f68809i = unsignedByte2;
                    if (unsignedByte2 > this.f68802b.getData().length) {
                        resetBufferForSize(this.f68809i);
                    }
                    this.f68808h = 0;
                    this.f68807g = 3;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(ihcVar.bytesLeft(), this.f68809i - this.f68808h);
                    ihcVar.readBytes(this.f68803c.f39834a, this.f68808h, iMin);
                    int i2 = this.f68808h + iMin;
                    this.f68808h = i2;
                    if (i2 == this.f68809i) {
                        this.f68803c.setPosition(0);
                        parseAudioMuxElement(this.f68803c);
                        this.f68807g = 0;
                    }
                }
            } else if (ihcVar.readUnsignedByte() == 86) {
                this.f68807g = 1;
            }
        }
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        c4838e.generateNewId();
        this.f68804d = ck5Var.track(c4838e.getTrackId(), 1);
        this.f68805e = c4838e.getFormatId();
    }

    @Override // p000.cy4
    public void packetFinished() {
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f68811k = j;
        }
    }

    @Override // p000.cy4
    public void seek() {
        this.f68807g = 0;
        this.f68811k = -9223372036854775807L;
        this.f68812l = false;
    }
}
