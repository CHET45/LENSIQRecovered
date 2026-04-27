package p000;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes3.dex */
@c5e(18)
public class qli implements rli {

    /* JADX INFO: renamed from: a */
    public final WindowId f74890a;

    public qli(@efb View view) {
        this.f74890a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof qli) && ((qli) obj).f74890a.equals(this.f74890a);
    }

    public int hashCode() {
        return this.f74890a.hashCode();
    }
}
