package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.b72;

/* JADX INFO: loaded from: classes7.dex */
public class jsa implements pv6 {

    /* JADX INFO: renamed from: n */
    public static final int f51698n = -1;

    /* JADX INFO: renamed from: o */
    public static final int f51699o = 5;

    /* JADX INFO: renamed from: p */
    public static final byte f51700p = 0;

    /* JADX INFO: renamed from: q */
    public static final byte f51701q = 1;

    /* JADX INFO: renamed from: a */
    public final InterfaceC8056d f51702a;

    /* JADX INFO: renamed from: c */
    public tri f51704c;

    /* JADX INFO: renamed from: h */
    public final uri f51709h;

    /* JADX INFO: renamed from: i */
    public final k4g f51710i;

    /* JADX INFO: renamed from: j */
    public boolean f51711j;

    /* JADX INFO: renamed from: k */
    public int f51712k;

    /* JADX INFO: renamed from: m */
    public long f51714m;

    /* JADX INFO: renamed from: b */
    public int f51703b = -1;

    /* JADX INFO: renamed from: d */
    public go2 f51705d = b72.C1761b.f12832a;

    /* JADX INFO: renamed from: e */
    public boolean f51706e = true;

    /* JADX INFO: renamed from: f */
    public final C8055c f51707f = new C8055c();

    /* JADX INFO: renamed from: g */
    public final ByteBuffer f51708g = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: l */
    public int f51713l = -1;

    /* JADX INFO: renamed from: jsa$d */
    public interface InterfaceC8056d {
        void deliverFrame(@eib tri triVar, boolean z, boolean z2, int i);
    }

    public jsa(InterfaceC8056d interfaceC8056d, uri uriVar, k4g k4gVar) {
        this.f51702a = (InterfaceC8056d) v7d.checkNotNull(interfaceC8056d, "sink");
        this.f51709h = (uri) v7d.checkNotNull(uriVar, "bufferAllocator");
        this.f51710i = (k4g) v7d.checkNotNull(k4gVar, "statsTraceCtx");
    }

    private void commitToSink(boolean z, boolean z2) {
        tri triVar = this.f51704c;
        this.f51704c = null;
        this.f51702a.deliverFrame(triVar, z, z2, this.f51712k);
        this.f51712k = 0;
    }

