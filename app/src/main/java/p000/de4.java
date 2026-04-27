package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.os.DeadObjectException;
import p000.a32;
import p000.p7e;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
public class de4 extends xnd<Void> {

    /* JADX INFO: renamed from: a */
    public final gfe f29475a;

    /* JADX INFO: renamed from: b */
    public final c91 f29476b;

    /* JADX INFO: renamed from: c */
    public final String f29477c;

    /* JADX INFO: renamed from: d */
    public final BluetoothManager f29478d;

    /* JADX INFO: renamed from: e */
    public final woe f29479e;

    /* JADX INFO: renamed from: f */
    public final y1h f29480f;

    /* JADX INFO: renamed from: m */
    public final os2 f29481m;

    /* JADX INFO: renamed from: de4$a */
    public class C4765a implements hnf<BluetoothGatt> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ lob f29482a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ynd f29483b;

        public C4765a(lob lobVar, ynd yndVar) {
            this.f29482a = lobVar;
            this.f29483b = yndVar;
        }

        @Override // p000.hnf
        public void onError(Throwable th) {
            kfe.m14731w(th, "Disconnect operation has been executed but finished with an error - considering disconnected.", new Object[0]);
            de4.this.m9104c(this.f29482a, this.f29483b);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 lf4Var) {
        }

        @Override // p000.hnf
        public void onSuccess(BluetoothGatt bluetoothGatt) {
            bluetoothGatt.close();
            de4.this.m9104c(this.f29482a, this.f29483b);
        }
    }

    /* JADX INFO: renamed from: de4$b */
    public static class C4766b extends kjf<BluetoothGatt> {

        /* JADX INFO: renamed from: a */
        public final BluetoothGatt f29485a;

        /* JADX INFO: renamed from: b */
        public final gfe f29486b;

        /* JADX INFO: renamed from: c */
        public final woe f29487c;

        /* JADX INFO: renamed from: de4$b$a */
        public class a implements sy6<uee.EnumC13520d, BluetoothGatt> {
            public a() {
            }

            @Override // p000.sy6
            public BluetoothGatt apply(uee.EnumC13520d enumC13520d) {
                return C4766b.this.f29485a;
            }
        }

        /* JADX INFO: renamed from: de4$b$b */
        public class b implements n8d<uee.EnumC13520d> {
            public b() {
            }

            @Override // p000.n8d
            public boolean test(uee.EnumC13520d enumC13520d) {
                return enumC13520d == uee.EnumC13520d.DISCONNECTED;
            }
        }

        /* JADX INFO: renamed from: de4$b$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4766b.this.f29485a.disconnect();
            }
        }

        public C4766b(BluetoothGatt bluetoothGatt, gfe gfeVar, woe woeVar) {
            this.f29485a = bluetoothGatt;
            this.f29486b = gfeVar;
            this.f29487c = woeVar;
        }

        @Override // p000.kjf
        public void subscribeActual(hnf<? super BluetoothGatt> hnfVar) {
            this.f29486b.getOnConnectionStateChange().filter(new b()).firstOrError().map(new a()).subscribe(hnfVar);
            this.f29487c.createWorker().schedule(new c());
        }
    }

    @b28
    public de4(gfe gfeVar, c91 c91Var, @w8b(x84.f97163a) String str, BluetoothManager bluetoothManager, @w8b(a32.C0034g.f249c) woe woeVar, @w8b(x84.f97165c) y1h y1hVar, os2 os2Var) {
        this.f29475a = gfeVar;
        this.f29476b = c91Var;
        this.f29477c = str;
        this.f29478d = bluetoothManager;
        this.f29479e = woeVar;
        this.f29480f = y1hVar;
        this.f29481m = os2Var;
    }

    private kjf<BluetoothGatt> disconnect(BluetoothGatt bluetoothGatt) {
        C4766b c4766b = new C4766b(bluetoothGatt, this.f29475a, this.f29479e);
        y1h y1hVar = this.f29480f;
        return c4766b.timeout(y1hVar.f100095a, y1hVar.f100096b, y1hVar.f100097c, kjf.just(bluetoothGatt));
    }

    private kjf<BluetoothGatt> disconnectIfRequired(BluetoothGatt bluetoothGatt) {
        return isDisconnected(bluetoothGatt) ? kjf.just(bluetoothGatt) : disconnect(bluetoothGatt);
    }

    private boolean isDisconnected(BluetoothGatt bluetoothGatt) {
        return this.f29478d.getConnectionState(bluetoothGatt.getDevice(), 7) == 0;
    }

    @Override // p000.xnd
    /* JADX INFO: renamed from: a */
    public void mo3260a(lob<Void> lobVar, ynd yndVar) {
        this.f29481m.onConnectionStateChange(uee.EnumC13520d.DISCONNECTING);
        BluetoothGatt bluetoothGatt = this.f29476b.getBluetoothGatt();
        if (bluetoothGatt != null) {
            disconnectIfRequired(bluetoothGatt).observeOn(this.f29479e).subscribe(new C4765a(lobVar, yndVar));
        } else {
            kfe.m14730w("Disconnect operation has been executed but GATT instance was null - considering disconnected.", new Object[0]);
            m9104c(lobVar, yndVar);
        }
    }

    @Override // p000.xnd
    /* JADX INFO: renamed from: b */
    public c51 mo3261b(DeadObjectException deadObjectException) {
        return new b51(deadObjectException, this.f29477c, -1);
    }

    @p7e({p7e.EnumC10826a.f69939f})
    /* JADX INFO: renamed from: c */
    public void m9104c(qy4<Void> qy4Var, ynd yndVar) {
        this.f29481m.onConnectionStateChange(uee.EnumC13520d.DISCONNECTED);
        yndVar.release();
        qy4Var.onComplete();
    }

    public String toString() {
        return "DisconnectOperation{" + pj9.commonMacMessage(this.f29477c) + '}';
    }
}
