package p000;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class bj9 implements po9 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f13876a = new HashSet();

    @Override // p000.po9
    public void debug(String str) {
        debug(str, null);
    }

    @Override // p000.po9
    public void error(String str, Throwable th) {
        boolean z = bt8.f14721a;
    }

    @Override // p000.po9
    public void warning(String str) {
        warning(str, null);
    }

    @Override // p000.po9
    public void debug(String str, Throwable th) {
        boolean z = bt8.f14721a;
    }

    @Override // p000.po9
    public void warning(String str, Throwable th) {
        Set<String> set = f13876a;
        if (set.contains(str)) {
            return;
        }
        Log.w(bt8.f14722b, str, th);
        set.add(str);
    }
}
