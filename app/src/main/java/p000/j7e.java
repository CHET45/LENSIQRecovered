package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import com.google.android.material.C3146R;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 30)
public class j7e implements ea2 {

    /* JADX INFO: renamed from: j7e$b */
    public static class C7774b {

        /* JADX INFO: renamed from: a */
        public static final j7e f49717a = new j7e();

        private C7774b() {
        }
    }

    public static ea2 getInstance() {
        return C7774b.f49717a;
    }

    @Override // p000.ea2
    public boolean applyIfPossible(Context context, Map<Integer, Integer> map) {
        if (!l7e.m15960a(context, map)) {
            return false;
        }
        fxg.m11228a(context, C3146R.style.ThemeOverlay_Material3_PersonalizedColors);
        return true;
    }

    @Override // p000.ea2
    @efb
    public Context wrapContextIfPossible(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, C3146R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return l7e.m15960a(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    private j7e() {
    }
}
