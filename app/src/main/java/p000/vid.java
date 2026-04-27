package p000;

import p000.p7e;
import p000.x5c;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class vid implements Runnable {

    /* JADX INFO: renamed from: a */
    public final zpi f91262a;

    /* JADX INFO: renamed from: b */
    public final d6c f91263b = new d6c();

    public vid(zpi workManagerImpl) {
        this.f91262a = workManagerImpl;
    }

    public x5c getOperation() {
        return this.f91263b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f91262a.getWorkDatabase().workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
            this.f91263b.setState(x5c.f96833a);
        } catch (Throwable th) {
            this.f91263b.setState(new x5c.AbstractC14928b.a(th));
        }
    }
}
