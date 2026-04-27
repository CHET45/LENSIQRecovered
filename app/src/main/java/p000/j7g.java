package p000;

import java.io.IOException;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j7g extends do1<String> {
    @Override // p000.do1
    public String parseNetworkResponse(Response response, int i) throws IOException {
        return response.body().string();
    }
}
