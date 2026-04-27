package p000;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@c5e(api = 30)
public final class l7e {
    private l7e() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15960a(Context context, Map<Integer, Integer> map) throws Throwable {
        ResourcesLoader resourcesLoaderM9000a = da2.m9000a(context, map);
        if (resourcesLoaderM9000a == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoaderM9000a);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15961b(int i) {
        return 28 <= i && i <= 31;
    }
}
