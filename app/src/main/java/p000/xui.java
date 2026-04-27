package p000;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class xui extends e4j {

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ avi f99431C;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ IBinder f99432m;

    public xui(avi aviVar, IBinder iBinder) {
        this.f99431C = aviVar;
        this.f99432m = iBinder;
    }

    @Override // p000.e4j
    /* JADX INFO: renamed from: b */
    public final void mo6636b() {
        this.f99431C.f11945a.f14980n = (IInterface) this.f99431C.f11945a.f14975i.mo6634a(this.f99432m);
        bvi.m3452r(this.f99431C.f11945a);
        this.f99431C.f11945a.f14973g = false;
        Iterator it = this.f99431C.f11945a.f14970d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f99431C.f11945a.f14970d.clear();
    }
}
