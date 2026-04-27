package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: cn */
/* JADX INFO: loaded from: classes3.dex */
@ey1
public abstract class AbstractC2392cn {

    /* JADX INFO: renamed from: cn$a */
    public class a extends AbstractC2392cn {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ByteBuffer f16983a;

        public a(final ByteBuffer val$buffer) {
            this.f16983a = val$buffer;
        }

        @Override // p000.AbstractC2392cn
        public byte[] array() {
            return this.f16983a.array();
        }

        @Override // p000.AbstractC2392cn
        public int arrayOffset() {
            return this.f16983a.arrayOffset();
        }

        @Override // p000.AbstractC2392cn
        public boolean hasArray() {
            return this.f16983a.hasArray();
        }

        @Override // p000.AbstractC2392cn
        public boolean hasNioBuffer() {
            return true;
        }

        @Override // p000.AbstractC2392cn
        public int limit() {
            return this.f16983a.limit();
        }

        @Override // p000.AbstractC2392cn
        public ByteBuffer nioBuffer() {
            return this.f16983a;
        }

        @Override // p000.AbstractC2392cn
        public int position() {
            return this.f16983a.position();
        }

        @Override // p000.AbstractC2392cn
        public int remaining() {
            return this.f16983a.remaining();
        }

        @Override // p000.AbstractC2392cn
        public AbstractC2392cn position(int position) {
            mi8.m17327e(this.f16983a, position);
            return this;
        }
    }

    /* JADX INFO: renamed from: cn$b */
    public class b extends AbstractC2392cn {

        /* JADX INFO: renamed from: a */
        public int f16984a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ byte[] f16985b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f16986c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f16987d;

        public b(final byte[] val$bytes, final int val$offset, final int val$length) {
            this.f16985b = val$bytes;
            this.f16986c = val$offset;
            this.f16987d = val$length;
        }

        @Override // p000.AbstractC2392cn
        public byte[] array() {
            return this.f16985b;
        }

        @Override // p000.AbstractC2392cn
        public int arrayOffset() {
            return this.f16986c;
        }

        @Override // p000.AbstractC2392cn
        public boolean hasArray() {
            return true;
        }

        @Override // p000.AbstractC2392cn
        public boolean hasNioBuffer() {
            return false;
        }

        @Override // p000.AbstractC2392cn
        public int limit() {
            return this.f16987d;
        }

        @Override // p000.AbstractC2392cn
        public ByteBuffer nioBuffer() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.AbstractC2392cn
        public int position() {
            return this.f16984a;
        }

        @Override // p000.AbstractC2392cn
        public int remaining() {
            return this.f16987d - this.f16984a;
        }

        @Override // p000.AbstractC2392cn
        public AbstractC2392cn position(int position) {
            if (position >= 0 && position <= this.f16987d) {
                this.f16984a = position;
                return this;
            }
            throw new IllegalArgumentException("Invalid position: " + position);
        }
    }

    public static AbstractC2392cn wrap(byte[] bytes) {
        return wrapNoCheck(bytes, 0, bytes.length);
    }

    private static AbstractC2392cn wrapNoCheck(final byte[] bytes, final int offset, final int length) {
        return new b(bytes, offset, length);
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    @qp1
    public abstract AbstractC2392cn position(int position);

    public abstract int remaining();

    public static AbstractC2392cn wrap(final byte[] bytes, final int offset, final int length) {
        if (offset < 0 || length < 0 || offset + length > bytes.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bytes.length), Integer.valueOf(offset), Integer.valueOf(length)));
        }
        return wrapNoCheck(bytes, offset, length);
    }

    public static AbstractC2392cn wrap(final ByteBuffer buffer) {
        v98.m23882b(buffer, "buffer");
        return new a(buffer);
    }
}
