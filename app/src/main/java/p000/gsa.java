package p000;

import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
import p000.b72;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
@fgb
public class gsa implements Closeable, m34 {

    /* JADX INFO: renamed from: Z1 */
    public static final int f40913Z1 = 5;

    /* JADX INFO: renamed from: a2 */
    public static final int f40914a2 = 1;

    /* JADX INFO: renamed from: b2 */
    public static final int f40915b2 = 254;

    /* JADX INFO: renamed from: c2 */
    public static final int f40916c2 = 2097152;

    /* JADX INFO: renamed from: C */
    public int f40917C;

    /* JADX INFO: renamed from: L */
    public boolean f40920L;

    /* JADX INFO: renamed from: M */
    public wm2 f40921M;

    /* JADX INFO: renamed from: Q */
    public long f40924Q;

    /* JADX INFO: renamed from: Z */
    public int f40928Z;

    /* JADX INFO: renamed from: a */
    public InterfaceC6484b f40929a;

    /* JADX INFO: renamed from: b */
    public int f40930b;

    /* JADX INFO: renamed from: c */
    public final k4g f40931c;

    /* JADX INFO: renamed from: d */
    public final rhh f40932d;

    /* JADX INFO: renamed from: e */
    public am3 f40933e;

    /* JADX INFO: renamed from: f */
    public md7 f40934f;

    /* JADX INFO: renamed from: m */
    public byte[] f40935m;

    /* JADX INFO: renamed from: F */
    public EnumC6487e f40918F = EnumC6487e.HEADER;

    /* JADX INFO: renamed from: H */
    public int f40919H = 5;

    /* JADX INFO: renamed from: N */
    public wm2 f40923N = new wm2();

    /* JADX INFO: renamed from: X */
    public boolean f40926X = false;

    /* JADX INFO: renamed from: Y */
    public int f40927Y = -1;

    /* JADX INFO: renamed from: M1 */
    public boolean f40922M1 = false;

    /* JADX INFO: renamed from: V1 */
    public volatile boolean f40925V1 = false;

    /* JADX INFO: renamed from: gsa$a */
    public static /* synthetic */ class C6483a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40936a;

