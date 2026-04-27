package p000;

import android.graphics.Bitmap;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.AbstractC1224c;
import androidx.media3.exoplayer.InterfaceC1255s;
import androidx.media3.exoplayer.image.ImageOutput;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import p000.vs7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class tv7 extends AbstractC1224c {

    /* JADX INFO: renamed from: s2 */
    public static final String f86067s2 = "ImageRenderer";

    /* JADX INFO: renamed from: t2 */
    public static final int f86068t2 = 0;

    /* JADX INFO: renamed from: u2 */
    public static final int f86069u2 = 2;

    /* JADX INFO: renamed from: v2 */
    public static final int f86070v2 = 3;

    /* JADX INFO: renamed from: w2 */
    public static final long f86071w2 = 30000;

    /* JADX INFO: renamed from: V1 */
    public final vs7.InterfaceC14247a f86072V1;

    /* JADX INFO: renamed from: Z1 */
    public final rl3 f86073Z1;

    /* JADX INFO: renamed from: a2 */
    public final ArrayDeque<C13253a> f86074a2;

    /* JADX INFO: renamed from: b2 */
    public boolean f86075b2;

    /* JADX INFO: renamed from: c2 */
    public boolean f86076c2;

    /* JADX INFO: renamed from: d2 */
    public C13253a f86077d2;

    /* JADX INFO: renamed from: e2 */
    public long f86078e2;

    /* JADX INFO: renamed from: f2 */
    public long f86079f2;

    /* JADX INFO: renamed from: g2 */
    public int f86080g2;

    /* JADX INFO: renamed from: h2 */
    public int f86081h2;

    /* JADX INFO: renamed from: i2 */
    @hib
    public C1213a f86082i2;

    /* JADX INFO: renamed from: j2 */
    @hib
    public vs7 f86083j2;

    /* JADX INFO: renamed from: k2 */
    @hib
    public rl3 f86084k2;

    /* JADX INFO: renamed from: l2 */
    public ImageOutput f86085l2;

    /* JADX INFO: renamed from: m2 */
    @hib
    public Bitmap f86086m2;

    /* JADX INFO: renamed from: n2 */
    public boolean f86087n2;

    /* JADX INFO: renamed from: o2 */
    @hib
    public C13254b f86088o2;

    /* JADX INFO: renamed from: p2 */
    @hib
    public C13254b f86089p2;

    /* JADX INFO: renamed from: q2 */
    public int f86090q2;

    /* JADX INFO: renamed from: r2 */
    public boolean f86091r2;

    /* JADX INFO: renamed from: tv7$a */
    public static final class C13253a {

        /* JADX INFO: renamed from: c */
        public static final C13253a f86092c = new C13253a(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a */
        public final long f86093a;

        /* JADX INFO: renamed from: b */
        public final long f86094b;

        public C13253a(long j, long j2) {
            this.f86093a = j;
            this.f86094b = j2;
        }
    }

    /* JADX INFO: renamed from: tv7$b */
    public static class C13254b {

        /* JADX INFO: renamed from: a */
        public final int f86095a;

        /* JADX INFO: renamed from: b */
        public final long f86096b;

        /* JADX INFO: renamed from: c */
        public Bitmap f86097c;

        public C13254b(int i, long j) {
            this.f86095a = i;
            this.f86096b = j;
        }

        public long getPresentationTimeUs() {
            return this.f86096b;
        }

        @hib
        public Bitmap getTileBitmap() {
            return this.f86097c;
        }

        public int getTileIndex() {
            return this.f86095a;
        }

        public boolean hasTileBitmap() {
            return this.f86097c != null;
        }

        public void setTileBitmap(Bitmap bitmap) {
            this.f86097c = bitmap;
        }
    }

    public tv7(vs7.InterfaceC14247a interfaceC14247a, @hib ImageOutput imageOutput) {
        super(4);
        this.f86072V1 = interfaceC14247a;
        this.f86085l2 = getImageOutput(imageOutput);
        this.f86073Z1 = rl3.newNoDataInstance();
        this.f86077d2 = C13253a.f86092c;
        this.f86074a2 = new ArrayDeque<>();
        this.f86079f2 = -9223372036854775807L;
        this.f86078e2 = -9223372036854775807L;
        this.f86080g2 = 0;
        this.f86081h2 = 1;
    }

    private boolean canCreateDecoderForFormat(C1213a c1213a) {
        int iSupportsFormat = this.f86072V1.supportsFormat(c1213a);
        return iSupportsFormat == InterfaceC1255s.create(4) || iSupportsFormat == InterfaceC1255s.create(3);
    }

    private Bitmap cropTileFromImageGrid(int i) {
        v80.checkStateNotNull(this.f86086m2);
        int width = this.f86086m2.getWidth() / ((C1213a) v80.checkStateNotNull(this.f86082i2)).f8273N;
        int height = this.f86086m2.getHeight() / ((C1213a) v80.checkStateNotNull(this.f86082i2)).f8274O;
        int i2 = this.f86082i2.f8273N;
        return Bitmap.createBitmap(this.f86086m2, (i % i2) * width, (i / i2) * height, width, height);
    }

    private boolean drainOutput(long j, long j2) throws aa5, ws7 {
        if (this.f86086m2 != null && this.f86088o2 == null) {
            return false;
        }
        if (this.f86081h2 == 0 && getState() != 2) {
            return false;
        }
        if (this.f86086m2 == null) {
            v80.checkStateNotNull(this.f86083j2);
            pv7 pv7VarDequeueOutputBuffer = this.f86083j2.dequeueOutputBuffer();
            if (pv7VarDequeueOutputBuffer == null) {
                return false;
            }
            if (((pv7) v80.checkStateNotNull(pv7VarDequeueOutputBuffer)).isEndOfStream()) {
                if (this.f86080g2 == 3) {
                    releaseDecoderResources();
                    v80.checkStateNotNull(this.f86082i2);
                    maybeInitCodec();
                } else {
                    ((pv7) v80.checkStateNotNull(pv7VarDequeueOutputBuffer)).release();
                    if (this.f86074a2.isEmpty()) {
                        this.f86076c2 = true;
                    }
                }
                return false;
            }
            v80.checkStateNotNull(pv7VarDequeueOutputBuffer.f72210e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f86086m2 = pv7VarDequeueOutputBuffer.f72210e;
            ((pv7) v80.checkStateNotNull(pv7VarDequeueOutputBuffer)).release();
        }
        if (!this.f86087n2 || this.f86086m2 == null || this.f86088o2 == null) {
            return false;
        }
        v80.checkStateNotNull(this.f86082i2);
        C1213a c1213a = this.f86082i2;
        int i = c1213a.f8273N;
        boolean z = ((i == 1 && c1213a.f8274O == 1) || i == -1 || c1213a.f8274O == -1) ? false : true;
        if (!this.f86088o2.hasTileBitmap()) {
            C13254b c13254b = this.f86088o2;
            c13254b.setTileBitmap(z ? cropTileFromImageGrid(c13254b.getTileIndex()) : (Bitmap) v80.checkStateNotNull(this.f86086m2));
        }
        if (!m22875B(j, j2, (Bitmap) v80.checkStateNotNull(this.f86088o2.getTileBitmap()), this.f86088o2.getPresentationTimeUs())) {
            return false;
        }
        onProcessedOutputBuffer(((C13254b) v80.checkStateNotNull(this.f86088o2)).getPresentationTimeUs());
        this.f86081h2 = 3;
        if (!z || ((C13254b) v80.checkStateNotNull(this.f86088o2)).getTileIndex() == (((C1213a) v80.checkStateNotNull(this.f86082i2)).f8274O * ((C1213a) v80.checkStateNotNull(this.f86082i2)).f8273N) - 1) {
            this.f86086m2 = null;
        }
        this.f86088o2 = this.f86089p2;
        this.f86089p2 = null;
        return true;
    }

    private boolean feedInputBuffer(long j) throws ql3 {
        if (this.f86087n2 && this.f86088o2 != null) {
            return false;
        }
        oq6 oq6VarM1751e = m1751e();
        vs7 vs7Var = this.f86083j2;
        if (vs7Var == null || this.f86080g2 == 3 || this.f86075b2) {
            return false;
        }
        if (this.f86084k2 == null) {
            rl3 rl3VarDequeueInputBuffer = vs7Var.dequeueInputBuffer();
            this.f86084k2 = rl3VarDequeueInputBuffer;
            if (rl3VarDequeueInputBuffer == null) {
                return false;
            }
        }
        if (this.f86080g2 == 2) {
            v80.checkStateNotNull(this.f86084k2);
            this.f86084k2.setFlags(4);
            ((vs7) v80.checkStateNotNull(this.f86083j2)).queueInputBuffer(this.f86084k2);
            this.f86084k2 = null;
            this.f86080g2 = 3;
            return false;
        }
        int iM1771y = m1771y(oq6VarM1751e, this.f86084k2, 0);
        if (iM1771y == -5) {
            this.f86082i2 = (C1213a) v80.checkStateNotNull(oq6VarM1751e.f68294b);
            this.f86091r2 = true;
            this.f86080g2 = 2;
            return true;
        }
        if (iM1771y != -4) {
            if (iM1771y == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f86084k2.flip();
        ByteBuffer byteBuffer = this.f86084k2.f78608d;
        boolean z = (byteBuffer != null && byteBuffer.remaining() > 0) || ((rl3) v80.checkStateNotNull(this.f86084k2)).isEndOfStream();
        if (z) {
            ((rl3) v80.checkStateNotNull(this.f86084k2)).f78606b = this.f86082i2;
            ((vs7) v80.checkStateNotNull(this.f86083j2)).queueInputBuffer((rl3) v80.checkStateNotNull(this.f86084k2));
            this.f86090q2 = 0;
        }
        maybeAdvanceTileInfo(j, (rl3) v80.checkStateNotNull(this.f86084k2));
        if (((rl3) v80.checkStateNotNull(this.f86084k2)).isEndOfStream()) {
            this.f86075b2 = true;
            this.f86084k2 = null;
            return false;
        }
        this.f86079f2 = Math.max(this.f86079f2, ((rl3) v80.checkStateNotNull(this.f86084k2)).f78610f);
        if (z) {
            this.f86084k2 = null;
        } else {
            ((rl3) v80.checkStateNotNull(this.f86084k2)).clear();
        }
        return !this.f86087n2;
    }

    private static ImageOutput getImageOutput(@hib ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f8743a : imageOutput;
    }

    private boolean isTileLastInGrid(C13254b c13254b) {
        return ((C1213a) v80.checkStateNotNull(this.f86082i2)).f8273N == -1 || this.f86082i2.f8274O == -1 || c13254b.getTileIndex() == (((C1213a) v80.checkStateNotNull(this.f86082i2)).f8274O * this.f86082i2.f8273N) - 1;
    }

    private void lowerFirstFrameState(int i) {
        this.f86081h2 = Math.min(this.f86081h2, i);
    }

    private void maybeAdvanceTileInfo(long j, rl3 rl3Var) {
        boolean z = true;
        if (rl3Var.isEndOfStream()) {
            this.f86087n2 = true;
            return;
        }
        C13254b c13254b = new C13254b(this.f86090q2, rl3Var.f78610f);
        this.f86089p2 = c13254b;
        this.f86090q2++;
        if (!this.f86087n2) {
            long presentationTimeUs = c13254b.getPresentationTimeUs();
            boolean z2 = presentationTimeUs - 30000 <= j && j <= 30000 + presentationTimeUs;
            C13254b c13254b2 = this.f86088o2;
            boolean z3 = c13254b2 != null && c13254b2.getPresentationTimeUs() <= j && j < presentationTimeUs;
            boolean zIsTileLastInGrid = isTileLastInGrid((C13254b) v80.checkStateNotNull(this.f86089p2));
            if (!z2 && !z3 && !zIsTileLastInGrid) {
                z = false;
            }
            this.f86087n2 = z;
            if (z3 && !z2) {
                return;
            }
        }
        this.f86088o2 = this.f86089p2;
        this.f86089p2 = null;
    }

    private boolean maybeInitCodec() throws aa5 {
        if (!m22874A()) {
            return false;
        }
        if (!this.f86091r2) {
            return true;
        }
        if (!canCreateDecoderForFormat((C1213a) v80.checkNotNull(this.f86082i2))) {
            throw m1747a(new ws7("Provided decoder factory can't create decoder for format."), this.f86082i2, 4005);
        }
        vs7 vs7Var = this.f86083j2;
        if (vs7Var != null) {
            vs7Var.release();
        }
        this.f86083j2 = this.f86072V1.createImageDecoder();
        this.f86091r2 = false;
        return true;
    }

    private void onProcessedOutputBuffer(long j) {
        this.f86078e2 = j;
        while (!this.f86074a2.isEmpty() && j >= this.f86074a2.peek().f86093a) {
            this.f86077d2 = this.f86074a2.removeFirst();
        }
    }

    private void releaseDecoderResources() {
        this.f86084k2 = null;
        this.f86080g2 = 0;
        this.f86079f2 = -9223372036854775807L;
        vs7 vs7Var = this.f86083j2;
        if (vs7Var != null) {
            vs7Var.release();
            this.f86083j2 = null;
        }
    }

    private void setImageOutput(@hib ImageOutput imageOutput) {
        this.f86085l2 = getImageOutput(imageOutput);
    }

    private boolean shouldForceRender() {
        boolean z = getState() == 2;
        int i = this.f86081h2;
        if (i == 0) {
            return z;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: A */
    public boolean m22874A() throws aa5 {
        return true;
    }

    /* JADX INFO: renamed from: B */
    public boolean m22875B(long j, long j2, Bitmap bitmap, long j3) throws aa5 {
        long j4 = j3 - j;
        if (!shouldForceRender() && j4 >= 30000) {
            return false;
        }
        this.f86085l2.onImageAvailable(j3 - this.f86077d2.f86094b, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public String getName() {
        return f86067s2;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c, androidx.media3.exoplayer.C1253p.b
    public void handleMessage(int i, @hib Object obj) throws aa5 {
        if (i != 15) {
            super.handleMessage(i, obj);
        } else {
            setImageOutput(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isEnded() {
        return this.f86076c2;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isReady() {
        int i = this.f86081h2;
        return i == 3 || (i == 0 && this.f86087n2);
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: n */
    public void mo1760n() {
        this.f86082i2 = null;
        this.f86077d2 = C13253a.f86092c;
        this.f86074a2.clear();
        releaseDecoderResources();
        this.f86085l2.onDisabled();
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: o */
    public void mo1761o(boolean z, boolean z2) throws aa5 {
        this.f86081h2 = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: q */
    public void mo1763q(long j, boolean z) throws aa5 {
        lowerFirstFrameState(1);
        this.f86076c2 = false;
        this.f86075b2 = false;
        this.f86086m2 = null;
        this.f86088o2 = null;
        this.f86089p2 = null;
        this.f86087n2 = false;
        this.f86084k2 = null;
        vs7 vs7Var = this.f86083j2;
        if (vs7Var != null) {
            vs7Var.flush();
        }
        this.f86074a2.clear();
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: r */
    public void mo1764r() {
        releaseDecoderResources();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void render(long j, long j2) throws aa5 {
        if (this.f86076c2) {
            return;
        }
        if (this.f86082i2 == null) {
            oq6 oq6VarM1751e = m1751e();
            this.f86073Z1.clear();
            int iM1771y = m1771y(oq6VarM1751e, this.f86073Z1, 2);
            if (iM1771y != -5) {
                if (iM1771y == -4) {
                    v80.checkState(this.f86073Z1.isEndOfStream());
                    this.f86075b2 = true;
                    this.f86076c2 = true;
                    return;
                }
                return;
            }
            this.f86082i2 = (C1213a) v80.checkStateNotNull(oq6VarM1751e.f68294b);
            this.f86091r2 = true;
        }
        if (this.f86083j2 != null || maybeInitCodec()) {
            try {
                x5h.beginSection("drainAndFeedDecoder");
                while (drainOutput(j, j2)) {
                }
                while (feedInputBuffer(j)) {
                }
                x5h.endSection();
            } catch (ws7 e) {
                throw m1747a(e, null, 4003);
            }
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC1255s
    public int supportsFormat(C1213a c1213a) {
        return this.f86072V1.supportsFormat(c1213a);
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: t */
    public void mo1766t() {
        releaseDecoderResources();
        lowerFirstFrameState(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r2 >= r5) goto L14;
     */
    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1769w(androidx.media3.common.C1213a[] r5, long r6, long r8, p000.una.C13612b r10) throws p000.aa5 {
        /*
            r4 = this;
            super.mo1769w(r5, r6, r8, r10)
            tv7$a r5 = r4.f86077d2
            long r5 = r5.f86094b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L36
            java.util.ArrayDeque<tv7$a> r5 = r4.f86074a2
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L29
            long r5 = r4.f86079f2
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L36
            long r2 = r4.f86078e2
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L29
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L29
            goto L36
        L29:
            java.util.ArrayDeque<tv7$a> r5 = r4.f86074a2
            tv7$a r6 = new tv7$a
            long r0 = r4.f86079f2
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L3d
        L36:
            tv7$a r5 = new tv7$a
            r5.<init>(r0, r8)
            r4.f86077d2 = r5
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tv7.mo1769w(androidx.media3.common.a[], long, long, una$b):void");
    }
}
