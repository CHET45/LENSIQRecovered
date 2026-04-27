package p000;

import androidx.media3.common.C1213a;
import java.util.Arrays;
import java.util.Collections;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.C7091i;
import p000.ckh;

/* JADX INFO: renamed from: pi */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C10964pi implements dy4 {

    /* JADX INFO: renamed from: A */
    public static final int f70883A = 2;

    /* JADX INFO: renamed from: B */
    public static final int f70884B = 3;

    /* JADX INFO: renamed from: C */
    public static final int f70885C = 4;

    /* JADX INFO: renamed from: D */
    public static final int f70886D = 5;

    /* JADX INFO: renamed from: E */
    public static final int f70887E = 2;

    /* JADX INFO: renamed from: F */
    public static final int f70888F = 8;

    /* JADX INFO: renamed from: G */
    public static final int f70889G = 256;

    /* JADX INFO: renamed from: H */
    public static final int f70890H = 512;

    /* JADX INFO: renamed from: I */
    public static final int f70891I = 768;

    /* JADX INFO: renamed from: J */
    public static final int f70892J = 1024;

    /* JADX INFO: renamed from: K */
    public static final int f70893K = 10;

    /* JADX INFO: renamed from: L */
    public static final int f70894L = 6;

    /* JADX INFO: renamed from: M */
    public static final byte[] f70895M = {BuiltinOptions.RangeOptions, BuiltinOptions.FillOptions, 51};

    /* JADX INFO: renamed from: N */
    public static final int f70896N = -1;

    /* JADX INFO: renamed from: x */
    public static final String f70897x = "AdtsReader";

    /* JADX INFO: renamed from: y */
    public static final int f70898y = 0;

    /* JADX INFO: renamed from: z */
    public static final int f70899z = 1;

    /* JADX INFO: renamed from: a */
    public final boolean f70900a;

    /* JADX INFO: renamed from: b */
    public final hhc f70901b;

    /* JADX INFO: renamed from: c */
    public final jhc f70902c;

    /* JADX INFO: renamed from: d */
    @hib
    public final String f70903d;

    /* JADX INFO: renamed from: e */
    public final int f70904e;

    /* JADX INFO: renamed from: f */
    public final String f70905f;

    /* JADX INFO: renamed from: g */
    public String f70906g;

    /* JADX INFO: renamed from: h */
    public q6h f70907h;

    /* JADX INFO: renamed from: i */
    public q6h f70908i;

    /* JADX INFO: renamed from: j */
    public int f70909j;

    /* JADX INFO: renamed from: k */
    public int f70910k;

    /* JADX INFO: renamed from: l */
    public int f70911l;

    /* JADX INFO: renamed from: m */
    public boolean f70912m;

    /* JADX INFO: renamed from: n */
    public boolean f70913n;

    /* JADX INFO: renamed from: o */
    public int f70914o;

    /* JADX INFO: renamed from: p */
    public int f70915p;

    /* JADX INFO: renamed from: q */
    public int f70916q;

    /* JADX INFO: renamed from: r */
    public boolean f70917r;

    /* JADX INFO: renamed from: s */
    public long f70918s;

    /* JADX INFO: renamed from: t */
    public int f70919t;

    /* JADX INFO: renamed from: u */
    public long f70920u;

    /* JADX INFO: renamed from: v */
    public q6h f70921v;

    /* JADX INFO: renamed from: w */
    public long f70922w;

    public C10964pi(boolean z, String str) {
        this(z, null, 0, str);
    }

    @z25({"output", "currentOutput", "id3Output"})
    private void assertTracksCreated() {
        v80.checkNotNull(this.f70907h);
        t0i.castNonNull(this.f70921v);
        t0i.castNonNull(this.f70908i);
    }

    private void checkAdtsHeader(jhc jhcVar) {
        if (jhcVar.bytesLeft() == 0) {
            return;
        }
        this.f70901b.f43646a[0] = jhcVar.getData()[jhcVar.getPosition()];
        this.f70901b.setPosition(2);
        int bits = this.f70901b.readBits(4);
        int i = this.f70915p;
        if (i != -1 && bits != i) {
            resetSync();
            return;
        }
        if (!this.f70913n) {
            this.f70913n = true;
            this.f70914o = this.f70916q;
            this.f70915p = bits;
        }
        setReadingAdtsHeaderState();
    }

    private boolean checkSyncPositionValid(jhc jhcVar, int i) {
        jhcVar.setPosition(i + 1);
        if (!tryRead(jhcVar, this.f70901b.f43646a, 1)) {
            return false;
        }
        this.f70901b.setPosition(4);
        int bits = this.f70901b.readBits(1);
        int i2 = this.f70914o;
        if (i2 != -1 && bits != i2) {
            return false;
        }
        if (this.f70915p != -1) {
            if (!tryRead(jhcVar, this.f70901b.f43646a, 1)) {
                return true;
            }
            this.f70901b.setPosition(2);
            if (this.f70901b.readBits(4) != this.f70915p) {
                return false;
            }
            jhcVar.setPosition(i + 2);
        }
        if (!tryRead(jhcVar, this.f70901b.f43646a, 4)) {
            return true;
        }
        this.f70901b.setPosition(14);
        int bits2 = this.f70901b.readBits(13);
        if (bits2 < 7) {
            return false;
        }
        byte[] data = jhcVar.getData();
        int iLimit = jhcVar.limit();
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

    private boolean continueRead(jhc jhcVar, byte[] bArr, int i) {
        int iMin = Math.min(jhcVar.bytesLeft(), i - this.f70910k);
        jhcVar.readBytes(bArr, this.f70910k, iMin);
        int i2 = this.f70910k + iMin;
        this.f70910k = i2;
        return i2 == i;
    }

    private void findNextSample(jhc jhcVar) {
        byte[] data = jhcVar.getData();
        int position = jhcVar.getPosition();
        int iLimit = jhcVar.limit();
        while (position < iLimit) {
            int i = position + 1;
            byte b = data[position];
            int i2 = b & 255;
            if (this.f70911l == 512 && isAdtsSyncBytes((byte) -1, (byte) i2) && (this.f70913n || checkSyncPositionValid(jhcVar, position - 1))) {
                this.f70916q = (b & 8) >> 3;
                this.f70912m = (b & 1) == 0;
                if (this.f70913n) {
                    setReadingAdtsHeaderState();
                } else {
                    setCheckingAdtsHeaderState();
                }
                jhcVar.setPosition(i);
                return;
            }
            int i3 = this.f70911l;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.f70911l = 768;
            } else if (i4 == 511) {
                this.f70911l = 512;
            } else if (i4 == 836) {
                this.f70911l = 1024;
            } else if (i4 == 1075) {
                setReadingId3HeaderState();
                jhcVar.setPosition(i);
                return;
            } else if (i3 != 256) {
                this.f70911l = 256;
            }
            position = i;
        }
        jhcVar.setPosition(position);
    }

    private boolean isAdtsSyncBytes(byte b, byte b2) {
        return isAdtsSyncWord(((b & 255) << 8) | (b2 & 255));
    }

    public static boolean isAdtsSyncWord(int i) {
        return (i & 65526) == 65520;
    }

    @g5e({"output"})
    private void parseAdtsHeader() throws yhc {
        this.f70901b.setPosition(0);
        if (this.f70917r) {
            this.f70901b.skipBits(10);
        } else {
            int i = 2;
            int bits = this.f70901b.readBits(2) + 1;
            if (bits != 2) {
                xh9.m25148w("AdtsReader", "Detected audio object type: " + bits + ", but assuming AAC LC.");
            } else {
                i = bits;
            }
            this.f70901b.skipBits(5);
            byte[] bArrBuildAudioSpecificConfig = C7091i.buildAudioSpecificConfig(i, this.f70915p, this.f70901b.readBits(3));
            C7091i.c audioSpecificConfig = C7091i.parseAudioSpecificConfig(bArrBuildAudioSpecificConfig);
            C1213a c1213aBuild = new C1213a.b().setId(this.f70906g).setContainerMimeType(this.f70905f).setSampleMimeType("audio/mp4a-latm").setCodecs(audioSpecificConfig.f45333c).setChannelCount(audioSpecificConfig.f45332b).setSampleRate(audioSpecificConfig.f45331a).setInitializationData(Collections.singletonList(bArrBuildAudioSpecificConfig)).setLanguage(this.f70903d).setRoleFlags(this.f70904e).build();
            this.f70918s = 1024000000 / ((long) c1213aBuild.f8267H);
            this.f70907h.format(c1213aBuild);
            this.f70917r = true;
        }
        this.f70901b.skipBits(4);
        int bits2 = this.f70901b.readBits(13);
        int i2 = bits2 - 7;
        if (this.f70912m) {
            i2 = bits2 - 9;
        }
        setReadingSampleState(this.f70907h, this.f70918s, 0, i2);
    }

    @g5e({"id3Output"})
    private void parseId3Header() {
        this.f70908i.sampleData(this.f70902c, 10);
        this.f70902c.setPosition(6);
        setReadingSampleState(this.f70908i, 0L, 10, this.f70902c.readSynchSafeInt() + 10);
    }

    @g5e({"currentOutput"})
    private void readSample(jhc jhcVar) {
        int iMin = Math.min(jhcVar.bytesLeft(), this.f70919t - this.f70910k);
        this.f70921v.sampleData(jhcVar, iMin);
        int i = this.f70910k + iMin;
        this.f70910k = i;
        if (i == this.f70919t) {
            v80.checkState(this.f70920u != -9223372036854775807L);
            this.f70921v.sampleMetadata(this.f70920u, 1, this.f70919t, 0, null);
            this.f70920u += this.f70922w;
            setFindingSampleState();
        }
    }

    private void resetSync() {
        this.f70913n = false;
        setFindingSampleState();
    }

    private void setCheckingAdtsHeaderState() {
        this.f70909j = 1;
        this.f70910k = 0;
    }

    private void setFindingSampleState() {
        this.f70909j = 0;
        this.f70910k = 0;
        this.f70911l = 256;
    }

    private void setReadingAdtsHeaderState() {
        this.f70909j = 3;
        this.f70910k = 0;
    }

    private void setReadingId3HeaderState() {
        this.f70909j = 2;
        this.f70910k = f70895M.length;
        this.f70919t = 0;
        this.f70902c.setPosition(0);
    }

    private void setReadingSampleState(q6h q6hVar, long j, int i, int i2) {
        this.f70909j = 4;
        this.f70910k = i;
        this.f70921v = q6hVar;
        this.f70922w = j;
        this.f70919t = i2;
    }

    private boolean tryRead(jhc jhcVar, byte[] bArr, int i) {
        if (jhcVar.bytesLeft() < i) {
            return false;
        }
        jhcVar.readBytes(bArr, 0, i);
        return true;
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) throws yhc {
        assertTracksCreated();
        while (jhcVar.bytesLeft() > 0) {
            int i = this.f70909j;
            if (i == 0) {
                findNextSample(jhcVar);
            } else if (i == 1) {
                checkAdtsHeader(jhcVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (continueRead(jhcVar, this.f70901b.f43646a, this.f70912m ? 7 : 5)) {
                        parseAdtsHeader();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    readSample(jhcVar);
                }
            } else if (continueRead(jhcVar, this.f70902c.getData(), 10)) {
                parseId3Header();
            }
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        this.f70906g = c2372e.getFormatId();
        q6h q6hVarTrack = bk5Var.track(c2372e.getTrackId(), 1);
        this.f70907h = q6hVarTrack;
        this.f70921v = q6hVarTrack;
        if (!this.f70900a) {
            this.f70908i = new yd4();
            return;
        }
        c2372e.generateNewId();
        q6h q6hVarTrack2 = bk5Var.track(c2372e.getTrackId(), 5);
        this.f70908i = q6hVarTrack2;
        q6hVarTrack2.format(new C1213a.b().setId(c2372e.getFormatId()).setContainerMimeType(this.f70905f).setSampleMimeType("application/id3").build());
    }

    public long getSampleDurationUs() {
        return this.f70918s;
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        this.f70920u = j;
    }

    @Override // p000.dy4
    public void seek() {
        this.f70920u = -9223372036854775807L;
        resetSync();
    }

    public C10964pi(boolean z, @hib String str, int i, String str2) {
        this.f70901b = new hhc(new byte[7]);
        this.f70902c = new jhc(Arrays.copyOf(f70895M, 10));
        this.f70914o = -1;
        this.f70915p = -1;
        this.f70918s = -9223372036854775807L;
        this.f70920u = -9223372036854775807L;
        this.f70900a = z;
        this.f70903d = str;
        this.f70904e = i;
        this.f70905f = str2;
        setFindingSampleState();
    }
}
