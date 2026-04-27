package p000;

import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.ckh;
import p000.gue;

/* JADX INFO: renamed from: mi */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C9356mi implements xj5 {

    /* JADX INFO: renamed from: p */
    public static final ik5 f61034p = new ik5() { // from class: li
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return C9356mi.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: q */
    public static final int f61035q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f61036r = 2;

    /* JADX INFO: renamed from: s */
    public static final int f61037s = 2048;

    /* JADX INFO: renamed from: t */
    public static final int f61038t = 8192;

    /* JADX INFO: renamed from: u */
    public static final int f61039u = 1000;

    /* JADX INFO: renamed from: d */
    public final int f61040d;

    /* JADX INFO: renamed from: e */
    public final C10964pi f61041e;

    /* JADX INFO: renamed from: f */
    public final jhc f61042f;

    /* JADX INFO: renamed from: g */
    public final jhc f61043g;

    /* JADX INFO: renamed from: h */
    public final hhc f61044h;

    /* JADX INFO: renamed from: i */
    public bk5 f61045i;

    /* JADX INFO: renamed from: j */
    public long f61046j;

    /* JADX INFO: renamed from: k */
    public long f61047k;

    /* JADX INFO: renamed from: l */
    public int f61048l;

    /* JADX INFO: renamed from: m */
    public boolean f61049m;

    /* JADX INFO: renamed from: n */
    public boolean f61050n;

    /* JADX INFO: renamed from: o */
    public boolean f61051o;

    /* JADX INFO: renamed from: mi$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public C9356mi() {
        this(0);
    }

    private void calculateAverageFrameSize(ak5 ak5Var) throws IOException {
        int bits;
        if (this.f61049m) {
            return;
        }
        this.f61048l = -1;
        ak5Var.resetPeekPosition();
        long j = 0;
        if (ak5Var.getPosition() == 0) {
            peekId3Header(ak5Var);
        }
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (!ak5Var.peekFully(this.f61043g.getData(), 0, 2, true)) {
                    break;
                }
                this.f61043g.setPosition(0);
                if (!C10964pi.isAdtsSyncWord(this.f61043g.readUnsignedShort())) {
                    break;
                }
                if (!ak5Var.peekFully(this.f61043g.getData(), 0, 4, true)) {
                    break;
                }
                this.f61044h.setPosition(14);
                bits = this.f61044h.readBits(13);
                if (bits <= 6) {
                    this.f61049m = true;
                    throw yhc.createForMalformedContainer("Malformed ADTS stream", null);
                }
                j += (long) bits;
                i2++;
                if (i2 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (ak5Var.advancePeekPosition(bits - 6, true));
        i = i2;
        ak5Var.resetPeekPosition();
        if (i > 0) {
            this.f61048l = (int) (j / ((long) i));
        } else {
            this.f61048l = -1;
        }
        this.f61049m = true;
    }

    private static int getBitrateFromFrameSize(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    private gue getConstantBitrateSeekMap(long j, boolean z) {
        return new st2(j, this.f61047k, getBitrateFromFrameSize(this.f61048l, this.f61041e.getSampleDurationUs()), this.f61048l, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$0() {
        return new xj5[]{new C9356mi()};
    }

    @g5e({"extractorOutput"})
    private void maybeOutputSeekMap(long j, boolean z) {
        if (this.f61051o) {
            return;
        }
        boolean z2 = (this.f61040d & 1) != 0 && this.f61048l > 0;
        if (z2 && this.f61041e.getSampleDurationUs() == -9223372036854775807L && !z) {
            return;
        }
        if (!z2 || this.f61041e.getSampleDurationUs() == -9223372036854775807L) {
            this.f61045i.seekMap(new gue.C6549b(-9223372036854775807L));
        } else {
            this.f61045i.seekMap(getConstantBitrateSeekMap(j, (this.f61040d & 2) != 0));
        }
        this.f61051o = true;
    }

    private int peekId3Header(ak5 ak5Var) throws IOException {
        int i = 0;
        while (true) {
            ak5Var.peekFully(this.f61043g.getData(), 0, 10);
            this.f61043g.setPosition(0);
            if (this.f61043g.readUnsignedInt24() != 4801587) {
                break;
            }
            this.f61043g.skipBytes(3);
            int synchSafeInt = this.f61043g.readSynchSafeInt();
            i += synchSafeInt + 10;
            ak5Var.advancePeekPosition(synchSafeInt);
        }
        ak5Var.resetPeekPosition();
        ak5Var.advancePeekPosition(i);
        if (this.f61047k == -1) {
            this.f61047k = i;
        }
        return i;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f61045i = bk5Var;
        this.f61041e.createTracks(bk5Var, new ckh.C2372e(0, 1));
        bk5Var.endTracks();
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        v80.checkStateNotNull(this.f61045i);
        long length = ak5Var.getLength();
        int i = this.f61040d;
        if ((i & 2) != 0 || ((i & 1) != 0 && length != -1)) {
            calculateAverageFrameSize(ak5Var);
        }
        int i2 = ak5Var.read(this.f61042f.getData(), 0, 2048);
        boolean z = i2 == -1;
        maybeOutputSeekMap(length, z);
        if (z) {
            return -1;
        }
        this.f61042f.setPosition(0);
        this.f61042f.setLimit(i2);
        if (!this.f61050n) {
            this.f61041e.packetStarted(this.f61046j, 4);
            this.f61050n = true;
        }
        this.f61041e.consume(this.f61042f);
        return 0;
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f61050n = false;
        this.f61041e.seek();
        this.f61046j = j2;
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        int iPeekId3Header = peekId3Header(ak5Var);
        int i = iPeekId3Header;
        int i2 = 0;
        int i3 = 0;
        do {
            ak5Var.peekFully(this.f61043g.getData(), 0, 2);
            this.f61043g.setPosition(0);
            if (C10964pi.isAdtsSyncWord(this.f61043g.readUnsignedShort())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                ak5Var.peekFully(this.f61043g.getData(), 0, 4);
                this.f61044h.setPosition(14);
                int bits = this.f61044h.readBits(13);
                if (bits <= 6) {
                    i++;
                    ak5Var.resetPeekPosition();
                    ak5Var.advancePeekPosition(i);
                } else {
                    ak5Var.advancePeekPosition(bits - 6);
                    i3 += bits;
                }
            } else {
                i++;
                ak5Var.resetPeekPosition();
                ak5Var.advancePeekPosition(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iPeekId3Header < 8192);
        return false;
    }

    public C9356mi(int i) {
        this.f61040d = (i & 2) != 0 ? i | 1 : i;
        this.f61041e = new C10964pi(true, "audio/mp4a-latm");
        this.f61042f = new jhc(2048);
        this.f61048l = -1;
        this.f61047k = -1L;
        jhc jhcVar = new jhc(10);
        this.f61043g = jhcVar;
        this.f61044h = new hhc(jhcVar.getData());
    }
}
