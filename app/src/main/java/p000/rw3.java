package p000;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class rw3 implements ro9 {
    @Override // p000.ro9
    @efb
    public ho9 fetchSync(@efb String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new qw3(httpURLConnection);
    }
}
