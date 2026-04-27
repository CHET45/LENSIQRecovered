package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
public final class cw4 implements hw4 {
    @Override // p000.hw4
    @ih4
    public void setUp(@yfb yig yigVar, @yfb yig yigVar2, @yfb Window window, @yfb View view, boolean z, boolean z2) {
        md8.checkNotNullParameter(yigVar, "statusBarStyle");
        md8.checkNotNullParameter(yigVar2, "navigationBarStyle");
        md8.checkNotNullParameter(window, "window");
        md8.checkNotNullParameter(view, "view");
        oli.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(yigVar.getScrim$activity_release(z));
        window.setNavigationBarColor(yigVar2.getScrim$activity_release(z2));
        xni xniVar = new xni(window, view);
        xniVar.setAppearanceLightStatusBars(!z);
        xniVar.setAppearanceLightNavigationBars(!z2);
    }
}
