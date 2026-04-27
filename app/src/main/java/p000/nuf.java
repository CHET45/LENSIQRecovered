package p000;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import p000.vc9;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class nuf {

    /* JADX INFO: renamed from: a */
    public static final String f65734a = "time.android.com";

    /* JADX INFO: renamed from: b */
    public static final int f65735b = 10000;

    /* JADX INFO: renamed from: c */
    public static final int f65736c = 24;

    /* JADX INFO: renamed from: d */
    public static final int f65737d = 32;

    /* JADX INFO: renamed from: e */
    public static final int f65738e = 40;

    /* JADX INFO: renamed from: f */
    public static final int f65739f = 48;

    /* JADX INFO: renamed from: g */
    public static final int f65740g = 123;

    /* JADX INFO: renamed from: h */
    public static final int f65741h = 3;

    /* JADX INFO: renamed from: i */
    public static final int f65742i = 4;

    /* JADX INFO: renamed from: j */
    public static final int f65743j = 5;

    /* JADX INFO: renamed from: k */
    public static final int f65744k = 3;

    /* JADX INFO: renamed from: l */
    public static final int f65745l = 3;

    /* JADX INFO: renamed from: m */
    public static final int f65746m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f65747n = 15;

    /* JADX INFO: renamed from: o */
    public static final long f65748o = 2208988800L;

    /* JADX INFO: renamed from: p */
    public static final Object f65749p = new Object();

    /* JADX INFO: renamed from: q */
    public static final Object f65750q = new Object();

    /* JADX INFO: renamed from: r */
    @xc7("valueLock")
    public static boolean f65751r = false;

    /* JADX INFO: renamed from: s */
    @xc7("valueLock")
    public static long f65752s = 0;

    /* JADX INFO: renamed from: t */
    @xc7("valueLock")
    public static String f65753t = "time.android.com";

    /* JADX INFO: renamed from: nuf$b */
    public interface InterfaceC10068b {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    /* JADX INFO: renamed from: nuf$c */
    public static final class C10069c implements vc9.InterfaceC13994b<vc9.InterfaceC13997e> {

        /* JADX INFO: renamed from: a */
        @hib
        public final InterfaceC10068b f65754a;

        public C10069c(@hib InterfaceC10068b interfaceC10068b) {
            this.f65754a = interfaceC10068b;
        }

        @Override // p000.vc9.InterfaceC13994b
        public void onLoadCanceled(vc9.InterfaceC13997e interfaceC13997e, long j, long j2, boolean z) {
        }

        @Override // p000.vc9.InterfaceC13994b
        public void onLoadCompleted(vc9.InterfaceC13997e interfaceC13997e, long j, long j2) {
            if (this.f65754a != null) {
                if (nuf.isInitialized()) {
                    this.f65754a.onInitialized();
                } else {
                    this.f65754a.onInitializationFailed(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // p000.vc9.InterfaceC13994b
        public vc9.C13995c onLoadError(vc9.InterfaceC13997e interfaceC13997e, long j, long j2, IOException iOException, int i) {
            InterfaceC10068b interfaceC10068b = this.f65754a;
            if (interfaceC10068b != null) {
                interfaceC10068b.onInitializationFailed(iOException);
            }
            return vc9.f90624k;
        }
    }

    /* JADX INFO: renamed from: nuf$d */
    public static final class C10070d implements vc9.InterfaceC13997e {
        private C10070d() {
        }

        @Override // p000.vc9.InterfaceC13997e
        public void cancelLoad() {
        }

        @Override // p000.vc9.InterfaceC13997e
        public void load() throws IOException {
            synchronized (nuf.f65749p) {
                synchronized (nuf.f65750q) {
                    if (nuf.f65751r) {
                        return;
                    }
                    long jLoadNtpTimeOffsetMs = nuf.loadNtpTimeOffsetMs();
                    synchronized (nuf.f65750q) {
                        long unused = nuf.f65752s = jLoadNtpTimeOffsetMs;
                        boolean unused2 = nuf.f65751r = true;
                    }
                }
            }
        }
    }

    private nuf() {
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
        synchronized (f65750q) {
            try {
                j = f65751r ? f65752s : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public static String getNtpHost() {
        String str;
        synchronized (f65750q) {
            str = f65753t;
        }
        return str;
    }

    public static void initialize(@hib vc9 vc9Var, @hib InterfaceC10068b interfaceC10068b) {
        if (isInitialized()) {
            if (interfaceC10068b != null) {
                interfaceC10068b.onInitialized();
            }
        } else {
            if (vc9Var == null) {
                vc9Var = new vc9("SntpClient");
            }
            vc9Var.startLoading(new C10070d(), new C10069c(interfaceC10068b), 1);
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (f65750q) {
            z = f65751r;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long loadNtpTimeOffsetMs() throws IOException {
        InetAddress byName = InetAddress.getByName(getNtpHost());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            writeTimestamp(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b = bArr[0];
            int i = bArr[1] & 255;
            long timestamp = readTimestamp(bArr, 24);
            long timestamp2 = readTimestamp(bArr, 32);
            long timestamp3 = readTimestamp(bArr, 40);
            checkValidServerReply((byte) ((b >> 6) & 3), (byte) (b & 7), i, timestamp3);
            long j2 = (j + (((timestamp2 - timestamp) + (timestamp3 - j)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
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

    public static void setNtpHost(String str) {
        synchronized (f65750q) {
            try {
                if (!f65753t.equals(str)) {
                    f65753t = str;
                    f65751r = false;
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
