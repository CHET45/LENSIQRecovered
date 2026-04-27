package com.eyevue.glassapp.view.setting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import p000.k9f;

/* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.b */
/* JADX INFO: loaded from: classes4.dex */
public class C2917b extends RequestBody {

    /* JADX INFO: renamed from: a */
    public final File f19152a;

    /* JADX INFO: renamed from: b */
    public final a f19153b;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.setting.b$a */
    public interface a {
        void onProgress(long currentBytes, long totalBytes, boolean done);
    }

    public C2917b(File file, a listener) {
        if (file != null && file.exists() && file.canRead()) {
            this.f19152a = file;
            this.f19153b = listener;
        } else {
            throw new IllegalArgumentException("Invalid file: " + file);
        }
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.f19152a.length();
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return MediaType.parse(k9f.f53383l);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink sink) throws IOException {
        long length = this.f19152a.length();
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.f19152a);
        long j = 0;
        while (true) {
            try {
                try {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        sink.flush();
                        fileInputStream.close();
                        return;
                    } else {
                        if (Thread.currentThread().isInterrupted()) {
                            throw new IOException("上传被中断");
                        }
                        long j2 = j + ((long) i);
                        sink.write(bArr, 0, i);
                        long j3 = (100 * j2) / length;
                        a aVar = this.f19153b;
                        if (aVar != null) {
                            aVar.onProgress(j2, length, j2 == length);
                        }
                        j = j2;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } finally {
                fileInputStream.close();
            }
        }
    }
}
