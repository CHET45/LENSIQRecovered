package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public abstract class le7 {
    @lg5("https://github.com/grpc/grpc-java/issues/2222")
    public List<p3f> getServices() {
        return Collections.emptyList();
    }

    @eib
    public final m3f<?, ?> lookupMethod(String str) {
        return lookupMethod(str, null);
    }

    @eib
    public abstract m3f<?, ?> lookupMethod(String str, @eib String str2);
}
