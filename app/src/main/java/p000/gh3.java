package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface gh3 extends bh3 {

    /* JADX INFO: renamed from: gh3$a */
    public interface InterfaceC6313a {
        @ovh
        gh3 createDataSource();
    }

    @ovh
    void addTransferListener(qdh qdhVar);

    @ovh
    void close() throws IOException;

    @ovh
    default Map<String, List<String>> getResponseHeaders() {
        return Collections.emptyMap();
    }

    @hib
    @ovh
    Uri getUri();

    @ovh
    long open(xh3 xh3Var) throws IOException;
}
