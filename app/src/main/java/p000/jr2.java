package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.os.DeadObjectException;
import java.util.concurrent.Callable;
import p000.rr2;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
public class jr2 extends xnd<BluetoothGatt> {

    /* JADX INFO: renamed from: a */
    public final BluetoothDevice f51544a;

    /* JADX INFO: renamed from: b */
    public final w41 f51545b;

    /* JADX INFO: renamed from: c */
    public final gfe f51546c;

    /* JADX INFO: renamed from: d */
    public final c91 f51547d;

    /* JADX INFO: renamed from: e */
    public final y1h f51548e;

    /* JADX INFO: renamed from: f */
    public final boolean f51549f;

    /* JADX INFO: renamed from: m */
    public final os2 f51550m;

    /* JADX INFO: renamed from: jr2$a */
    public class C8034a implements InterfaceC7776j8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ynd f51551a;

        public C8034a(ynd yndVar) {
            this.f51551a = yndVar;
        }

        @Override // p000.InterfaceC7776j8
        public void run() {
            this.f51551a.release();
        }
    }

    /* JADX INFO: renamed from: jr2$b */
    public class C8035b implements fpf<BluetoothGatt, BluetoothGatt> {
        public C8035b() {
        }

        @Override // p000.fpf
        /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
        public oof<BluetoothGatt> apply2(kjf<BluetoothGatt> kjfVar) {
            jr2 jr2Var = jr2.this;
            if (jr2Var.f51549f) {
                return kjfVar;
            }
            y1h y1hVar = jr2Var.f51548e;
            return kjfVar.timeout(y1hVar.f100095a, y1hVar.f100096b, y1hVar.f100097c, jr2Var.m14253d());
        }
    }

    /* JADX INFO: renamed from: jr2$c */
    public class CallableC8036c implements Callable<BluetoothGatt> {
        public CallableC8036c() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public BluetoothGatt call() {
            throw new d51(jr2.this.f51547d.getBluetoothGatt(), i51.f45759b);
        }
    }

    /* JADX INFO: renamed from: jr2$d */
    public class C8037d implements mnf<BluetoothGatt> {

        /* JADX INFO: renamed from: jr2$d$a */
        public class a implements n8d<uee.EnumC13520d> {
            public a() {
            }

            @Override // p000.n8d
            public boolean test(uee.EnumC13520d enumC13520d) {
                return enumC13520d == uee.EnumC13520d.CONNECTED;
            }
        }

        public C8037d() {
        }

        @Override // p000.mnf
        public void subscribe(ilf<BluetoothGatt> ilfVar) {
            ilfVar.setDisposable((kg4) jr2.this.m14252c().delaySubscription(jr2.this.f51546c.getOnConnectionStateChange().filter(new a())).mergeWith(jr2.this.f51546c.observeDisconnect().firstOrError()).firstOrError().subscribeWith(og4.disposableSingleObserverFromEmitter(ilfVar)));
            jr2.this.f51550m.onConnectionStateChange(uee.EnumC13520d.CONNECTING);
            jr2 jr2Var = jr2.this;
            jr2.this.f51547d.updateBluetoothGatt(jr2Var.f51545b.connectGatt(jr2Var.f51544a, jr2Var.f51549f, jr2Var.f51546c.getBluetoothGattCallback()));
        }
    }

    /* JADX INFO: renamed from: jr2$e */
    public class CallableC8038e implements Callable<BluetoothGatt> {
        public CallableC8038e() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public BluetoothGatt call() {
            jr2.this.f51550m.onConnectionStateChange(uee.EnumC13520d.CONNECTED);
            return jr2.this.f51547d.getBluetoothGatt();
        }
    }

    @b28
    public jr2(BluetoothDevice bluetoothDevice, w41 w41Var, gfe gfeVar, c91 c91Var, @w8b(x84.f97166d) y1h y1hVar, @w8b(rr2.C12212b.f79062a) boolean z, os2 os2Var) {
        this.f51544a = bluetoothDevice;
        this.f51545b = w41Var;
        this.f51546c = gfeVar;
        this.f51547d = c91Var;
        this.f51548e = y1hVar;
        this.f51549f = z;
        this.f51550m = os2Var;
    }

    @efb
    private kjf<BluetoothGatt> getConnectedBluetoothGatt() {
        return kjf.create(new C8037d());
    }

    private fpf<BluetoothGatt, BluetoothGatt> wrapWithTimeoutWhenNotAutoconnecting() {
        return new C8035b();
    }

    @Override // p000.xnd
    /* JADX INFO: renamed from: a */
    public void mo3260a(lob<BluetoothGatt> lobVar, ynd yndVar) {
        lobVar.setDisposable((kg4) getConnectedBluetoothGatt().compose(wrapWithTimeoutWhenNotAutoconnecting()).doFinally(new C8034a(yndVar)).subscribeWith(og4.disposableSingleObserverFromEmitter(lobVar)));
        if (this.f51549f) {
            yndVar.release();
        }
    }

    @Override // p000.xnd
    /* JADX INFO: renamed from: b */
    public c51 mo3261b(DeadObjectException deadObjectException) {
        return new b51(deadObjectException, this.f51544a.getAddress(), -1);
    }

    /* JADX INFO: renamed from: c */
    public kjf<BluetoothGatt> m14252c() {
        return kjf.fromCallable(new CallableC8038e());
    }

    @efb
    /* JADX INFO: renamed from: d */
    public kjf<BluetoothGatt> m14253d() {
        return kjf.fromCallable(new CallableC8036c());
    }

    public String toString() {
        return "ConnectOperation{" + pj9.commonMacMessage(this.f51544a.getAddress()) + ", autoConnect=" + this.f51549f + '}';
    }
}
