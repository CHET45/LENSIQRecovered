package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes7.dex */
public class wm2 extends AbstractC15409y3 {

    /* JADX INFO: renamed from: a */
    public final Deque<frd> f94725a;

    /* JADX INFO: renamed from: b */
    public Deque<frd> f94726b;

    /* JADX INFO: renamed from: c */
    public int f94727c;

    /* JADX INFO: renamed from: d */
    public final Queue<frd> f94728d;

    /* JADX INFO: renamed from: e */
    public boolean f94729e;

    /* JADX INFO: renamed from: f */
    public static final InterfaceC14686f<Void> f94723f = new C14681a();

    /* JADX INFO: renamed from: m */
    public static final InterfaceC14686f<Void> f94724m = new C14682b();

    /* JADX INFO: renamed from: C */
    public static final InterfaceC14686f<byte[]> f94720C = new C14683c();

    /* JADX INFO: renamed from: F */
    public static final InterfaceC14686f<ByteBuffer> f94721F = new C14684d();

    /* JADX INFO: renamed from: H */
    public static final InterfaceC14687g<OutputStream> f94722H = new C14685e();

    /* JADX INFO: renamed from: wm2$a */
    public class C14681a implements InterfaceC14686f<Void> {
        @Override // p000.wm2.InterfaceC14686f, p000.wm2.InterfaceC14687g
        public int read(frd frdVar, int i, Void r3, int i2) {
            return frdVar.readUnsignedByte();
        }
    }

    /* JADX INFO: renamed from: wm2$b */
    public class C14682b implements InterfaceC14686f<Void> {
        @Override // p000.wm2.InterfaceC14686f, p000.wm2.InterfaceC14687g
        public int read(frd frdVar, int i, Void r3, int i2) {
            frdVar.skipBytes(i);
            return 0;
        }
    }

    /* JADX INFO: renamed from: wm2$c */
    public class C14683c implements InterfaceC14686f<byte[]> {
        @Override // p000.wm2.InterfaceC14686f, p000.wm2.InterfaceC14687g
        public int read(frd frdVar, int i, byte[] bArr, int i2) {
            frdVar.readBytes(bArr, i2, i);
            return i2 + i;
        }
    }

