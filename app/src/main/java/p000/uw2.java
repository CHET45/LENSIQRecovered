package p000;

import android.content.ContentProvider;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class uw2 {
    private uw2() {
    }

    @efb
    public static Context requireContext(@efb ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
