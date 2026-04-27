package p000;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes3.dex */
@c5e(26)
public final class l16 implements jv6, ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@efb Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    @Override // p000.jv6
    public void registerSelf(Activity activity) {
    }
}
