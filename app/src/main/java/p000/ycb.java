package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import p000.vj1;

/* JADX INFO: loaded from: classes4.dex */
public final class ycb extends vj1.AbstractC14111i {

    /* JADX INFO: renamed from: F */
    public final ByteBuffer f101116F;

    public ycb(ByteBuffer buffer) {
        w98.m24433b(buffer, "buffer");
        this.f101116F = buffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream in) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int beginIndex, int endIndex) {
        if (beginIndex < this.f101116F.position() || endIndex > this.f101116F.limit() || beginIndex > endIndex) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(beginIndex), Integer.valueOf(endIndex)));
        }
        ByteBuffer byteBufferSlice = this.f101116F.slice();
        li8.m16163e(byteBufferSlice, beginIndex - this.f101116F.position());
        li8.m16161c(byteBufferSlice, endIndex - this.f101116F.position());
        return byteBufferSlice;
    }

    private Object writeReplace() {
        return vj1.copyFrom(this.f101116F.slice());
    }

    @Override // p000.vj1
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f101116F.asReadOnlyBuffer();
    }

    @Override // p000.vj1
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // p000.vj1
    public byte byteAt(int index) {
        try {
            return this.f101116F.get(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // p000.vj1
    public void copyTo(ByteBuffer target) {
        target.put(this.f101116F.slice());
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: d */
    public void mo9050d(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        ByteBuffer byteBufferSlice = this.f101116F.slice();
        li8.m16163e(byteBufferSlice, sourceOffset);
        byteBufferSlice.get(target, targetOffset, numberToCopy);
    }

    @Override // p000.vj1
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof vj1)) {
            return false;
        }
        vj1 vj1Var = (vj1) other;
        if (size() != vj1Var.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return other instanceof ycb ? this.f101116F.equals(((ycb) other).f101116F) : other instanceof dbe ? other.equals(this) : this.f101116F.equals(vj1Var.asReadOnlyByteBuffer());
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: h */
    public int mo9053h(int h, int offset, int length) {
        for (int i = offset; i < offset + length; i++) {
            h = (h * 31) + this.f101116F.get(i);
        }
        return h;
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: i */
    public int mo9054i(int state, int offset, int length) {
        return pzh.m19875o(state, this.f101116F, offset, length + offset);
    }

    @Override // p000.vj1
    public byte internalByteAt(int index) {
        return byteAt(index);
    }

    @Override // p000.vj1
    public boolean isValidUtf8() {
        return pzh.m19872l(this.f101116F);
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: k */
    public String mo9055k(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.f101116F.hasArray()) {
            byteArray = this.f101116F.array();
            iArrayOffset = this.f101116F.arrayOffset() + this.f101116F.position();
            length = this.f101116F.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // p000.vj1
    public f72 newCodedInput() {
        return f72.m10683c(this.f101116F, true);
    }

    @Override // p000.vj1
    public InputStream newInput() {
        return new C15618a();
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: o */
    public void mo9056o(mj1 output) throws IOException {
        output.writeLazy(this.f101116F.slice());
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: q */
    public void mo9057q(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        if (!this.f101116F.hasArray()) {
            ij1.m13131b(slice(sourceOffset, numberToWrite + sourceOffset), out);
        } else {
            out.write(this.f101116F.array(), this.f101116F.arrayOffset() + this.f101116F.position() + sourceOffset, numberToWrite);
        }
    }

    @Override // p000.vj1.AbstractC14111i
    /* JADX INFO: renamed from: s */
    public boolean mo24023s(vj1 other, int offset, int length) {
        return substring(0, length).equals(other.substring(offset, length + offset));
    }

    @Override // p000.vj1
    public int size() {
        return this.f101116F.remaining();
    }

    @Override // p000.vj1
    public vj1 substring(int beginIndex, int endIndex) {
        try {
            return new ycb(slice(beginIndex, endIndex));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // p000.vj1
    public void writeTo(OutputStream out) throws IOException {
        out.write(toByteArray());
    }

    /* JADX INFO: renamed from: ycb$a */
    public class C15618a extends InputStream {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f101117a;

        public C15618a() {
            this.f101117a = ycb.this.f101116F.slice();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f101117a.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int readlimit) {
            li8.m16162d(this.f101117a);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f101117a.hasRemaining()) {
                return this.f101117a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                li8.m16164f(this.f101117a);
            } catch (InvalidMarkException e) {
                throw new IOException(e);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bytes, int off, int len) throws IOException {
            if (!this.f101117a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(len, this.f101117a.remaining());
            this.f101117a.get(bytes, off, iMin);
            return iMin;
        }
    }
}
