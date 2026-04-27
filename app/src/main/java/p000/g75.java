package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class g75 extends InputStream {

    /* JADX INFO: renamed from: c */
    public static final Queue<g75> f38940c = v0i.createQueue(0);

    /* JADX INFO: renamed from: a */
    public InputStream f38941a;

    /* JADX INFO: renamed from: b */
    public IOException f38942b;

    /* JADX INFO: renamed from: a */
    public static void m11419a() {
        while (true) {
            Queue<g75> queue = f38940c;
            if (queue.isEmpty()) {
                return;
            } else {
                queue.remove();
            }
        }
    }

    @efb
    public static g75 obtain(@efb InputStream inputStream) {
        g75 g75VarPoll;
        Queue<g75> queue = f38940c;
        synchronized (queue) {
            g75VarPoll = queue.poll();
        }
        if (g75VarPoll == null) {
            g75VarPoll = new g75();
        }
        g75VarPoll.m11420b(inputStream);
        return g75VarPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f38941a.available();
    }

    /* JADX INFO: renamed from: b */
    public void m11420b(@efb InputStream inputStream) {
        this.f38941a = inputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f38941a.close();
    }

    @hib
    public IOException getException() {
        return this.f38942b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f38941a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f38941a.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f38941a.read(bArr);
        } catch (IOException e) {
            this.f38942b = e;
            return -1;
        }
    }

    public void release() {
        this.f38942b = null;
        this.f38941a = null;
        Queue<g75> queue = f38940c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f38941a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f38941a.skip(j);
        } catch (IOException e) {
            this.f38942b = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f38941a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f38942b = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f38941a.read();
        } catch (IOException e) {
            this.f38942b = e;
            return -1;
        }
    }
}
