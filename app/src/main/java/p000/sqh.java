package p000;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class sqh extends wq0 {

    /* JADX INFO: renamed from: o */
    public static final int f82652o = 2000;

    /* JADX INFO: renamed from: p */
    public static final int f82653p = 8000;

    /* JADX INFO: renamed from: q */
    public static final int f82654q = -1;

    /* JADX INFO: renamed from: f */
    public final int f82655f;

    /* JADX INFO: renamed from: g */
    public final byte[] f82656g;

    /* JADX INFO: renamed from: h */
    public final DatagramPacket f82657h;

    /* JADX INFO: renamed from: i */
    @hib
    public Uri f82658i;

    /* JADX INFO: renamed from: j */
    @hib
    public DatagramSocket f82659j;

    /* JADX INFO: renamed from: k */
    @hib
    public MulticastSocket f82660k;

    /* JADX INFO: renamed from: l */
    @hib
    public InetAddress f82661l;

    /* JADX INFO: renamed from: m */
    public boolean f82662m;

    /* JADX INFO: renamed from: n */
    public int f82663n;

    /* JADX INFO: renamed from: sqh$a */
    public static final class C12752a extends sh3 {
        public C12752a(Throwable th, int i) {
            super(th, i);
        }
    }

    public sqh() {
        this(2000);
    }

    @Override // p000.gh3
    public void close() {
        this.f82658i = null;
        MulticastSocket multicastSocket = this.f82660k;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) v80.checkNotNull(this.f82661l));
            } catch (IOException unused) {
            }
            this.f82660k = null;
        }
        DatagramSocket datagramSocket = this.f82659j;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f82659j = null;
        }
        this.f82661l = null;
        this.f82663n = 0;
        if (this.f82662m) {
            this.f82662m = false;
            m24715c();
        }
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.f82659j;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f82658i;
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws C12752a {
        Uri uri = xh3Var.f97800a;
        this.f82658i = uri;
        String str = (String) v80.checkNotNull(uri.getHost());
        int port = this.f82658i.getPort();
        m24716d(xh3Var);
        try {
            this.f82661l = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f82661l, port);
            if (this.f82661l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f82660k = multicastSocket;
                multicastSocket.joinGroup(this.f82661l);
                this.f82659j = this.f82660k;
            } else {
                this.f82659j = new DatagramSocket(inetSocketAddress);
            }
            this.f82659j.setSoTimeout(this.f82655f);
            this.f82662m = true;
            m24717e(xh3Var);
            return -1L;
        } catch (IOException e) {
            throw new C12752a(e, 2001);
        } catch (SecurityException e2) {
            throw new C12752a(e2, 2006);
        }
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws C12752a {
        if (i2 == 0) {
            return 0;
        }
        if (this.f82663n == 0) {
            try {
                ((DatagramSocket) v80.checkNotNull(this.f82659j)).receive(this.f82657h);
                int length = this.f82657h.getLength();
                this.f82663n = length;
                m24714b(length);
            } catch (SocketTimeoutException e) {
                throw new C12752a(e, 2002);
            } catch (IOException e2) {
                throw new C12752a(e2, 2001);
            }
        }
        int length2 = this.f82657h.getLength();
        int i3 = this.f82663n;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f82656g, length2 - i3, bArr, i, iMin);
        this.f82663n -= iMin;
        return iMin;
    }

    public sqh(int i) {
        this(i, 8000);
    }

    public sqh(int i, int i2) {
        super(true);
        this.f82655f = i2;
        byte[] bArr = new byte[i];
        this.f82656g = bArr;
        this.f82657h = new DatagramPacket(bArr, 0, i);
    }
}
