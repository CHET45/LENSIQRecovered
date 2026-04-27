package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: bn */
/* JADX INFO: loaded from: classes4.dex */
@ay1
public abstract class AbstractC1952bn {

    /* JADX INFO: renamed from: bn$a */
    public class a extends AbstractC1952bn {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ByteBuffer f14158a;

        public a(final ByteBuffer val$buffer) {
            this.f14158a = val$buffer;
        }

        @Override // p000.AbstractC1952bn
        public byte[] array() {
            return this.f14158a.array();
        }

        @Override // p000.AbstractC1952bn
        public int arrayOffset() {
            return this.f14158a.arrayOffset();
        }

        @Override // p000.AbstractC1952bn
        public boolean hasArray() {
            return this.f14158a.hasArray();
        }

        @Override // p000.AbstractC1952bn
        public boolean hasNioBuffer() {
            return true;
        }

        @Override // p000.AbstractC1952bn
        public int limit() {
            return this.f14158a.limit();
        }

        @Override // p000.AbstractC1952bn
        public ByteBuffer nioBuffer() {
            return this.f14158a;
        }

        @Override // p000.AbstractC1952bn
        public int position() {
            return this.f14158a.position();
        }

        @Override // p000.AbstractC1952bn
        public int remaining() {
            return this.f14158a.remaining();
        }

        @Override // p000.AbstractC1952bn
        public AbstractC1952bn position(int position) {
            li8.m16163e(this.f14158a, position);
            return this;
        }
    }

    /* JADX INFO: renamed from: bn$b */
    public class b extends AbstractC1952bn {

        /* JADX INFO: renamed from: a */
        public int f14159a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ byte[] f14160b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f14161c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f14162d;

        public b(final byte[] val$bytes, final int val$offset, final int val$length) {
            this.f14160b = val$bytes;
            this.f14161c = val$offset;
            this.f14162d = val$length;
        }

        @Override // p000.AbstractC1952bn
        public byte[] array() {
            return this.f14160b;
        }

        @Override // p000.AbstractC1952bn
        public int arrayOffset() {
            return this.f14161c;
        }

        @Override // p000.AbstractC1952bn
        public boolean hasArray() {
            return true;
        }

        @Override // p000.AbstractC1952bn
        public boolean hasNioBuffer() {
            return false;
        }

        @Override // p000.AbstractC1952bn
        public int limit() {
            return this.f14162d;
        }

        @Override // p000.AbstractC1952bn
        public ByteBuffer nioBuffer() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC1952bn
        public int position() {
            return this.f14159a;
        }

        @Override // p000.AbstractC1952bn
        public int remaining() {
            return this.f14162d - this.f14159a;
        }

        @Override // p000.AbstractC1952bn
        public AbstractC1952bn position(int position) {
            if (position >= 0 && position <= this.f14162d) {
                this.f14159a = position;
                return this;
            }
            throw new IllegalArgumentException("Invalid position: " + position);
        }
    }

    public static AbstractC1952bn wrap(byte[] bytes) {
        return wrapNoCheck(bytes, 0, bytes.length);
    }

    private static AbstractC1952bn wrapNoCheck(final byte[] bytes, final int offset, final int length) {
        return new b(bytes, offset, length);
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    @pp1
    public abstract AbstractC1952bn position(int position);

    public abstract int remaining();

    public static AbstractC1952bn wrap(final byte[] bytes, final int offset, final int length) {
        if (offset < 0 || length < 0 || offset + length > bytes.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bytes.length), Integer.valueOf(offset), Integer.valueOf(length)));
        }
        return wrapNoCheck(bytes, offset, length);
    }

    public static AbstractC1952bn wrap(final ByteBuffer buffer) {
        w98.m24433b(buffer, "buffer");
        return new a(buffer);
    }
}
