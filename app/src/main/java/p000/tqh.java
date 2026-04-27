package p000;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class tqh extends vq0 {

    /* JADX INFO: renamed from: o */
    public static final int f85627o = 2000;

    /* JADX INFO: renamed from: p */
    public static final int f85628p = 8000;

    /* JADX INFO: renamed from: q */
    public static final int f85629q = -1;

    /* JADX INFO: renamed from: f */
    public final int f85630f;

    /* JADX INFO: renamed from: g */
    public final byte[] f85631g;

    /* JADX INFO: renamed from: h */
    public final DatagramPacket f85632h;

    /* JADX INFO: renamed from: i */
    @hib
    public Uri f85633i;

    /* JADX INFO: renamed from: j */
    @hib
    public DatagramSocket f85634j;

    /* JADX INFO: renamed from: k */
    @hib
    public MulticastSocket f85635k;

    /* JADX INFO: renamed from: l */
    @hib
    public InetAddress f85636l;

    /* JADX INFO: renamed from: m */
    public boolean f85637m;

    /* JADX INFO: renamed from: n */
    public int f85638n;

    /* JADX INFO: renamed from: tqh$a */
    public static final class C13169a extends rh3 {
        public C13169a(Throwable th, int i) {
            super(th, i);
        }
    }

    public tqh() {
        this(2000);
    }

    @Override // p000.ih3, p000.en7
    public void close() {
        this.f85633i = null;
        MulticastSocket multicastSocket = this.f85635k;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) u80.checkNotNull(this.f85636l));
            } catch (IOException unused) {
            }
            this.f85635k = null;
        }
        DatagramSocket datagramSocket = this.f85634j;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f85634j = null;
        }
        this.f85636l = null;
        this.f85638n = 0;
        if (this.f85637m) {
            this.f85637m = false;
            m24113c();
        }
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.f85634j;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f85633i;
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws C13169a {
        Uri uri = yh3Var.f101485a;
        this.f85633i = uri;
        String str = (String) u80.checkNotNull(uri.getHost());
        int port = this.f85633i.getPort();
        m24114d(yh3Var);
        try {
            this.f85636l = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f85636l, port);
            if (this.f85636l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f85635k = multicastSocket;
                multicastSocket.joinGroup(this.f85636l);
                this.f85634j = this.f85635k;
            } else {
                this.f85634j = new DatagramSocket(inetSocketAddress);
            }
            this.f85634j.setSoTimeout(this.f85630f);
            this.f85637m = true;
            m24115e(yh3Var);
            return -1L;
        } catch (IOException e) {
            throw new C13169a(e, 2001);
        } catch (SecurityException e2) {
            throw new C13169a(e2, 2006);
        }
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws C13169a {
        if (i2 == 0) {
            return 0;
        }
        if (this.f85638n == 0) {
            try {
                ((DatagramSocket) u80.checkNotNull(this.f85634j)).receive(this.f85632h);
                int length = this.f85632h.getLength();
                this.f85638n = length;
                m24112b(length);
            } catch (SocketTimeoutException e) {
                throw new C13169a(e, 2002);
            } catch (IOException e2) {
                throw new C13169a(e2, 2001);
            }
        }
        int length2 = this.f85632h.getLength();
        int i3 = this.f85638n;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f85631g, length2 - i3, bArr, i, iMin);
        this.f85638n -= iMin;
        return iMin;
    }

    public tqh(int i) {
        this(i, 8000);
    }

    public tqh(int i, int i2) {
        super(true);
        this.f85630f = i2;
        byte[] bArr = new byte[i];
        this.f85631g = bArr;
        this.f85632h = new DatagramPacket(bArr, 0, i);
    }
}
