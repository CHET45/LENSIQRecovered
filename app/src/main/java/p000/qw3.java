package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class qw3 implements ho9 {

    /* JADX INFO: renamed from: a */
    @efb
    public final HttpURLConnection f75971a;

    public qw3(@efb HttpURLConnection httpURLConnection) {
        this.f75971a = httpURLConnection;
    }

    private String getErrorFromConnection(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // p000.ho9
    @efb
    public InputStream bodyByteStream() throws IOException {
        return this.f75971a.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f75971a.disconnect();
    }

    @Override // p000.ho9
    @hib
    public String contentType() {
        return this.f75971a.getContentType();
    }

    @Override // p000.ho9
    @hib
    public String error() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f75971a.getURL() + ". Failed with " + this.f75971a.getResponseCode() + "\n" + getErrorFromConnection(this.f75971a);
        } catch (IOException e) {
            dj9.warning("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // p000.ho9
    public boolean isSuccessful() {
        try {
            return this.f75971a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
