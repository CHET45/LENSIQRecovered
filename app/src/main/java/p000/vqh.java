package p000;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes7.dex */
public class vqh extends Socket {

    /* JADX INFO: renamed from: b */
    public final LocalSocketAddress f92012b;

    /* JADX INFO: renamed from: c */
    @uc7("this")
    public boolean f92013c = false;

    /* JADX INFO: renamed from: d */
    @uc7("this")
    public boolean f92014d = false;

    /* JADX INFO: renamed from: e */
    @uc7("this")
    public boolean f92015e = false;

    /* JADX INFO: renamed from: a */
    public final LocalSocket f92011a = new LocalSocket();

    /* JADX INFO: renamed from: vqh$a */
    public class C14215a extends FilterInputStream {
        public C14215a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            vqh.this.close();
        }
    }

    /* JADX INFO: renamed from: vqh$b */
    public class C14216b extends SocketAddress {
        public C14216b() {
        }
    }

    /* JADX INFO: renamed from: vqh$c */
    public class C14217c extends FilterOutputStream {
        public C14217c(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            vqh.this.close();
        }
    }

    /* JADX INFO: renamed from: vqh$d */
    public class C14218d extends SocketAddress {
        public C14218d() {
        }
    }

    public vqh(LocalSocketAddress localSocketAddress) {
        this.f92012b = localSocketAddress;
    }

    private static SocketException toSocketException(Throwable th) {
        SocketException socketException = new SocketException();
        socketException.initCause(th);
        return socketException;
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) {
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f92013c) {
                return;
            }
            if (!this.f92014d) {
                shutdownInput();
            }
            if (!this.f92015e) {
                shutdownOutput();
            }
            this.f92011a.close();
            this.f92013c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) throws IOException {
        this.f92011a.connect(this.f92012b);
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        throw new UnsupportedOperationException("getChannel() not supported");
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        throw new UnsupportedOperationException("getInetAddress() not supported");
    }

    @Override // java.net.Socket
    public InputStream getInputStream() throws IOException {
        return new C14215a(this.f92011a.getInputStream());
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() {
        throw new UnsupportedOperationException("Unsupported operation getKeepAlive()");
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        throw new UnsupportedOperationException("Unsupported operation getLocalAddress()");
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        throw new UnsupportedOperationException("Unsupported operation getLocalPort()");
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return new C14216b();
    }

    @Override // java.net.Socket
    public boolean getOOBInline() {
        throw new UnsupportedOperationException("Unsupported operation getOOBInline()");
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() throws IOException {
        return new C14217c(this.f92011a.getOutputStream());
    }

    @Override // java.net.Socket
    public int getPort() {
        throw new UnsupportedOperationException("Unsupported operation getPort()");
    }

    @Override // java.net.Socket
    public int getReceiveBufferSize() throws SocketException {
        try {
            return this.f92011a.getReceiveBufferSize();
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return new C14218d();
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() {
        throw new UnsupportedOperationException("Unsupported operation getReuseAddress()");
    }

    @Override // java.net.Socket
    public int getSendBufferSize() throws SocketException {
        try {
            return this.f92011a.getSendBufferSize();
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public int getSoLinger() {
        return -1;
    }

    @Override // java.net.Socket
    public int getSoTimeout() throws SocketException {
        try {
            return this.f92011a.getSoTimeout();
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return true;
    }

    @Override // java.net.Socket
    public int getTrafficClass() {
        throw new UnsupportedOperationException("Unsupported operation getTrafficClass()");
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.f92011a.isBound();
    }

    @Override // java.net.Socket
    public synchronized boolean isClosed() {
        return this.f92013c;
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.f92011a.isConnected();
    }

    @Override // java.net.Socket
    public synchronized boolean isInputShutdown() {
        return this.f92014d;
    }

    @Override // java.net.Socket
    public synchronized boolean isOutputShutdown() {
        return this.f92015e;
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i) {
        throw new UnsupportedOperationException("Unsupported operation sendUrgentData()");
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z) {
        throw new UnsupportedOperationException("Unsupported operation setKeepAlive()");
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z) {
        throw new UnsupportedOperationException("Unsupported operation setOOBInline()");
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i, int i2, int i3) {
        throw new UnsupportedOperationException("Unsupported operation setPerformancePreferences()");
    }

    @Override // java.net.Socket
    public void setReceiveBufferSize(int i) throws SocketException {
        try {
            this.f92011a.setReceiveBufferSize(i);
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z) {
        throw new UnsupportedOperationException("Unsupported operation setReuseAddress()");
    }

    @Override // java.net.Socket
    public void setSendBufferSize(int i) throws SocketException {
        try {
            this.f92011a.setSendBufferSize(i);
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z, int i) {
        throw new UnsupportedOperationException("Unsupported operation setSoLinger()");
    }

    @Override // java.net.Socket
    public void setSoTimeout(int i) throws SocketException {
        try {
            this.f92011a.setSoTimeout(i);
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) {
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i) {
        throw new UnsupportedOperationException("Unsupported operation setTrafficClass()");
    }

    @Override // java.net.Socket
    public synchronized void shutdownInput() throws IOException {
        this.f92011a.shutdownInput();
        this.f92014d = true;
    }

    @Override // java.net.Socket
    public synchronized void shutdownOutput() throws IOException {
        this.f92011a.shutdownOutput();
        this.f92015e = true;
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) throws IOException {
        this.f92011a.connect(this.f92012b, i);
    }
}
