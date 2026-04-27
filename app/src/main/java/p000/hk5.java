package p000;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface hk5 {

    /* JADX INFO: renamed from: a */
    public static final hk5 f43884a = new hk5() { // from class: fk5
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return hk5.lambda$static$0();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[0];
    }

    yj5[] createExtractors();

    default yj5[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }
}
