package p000;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class aif implements jre {

    /* JADX INFO: renamed from: a */
    public PointF f1674a;

    /* JADX INFO: renamed from: b */
    public jre f1675b;

    /* JADX INFO: renamed from: c */
    public boolean f1676c = true;

    @Override // p000.jre
    public boolean canLoadMore(View view) {
        jre jreVar = this.f1675b;
        return jreVar != null ? jreVar.canLoadMore(view) : yrf.canLoadMore(view, this.f1674a, this.f1676c);
    }

    @Override // p000.jre
    public boolean canRefresh(View view) {
        jre jreVar = this.f1675b;
        return jreVar != null ? jreVar.canRefresh(view) : yrf.canRefresh(view, this.f1674a);
    }
}
