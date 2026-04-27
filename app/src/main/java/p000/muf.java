package p000;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import p000.uc9;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class muf {

    /* JADX INFO: renamed from: a */
    public static final String f62326a = "time.android.com";

    /* JADX INFO: renamed from: b */
    public static final int f62327b = 1000;

    /* JADX INFO: renamed from: c */
    public static final int f62328c = 10;

    /* JADX INFO: renamed from: d */
    public static final int f62329d = 24;

    /* JADX INFO: renamed from: e */
    public static final int f62330e = 32;

    /* JADX INFO: renamed from: f */
    public static final int f62331f = 40;

    /* JADX INFO: renamed from: g */
    public static final int f62332g = 48;

    /* JADX INFO: renamed from: h */
    public static final int f62333h = 123;

    /* JADX INFO: renamed from: i */
    public static final int f62334i = 3;

    /* JADX INFO: renamed from: j */
    public static final int f62335j = 4;

    /* JADX INFO: renamed from: k */
    public static final int f62336k = 5;

    /* JADX INFO: renamed from: l */
    public static final int f62337l = 3;

    /* JADX INFO: renamed from: m */
    public static final int f62338m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f62339n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f62340o = 15;

    /* JADX INFO: renamed from: p */
    public static final long f62341p = 2208988800L;

    /* JADX INFO: renamed from: q */
    public static final Object f62342q = new Object();

    /* JADX INFO: renamed from: r */
    public static final Object f62343r = new Object();

    /* JADX INFO: renamed from: s */
    @xc7("valueLock")
    public static boolean f62344s = false;

    /* JADX INFO: renamed from: t */
    @xc7("valueLock")
    public static long f62345t = 0;

    /* JADX INFO: renamed from: u */
    @xc7("valueLock")
    public static String f62346u = "time.android.com";

    /* JADX INFO: renamed from: v */
    @xc7("valueLock")
    public static int f62347v = 1000;

    /* JADX INFO: renamed from: w */
    @xc7("valueLock")
    public static long f62348w = -9223372036854775807L;

    /* JADX INFO: renamed from: x */
    @xc7("valueLock")
    public static long f62349x = -9223372036854775807L;

    /* JADX INFO: renamed from: muf$b */
    public interface InterfaceC9542b {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    /* JADX INFO: renamed from: muf$c */
    public static final class C9543c implements uc9.InterfaceC13490b<uc9.InterfaceC13493e> {

        /* JADX INFO: renamed from: a */
        @hib
        public final InterfaceC9542b f62350a;

        public C9543c(@hib InterfaceC9542b interfaceC9542b) {
            this.f62350a = interfaceC9542b;
        }

        @Override // p000.uc9.InterfaceC13490b
        public void onLoadCanceled(uc9.InterfaceC13493e interfaceC13493e, long j, long j2, boolean z) {
        }

        @Override // p000.uc9.InterfaceC13490b
        public void onLoadCompleted(uc9.InterfaceC13493e interfaceC13493e, long j, long j2) {
            if (this.f62350a != null) {
                if (muf.isInitialized()) {
                    this.f62350a.onInitialized();
                } else {
                    this.f62350a.onInitializationFailed(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // p000.uc9.InterfaceC13490b
        public uc9.C13491c onLoadError(uc9.InterfaceC13493e interfaceC13493e, long j, long j2, IOException iOException, int i) {
            InterfaceC9542b interfaceC9542b = this.f62350a;
            if (interfaceC9542b != null) {
                interfaceC9542b.onInitializationFailed(iOException);
            }
            return uc9.f87553k;
        }
    }

    /* JADX INFO: renamed from: muf$d */
    public static final class C9544d implements uc9.InterfaceC13493e {
        private C9544d() {
        }

        @Override // p000.uc9.InterfaceC13493e
        public void cancelLoad() {
        }

        @Override // p000.uc9.InterfaceC13493e
        public void load() throws IOException {
            synchronized (muf.f62342q) {
                synchronized (muf.f62343r) {
                    if (muf.f62344s) {
                        return;
                    }
                    long jLoadNtpTimeOffsetMs = muf.loadNtpTimeOffsetMs();
                    synchronized (muf.f62343r) {
                        long unused = muf.f62349x = SystemClock.elapsedRealtime();
                        long unused2 = muf.f62345t = jLoadNtpTimeOffsetMs;
                        boolean unused3 = muf.f62344s = true;
                    }
                }
            }
        }
    }

    private muf() {
    }

    private static void checkValidServerReply(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b2));
        }
        if (i != 0 && i <= 15) {
            if (j == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i);
        }
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j;
        synchronized (f62343r) {
            try {
                j = f62344s ? f62345t : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public static long getMaxElapsedTimeUntilUpdateMs() {
        long j;
        synchronized (f62343r) {
            j = f62348w;
        }
        return j;
    }

    public static String getNtpHost() {
        String str;
        synchronized (f62343r) {
            str = f62346u;
        }
        return str;
    }

    public static int getTimeoutMs() {
        int i;
        synchronized (f62343r) {
            i = f62347v;
        }
        return i;
    }

    public static void initialize(@hib uc9 uc9Var, @hib InterfaceC9542b interfaceC9542b) {
        if (isInitialized()) {
            if (interfaceC9542b != null) {
                interfaceC9542b.onInitialized();
            }
        } else {
            if (uc9Var == null) {
                uc9Var = new uc9("SntpClient");
            }
            uc9Var.startLoading(new C9544d(), new C9543c(interfaceC9542b), 1);
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (f62343r) {
            try {
                if (f62349x != -9223372036854775807L && f62348w != -9223372036854775807L) {
                    f62344s = f62344s && SystemClock.elapsedRealtime() - f62349x < f62348w;
                }
                z = f62344s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long loadNtpTimeOffsetMs() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(getTimeoutMs());
            InetAddress[] allByName = InetAddress.getAllByName(getNtpHost());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i], 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                writeTimestamp(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b = bArr[0];
                    int i3 = bArr[1] & 255;
                    long timestamp = readTimestamp(bArr, 24);
                    long timestamp2 = readTimestamp(bArr, 32);
                    long timestamp3 = readTimestamp(bArr, 40);
                    checkValidServerReply((byte) ((b >> 6) & 3), (byte) (b & 7), i3, timestamp3);
                    long j2 = (j + (((timestamp2 - timestamp) + (timestamp3 - j)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j2;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e;
                    } else {
                        socketTimeoutException.addSuppressed(e);
                    }
                    int i4 = i2 + 1;
                    if (i2 >= 10) {
                        throw ((SocketTimeoutException) v80.checkNotNull(socketTimeoutException));
                    }
                    i++;
                    i2 = i4;
                }
            }
            throw ((SocketTimeoutException) v80.checkNotNull(socketTimeoutException));
        } finally {
        }
    }

    private static long read32(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    private static long readTimestamp(byte[] bArr, int i) {
        long j = read32(bArr, i);
        long j2 = read32(bArr, i + 4);
        if (j == 0 && j2 == 0) {
            return 0L;
        }
        return ((j - 2208988800L) * 1000) + ((j2 * 1000) / 4294967296L);
    }

    public static void setMaxElapsedTimeUntilUpdateMs(long j) {
        synchronized (f62343r) {
            f62348w = j;
        }
    }

    public static void setNtpHost(String str) {
        synchronized (f62343r) {
            try {
                if (!f62346u.equals(str)) {
                    f62346u = str;
                    f62344s = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setTimeoutMs(int i) {
        synchronized (f62343r) {
            try {
                if (f62347v != i) {
                    f62347v = i;
                    f62344s = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void writeTimestamp(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        bArr[i] = (byte) (r2 >> 24);
        bArr[i + 1] = (byte) (r2 >> 16);
        bArr[i + 2] = (byte) (r2 >> 8);
        bArr[i + 3] = (byte) (j2 + 2208988800L);
        long j4 = (j3 * 4294967296L) / 1000;
        bArr[i + 4] = (byte) (j4 >> 24);
        bArr[i + 5] = (byte) (j4 >> 16);
        bArr[i + 6] = (byte) (j4 >> 8);
        bArr[i + 7] = (byte) (Math.random() * 255.0d);
    }
}
