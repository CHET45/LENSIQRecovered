package p000;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p024firebaseauthapi.zzaao;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class t6j {

    /* JADX INFO: renamed from: a */
    public static final Logger f83905a = new Logger("GetTokenResultFactory", new String[0]);

    public static f57 zza(String str) {
        Map map;
        try {
            map = s6j.zza(str);
        } catch (zzaao e) {
            f83905a.m5795e("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        return new f57(str, map);
    }
}
