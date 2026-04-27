package p000;

import android.os.IBinder;

/* JADX INFO: loaded from: classes3.dex */
public class pli implements rli {

    /* JADX INFO: renamed from: a */
    public final IBinder f71359a;

    public pli(IBinder iBinder) {
        this.f71359a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof pli) && ((pli) obj).f71359a.equals(this.f71359a);
    }

    public int hashCode() {
        return this.f71359a.hashCode();
    }
}
