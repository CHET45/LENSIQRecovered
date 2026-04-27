package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class lo7 {
    public eo7 buildHttpGetRequest(String str) {
        return buildHttpGetRequest(str, Collections.emptyMap());
    }

    public eo7 buildHttpGetRequest(String str, Map<String, String> map) {
        return new eo7(str, map);
    }
}