    /* JADX INFO: renamed from: wm2$d */
    public class C14684d implements InterfaceC14686f<ByteBuffer> {
        @Override // p000.wm2.InterfaceC14686f, p000.wm2.InterfaceC14687g
        public int read(frd frdVar, int i, ByteBuffer byteBuffer, int i2) {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i);
            frdVar.readBytes(byteBuffer);
            byteBuffer.limit(iLimit);
            return 0;
        }
    }

    /* JADX INFO: renamed from: wm2$e */
    public class C14685e implements InterfaceC14687g<OutputStream> {
        @Override // p000.wm2.InterfaceC14687g
        public int read(frd frdVar, int i, OutputStream outputStream, int i2) throws IOException {
            frdVar.readBytes(outputStream, i);
            return 0;
        }
    }

    /* JADX INFO: renamed from: wm2$f */
    public interface InterfaceC14686f<T> extends InterfaceC14687g<T> {
        @Override // p000.wm2.InterfaceC14687g
        int read(frd frdVar, int i, T t, int i2);
    }

    /* JADX INFO: renamed from: wm2$g */
    public interface InterfaceC14687g<T> {
        int read(frd frdVar, int i, T t, int i2) throws IOException;
    }

    public wm2(int i) {
        this.f94728d = new ArrayDeque(2);
        this.f94725a = new ArrayDeque(i);
    }

    private void advanceBuffer() {
        if (!this.f94729e) {
            this.f94725a.remove().close();
            return;
        }
        this.f94726b.add(this.f94725a.remove());
        frd frdVarPeek = this.f94725a.peek();
        if (frdVarPeek != null) {
            frdVarPeek.mark();
        }
    }

    private void advanceBufferIfNecessary() {
        if (this.f94725a.peek().readableBytes() == 0) {
            advanceBuffer();
        }
    }

    private void enqueueBuffer(frd frdVar) {
        if (!(frdVar instanceof wm2)) {
            this.f94725a.add(frdVar);
            this.f94727c += frdVar.readableBytes();
            return;
        }
        wm2 wm2Var = (wm2) frdVar;
        while (!wm2Var.f94725a.isEmpty()) {
            this.f94725a.add(wm2Var.f94725a.remove());
        }
        this.f94727c += wm2Var.f94727c;
        wm2Var.f94727c = 0;
        wm2Var.close();
    }

    private <T> int execute(InterfaceC14687g<T> interfaceC14687g, int i, T t, int i2) throws IOException {
        m25634a(i);
        if (!this.f94725a.isEmpty()) {
            advanceBufferIfNecessary();
        }
        while (i > 0 && !this.f94725a.isEmpty()) {
            frd frdVarPeek = this.f94725a.peek();
            int iMin = Math.min(i, frdVarPeek.readableBytes());
            i2 = interfaceC14687g.read(frdVarPeek, iMin, t, i2);
            i -= iMin;
            this.f94727c -= iMin;
            advanceBufferIfNecessary();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private <T> int executeNoThrow(InterfaceC14686f<T> interfaceC14686f, int i, T t, int i2) {
        try {
            return execute(interfaceC14686f, i, t, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public void addBuffer(frd frdVar) {
        boolean z = this.f94729e && this.f94725a.isEmpty();
        enqueueBuffer(frdVar);
        if (z) {
            this.f94725a.peek().mark();
        }
    }

    @Override // p000.AbstractC15409y3, p000.frd
    public boolean byteBufferSupported() {
        Iterator<frd> it = this.f94725a.iterator();
        while (it.hasNext()) {
            if (!it.next().byteBufferSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC15409y3, p000.frd, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f94725a.isEmpty()) {
            this.f94725a.remove().close();
        }
        if (this.f94726b != null) {
            while (!this.f94726b.isEmpty()) {
                this.f94726b.remove().close();
            }
        }
    }

    @Override // p000.AbstractC15409y3, p000.frd
    @eib
    public ByteBuffer getByteBuffer() {
        if (this.f94725a.isEmpty()) {
            return null;
        }
        return this.f94725a.peek().getByteBuffer();
    }

    @Override // p000.AbstractC15409y3, p000.frd
    public void mark() {
        if (this.f94726b == null) {
            this.f94726b = new ArrayDeque(Math.min(this.f94725a.size(), 16));
        }
        while (!this.f94726b.isEmpty()) {
            this.f94726b.remove().close();
        }
        this.f94729e = true;
        frd frdVarPeek = this.f94725a.peek();
        if (frdVarPeek != null) {
            frdVarPeek.mark();
        }
    }

    @Override // p000.AbstractC15409y3, p000.frd
    public boolean markSupported() {
        Iterator<frd> it = this.f94725a.iterator();
        while (it.hasNext()) {
            if (!it.next().markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.frd
    public void readBytes(byte[] bArr, int i, int i2) {
        executeNoThrow(f94720C, i2, bArr, i);
    }

    @Override // p000.frd
    public int readUnsignedByte() {
        return executeNoThrow(f94723f, 1, null, 0);
    }

    @Override // p000.frd
    public int readableBytes() {
        return this.f94727c;
    }

    @Override // p000.AbstractC15409y3, p000.frd
    public void reset() {
        if (!this.f94729e) {
            throw new InvalidMarkException();
        }
        frd frdVarPeek = this.f94725a.peek();
        if (frdVarPeek != null) {
            int i = frdVarPeek.readableBytes();
            frdVarPeek.reset();
            this.f94727c += frdVarPeek.readableBytes() - i;
        }
        while (true) {
            frd frdVarPollLast = this.f94726b.pollLast();
            if (frdVarPollLast == null) {
                return;
            }
            frdVarPollLast.reset();
            this.f94725a.addFirst(frdVarPollLast);
            this.f94727c += frdVarPollLast.readableBytes();
        }
    }

    @Override // p000.frd
    public void skipBytes(int i) {
        executeNoThrow(f94724m, i, null, 0);
    }

    @Override // p000.frd
    public void readBytes(ByteBuffer byteBuffer) {
        executeNoThrow(f94721F, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // p000.frd
    public void readBytes(OutputStream outputStream, int i) throws IOException {
        execute(f94722H, i, outputStream, 0);
    }

    public wm2() {
        this.f94728d = new ArrayDeque(2);
        this.f94725a = new ArrayDeque();
    }

    public void readBytes(wm2 wm2Var, int i) {
        m25634a(i);
        this.f94727c -= i;
        while (i > 0) {
            frd frdVarPeek = this.f94728d.peek();
            if (frdVarPeek.readableBytes() > i) {
                wm2Var.addBuffer(frdVarPeek.readBytes(i));
                i = 0;
            } else {
                wm2Var.addBuffer(this.f94728d.poll());
                i -= frdVarPeek.readableBytes();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [frd] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [frd] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [wm2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [wm2] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // p000.frd
    public frd readBytes(int i) {
        frd frdVarPoll;
        int i2;
        frd bytes;
        ?? r1;
        ?? r0;
        if (i <= 0) {
            return grd.empty();
        }
        m25634a(i);
        this.f94727c -= i;
        ?? r02 = 0;
        ?? wm2Var = 0;
        while (true) {
            frd frdVarPeek = this.f94725a.peek();
            int i3 = frdVarPeek.readableBytes();
            if (i3 > i) {
                bytes = frdVarPeek.readBytes(i);
                i2 = 0;
            } else {
                if (this.f94729e) {
                    frdVarPoll = frdVarPeek.readBytes(i3);
                    advanceBuffer();
                } else {
                    frdVarPoll = this.f94725a.poll();
                }
                frd frdVar = frdVarPoll;
                i2 = i - i3;
                bytes = frdVar;
            }
            if (r02 == 0) {
                r0 = bytes;
                r1 = wm2Var;
            } else {
                if (wm2Var == 0) {
                    wm2Var = new wm2(i2 != 0 ? Math.min(this.f94725a.size() + 2, 16) : 2);
                    wm2Var.addBuffer(r02);
                    r02 = wm2Var;
                }
                wm2Var.addBuffer(bytes);
                r0 = r02;
                r1 = wm2Var;
            }
            if (i2 <= 0) {
                return r0;
            }
            i = i2;
            r02 = r0;
            wm2Var = r1;
        }
    }
}
