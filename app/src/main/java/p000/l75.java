package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class l75 extends InputStream {

    /* JADX INFO: renamed from: c */
    @xc7("POOL")
    public static final Queue<l75> f56624c = v0i.createQueue(0);

    /* JADX INFO: renamed from: a */
    public InputStream f56625a;

    /* JADX INFO: renamed from: b */
    public IOException f56626b;

    /* JADX INFO: renamed from: a */
    public static void m15950a() {
        synchronized (f56624c) {
            while (true) {
                try {
                    Queue<l75> queue = f56624c;
                    if (!queue.isEmpty()) {
                        queue.remove();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @efb
    public static l75 obtain(@efb InputStream inputStream) {
        l75 l75VarPoll;
        Queue<l75> queue = f56624c;
        synchronized (queue) {
            l75VarPoll = queue.poll();
        }
        if (l75VarPoll == null) {
            l75VarPoll = new l75();
        }
        l75VarPoll.m15951b(inputStream);
        return l75VarPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f56625a.available();
    }

    /* JADX INFO: renamed from: b */
    public void m15951b(@efb InputStream inputStream) {
        this.f56625a = inputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56625a.close();
    }

    @hib
    public IOException getException() {
        return this.f56626b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f56625a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f56625a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f56625a.read();
        } catch (IOException e) {
            this.f56626b = e;
            throw e;
        }
    }

    public void release() {
        this.f56626b = null;
        this.f56625a = null;
        Queue<l75> queue = f56624c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f56625a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.f56625a.skip(j);
        } catch (IOException e) {
            this.f56626b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f56625a.read(bArr);
        } catch (IOException e) {
            this.f56626b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f56625a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f56626b = e;
            throw e;
        }
    }
}
