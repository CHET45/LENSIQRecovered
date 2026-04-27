package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p000.f6g;
import p000.kq6;
import p000.pgi;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ngi extends f6g {

    /* JADX INFO: renamed from: r */
    @hib
    public C9870a f64485r;

    /* JADX INFO: renamed from: s */
    public int f64486s;

    /* JADX INFO: renamed from: t */
    public boolean f64487t;

    /* JADX INFO: renamed from: u */
    @hib
    public pgi.C10957c f64488u;

    /* JADX INFO: renamed from: v */
    @hib
    public pgi.C10955a f64489v;

    /* JADX INFO: renamed from: ngi$a */
    public static final class C9870a {

        /* JADX INFO: renamed from: a */
        public final pgi.C10957c f64490a;

        /* JADX INFO: renamed from: b */
        public final pgi.C10955a f64491b;

        /* JADX INFO: renamed from: c */
        public final byte[] f64492c;

        /* JADX INFO: renamed from: d */
        public final pgi.C10956b[] f64493d;

        /* JADX INFO: renamed from: e */
        public final int f64494e;

        public C9870a(pgi.C10957c c10957c, pgi.C10955a c10955a, byte[] bArr, pgi.C10956b[] c10956bArr, int i) {
            this.f64490a = c10957c;
            this.f64491b = c10955a;
            this.f64492c = bArr;
            this.f64493d = c10956bArr;
            this.f64494e = i;
        }
    }

    private static int decodeBlockSize(byte b, C9870a c9870a) {
        return !c9870a.f64493d[m17935k(b, c9870a.f64494e, 1)].f70724a ? c9870a.f64490a.f70734g : c9870a.f64490a.f70735h;
    }

    @fdi
    /* JADX INFO: renamed from: j */
    public static void m17934j(ihc ihcVar, long j) {
        if (ihcVar.capacity() < ihcVar.limit() + 4) {
            ihcVar.reset(Arrays.copyOf(ihcVar.getData(), ihcVar.limit() + 4));
        } else {
            ihcVar.setLimit(ihcVar.limit() + 4);
        }
        byte[] data = ihcVar.getData();
        data[ihcVar.limit() - 4] = (byte) (j & 255);
        data[ihcVar.limit() - 3] = (byte) ((j >>> 8) & 255);
        data[ihcVar.limit() - 2] = (byte) ((j >>> 16) & 255);
        data[ihcVar.limit() - 1] = (byte) ((j >>> 24) & 255);
    }

    @fdi
    /* JADX INFO: renamed from: k */
    public static int m17935k(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean verifyBitstreamType(ihc ihcVar) {
        try {
            return pgi.verifyVorbisHeaderCapturePattern(1, ihcVar, true);
        } catch (xhc unused) {
            return false;
        }
    }

    @Override // p000.f6g
    /* JADX INFO: renamed from: d */
    public void mo10678d(long j) {
        super.mo10678d(j);
        this.f64487t = j != 0;
        pgi.C10957c c10957c = this.f64488u;
        this.f64486s = c10957c != null ? c10957c.f70734g : 0;
    }

    @Override // p000.f6g
    /* JADX INFO: renamed from: e */
    public long mo2868e(ihc ihcVar) {
        if ((ihcVar.getData()[0] & 1) == 1) {
            return -1L;
        }
        int iDecodeBlockSize = decodeBlockSize(ihcVar.getData()[0], (C9870a) u80.checkStateNotNull(this.f64485r));
        long j = this.f64487t ? (this.f64486s + iDecodeBlockSize) / 4 : 0;
        m17934j(ihcVar, j);
        this.f64487t = true;
        this.f64486s = iDecodeBlockSize;
        return j;
    }

    @Override // p000.f6g
    @a35(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: g */
    public boolean mo2869g(ihc ihcVar, long j, f6g.C5642b c5642b) throws IOException {
        if (this.f64485r != null) {
            u80.checkNotNull(c5642b.f35532a);
            return false;
        }
        C9870a c9870aM17936l = m17936l(ihcVar);
        this.f64485r = c9870aM17936l;
        if (c9870aM17936l == null) {
            return true;
        }
        pgi.C10957c c10957c = c9870aM17936l.f64490a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c10957c.f70737j);
        arrayList.add(c9870aM17936l.f64492c);
        c5642b.f35532a = new kq6.C8497b().setSampleMimeType("audio/vorbis").setAverageBitrate(c10957c.f70732e).setPeakBitrate(c10957c.f70731d).setChannelCount(c10957c.f70729b).setSampleRate(c10957c.f70730c).setInitializationData(arrayList).setMetadata(pgi.parseVorbisComments(kx7.copyOf(c9870aM17936l.f64491b.f70722b))).build();
        return true;
    }

    @Override // p000.f6g
    /* JADX INFO: renamed from: h */
    public void mo2870h(boolean z) {
        super.mo2870h(z);
        if (z) {
            this.f64485r = null;
            this.f64488u = null;
            this.f64489v = null;
        }
        this.f64486s = 0;
        this.f64487t = false;
    }

    @hib
    @fdi
    /* JADX INFO: renamed from: l */
    public C9870a m17936l(ihc ihcVar) throws IOException {
        pgi.C10957c c10957c = this.f64488u;
        if (c10957c == null) {
            this.f64488u = pgi.readVorbisIdentificationHeader(ihcVar);
            return null;
        }
        pgi.C10955a c10955a = this.f64489v;
        if (c10955a == null) {
            this.f64489v = pgi.readVorbisCommentHeader(ihcVar);
            return null;
        }
        byte[] bArr = new byte[ihcVar.limit()];
        System.arraycopy(ihcVar.getData(), 0, bArr, 0, ihcVar.limit());
        return new C9870a(c10957c, c10955a, bArr, pgi.readVorbisModes(ihcVar, c10957c.f70729b), pgi.iLog(r4.length - 1));
    }
}
