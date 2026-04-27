package p000;

import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.dkh;
import p000.hue;

/* JADX INFO: renamed from: ni */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C9880ni implements yj5 {

    /* JADX INFO: renamed from: p */
    public static final hk5 f64565p = new hk5() { // from class: ki
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return C9880ni.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: q */
    public static final int f64566q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f64567r = 2;

    /* JADX INFO: renamed from: s */
    public static final int f64568s = 2048;

    /* JADX INFO: renamed from: t */
    public static final int f64569t = 8192;

    /* JADX INFO: renamed from: u */
    public static final int f64570u = 1000;

    /* JADX INFO: renamed from: d */
    public final int f64571d;

    /* JADX INFO: renamed from: e */
    public final C10386oi f64572e;

    /* JADX INFO: renamed from: f */
    public final ihc f64573f;

    /* JADX INFO: renamed from: g */
    public final ihc f64574g;

    /* JADX INFO: renamed from: h */
    public final ghc f64575h;

    /* JADX INFO: renamed from: i */
    public ck5 f64576i;

    /* JADX INFO: renamed from: j */
    public long f64577j;

    /* JADX INFO: renamed from: k */
    public long f64578k;

    /* JADX INFO: renamed from: l */
    public int f64579l;

    /* JADX INFO: renamed from: m */
    public boolean f64580m;

    /* JADX INFO: renamed from: n */
    public boolean f64581n;

    /* JADX INFO: renamed from: o */
    public boolean f64582o;

    /* JADX INFO: renamed from: ni$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public C9880ni() {
        this(0);
    }

    private void calculateAverageFrameSize(zj5 zj5Var) throws IOException {
        int bits;
        if (this.f64580m) {
            return;
        }
        this.f64579l = -1;
        zj5Var.resetPeekPosition();
        long j = 0;
        if (zj5Var.getPosition() == 0) {
            peekId3Header(zj5Var);
        }
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (!zj5Var.peekFully(this.f64574g.getData(), 0, 2, true)) {
                    break;
                }
                this.f64574g.setPosition(0);
                if (!C10386oi.isAdtsSyncWord(this.f64574g.readUnsignedShort())) {
                    break;
                }
                if (!zj5Var.peekFully(this.f64574g.getData(), 0, 4, true)) {
                    break;
                }
                this.f64575h.setPosition(14);
                bits = this.f64575h.readBits(13);
                if (bits <= 6) {
                    this.f64580m = true;
                    throw xhc.createForMalformedContainer("Malformed ADTS stream", null);
                }
                j += (long) bits;
                i2++;
                if (i2 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (zj5Var.advancePeekPosition(bits - 6, true));
        i = i2;
        zj5Var.resetPeekPosition();
        if (i > 0) {
            this.f64579l = (int) (j / ((long) i));
        } else {
            this.f64579l = -1;
        }
        this.f64580m = true;
    }

    private static int getBitrateFromFrameSize(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    private hue getConstantBitrateSeekMap(long j, boolean z) {
        return new rt2(j, this.f64578k, getBitrateFromFrameSize(this.f64579l, this.f64572e.getSampleDurationUs()), this.f64579l, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new C9880ni()};
    }

    @g5e({"extractorOutput"})
    private void maybeOutputSeekMap(long j, boolean z) {
        if (this.f64582o) {
            return;
        }
        boolean z2 = (this.f64571d & 1) != 0 && this.f64579l > 0;
        if (z2 && this.f64572e.getSampleDurationUs() == -9223372036854775807L && !z) {
            return;
        }
        if (!z2 || this.f64572e.getSampleDurationUs() == -9223372036854775807L) {
            this.f64576i.seekMap(new hue.C7024b(-9223372036854775807L));
        } else {
            this.f64576i.seekMap(getConstantBitrateSeekMap(j, (this.f64571d & 2) != 0));
        }
        this.f64582o = true;
    }

    private int peekId3Header(zj5 zj5Var) throws IOException {
        int i = 0;
        while (true) {
            zj5Var.peekFully(this.f64574g.getData(), 0, 10);
            this.f64574g.setPosition(0);
            if (this.f64574g.readUnsignedInt24() != 4801587) {
                break;
            }
            this.f64574g.skipBytes(3);
            int synchSafeInt = this.f64574g.readSynchSafeInt();
            i += synchSafeInt + 10;
            zj5Var.advancePeekPosition(synchSafeInt);
        }
        zj5Var.resetPeekPosition();
        zj5Var.advancePeekPosition(i);
        if (this.f64578k == -1) {
            this.f64578k = i;
        }
        return i;
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f64576i = ck5Var;
        this.f64572e.createTracks(ck5Var, new dkh.C4838e(0, 1));
        ck5Var.endTracks();
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        u80.checkStateNotNull(this.f64576i);
        long length = zj5Var.getLength();
        int i = this.f64571d;
        if ((i & 2) != 0 || ((i & 1) != 0 && length != -1)) {
            calculateAverageFrameSize(zj5Var);
        }
        int i2 = zj5Var.read(this.f64573f.getData(), 0, 2048);
        boolean z = i2 == -1;
        maybeOutputSeekMap(length, z);
        if (z) {
            return -1;
        }
        this.f64573f.setPosition(0);
        this.f64573f.setLimit(i2);
        if (!this.f64581n) {
            this.f64572e.packetStarted(this.f64577j, 4);
            this.f64581n = true;
        }
        this.f64572e.consume(this.f64573f);
        return 0;
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        this.f64581n = false;
        this.f64572e.seek();
        this.f64577j = j2;
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        int iPeekId3Header = peekId3Header(zj5Var);
        int i = iPeekId3Header;
        int i2 = 0;
        int i3 = 0;
        do {
            zj5Var.peekFully(this.f64574g.getData(), 0, 2);
            this.f64574g.setPosition(0);
            if (C10386oi.isAdtsSyncWord(this.f64574g.readUnsignedShort())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zj5Var.peekFully(this.f64574g.getData(), 0, 4);
                this.f64575h.setPosition(14);
                int bits = this.f64575h.readBits(13);
                if (bits <= 6) {
                    i++;
                    zj5Var.resetPeekPosition();
                    zj5Var.advancePeekPosition(i);
                } else {
                    zj5Var.advancePeekPosition(bits - 6);
                    i3 += bits;
                }
            } else {
                i++;
                zj5Var.resetPeekPosition();
                zj5Var.advancePeekPosition(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iPeekId3Header < 8192);
        return false;
    }

    public C9880ni(int i) {
        this.f64571d = (i & 2) != 0 ? i | 1 : i;
        this.f64572e = new C10386oi(true);
        this.f64573f = new ihc(2048);
        this.f64579l = -1;
        this.f64578k = -1L;
        ihc ihcVar = new ihc(10);
        this.f64574g = ihcVar;
        this.f64575h = new ghc(ihcVar.getData());
    }
}
