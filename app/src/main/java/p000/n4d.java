package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n4d {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ArrayList<m4d> f63255a = new ArrayList<>();

    public final void addListener(@yfb m4d m4dVar) {
        md8.checkNotNullParameter(m4dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f63255a.add(m4dVar);
    }

    public final void onRelease() {
        for (int lastIndex = l82.getLastIndex(this.f63255a); -1 < lastIndex; lastIndex--) {
            this.f63255a.get(lastIndex).onRelease();
        }
    }

    public final void removeListener(@yfb m4d m4dVar) {
        md8.checkNotNullParameter(m4dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f63255a.remove(m4dVar);
    }
}