    private int getKnownLength(InputStream inputStream) throws IOException {
        if ((inputStream instanceof ss8) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    private void releaseBuffer() {
        tri triVar = this.f51704c;
        if (triVar != null) {
            triVar.release();
            this.f51704c = null;
        }
    }

    private void verifyNotClosed() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    private void writeBufferChain(C8054b c8054b, boolean z) {
        int i = c8054b.readableBytes();
        int i2 = this.f51703b;
        if (i2 >= 0 && i > i2) {
            throw n4g.f63267n.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i), Integer.valueOf(this.f51703b))).asRuntimeException();
        }
        this.f51708g.clear();
        this.f51708g.put(z ? (byte) 1 : (byte) 0).putInt(i);
        tri triVarAllocate = this.f51709h.allocate(5);
        triVarAllocate.write(this.f51708g.array(), 0, this.f51708g.position());
        if (i == 0) {
            this.f51704c = triVarAllocate;
            return;
        }
        this.f51702a.deliverFrame(triVarAllocate, false, false, this.f51712k - 1);
        this.f51712k = 1;
        List list = c8054b.f51715a;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            this.f51702a.deliverFrame((tri) list.get(i3), false, false, 0);
        }
        this.f51704c = (tri) list.get(list.size() - 1);
        this.f51714m = i;
    }

    private int writeCompressed(InputStream inputStream, int i) throws IOException {
        C8054b c8054b = new C8054b();
        OutputStream outputStreamCompress = this.f51705d.compress(c8054b);
        try {
            int iWriteToOutputStream = writeToOutputStream(inputStream, outputStreamCompress);
            outputStreamCompress.close();
            int i2 = this.f51703b;
            if (i2 >= 0 && iWriteToOutputStream > i2) {
                throw n4g.f63267n.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iWriteToOutputStream), Integer.valueOf(this.f51703b))).asRuntimeException();
            }
            writeBufferChain(c8054b, true);
            return iWriteToOutputStream;
        } catch (Throwable th) {
            outputStreamCompress.close();
            throw th;
        }
    }

    private int writeKnownLengthUncompressed(InputStream inputStream, int i) throws IOException {
        int i2 = this.f51703b;
        if (i2 >= 0 && i > i2) {
            throw n4g.f63267n.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i), Integer.valueOf(this.f51703b))).asRuntimeException();
        }
        this.f51708g.clear();
        this.f51708g.put((byte) 0).putInt(i);
        if (this.f51704c == null) {
            this.f51704c = this.f51709h.allocate(this.f51708g.position() + i);
        }
        writeRaw(this.f51708g.array(), 0, this.f51708g.position());
        return writeToOutputStream(inputStream, this.f51707f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeRaw(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            tri triVar = this.f51704c;
            if (triVar != null && triVar.writableBytes() == 0) {
                commitToSink(false, false);
            }
            if (this.f51704c == null) {
                this.f51704c = this.f51709h.allocate(i2);
            }
            int iMin = Math.min(i2, this.f51704c.writableBytes());
            this.f51704c.write(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int writeToOutputStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof xo4) {
            return ((xo4) inputStream).drainTo(outputStream);
        }
        long jCopy = tj1.copy(inputStream, outputStream);
        v7d.checkArgument(jCopy <= 2147483647L, "Message size overflow: %s", jCopy);
        return (int) jCopy;
    }

    private int writeUncompressed(InputStream inputStream, int i) throws IOException {
        if (i != -1) {
            this.f51714m = i;
            return writeKnownLengthUncompressed(inputStream, i);
        }
        C8054b c8054b = new C8054b();
        int iWriteToOutputStream = writeToOutputStream(inputStream, c8054b);
        writeBufferChain(c8054b, false);
        return iWriteToOutputStream;
    }

    @Override // p000.pv6
    public void close() {
        if (isClosed()) {
            return;
        }
        this.f51711j = true;
        tri triVar = this.f51704c;
        if (triVar != null && triVar.readableBytes() == 0) {
            releaseBuffer();
        }
        commitToSink(true, true);
    }

    @Override // p000.pv6
    public void dispose() {
        this.f51711j = true;
        releaseBuffer();
    }

    @Override // p000.pv6
    public void flush() {
        tri triVar = this.f51704c;
        if (triVar == null || triVar.readableBytes() <= 0) {
            return;
        }
        commitToSink(false, true);
    }

    @Override // p000.pv6
    public boolean isClosed() {
        return this.f51711j;
    }

    @Override // p000.pv6
    public void setMaxOutboundMessageSize(int i) {
        v7d.checkState(this.f51703b == -1, "max size already set");
        this.f51703b = i;
    }

    @Override // p000.pv6
    public void writePayload(InputStream inputStream) {
        verifyNotClosed();
        this.f51712k++;
        int i = this.f51713l + 1;
        this.f51713l = i;
        this.f51714m = 0L;
        this.f51710i.outboundMessage(i);
        boolean z = this.f51706e && this.f51705d != b72.C1761b.f12832a;
        try {
            int knownLength = getKnownLength(inputStream);
            int iWriteUncompressed = (knownLength == 0 || !z) ? writeUncompressed(inputStream, knownLength) : writeCompressed(inputStream, knownLength);
            if (knownLength != -1 && iWriteUncompressed != knownLength) {
                throw n4g.f63272s.withDescription(String.format("Message length inaccurate %s != %s", Integer.valueOf(iWriteUncompressed), Integer.valueOf(knownLength))).asRuntimeException();
            }
            long j = iWriteUncompressed;
            this.f51710i.outboundUncompressedSize(j);
            this.f51710i.outboundWireSize(this.f51714m);
            this.f51710i.outboundMessageSent(this.f51713l, this.f51714m, j);
        } catch (IOException e) {
            throw n4g.f63272s.withDescription("Failed to frame message").withCause(e).asRuntimeException();
        } catch (v4g e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw n4g.f63272s.withDescription("Failed to frame message").withCause(e3).asRuntimeException();
        }
    }

    /* JADX INFO: renamed from: jsa$c */
    public class C8055c extends OutputStream {
        private C8055c() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            write(new byte[]{(byte) i}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            jsa.this.writeRaw(bArr, i, i2);
        }
    }

    @Override // p000.pv6
    public jsa setCompressor(go2 go2Var) {
        this.f51705d = (go2) v7d.checkNotNull(go2Var, "Can't pass an empty compressor");
        return this;
    }

    @Override // p000.pv6
    public jsa setMessageCompression(boolean z) {
        this.f51706e = z;
        return this;
    }

    /* JADX INFO: renamed from: jsa$b */
    public final class C8054b extends OutputStream {

        /* JADX INFO: renamed from: a */
        public final List<tri> f51715a;

        /* JADX INFO: renamed from: b */
        public tri f51716b;

        private C8054b() {
            this.f51715a = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int readableBytes() {
            Iterator<tri> it = this.f51715a.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().readableBytes();
            }
            return i;
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            tri triVar = this.f51716b;
            if (triVar == null || triVar.writableBytes() <= 0) {
                write(new byte[]{(byte) i}, 0, 1);
            } else {
                this.f51716b.write((byte) i);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            if (this.f51716b == null) {
                tri triVarAllocate = jsa.this.f51709h.allocate(i2);
                this.f51716b = triVarAllocate;
                this.f51715a.add(triVarAllocate);
            }
            while (i2 > 0) {
                int iMin = Math.min(i2, this.f51716b.writableBytes());
                if (iMin == 0) {
                    tri triVarAllocate2 = jsa.this.f51709h.allocate(Math.max(i2, this.f51716b.readableBytes() * 2));
                    this.f51716b = triVarAllocate2;
                    this.f51715a.add(triVarAllocate2);
                } else {
                    this.f51716b.write(bArr, i, iMin);
                    i += iMin;
                    i2 -= iMin;
                }
            }
        }
    }
}
