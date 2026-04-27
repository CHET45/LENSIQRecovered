package p000;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public abstract class rj1 {

    /* JADX INFO: renamed from: rj1$a */
    public class C12111a extends hw1 {

        /* JADX INFO: renamed from: a */
        public final Charset f78415a;

        public C12111a(Charset charset) {
            this.f78415a = (Charset) v7d.checkNotNull(charset);
        }

        @Override // p000.hw1
        public rj1 asByteSource(Charset charset) {
            return charset.equals(this.f78415a) ? rj1.this : super.asByteSource(charset);
        }

        @Override // p000.hw1
        public Reader openStream() throws IOException {
            return new InputStreamReader(rj1.this.openStream(), this.f78415a);
        }

        @Override // p000.hw1
        public String read() throws IOException {
            return new String(rj1.this.read(), this.f78415a);
        }

        public String toString() {
            return rj1.this.toString() + ".asCharSource(" + this.f78415a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: rj1$b */
    public static class C12112b extends rj1 {

        /* JADX INFO: renamed from: a */
        public final byte[] f78417a;

        /* JADX INFO: renamed from: b */
        public final int f78418b;

        /* JADX INFO: renamed from: c */
        public final int f78419c;

        public C12112b(byte[] bytes) {
            this(bytes, 0, bytes.length);
        }

        @Override // p000.rj1
        public long copyTo(OutputStream output) throws IOException {
            output.write(this.f78417a, this.f78418b, this.f78419c);
            return this.f78419c;
        }

        @Override // p000.rj1
        public jh7 hash(lh7 hashFunction) throws IOException {
            return hashFunction.hashBytes(this.f78417a, this.f78418b, this.f78419c);
        }

        @Override // p000.rj1
        public boolean isEmpty() {
            return this.f78419c == 0;
        }

        @Override // p000.rj1
        public InputStream openBufferedStream() {
            return openStream();
        }

        @Override // p000.rj1
        public InputStream openStream() {
            return new ByteArrayInputStream(this.f78417a, this.f78418b, this.f78419c);
        }

        @Override // p000.rj1
        public byte[] read() {
            byte[] bArr = this.f78417a;
            int i = this.f78418b;
            return Arrays.copyOfRange(bArr, i, this.f78419c + i);
        }

        @Override // p000.rj1
        public long size() {
            return this.f78419c;
        }

        @Override // p000.rj1
        public z6c<Long> sizeIfKnown() {
            return z6c.m26593of(Long.valueOf(this.f78419c));
        }

        @Override // p000.rj1
        public rj1 slice(long offset, long length) {
            v7d.checkArgument(offset >= 0, "offset (%s) may not be negative", offset);
            v7d.checkArgument(length >= 0, "length (%s) may not be negative", length);
            long jMin = Math.min(offset, this.f78419c);
            return new C12112b(this.f78417a, this.f78418b + ((int) jMin), (int) Math.min(length, ((long) this.f78419c) - jMin));
        }

        public String toString() {
            return "ByteSource.wrap(" + i80.truncate(br0.base16().encode(this.f78417a, this.f78418b, this.f78419c), 30, "...") + c0b.f15434d;
        }

        public C12112b(byte[] bytes, int offset, int length) {
            this.f78417a = bytes;
            this.f78418b = offset;
            this.f78419c = length;
        }

        @Override // p000.rj1
        @jgc
        public <T> T read(oj1<T> processor) throws IOException {
            processor.processBytes(this.f78417a, this.f78418b, this.f78419c);
            return processor.getResult();
        }
    }

    /* JADX INFO: renamed from: rj1$c */
    public static final class C12113c extends rj1 {

        /* JADX INFO: renamed from: a */
        public final Iterable<? extends rj1> f78420a;

        public C12113c(Iterable<? extends rj1> sources) {
            this.f78420a = (Iterable) v7d.checkNotNull(sources);
        }

        @Override // p000.rj1
        public boolean isEmpty() throws IOException {
            Iterator<? extends rj1> it = this.f78420a.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // p000.rj1
        public InputStream openStream() throws IOException {
            return new l2b(this.f78420a.iterator());
        }

        @Override // p000.rj1
        public long size() throws IOException {
            Iterator<? extends rj1> it = this.f78420a.iterator();
            long size = 0;
            while (it.hasNext()) {
                size += it.next().size();
                if (size < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return size;
        }

        @Override // p000.rj1
        public z6c<Long> sizeIfKnown() {
            Iterable<? extends rj1> iterable = this.f78420a;
            if (!(iterable instanceof Collection)) {
                return z6c.absent();
            }
            Iterator<? extends rj1> it = iterable.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                z6c<Long> z6cVarSizeIfKnown = it.next().sizeIfKnown();
                if (!z6cVarSizeIfKnown.isPresent()) {
                    return z6c.absent();
                }
                jLongValue += z6cVarSizeIfKnown.get().longValue();
                if (jLongValue < 0) {
                    return z6c.m26593of(Long.MAX_VALUE);
                }
            }
            return z6c.m26593of(Long.valueOf(jLongValue));
        }

        public String toString() {
            return "ByteSource.concat(" + this.f78420a + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: rj1$d */
    public static final class C12114d extends C12112b {

        /* JADX INFO: renamed from: d */
        public static final C12114d f78421d = new C12114d();

        public C12114d() {
            super(new byte[0]);
        }

        @Override // p000.rj1
        public hw1 asCharSource(Charset charset) {
            v7d.checkNotNull(charset);
            return hw1.empty();
        }

        @Override // p000.rj1.C12112b, p000.rj1
        public byte[] read() {
            return this.f78417a;
        }

        @Override // p000.rj1.C12112b
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    /* JADX INFO: renamed from: rj1$e */
    public final class C12115e extends rj1 {

        /* JADX INFO: renamed from: a */
        public final long f78422a;

        /* JADX INFO: renamed from: b */
        public final long f78423b;

        public C12115e(long offset, long length) {
            v7d.checkArgument(offset >= 0, "offset (%s) may not be negative", offset);
            v7d.checkArgument(length >= 0, "length (%s) may not be negative", length);
            this.f78422a = offset;
            this.f78423b = length;
        }

        private InputStream sliceStream(InputStream in) throws IOException {
            long j = this.f78422a;
            if (j > 0) {
                try {
                    if (tj1.m22681b(in, j) < this.f78422a) {
                        in.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return tj1.limit(in, this.f78423b);
        }

        @Override // p000.rj1
        public boolean isEmpty() throws IOException {
            return this.f78423b == 0 || super.isEmpty();
        }

        @Override // p000.rj1
        public InputStream openBufferedStream() throws IOException {
            return sliceStream(rj1.this.openBufferedStream());
        }

        @Override // p000.rj1
        public InputStream openStream() throws IOException {
            return sliceStream(rj1.this.openStream());
        }

        @Override // p000.rj1
        public z6c<Long> sizeIfKnown() {
            z6c<Long> z6cVarSizeIfKnown = rj1.this.sizeIfKnown();
            if (!z6cVarSizeIfKnown.isPresent()) {
                return z6c.absent();
            }
            long jLongValue = z6cVarSizeIfKnown.get().longValue();
            return z6c.m26593of(Long.valueOf(Math.min(this.f78423b, jLongValue - Math.min(this.f78422a, jLongValue))));
        }

        @Override // p000.rj1
        public rj1 slice(long offset, long length) {
            v7d.checkArgument(offset >= 0, "offset (%s) may not be negative", offset);
            v7d.checkArgument(length >= 0, "length (%s) may not be negative", length);
            long j = this.f78423b - offset;
            return j <= 0 ? rj1.empty() : rj1.this.slice(this.f78422a + offset, Math.min(length, j));
        }

        public String toString() {
            return rj1.this.toString() + ".slice(" + this.f78422a + ", " + this.f78423b + c0b.f15434d;
        }
    }

    public static rj1 concat(Iterable<? extends rj1> sources) {
        return new C12113c(sources);
    }

    private long countBySkipping(InputStream in) throws IOException {
        long j = 0;
        while (true) {
            long jM22681b = tj1.m22681b(in, 2147483647L);
            if (jM22681b <= 0) {
                return j;
            }
            j += jM22681b;
        }
    }

    public static rj1 empty() {
        return C12114d.f78421d;
    }

    public static rj1 wrap(byte[] b) {
        return new C12112b(b);
    }

    public hw1 asCharSource(Charset charset) {
        return new C12111a(charset);
    }

    public boolean contentEquals(rj1 other) throws IOException {
        int i;
        v7d.checkNotNull(other);
        byte[] bArrM22680a = tj1.m22680a();
        byte[] bArrM22680a2 = tj1.m22680a();
        d62 d62VarCreate = d62.create();
        try {
            InputStream inputStream = (InputStream) d62VarCreate.register(openStream());
            InputStream inputStream2 = (InputStream) d62VarCreate.register(other.openStream());
            do {
                i = tj1.read(inputStream, bArrM22680a, 0, bArrM22680a.length);
                if (i == tj1.read(inputStream2, bArrM22680a2, 0, bArrM22680a2.length) && Arrays.equals(bArrM22680a, bArrM22680a2)) {
                }
                return false;
            } while (i == bArrM22680a.length);
            d62VarCreate.close();
            return true;
        } finally {
        }
    }

    @op1
    public long copyTo(OutputStream output) throws IOException {
        v7d.checkNotNull(output);
        try {
            return tj1.copy((InputStream) d62.create().register(openStream()), output);
        } finally {
        }
    }

    public jh7 hash(lh7 hashFunction) throws IOException {
        wh7 wh7VarNewHasher = hashFunction.newHasher();
        copyTo(t07.asOutputStream(wh7VarNewHasher));
        return wh7VarNewHasher.hash();
    }

    public boolean isEmpty() throws IOException {
        z6c<Long> z6cVarSizeIfKnown = sizeIfKnown();
        if (z6cVarSizeIfKnown.isPresent()) {
            return z6cVarSizeIfKnown.get().longValue() == 0;
        }
        d62 d62VarCreate = d62.create();
        try {
            return ((InputStream) d62VarCreate.register(openStream())).read() == -1;
        } catch (Throwable th) {
            try {
                throw d62VarCreate.rethrow(th);
            } finally {
                d62VarCreate.close();
            }
        }
    }

    public InputStream openBufferedStream() throws IOException {
        InputStream inputStreamOpenStream = openStream();
        return inputStreamOpenStream instanceof BufferedInputStream ? (BufferedInputStream) inputStreamOpenStream : new BufferedInputStream(inputStreamOpenStream);
    }

    public abstract InputStream openStream() throws IOException;

    public byte[] read() throws IOException {
        d62 d62VarCreate = d62.create();
        try {
            InputStream inputStream = (InputStream) d62VarCreate.register(openStream());
            z6c<Long> z6cVarSizeIfKnown = sizeIfKnown();
            return z6cVarSizeIfKnown.isPresent() ? tj1.m22682c(inputStream, z6cVarSizeIfKnown.get().longValue()) : tj1.toByteArray(inputStream);
        } catch (Throwable th) {
            try {
                throw d62VarCreate.rethrow(th);
            } finally {
                d62VarCreate.close();
            }
        }
    }

    public long size() throws IOException {
        z6c<Long> z6cVarSizeIfKnown = sizeIfKnown();
        if (z6cVarSizeIfKnown.isPresent()) {
            return z6cVarSizeIfKnown.get().longValue();
        }
        d62 d62VarCreate = d62.create();
        try {
            return countBySkipping((InputStream) d62VarCreate.register(openStream()));
        } catch (IOException unused) {
            d62VarCreate.close();
            try {
                return tj1.exhaust((InputStream) d62.create().register(openStream()));
            } finally {
            }
        } finally {
        }
    }

    public z6c<Long> sizeIfKnown() {
        return z6c.absent();
    }

    public rj1 slice(long offset, long length) {
        return new C12115e(offset, length);
    }

    public static rj1 concat(Iterator<? extends rj1> sources) {
        return concat(kx7.copyOf(sources));
    }

    public static rj1 concat(rj1... sources) {
        return concat(kx7.copyOf(sources));
    }

    @op1
    public long copyTo(qj1 sink) throws IOException {
        v7d.checkNotNull(sink);
        d62 d62VarCreate = d62.create();
        try {
            return tj1.copy((InputStream) d62VarCreate.register(openStream()), (OutputStream) d62VarCreate.register(sink.openStream()));
        } finally {
        }
    }

    @jgc
    @op1
    public <T> T read(oj1<T> oj1Var) throws IOException {
        v7d.checkNotNull(oj1Var);
        try {
            return (T) tj1.readBytes((InputStream) d62.create().register(openStream()), oj1Var);
        } finally {
        }
    }
}
