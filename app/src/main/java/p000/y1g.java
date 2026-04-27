package p000;

import androidx.work.WorkerParameters;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class y1g implements Runnable {

    /* JADX INFO: renamed from: a */
    public zpi f100092a;

    /* JADX INFO: renamed from: b */
    public String f100093b;

    /* JADX INFO: renamed from: c */
    public WorkerParameters.C1505a f100094c;

    public y1g(zpi workManagerImpl, String workSpecId, WorkerParameters.C1505a runtimeExtras) {
        this.f100092a = workManagerImpl;
        this.f100093b = workSpecId;
        this.f100094c = runtimeExtras;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100092a.getProcessor().startWork(this.f100093b, this.f100094c);
    }
}
