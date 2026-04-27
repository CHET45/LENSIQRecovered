package p000;

import androidx.mediarouter.app.MediaRouteChooserDialogFragment;
import androidx.mediarouter.app.MediaRouteControllerDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public class fma {

    /* JADX INFO: renamed from: a */
    public static final fma f37106a = new fma();

    @efb
    public static fma getDefault() {
        return f37106a;
    }

    @efb
    public MediaRouteChooserDialogFragment onCreateChooserDialogFragment() {
        return new MediaRouteChooserDialogFragment();
    }

    @efb
    public MediaRouteControllerDialogFragment onCreateControllerDialogFragment() {
        return new MediaRouteControllerDialogFragment();
    }
}
