package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p000.e6g;
import p000.ogi;

/* JADX INFO: loaded from: classes3.dex */
public final class mgi extends e6g {

    /* JADX INFO: renamed from: r */
    @hib
    public C9349a f60981r;

    /* JADX INFO: renamed from: s */
    public int f60982s;

    /* JADX INFO: renamed from: t */
    public boolean f60983t;

    /* JADX INFO: renamed from: u */
    @hib
    public ogi.C10374c f60984u;

    /* JADX INFO: renamed from: v */
    @hib
    public ogi.C10372a f60985v;

    /* JADX INFO: renamed from: mgi$a */
    public static final class C9349a {

        /* JADX INFO: renamed from: a */
        public final ogi.C10374c f60986a;

        /* JADX INFO: renamed from: b */
        public final ogi.C10372a f60987b;

        /* JADX INFO: renamed from: c */
        public final byte[] f60988c;

        /* JADX INFO: renamed from: d */
        public final ogi.C10373b[] f60989d;

        /* JADX INFO: renamed from: e */
        public final int f60990e;

        public C9349a(ogi.C10374c c10374c, ogi.C10372a c10372a, byte[] bArr, ogi.C10373b[] c10373bArr, int i) {
            this.f60986a = c10374c;
            this.f60987b = c10372a;
            this.f60988c = bArr;
            this.f60989d = c10373bArr;
            this.f60990e = i;
        }
    }

    private static int decodeBlockSize(byte b, C9349a c9349a) {
        return !c9349a.f60989d[m17296k(b, c9349a.f60990e, 1)].f67594a ? c9349a.f60986a.f67604g : c9349a.f60986a.f67605h;
    }

    @fdi
    /* JADX INFO: renamed from: j */
    public static void m17295j(jhc jhcVar, long j) {
        if (jhcVar.capacity() < jhcVar.limit() + 4) {
            jhcVar.reset(Arrays.copyOf(jhcVar.getData(), jhcVar.limit() + 4));
        } else {
            jhcVar.setLimit(jhcVar.limit() + 4);
        }
        byte[] data = jhcVar.getData();
        data[jhcVar.limit() - 4] = (byte) (j & 255);
        data[jhcVar.limit() - 3] = (byte) ((j >>> 8) & 255);
        data[jhcVar.limit() - 2] = (byte) ((j >>> 16) & 255);
        data[jhcVar.limit() - 1] = (byte) ((j >>> 24) & 255);
    }

    @fdi
    /* JADX INFO: renamed from: k */
    public static int m17296k(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean verifyBitstreamType(jhc jhcVar) {
        try {
            return ogi.verifyVorbisHeaderCapturePattern(1, jhcVar, true);
        } catch (yhc unused) {
            return false;
        }
    }

    @Override // p000.e6g
    /* JADX INFO: renamed from: d */
    public void mo9756d(long j) {
        super.mo9756d(j);
        this.f60983t = j != 0;
        ogi.C10374c c10374c = this.f60984u;
        this.f60982s = c10374c != null ? c10374c.f67604g : 0;
    }

    @Override // p000.e6g
    /* JADX INFO: renamed from: e */
    public long mo121e(jhc jhcVar) {
        if ((jhcVar.getData()[0] & 1) == 1) {
            return -1L;
        }
        int iDecodeBlockSize = decodeBlockSize(jhcVar.getData()[0], (C9349a) v80.checkStateNotNull(this.f60981r));
        long j = this.f60983t ? (this.f60982s + iDecodeBlockSize) / 4 : 0;
        m17295j(jhcVar, j);
        this.f60983t = true;
        this.f60982s = iDecodeBlockSize;
        return j;
    }

    @Override // p000.e6g
    @a35(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: g */
    public boolean mo122g(jhc jhcVar, long j, e6g.C5148b c5148b) throws IOException {
        if (this.f60981r != null) {
            v80.checkNotNull(c5148b.f31967a);
            return false;
        }
        C9349a c9349aM17297l = m17297l(jhcVar);
        this.f60981r = c9349aM17297l;
        if (c9349aM17297l == null) {
            return true;
        }
        ogi.C10374c c10374c = c9349aM17297l.f60986a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c10374c.f67607j);
        arrayList.add(c9349aM17297l.f60988c);
        c5148b.f31967a = new C1213a.b().setContainerMimeType("audio/ogg").setSampleMimeType("audio/vorbis").setAverageBitrate(c10374c.f67602e).setPeakBitrate(c10374c.f67601d).setChannelCount(c10374c.f67599b).setSampleRate(c10374c.f67600c).setInitializationData(arrayList).setMetadata(ogi.parseVorbisComments(kx7.copyOf(c9349aM17297l.f60987b.f67592b))).build();
        return true;
    }

    @Override // p000.e6g
    /* JADX INFO: renamed from: h */
    public void mo123h(boolean z) {
        super.mo123h(z);
        if (z) {
            this.f60981r = null;
            this.f60984u = null;
            this.f60985v = null;
        }
        this.f60982s = 0;
        this.f60983t = false;
    }

    @hib
    @fdi
    /* JADX INFO: renamed from: l */
    public C9349a m17297l(jhc jhcVar) throws IOException {
        ogi.C10374c c10374c = this.f60984u;
        if (c10374c == null) {
            this.f60984u = ogi.readVorbisIdentificationHeader(jhcVar);
            return null;
        }
        ogi.C10372a c10372a = this.f60985v;
        if (c10372a == null) {
            this.f60985v = ogi.readVorbisCommentHeader(jhcVar);
            return null;
        }
        byte[] bArr = new byte[jhcVar.limit()];
        System.arraycopy(jhcVar.getData(), 0, bArr, 0, jhcVar.limit());
        return new C9349a(c10374c, c10372a, bArr, ogi.readVorbisModes(jhcVar, c10374c.f67599b), ogi.iLog(r4.length - 1));
    }
}
