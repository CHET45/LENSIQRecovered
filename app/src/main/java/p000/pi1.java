package p000;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@e5e(extension = 31, version = 7)
public final class pi1 extends UploadDataProvider {

    /* JADX INFO: renamed from: a */
    public final byte[] f70924a;

    /* JADX INFO: renamed from: b */
    public int f70925b;

    public pi1(byte[] bArr) {
        this.f70924a = bArr;
    }

    public long getLength() {
        return this.f70924a.length;
    }

    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        int iMin = Math.min(byteBuffer.remaining(), this.f70924a.length - this.f70925b);
        byteBuffer.put(this.f70924a, this.f70925b, iMin);
        this.f70925b += iMin;
        uploadDataSink.onReadSucceeded(false);
    }

    public void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.f70925b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
