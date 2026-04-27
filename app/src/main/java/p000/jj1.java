package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class jj1 {

    /* JADX INFO: renamed from: a */
    public static final int f50690a = 1024;

    /* JADX INFO: renamed from: b */
    public static final int f50691b = 16384;

    /* JADX INFO: renamed from: c */
    public static final float f50692c = 0.5f;

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<SoftReference<byte[]>> f50693d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e */
    public static final Class<?> f50694e;

    /* JADX INFO: renamed from: f */
    public static final long f50695f;

    static {
        Class<?> clsSafeGetClass = safeGetClass("java.io.FileOutputStream");
        f50694e = clsSafeGetClass;
        f50695f = getChannelFieldOffset(clsSafeGetClass);
    }

    private jj1() {
    }

    /* JADX INFO: renamed from: a */
    public static void m14115a() {
        f50693d.set(null);
    }

    /* JADX INFO: renamed from: b */
    public static void m14116b(ByteBuffer buffer, OutputStream output) throws IOException {
        int iPosition = buffer.position();
        try {
            if (buffer.hasArray()) {
                output.write(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
            } else if (!writeToChannel(buffer, output)) {
                byte[] orCreateBuffer = getOrCreateBuffer(buffer.remaining());
                while (buffer.hasRemaining()) {
                    int iMin = Math.min(buffer.remaining(), orCreateBuffer.length);
                    buffer.get(orCreateBuffer, 0, iMin);
                    output.write(orCreateBuffer, 0, iMin);
                }
            }
            mi8.m17327e(buffer, iPosition);
        } catch (Throwable th) {
            mi8.m17327e(buffer, iPosition);
            throw th;
        }
    }

    private static byte[] getBuffer() {
        SoftReference<byte[]> softReference = f50693d.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static long getChannelFieldOffset(Class<?> clazz) {
        if (clazz == null) {
            return -1L;
        }
        try {
            if (evh.m10256J()) {
                return evh.m10260N(clazz.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static byte[] getOrCreateBuffer(int requestedSize) {
        int iMax = Math.max(requestedSize, 1024);
        byte[] buffer = getBuffer();
        if (buffer == null || needToReallocate(iMax, buffer.length)) {
            buffer = new byte[iMax];
            if (iMax <= 16384) {
                setBuffer(buffer);
            }
        }
        return buffer;
    }

    private static boolean needToReallocate(int requestedSize, int bufferLength) {
        return bufferLength < requestedSize && ((float) bufferLength) < ((float) requestedSize) * 0.5f;
    }

    private static Class<?> safeGetClass(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void setBuffer(byte[] value) {
        f50693d.set(new SoftReference<>(value));
    }

    private static boolean writeToChannel(ByteBuffer buffer, OutputStream output) throws IOException {
        WritableByteChannel writableByteChannel;
        long j = f50695f;
        if (j < 0 || !f50694e.isInstance(output)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) evh.m10252F(output, j);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(buffer);
        return true;
    }
}
