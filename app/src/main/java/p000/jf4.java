package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public final class jf4 {

    /* JADX INFO: renamed from: b */
    public static final String f50443b = "android.hardware.display.category.PRESENTATION";

    /* JADX INFO: renamed from: a */
    public final Context f50444a;

    private jf4(Context context) {
        this.f50444a = context;
    }

    @efb
    public static jf4 getInstance(@efb Context context) {
        return new jf4(context);
    }

    @hib
    public Display getDisplay(int i) {
        return ((DisplayManager) this.f50444a.getSystemService("display")).getDisplay(i);
    }

    @efb
    public Display[] getDisplays() {
        return ((DisplayManager) this.f50444a.getSystemService("display")).getDisplays();
    }

    @efb
    public Display[] getDisplays(@hib String str) {
        return ((DisplayManager) this.f50444a.getSystemService("display")).getDisplays();
    }
}
