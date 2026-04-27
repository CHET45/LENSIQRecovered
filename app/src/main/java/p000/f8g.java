package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public class f8g implements mdd {
    @Override // p000.mdd
    public Object createFromBundle(Bundle bundle) {
        return bundle.getString(cf8.f16414c);
    }

    @Override // p000.mdd
    public boolean writeToBundle(Bundle bundle, Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        bundle.putString(cf8.f16414c, (String) obj);
        return true;
    }
}
