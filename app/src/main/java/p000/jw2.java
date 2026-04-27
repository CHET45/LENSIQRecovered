package p000;

import android.text.TextUtils;
import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class jw2 extends FilterInputStream {

    /* JADX INFO: renamed from: c */
    public static final String f52121c = "ContentLengthStream";

    /* JADX INFO: renamed from: d */
    public static final int f52122d = -1;

    /* JADX INFO: renamed from: a */
    public final long f52123a;

    /* JADX INFO: renamed from: b */
    public int f52124b;

    private jw2(@efb InputStream inputStream, long j) {
        super(inputStream);
        this.f52123a = j;
    }

    private int checkReadSoFarOrThrow(int i) throws IOException {
        if (i >= 0) {
            this.f52124b += i;
        } else if (this.f52123a - ((long) this.f52124b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f52123a + ", but read: " + this.f52124b);
        }
        return i;
    }

    @efb
    public static InputStream obtain(@efb InputStream inputStream, @hib String str) {
        return obtain(inputStream, parseContentLength(str));
    }

    private static int parseContentLength(@hib String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                if (Log.isLoggable(f52121c, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to parse content length header: ");
                    sb.append(str);
                }
            }
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f52123a - ((long) this.f52124b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i;
        i = super.read();
        checkReadSoFarOrThrow(i >= 0 ? 1 : -1);
        return i;
    }

    @efb
    public static InputStream obtain(@efb InputStream inputStream, long j) {
        return new jw2(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return checkReadSoFarOrThrow(super.read(bArr, i, i2));
    }
}
