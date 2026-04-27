package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class rl9 implements mdd {
    @Override // p000.mdd
    public Object createFromBundle(Bundle bundle) {
        return Long.valueOf(bundle.getLong(cf8.f16414c));
    }

    @Override // p000.mdd
    public boolean writeToBundle(Bundle bundle, Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        bundle.putLong(cf8.f16414c, ((Long) obj).longValue());
        return true;
    }
}
