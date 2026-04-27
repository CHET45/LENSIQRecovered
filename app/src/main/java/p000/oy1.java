package p000;

import android.content.Context;
import android.os.Process;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
@l42
public class oy1 {

    /* JADX INFO: renamed from: a */
    public final Context f69196a;

    /* JADX INFO: renamed from: b */
    public final Set<String> f69197b = new HashSet();

    @b28
    public oy1(Context context) {
        this.f69196a = context;
    }

    private boolean isPermissionGranted(String str) {
        if (str == null) {
            throw new IllegalArgumentException("permission is null");
        }
        if (this.f69197b.contains(str)) {
            return true;
        }
        boolean z = this.f69196a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        if (z) {
            this.f69197b.add(str);
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m19092a(String[] strArr) {
        for (String str : strArr) {
            if (isPermissionGranted(str)) {
                return true;
            }
        }
        return false;
    }
}
