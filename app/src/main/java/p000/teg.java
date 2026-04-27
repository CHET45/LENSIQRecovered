package p000;

import androidx.media3.common.C1213a;
import java.io.EOFException;
import java.io.IOException;
import p000.peg;
import p000.q6h;

/* JADX INFO: loaded from: classes3.dex */
public final class teg implements q6h {

    /* JADX INFO: renamed from: n */
    public static final String f84458n = "SubtitleTranscodingTO";

    /* JADX INFO: renamed from: d */
    public final q6h f84459d;

    /* JADX INFO: renamed from: e */
    public final peg.InterfaceC10936a f84460e;

    /* JADX INFO: renamed from: k */
    @hib
    public peg f84466k;

    /* JADX INFO: renamed from: l */
    public C1213a f84467l;

    /* JADX INFO: renamed from: m */
    public boolean f84468m;

    /* JADX INFO: renamed from: f */
    public final t93 f84461f = new t93();

    /* JADX INFO: renamed from: h */
    public int f84463h = 0;

    /* JADX INFO: renamed from: i */
    public int f84464i = 0;

    /* JADX INFO: renamed from: j */
    public byte[] f84465j = t0i.f83321f;

    /* JADX INFO: renamed from: g */
    public final jhc f84462g = new jhc();

    public teg(q6h q6hVar, peg.InterfaceC10936a interfaceC10936a) {
        this.f84459d = q6hVar;
        this.f84460e = interfaceC10936a;
    }

    private void ensureSampleDataCapacity(int i) {
        int length = this.f84465j.length;
        int i2 = this.f84464i;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f84463h;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f84465j;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f84463h, bArr2, 0, i3);
        this.f84463h = 0;
        this.f84464i = i3;
        this.f84465j = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: outputSample, reason: merged with bridge method [inline-methods] */
    public void lambda$sampleMetadata$0(ba3 ba3Var, long j, int i) {
        v80.checkStateNotNull(this.f84467l);
        byte[] bArrEncode = this.f84461f.encode(ba3Var.f13111a, ba3Var.f13113c);
        this.f84462g.reset(bArrEncode);
        this.f84459d.sampleData(this.f84462g, bArrEncode.length);
        long j2 = ba3Var.f13112b;
        if (j2 == -9223372036854775807L) {
            v80.checkState(this.f84467l.f8296t == Long.MAX_VALUE);
        } else {
            long j3 = this.f84467l.f8296t;
            j = j3 == Long.MAX_VALUE ? j + j2 : j2 + j3;
        }
        this.f84459d.sampleMetadata(j, i | 1, bArrEncode.length, 0, null);
    }

    @Override // p000.q6h
    public void format(C1213a c1213a) {
        v80.checkNotNull(c1213a.f8291o);
        v80.checkArgument(rva.getTrackType(c1213a.f8291o) == 3);
        if (!c1213a.equals(this.f84467l)) {
            this.f84467l = c1213a;
            this.f84466k = this.f84460e.supportsFormat(c1213a) ? this.f84460e.create(c1213a) : null;
        }
        if (this.f84466k == null) {
            this.f84459d.format(c1213a);
        } else {
            this.f84459d.format(c1213a.buildUpon().setSampleMimeType(rva.f79794T0).setCodecs(c1213a.f8291o).setSubsampleOffsetUs(Long.MAX_VALUE).setCueReplacementBehavior(this.f84460e.getCueReplacementBehavior(c1213a)).build());
        }
    }

    public void resetSubtitleParser() {
        peg pegVar = this.f84466k;
        if (pegVar != null) {
            pegVar.reset();
        }
    }

    @Override // p000.q6h
    public int sampleData(bh3 bh3Var, int i, boolean z, int i2) throws IOException {
        if (this.f84466k == null) {
            return this.f84459d.sampleData(bh3Var, i, z, i2);
        }
        ensureSampleDataCapacity(i);
        int i3 = bh3Var.read(this.f84465j, this.f84464i, i);
        if (i3 != -1) {
            this.f84464i += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p000.q6h
    public void sampleMetadata(final long j, final int i, int i2, int i3, @hib q6h.C11325a c11325a) {
        if (this.f84466k == null) {
            this.f84459d.sampleMetadata(j, i, i2, i3, c11325a);
            return;
        }
        v80.checkArgument(c11325a == null, "DRM on subtitles is not supported");
        int i4 = (this.f84464i - i3) - i2;
        try {
            this.f84466k.parse(this.f84465j, i4, i2, peg.C10937b.allCues(), new qu2() { // from class: seg
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f81636a.lambda$sampleMetadata$0(j, i, (ba3) obj);
                }
            });
        } catch (RuntimeException e) {
            if (!this.f84468m) {
                throw e;
            }
            xh9.m25149w(f84458n, "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.f84463h = i5;
        if (i5 == this.f84464i) {
            this.f84463h = 0;
            this.f84464i = 0;
        }
    }

    public void shouldSuppressParsingErrors(boolean z) {
        this.f84468m = z;
    }

    @Override // p000.q6h
    public void sampleData(jhc jhcVar, int i, int i2) {
        if (this.f84466k == null) {
            this.f84459d.sampleData(jhcVar, i, i2);
            return;
        }
        ensureSampleDataCapacity(i);
        jhcVar.readBytes(this.f84465j, this.f84464i, i);
        this.f84464i += i;
    }
}
