package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ej1 {

    /* JADX INFO: renamed from: a */
    public static final int f33167a = 16384;

    /* JADX INFO: renamed from: b */
    public static final AtomicReference<byte[]> f33168b = new AtomicReference<>();

    /* JADX INFO: renamed from: ej1$b */
    public static final class C5338b {

        /* JADX INFO: renamed from: a */
        public final int f33172a;

        /* JADX INFO: renamed from: b */
        public final int f33173b;

        /* JADX INFO: renamed from: c */
        public final byte[] f33174c;

        public C5338b(@efb byte[] bArr, int i, int i2) {
            this.f33174c = bArr;
            this.f33172a = i;
            this.f33173b = i2;
        }
    }

    private ej1() {
    }

    @efb
    public static ByteBuffer fromFile(@efb File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    @efb
    public static ByteBuffer fromStream(@efb InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f33168b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(andSet);
            if (i < 0) {
                f33168b.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return rewind(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i);
        }
    }

    @hib
    private static C5338b getSafeArray(@efb ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new C5338b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static ByteBuffer rewind(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    @efb
    public static byte[] toBytes(@efb ByteBuffer byteBuffer) {
        C5338b safeArray = getSafeArray(byteBuffer);
        if (safeArray != null && safeArray.f33172a == 0 && safeArray.f33173b == safeArray.f33174c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        rewind(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void toFile(@efb ByteBuffer byteBuffer, @efb File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        rewind(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            channel = randomAccessFile.getChannel();
            channel.write(byteBuffer);
            channel.force(false);
            channel.close();
            randomAccessFile.close();
            try {
                channel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile == null) {
                throw th;
            }
            try {
                randomAccessFile.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }

    public static void toStream(@efb ByteBuffer byteBuffer, @efb OutputStream outputStream) throws IOException {
        C5338b safeArray = getSafeArray(byteBuffer);
        if (safeArray != null) {
            byte[] bArr = safeArray.f33174c;
            int i = safeArray.f33172a;
            outputStream.write(bArr, i, safeArray.f33173b + i);
            return;
        }
        byte[] andSet = f33168b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int iMin = Math.min(byteBuffer.remaining(), andSet.length);
            byteBuffer.get(andSet, 0, iMin);
            outputStream.write(andSet, 0, iMin);
        }
        f33168b.set(andSet);
    }

    /* JADX INFO: renamed from: ej1$a */
    public static class C5337a extends InputStream {

        /* JADX INFO: renamed from: c */
        public static final int f33169c = -1;

        /* JADX INFO: renamed from: a */
        @efb
        public final ByteBuffer f33170a;

        /* JADX INFO: renamed from: b */
        public int f33171b = -1;

        public C5337a(@efb ByteBuffer byteBuffer) {
            this.f33170a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f33170a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f33171b = this.f33170a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f33170a.hasRemaining()) {
                return this.f33170a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i = this.f33171b;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f33170a.position(i);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.f33170a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, available());
            ByteBuffer byteBuffer = this.f33170a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(@efb byte[] bArr, int i, int i2) {
            if (!this.f33170a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, available());
            this.f33170a.get(bArr, i, iMin);
            return iMin;
        }
    }

    @efb
    public static InputStream toStream(@efb ByteBuffer byteBuffer) {
        return new C5337a(byteBuffer);
    }
}
