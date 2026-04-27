package p000;

import android.bluetooth.BluetoothGatt;
import android.os.DeadObjectException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ynf<T> extends xnd<T> {

    /* JADX INFO: renamed from: a */
    public final BluetoothGatt f102355a;

    /* JADX INFO: renamed from: b */
    public final gfe f102356b;

    /* JADX INFO: renamed from: c */
    public final i51 f102357c;

    /* JADX INFO: renamed from: d */
    public final y1h f102358d;

    public ynf(BluetoothGatt bluetoothGatt, gfe gfeVar, i51 i51Var, y1h y1hVar) {
        this.f102355a = bluetoothGatt;
        this.f102356b = gfeVar;
        this.f102357c = i51Var;
        this.f102358d = y1hVar;
    }

    @Override // p000.xnd
    /* JADX INFO: renamed from: a */
    public final void mo3260a(lob<T> lobVar, ynd yndVar) {
        znd zndVar = new znd(lobVar, yndVar);
        kjf<T> kjfVarMo11830c = mo11830c(this.f102356b);
        y1h y1hVar = this.f102358d;
        long j = y1hVar.f100095a;
        TimeUnit timeUnit = y1hVar.f100096b;
        woe woeVar = y1hVar.f100097c;
        kjfVarMo11830c.timeout(j, timeUnit, woeVar, mo21015e(this.f102355a, this.f102356b, woeVar)).toObservable().subscribe(zndVar);
        if (mo11831d(this.f102355a)) {
            return;
        }
        zndVar.cancel();
        zndVar.onError(new e51(this.f102355a, this.f102357c));
    }

    @Override // p000.xnd
    /* JADX INFO: renamed from: b */
    public c51 mo3261b(DeadObjectException deadObjectException) {
        return new b51(deadObjectException, this.f102355a.getDevice().getAddress(), -1);
    }

    /* JADX INFO: renamed from: c */
    public abstract kjf<T> mo11830c(gfe gfeVar);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo11831d(BluetoothGatt bluetoothGatt);

    /* JADX INFO: renamed from: e */
    public kjf<T> mo21015e(BluetoothGatt bluetoothGatt, gfe gfeVar, woe woeVar) {
        return kjf.error(new d51(this.f102355a, this.f102357c));
    }

    public String toString() {
        return pj9.commonMacMessage(this.f102355a);
    }
}
