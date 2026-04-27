package p000;

import java.util.Collections;
import java.util.Map;
import p000.dz8;

/* JADX INFO: loaded from: classes3.dex */
public interface ii7 {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final ii7 f47093a = new C7300a();

    /* JADX INFO: renamed from: b */
    public static final ii7 f47094b = new dz8.C5025a().build();

    /* JADX INFO: renamed from: ii7$a */
    public class C7300a implements ii7 {
        @Override // p000.ii7
        public Map<String, String> getHeaders() {
            return Collections.emptyMap();
        }
    }

    Map<String, String> getHeaders();
}
