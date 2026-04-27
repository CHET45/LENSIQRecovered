package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class f4g {
    public static void initStatistics(Context context) {
        e4g e4gVar = e4g.getInstance();
        e4gVar.setStatistics(gw5.getInstance());
        e4gVar.init(context);
    }
}