        static {
            int[] iArr = new int[EnumC6487e.values().length];
            f40936a = iArr;
            try {
                iArr[EnumC6487e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40936a[EnumC6487e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: gsa$b */
    public interface InterfaceC6484b {
        void bytesRead(int i);

        void deframeFailed(Throwable th);

        void deframerClosed(boolean z);

        void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a);
    }

    /* JADX INFO: renamed from: gsa$c */
    public static class C6485c implements y5g.InterfaceC15496a {

        /* JADX INFO: renamed from: a */
        public InputStream f40937a;

        public /* synthetic */ C6485c(InputStream inputStream, C6483a c6483a) {
            this(inputStream);
        }

        @Override // p000.y5g.InterfaceC15496a
        @eib
        public InputStream next() {
            InputStream inputStream = this.f40937a;
            this.f40937a = null;
            return inputStream;
        }

        private C6485c(InputStream inputStream) {
            this.f40937a = inputStream;
        }
    }

    /* JADX INFO: renamed from: gsa$e */
    public enum EnumC6487e {
        HEADER,
        BODY
    }

    public gsa(InterfaceC6484b interfaceC6484b, am3 am3Var, int i, k4g k4gVar, rhh rhhVar) {
        this.f40929a = (InterfaceC6484b) v7d.checkNotNull(interfaceC6484b, "sink");
        this.f40933e = (am3) v7d.checkNotNull(am3Var, "decompressor");
        this.f40930b = i;
        this.f40931c = (k4g) v7d.checkNotNull(k4gVar, "statsTraceCtx");
        this.f40932d = (rhh) v7d.checkNotNull(rhhVar, "transportTracer");
    }

    private void deliver() {
        if (this.f40926X) {
            return;
        }
        this.f40926X = true;
        while (!this.f40925V1 && this.f40924Q > 0 && readRequiredBytes()) {
            try {
                int i = C6483a.f40936a[this.f40918F.ordinal()];
                if (i == 1) {
                    processHeader();
                } else {
                    if (i != 2) {
                        throw new AssertionError("Invalid state: " + this.f40918F);
                    }
                    processBody();
                    this.f40924Q--;
                }
            } catch (Throwable th) {
                this.f40926X = false;
                throw th;
            }
        }
        if (this.f40925V1) {
            close();
            this.f40926X = false;
        } else {
            if (this.f40922M1 && isStalled()) {
                close();
            }
            this.f40926X = false;
        }
    }

    private InputStream getCompressedBody() {
        am3 am3Var = this.f40933e;
        if (am3Var == b72.C1761b.f12832a) {
            throw n4g.f63272s.withDescription("Can't decode compressed gRPC message as compression not configured").asRuntimeException();
        }
        try {
            return new C6486d(am3Var.decompress(grd.openStream(this.f40921M, true)), this.f40930b, this.f40931c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private InputStream getUncompressedBody() {
        this.f40931c.inboundUncompressedSize(this.f40921M.readableBytes());
        return grd.openStream(this.f40921M, true);
    }

    private boolean isClosedOrScheduledToClose() {
        return isClosed() || this.f40922M1;
    }

    private boolean isStalled() {
        md7 md7Var = this.f40934f;
        return md7Var != null ? md7Var.m17256m() : this.f40923N.readableBytes() == 0;
    }

    private void processBody() {
        this.f40931c.inboundMessageRead(this.f40927Y, this.f40928Z, -1L);
        this.f40928Z = 0;
        InputStream compressedBody = this.f40920L ? getCompressedBody() : getUncompressedBody();
        this.f40921M.touch();
        this.f40921M = null;
        this.f40929a.messagesAvailable(new C6485c(compressedBody, null));
        this.f40918F = EnumC6487e.HEADER;
        this.f40919H = 5;
    }

    private void processHeader() {
        int unsignedByte = this.f40921M.readUnsignedByte();
        if ((unsignedByte & f40915b2) != 0) {
            throw n4g.f63272s.withDescription("gRPC frame header malformed: reserved bits not zero").asRuntimeException();
        }
        this.f40920L = (unsignedByte & 1) != 0;
        int i = this.f40921M.readInt();
        this.f40919H = i;
        if (i < 0 || i > this.f40930b) {
            throw n4g.f63267n.withDescription(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f40930b), Integer.valueOf(this.f40919H))).asRuntimeException();
        }
        int i2 = this.f40927Y + 1;
        this.f40927Y = i2;
        this.f40931c.inboundMessage(i2);
        this.f40932d.reportMessageReceived();
        this.f40918F = EnumC6487e.BODY;
    }

    private boolean readRequiredBytes() throws Throwable {
        int iM17253j;
        int i = 0;
        try {
            if (this.f40921M == null) {
                this.f40921M = new wm2();
            }
            int iM17252i = 0;
            iM17253j = 0;
            while (true) {
                try {
                    int i2 = this.f40919H - this.f40921M.readableBytes();
                    if (i2 <= 0) {
                        if (iM17252i <= 0) {
                            return true;
                        }
                        this.f40929a.bytesRead(iM17252i);
                        if (this.f40918F != EnumC6487e.BODY) {
                            return true;
                        }
                        if (this.f40934f != null) {
                            this.f40931c.inboundWireSize(iM17253j);
                            this.f40928Z += iM17253j;
                            return true;
                        }
                        this.f40931c.inboundWireSize(iM17252i);
                        this.f40928Z += iM17252i;
                        return true;
                    }
                    if (this.f40934f != null) {
                        try {
                            byte[] bArr = this.f40935m;
                            if (bArr == null || this.f40917C == bArr.length) {
                                this.f40935m = new byte[Math.min(i2, 2097152)];
                                this.f40917C = 0;
                            }
                            int iM17255l = this.f40934f.m17255l(this.f40935m, this.f40917C, Math.min(i2, this.f40935m.length - this.f40917C));
                            iM17252i += this.f40934f.m17252i();
                            iM17253j += this.f40934f.m17253j();
                            if (iM17255l == 0) {
                                if (iM17252i > 0) {
                                    this.f40929a.bytesRead(iM17252i);
                                    if (this.f40918F == EnumC6487e.BODY) {
                                        if (this.f40934f != null) {
                                            this.f40931c.inboundWireSize(iM17253j);
                                            this.f40928Z += iM17253j;
                                        } else {
                                            this.f40931c.inboundWireSize(iM17252i);
                                            this.f40928Z += iM17252i;
                                        }
                                    }
                                }
                                return false;
                            }
                            this.f40921M.addBuffer(grd.wrap(this.f40935m, this.f40917C, iM17255l));
                            this.f40917C += iM17255l;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        } catch (DataFormatException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        if (this.f40923N.readableBytes() == 0) {
                            if (iM17252i > 0) {
                                this.f40929a.bytesRead(iM17252i);
                                if (this.f40918F == EnumC6487e.BODY) {
                                    if (this.f40934f != null) {
                                        this.f40931c.inboundWireSize(iM17253j);
                                        this.f40928Z += iM17253j;
                                    } else {
                                        this.f40931c.inboundWireSize(iM17252i);
                                        this.f40928Z += iM17252i;
                                    }
                                }
                            }
                            return false;
                        }
                        int iMin = Math.min(i2, this.f40923N.readableBytes());
                        iM17252i += iMin;
                        this.f40921M.addBuffer(this.f40923N.readBytes(iMin));
                    }
                } catch (Throwable th) {
                    int i3 = iM17252i;
                    th = th;
                    i = i3;
                    if (i > 0) {
                        this.f40929a.bytesRead(i);
                        if (this.f40918F == EnumC6487e.BODY) {
                            if (this.f40934f != null) {
                                this.f40931c.inboundWireSize(iM17253j);
                                this.f40928Z += iM17253j;
                            } else {
                                this.f40931c.inboundWireSize(i);
                                this.f40928Z += i;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            iM17253j = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m11834a() {
        return this.f40924Q != 0;
    }

    /* JADX INFO: renamed from: b */
    public void m11835b(InterfaceC6484b interfaceC6484b) {
        this.f40929a = interfaceC6484b;
    }

    /* JADX INFO: renamed from: c */
    public void m11836c() {
        this.f40925V1 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, p000.m34
    public void close() {
        if (isClosed()) {
            return;
        }
        wm2 wm2Var = this.f40921M;
        boolean z = wm2Var != null && wm2Var.readableBytes() > 0;
        try {
            md7 md7Var = this.f40934f;
            if (md7Var != null) {
                boolean z2 = z || md7Var.m17254k();
                this.f40934f.close();
                z = z2;
            }
            wm2 wm2Var2 = this.f40923N;
            if (wm2Var2 != null) {
                wm2Var2.close();
            }
            wm2 wm2Var3 = this.f40921M;
            if (wm2Var3 != null) {
                wm2Var3.close();
            }
            this.f40934f = null;
            this.f40923N = null;
            this.f40921M = null;
            this.f40929a.deframerClosed(z);
        } catch (Throwable th) {
            this.f40934f = null;
            this.f40923N = null;
            this.f40921M = null;
            throw th;
        }
    }

    @Override // p000.m34
    public void closeWhenComplete() {
        if (isClosed()) {
            return;
        }
        if (isStalled()) {
            close();
        } else {
            this.f40922M1 = true;
        }
    }

    @Override // p000.m34
    public void deframe(frd frdVar) throws Throwable {
        v7d.checkNotNull(frdVar, "data");
        boolean z = true;
        try {
            if (isClosedOrScheduledToClose()) {
                frdVar.close();
                return;
            }
            md7 md7Var = this.f40934f;
            if (md7Var != null) {
                md7Var.m17251h(frdVar);
            } else {
                this.f40923N.addBuffer(frdVar);
            }
            try {
                deliver();
            } catch (Throwable th) {
                th = th;
                z = false;
                if (z) {
                    frdVar.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean isClosed() {
        return this.f40923N == null && this.f40934f == null;
    }

    @Override // p000.m34
    public void request(int i) {
        v7d.checkArgument(i > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f40924Q += (long) i;
        deliver();
    }

    @Override // p000.m34
    public void setDecompressor(am3 am3Var) {
        v7d.checkState(this.f40934f == null, "Already set full stream decompressor");
        this.f40933e = (am3) v7d.checkNotNull(am3Var, "Can't pass an empty decompressor");
    }

    @Override // p000.m34
    public void setFullStreamDecompressor(md7 md7Var) {
        v7d.checkState(this.f40933e == b72.C1761b.f12832a, "per-message decompressor already set");
        v7d.checkState(this.f40934f == null, "full stream decompressor already set");
        this.f40934f = (md7) v7d.checkNotNull(md7Var, "Can't pass a null full stream decompressor");
        this.f40923N = null;
    }

    @Override // p000.m34
    public void setMaxInboundMessageSize(int i) {
        this.f40930b = i;
    }

    /* JADX INFO: renamed from: gsa$d */
    @gdi
    public static final class C6486d extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        public final int f40938a;

        /* JADX INFO: renamed from: b */
        public final k4g f40939b;

        /* JADX INFO: renamed from: c */
        public long f40940c;

        /* JADX INFO: renamed from: d */
        public long f40941d;

        /* JADX INFO: renamed from: e */
        public long f40942e;

        public C6486d(InputStream inputStream, int i, k4g k4gVar) {
            super(inputStream);
            this.f40942e = -1L;
            this.f40938a = i;
            this.f40939b = k4gVar;
        }

        private void reportCount() {
            long j = this.f40941d;
            long j2 = this.f40940c;
            if (j > j2) {
                this.f40939b.inboundUncompressedSize(j - j2);
                this.f40940c = this.f40941d;
            }
        }

        private void verifySize() {
            if (this.f40941d <= this.f40938a) {
                return;
            }
            throw n4g.f63267n.withDescription("Decompressed gRPC message exceeds maximum size " + this.f40938a).asRuntimeException();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.f40942e = this.f40941d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = ((FilterInputStream) this).in.read();
            if (i != -1) {
                this.f40941d++;
            }
            verifySize();
            reportCount();
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f40942e == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f40941d = this.f40942e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j);
            this.f40941d += jSkip;
            verifySize();
            reportCount();
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
            if (i3 != -1) {
                this.f40941d += (long) i3;
            }
            verifySize();
            reportCount();
            return i3;
        }
    }
}
