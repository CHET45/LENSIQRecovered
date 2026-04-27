package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ms5 extends do1<File> {

    /* JADX INFO: renamed from: b */
    public String f61929b;

    /* JADX INFO: renamed from: c */
    public String f61930c;

    /* JADX INFO: renamed from: ms5$a */
    public class RunnableC9494a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f61931a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f61932b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f61933c;

        public RunnableC9494a(long j, long j2, int i) {
            this.f61931a = j;
            this.f61932b = j2;
            this.f61933c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j = this.f61932b;
            ms5.this.inProgress((this.f61931a * 1.0f) / j, j, this.f61933c);
        }
    }

    public ms5(String str, String str2) {
        this.f61929b = str;
        this.f61930c = str2;
    }

    public File saveFile(Response response, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[2048];
        InputStream inputStream = null;
        try {
            InputStream inputStreamByteStream = response.body().byteStream();
            try {
                long jContentLength = response.body().contentLength();
                File file = new File(this.f61929b);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, this.f61930c);
                fileOutputStream = new FileOutputStream(file2);
                long j = 0;
                while (true) {
                    try {
                        int i2 = inputStreamByteStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        long j2 = j + ((long) i2);
                        fileOutputStream.write(bArr, 0, i2);
                        g1c.getInstance().getDelivery().execute(new RunnableC9494a(j2, jContentLength, i));
                        j = j2;
                        bArr = bArr;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamByteStream;
                        try {
                            response.body().close();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (IOException unused) {
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException unused2) {
                            throw th;
                        }
                    }
                }
                fileOutputStream.flush();
                try {
                    response.body().close();
                    inputStreamByteStream.close();
                } catch (IOException unused3) {
                }
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
                return file2;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.do1
    public File parseNetworkResponse(Response response, int i) throws Exception {
        return saveFile(response, i);
    }
}
