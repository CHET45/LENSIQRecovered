package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ih3 extends ah3 {

    /* JADX INFO: renamed from: ih3$a */
    public interface InterfaceC7283a {
        ih3 createDataSource();
    }

    void addTransferListener(pdh pdhVar);

    void close() throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.emptyMap();
    }

    @hib
    Uri getUri();

    long open(yh3 yh3Var) throws IOException;
}
