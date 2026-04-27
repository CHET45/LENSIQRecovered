package p000;

import java.io.IOException;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x7e {
    public abstract void onError(Request request, Exception exc);

    public abstract void onResponse(String str) throws IOException;
}
