package p000;

import java.util.Arrays;
import java.util.Collections;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.C7696j;
import p000.dkh;
import p000.kq6;

/* JADX INFO: renamed from: oi */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C10386oi implements cy4 {

    /* JADX INFO: renamed from: A */
    public static final int f67694A = 4;

    /* JADX INFO: renamed from: B */
    public static final int f67695B = 5;

    /* JADX INFO: renamed from: C */
    public static final int f67696C = 2;

    /* JADX INFO: renamed from: D */
    public static final int f67697D = 8;

    /* JADX INFO: renamed from: E */
    public static final int f67698E = 256;

    /* JADX INFO: renamed from: F */
    public static final int f67699F = 512;

    /* JADX INFO: renamed from: G */
    public static final int f67700G = 768;

    /* JADX INFO: renamed from: H */
    public static final int f67701H = 1024;

    /* JADX INFO: renamed from: I */
    public static final int f67702I = 10;

    /* JADX INFO: renamed from: J */
    public static final int f67703J = 6;

    /* JADX INFO: renamed from: K */
    public static final byte[] f67704K = {BuiltinOptions.RangeOptions, BuiltinOptions.FillOptions, 51};

    /* JADX INFO: renamed from: L */
    public static final int f67705L = -1;

    /* JADX INFO: renamed from: v */
    public static final String f67706v = "AdtsReader";

    /* JADX INFO: renamed from: w */
    public static final int f67707w = 0;

    /* JADX INFO: renamed from: x */
    public static final int f67708x = 1;

    /* JADX INFO: renamed from: y */
    public static final int f67709y = 2;

    /* JADX INFO: renamed from: z */
    public static final int f67710z = 3;

    /* JADX INFO: renamed from: a */
    public final boolean f67711a;

    /* JADX INFO: renamed from: b */
    public final ghc f67712b;

    /* JADX INFO: renamed from: c */
    public final ihc f67713c;

    /* JADX INFO: renamed from: d */
    @hib
    public final String f67714d;

    /* JADX INFO: renamed from: e */
    public String f67715e;

    /* JADX INFO: renamed from: f */
    public r6h f67716f;

    /* JADX INFO: renamed from: g */
    public r6h f67717g;

    /* JADX INFO: renamed from: h */
    public int f67718h;

    /* JADX INFO: renamed from: i */
    public int f67719i;

    /* JADX INFO: renamed from: j */
    public int f67720j;

    /* JADX INFO: renamed from: k */
    public boolean f67721k;

    /* JADX INFO: renamed from: l */
    public boolean f67722l;

    /* JADX INFO: renamed from: m */
    public int f67723m;

    /* JADX INFO: renamed from: n */
    public int f67724n;

    /* JADX INFO: renamed from: o */
    public int f67725o;

    /* JADX INFO: renamed from: p */
    public boolean f67726p;

    /* JADX INFO: renamed from: q */
    public long f67727q;

    /* JADX INFO: renamed from: r */
    public int f67728r;

    /* JADX INFO: renamed from: s */
    public long f67729s;

    /* JADX INFO: renamed from: t */
    public r6h f67730t;

    /* JADX INFO: renamed from: u */
    public long f67731u;

    public C10386oi(boolean z) {
        this(z, null);
    }

    @z25({"output", "currentOutput", "id3Output"})
    private void assertTracksCreated() {
        u80.checkNotNull(this.f67716f);
        x0i.castNonNull(this.f67730t);
        x0i.castNonNull(this.f67717g);
    }

    private void checkAdtsHeader(ihc ihcVar) {
        if (ihcVar.bytesLeft() == 0) {
            return;
        }
        this.f67712b.f39834a[0] = ihcVar.getData()[ihcVar.getPosition()];
        this.f67712b.setPosition(2);
        int bits = this.f67712b.readBits(4);
        int i = this.f67724n;
        if (i != -1 && bits != i) {
            resetSync();
            return;
        }
        if (!this.f67722l) {
            this.f67722l = true;
            this.f67723m = this.f67725o;
            this.f67724n = bits;
        }
        setReadingAdtsHeaderState();
    }

    private boolean checkSyncPositionValid(ihc ihcVar, int i) {
        ihcVar.setPosition(i + 1);
        if (!tryRead(ihcVar, this.f67712b.f39834a, 1)) {
            return false;
        }
        this.f67712b.setPosition(4);
        int bits = this.f67712b.readBits(1);
        int i2 = this.f67723m;
        if (i2 != -1 && bits != i2) {
            return false;
        }
        if (this.f67724n != -1) {
            if (!tryRead(ihcVar, this.f67712b.f39834a, 1)) {
                return true;
            }
            this.f67712b.setPosition(2);
            if (this.f67712b.readBits(4) != this.f67724n) {
                return false;
            }
            ihcVar.setPosition(i + 2);
        }
        if (!tryRead(ihcVar, this.f67712b.f39834a, 4)) {
            return true;
        }
        this.f67712b.setPosition(14);
        int bits2 = this.f67712b.readBits(13);
        if (bits2 < 7) {
            return false;
        }
        byte[] data = ihcVar.getData();
        int iLimit = ihcVar.limit();
        int i3 = i + bits2;
        if (i3 >= iLimit) {
            return true;
        }
        byte b = data[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == iLimit) {
                return true;
            }
            return isAdtsSyncBytes((byte) -1, data[i4]) && ((data[i4] & 8) >> 3) == bits;
        }
        if (b != 73) {
            return false;
        }
        int i5 = i3 + 1;
        if (i5 == iLimit) {
            return true;
        }
        if (data[i5] != 68) {
            return false;
        }
        int i6 = i3 + 2;
        return i6 == iLimit || data[i6] == 51;
    }

    private boolean continueRead(ihc ihcVar, byte[] bArr, int i) {
        int iMin = Math.min(ihcVar.bytesLeft(), i - this.f67719i);
        ihcVar.readBytes(bArr, this.f67719i, iMin);
        int i2 = this.f67719i + iMin;
        this.f67719i = i2;
        return i2 == i;
    }

    private void findNextSample(ihc ihcVar) {
        byte[] data = ihcVar.getData();
        int position = ihcVar.getPosition();
        int iLimit = ihcVar.limit();
        while (position < iLimit) {
            int i = position + 1;
            byte b = data[position];
            int i2 = b & 255;
            if (this.f67720j == 512 && isAdtsSyncBytes((byte) -1, (byte) i2) && (this.f67722l || checkSyncPositionValid(ihcVar, position - 1))) {
                this.f67725o = (b & 8) >> 3;
                this.f67721k = (b & 1) == 0;
                if (this.f67722l) {
                    setReadingAdtsHeaderState();
                } else {
                    setCheckingAdtsHeaderState();
                }
                ihcVar.setPosition(i);
                return;
            }
            int i3 = this.f67720j;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.f67720j = 768;
            } else if (i4 == 511) {
                this.f67720j = 512;
            } else if (i4 == 836) {
                this.f67720j = 1024;
            } else if (i4 == 1075) {
                setReadingId3HeaderState();
                ihcVar.setPosition(i);
                return;
            } else if (i3 != 256) {
                this.f67720j = 256;
            }
            position = i;
        }
        ihcVar.setPosition(position);
    }

    private boolean isAdtsSyncBytes(byte b, byte b2) {
        return isAdtsSyncWord(((b & 255) << 8) | (b2 & 255));
    }

    public static boolean isAdtsSyncWord(int i) {
        return (i & 65526) == 65520;
    }

    @g5e({"output"})
    private void parseAdtsHeader() throws xhc {
        this.f67712b.setPosition(0);
        if (this.f67726p) {
            this.f67712b.skipBits(10);
        } else {
            int i = 2;
            int bits = this.f67712b.readBits(2) + 1;
            if (bits != 2) {
                yh9.m25919w("AdtsReader", "Detected audio object type: " + bits + ", but assuming AAC LC.");
            } else {
                i = bits;
            }
            this.f67712b.skipBits(5);
            byte[] bArrBuildAudioSpecificConfig = C7696j.buildAudioSpecificConfig(i, this.f67724n, this.f67712b.readBits(3));
            C7696j.c audioSpecificConfig = C7696j.parseAudioSpecificConfig(bArrBuildAudioSpecificConfig);
            kq6 kq6VarBuild = new kq6.C8497b().setId(this.f67715e).setSampleMimeType("audio/mp4a-latm").setCodecs(audioSpecificConfig.f49195c).setChannelCount(audioSpecificConfig.f49194b).setSampleRate(audioSpecificConfig.f49193a).setInitializationData(Collections.singletonList(bArrBuildAudioSpecificConfig)).setLanguage(this.f67714d).build();
            this.f67727q = 1024000000 / ((long) kq6VarBuild.f55009f2);
            this.f67716f.format(kq6VarBuild);
            this.f67726p = true;
        }
        this.f67712b.skipBits(4);
        int bits2 = this.f67712b.readBits(13);
        int i2 = bits2 - 7;
        if (this.f67721k) {
            i2 = bits2 - 9;
        }
        setReadingSampleState(this.f67716f, this.f67727q, 0, i2);
    }

    @g5e({"id3Output"})
    private void parseId3Header() {
        this.f67717g.sampleData(this.f67713c, 10);
        this.f67713c.setPosition(6);
        setReadingSampleState(this.f67717g, 0L, 10, this.f67713c.readSynchSafeInt() + 10);
    }

    @g5e({"currentOutput"})
    private void readSample(ihc ihcVar) {
        int iMin = Math.min(ihcVar.bytesLeft(), this.f67728r - this.f67719i);
        this.f67730t.sampleData(ihcVar, iMin);
        int i = this.f67719i + iMin;
        this.f67719i = i;
        int i2 = this.f67728r;
        if (i == i2) {
            long j = this.f67729s;
            if (j != -9223372036854775807L) {
                this.f67730t.sampleMetadata(j, 1, i2, 0, null);
                this.f67729s += this.f67731u;
            }
            setFindingSampleState();
        }
    }

    private void resetSync() {
        this.f67722l = false;
        setFindingSampleState();
    }

    private void setCheckingAdtsHeaderState() {
        this.f67718h = 1;
        this.f67719i = 0;
    }

    private void setFindingSampleState() {
        this.f67718h = 0;
        this.f67719i = 0;
        this.f67720j = 256;
    }

    private void setReadingAdtsHeaderState() {
        this.f67718h = 3;
        this.f67719i = 0;
    }

    private void setReadingId3HeaderState() {
        this.f67718h = 2;
        this.f67719i = f67704K.length;
        this.f67728r = 0;
        this.f67713c.setPosition(0);
    }

    private void setReadingSampleState(r6h r6hVar, long j, int i, int i2) {
        this.f67718h = 4;
        this.f67719i = i;
        this.f67730t = r6hVar;
        this.f67731u = j;
        this.f67728r = i2;
    }

    private boolean tryRead(ihc ihcVar, byte[] bArr, int i) {
        if (ihcVar.bytesLeft() < i) {
            return false;
        }
        ihcVar.readBytes(bArr, 0, i);
        return true;
    }

    @Override // p000.cy4
    public void consume(ihc ihcVar) throws xhc {
        assertTracksCreated();
        while (ihcVar.bytesLeft() > 0) {
            int i = this.f67718h;
            if (i == 0) {
                findNextSample(ihcVar);
            } else if (i == 1) {
                checkAdtsHeader(ihcVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (continueRead(ihcVar, this.f67712b.f39834a, this.f67721k ? 7 : 5)) {
                        parseAdtsHeader();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    readSample(ihcVar);
                }
            } else if (continueRead(ihcVar, this.f67713c.getData(), 10)) {
                parseId3Header();
            }
        }
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        c4838e.generateNewId();
        this.f67715e = c4838e.getFormatId();
        r6h r6hVarTrack = ck5Var.track(c4838e.getTrackId(), 1);
        this.f67716f = r6hVarTrack;
        this.f67730t = r6hVarTrack;
        if (!this.f67711a) {
            this.f67717g = new ts4();
            return;
        }
        c4838e.generateNewId();
        r6h r6hVarTrack2 = ck5Var.track(c4838e.getTrackId(), 5);
        this.f67717g = r6hVarTrack2;
        r6hVarTrack2.format(new kq6.C8497b().setId(c4838e.getFormatId()).setSampleMimeType("application/id3").build());
    }

    public long getSampleDurationUs() {
        return this.f67727q;
    }

    @Override // p000.cy4
    public void packetFinished() {
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f67729s = j;
        }
    }

    @Override // p000.cy4
    public void seek() {
        this.f67729s = -9223372036854775807L;
        resetSync();
    }

    public C10386oi(boolean z, @hib String str) {
        this.f67712b = new ghc(new byte[7]);
        this.f67713c = new ihc(Arrays.copyOf(f67704K, 10));
        setFindingSampleState();
        this.f67723m = -1;
        this.f67724n = -1;
        this.f67727q = -9223372036854775807L;
        this.f67729s = -9223372036854775807L;
        this.f67711a = z;
        this.f67714d = str;
    }
}
