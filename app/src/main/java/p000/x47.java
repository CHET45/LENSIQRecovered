package p000;

import java.util.Map;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes7.dex */
public class x47 extends n0c {
    public x47(String str, Object obj, Map<String, String> map, Map<String, String> map2, int i) {
        super(str, obj, map, map2, i);
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: b */
    public Request mo10718b(RequestBody requestBody) {
        return this.f62901f.get().build();
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: c */
    public RequestBody mo10719c() {
        return null;
    }
}
