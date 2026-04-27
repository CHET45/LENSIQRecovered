package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@is2
public class vgb {

    /* JADX INFO: renamed from: h */
    public static final UUID f91103h = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: a */
    public final byte[] f91104a;

    /* JADX INFO: renamed from: b */
    public final byte[] f91105b;

    /* JADX INFO: renamed from: c */
    public final byte[] f91106c;

    /* JADX INFO: renamed from: d */
    public final BluetoothGatt f91107d;

    /* JADX INFO: renamed from: e */
    public final gfe f91108e;

    /* JADX INFO: renamed from: f */
    public final r74 f91109f;

    /* JADX INFO: renamed from: g */
    public final Map<nw1, C16031z8> f91110g = new HashMap();

    /* JADX INFO: renamed from: vgb$a */
    public static /* synthetic */ class C14061a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f91111a;

        static {
            int[] iArr = new int[khb.values().length];
            f91111a = iArr;
            try {
                iArr[khb.COMPAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91111a[khb.QUICK_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91111a[khb.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @b28
    public vgb(@w8b(a32.C0028a.f238a) byte[] bArr, @w8b(a32.C0028a.f239b) byte[] bArr2, @w8b(a32.C0028a.f240c) byte[] bArr3, BluetoothGatt bluetoothGatt, gfe gfeVar, r74 r74Var) {
        this.f91104a = bArr;
        this.f91105b = bArr2;
        this.f91106c = bArr3;
        this.f91107d = bluetoothGatt;
        this.f91108e = gfeVar;
        this.f91109f = r74Var;
    }

    @efb
    /* JADX INFO: renamed from: k */
    public static vkb<byte[]> m23949k(gfe gfeVar, final nw1 nw1Var) {
        return gfeVar.getOnCharacteristicChanged().filter(new n8d() { // from class: ogb
            @Override // p000.n8d
            public final boolean test(Object obj) {
                return vgb.lambda$observeOnCharacteristicChangeCallbacks$7(nw1Var, (lw1) obj);
            }
        }).map(new sy6() { // from class: pgb
            @Override // p000.sy6
            public final Object apply(Object obj) {
                return ((lw1) obj).f58951a;
            }
        });
    }

    @efb
    /* JADX INFO: renamed from: l */
    public static xd2 m23950l(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final boolean z) {
        return xd2.fromAction(new InterfaceC7776j8() { // from class: mgb
            @Override // p000.InterfaceC7776j8
            public final void run() throws Throwable {
                vgb.lambda$setCharacteristicNotification$3(bluetoothGatt, bluetoothGattCharacteristic, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$observeOnCharacteristicChangeCallbacks$7(nw1 nw1Var, lw1 lw1Var) throws Throwable {
        return lw1Var.equals(nw1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setCharacteristicNotification$3(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) throws Throwable {
        if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z)) {
            throw new t41(bluetoothGattCharacteristic, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ vkb lambda$setupModeTransformer$4(xd2 xd2Var, vkb vkbVar) throws Throwable {
        return vkbVar.mergeWith(xd2Var.onErrorComplete());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wub lambda$setupModeTransformer$5(khb khbVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, r74 r74Var, byte[] bArr, vkb vkbVar) {
        int i = C14061a.f91111a[khbVar.ordinal()];
        if (i == 1) {
            return vkbVar;
        }
        if (i != 2) {
            return m23953p(bluetoothGattCharacteristic, r74Var, bArr).andThen(vkbVar);
        }
        final xd2 xd2VarIgnoreElements = m23953p(bluetoothGattCharacteristic, r74Var, bArr).toObservable().publish().autoConnect(2).ignoreElements();
        return vkbVar.mergeWith(xd2VarIgnoreElements).map(new sy6() { // from class: ugb
            @Override // p000.sy6
            public final Object apply(Object obj) {
                return vgb.lambda$setupModeTransformer$4(xd2VarIgnoreElements, (vkb) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ vkb lambda$setupServerInitiatedCharacteristicRead$0(wjd wjdVar, vkb vkbVar) throws Throwable {
        return vkb.amb(Arrays.asList(wjdVar.cast(byte[].class), vkbVar.takeUntil(wjdVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupServerInitiatedCharacteristicRead$1(wjd wjdVar, nw1 nw1Var, BluetoothGattCharacteristic bluetoothGattCharacteristic, khb khbVar) throws Throwable {
        wjdVar.onComplete();
        synchronized (this.f91110g) {
            this.f91110g.remove(nw1Var);
        }
        m23950l(this.f91107d, bluetoothGattCharacteristic, false).compose(m23952o(this.f91109f, bluetoothGattCharacteristic, this.f91106c, khbVar)).subscribe(r07.f76639c, r07.emptyConsumer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wub lambda$setupServerInitiatedCharacteristicRead$2(final BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, final khb khbVar) throws Throwable {
        synchronized (this.f91110g) {
            try {
                final nw1 nw1Var = new nw1(bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()));
                C16031z8 c16031z8 = this.f91110g.get(nw1Var);
                if (c16031z8 != null) {
                    if (c16031z8.f104359b == z) {
                        return c16031z8.f104358a;
                    }
                    return vkb.error(new v41(bluetoothGattCharacteristic.getUuid(), !z));
                }
                byte[] bArr = z ? this.f91105b : this.f91104a;
                final wjd wjdVarCreate = wjd.create();
                vkb vkbVarRefCount = m23950l(this.f91107d, bluetoothGattCharacteristic, true).andThen(vwb.justOnNext(m23949k(this.f91108e, nw1Var))).compose(m23951m(this.f91109f, bluetoothGattCharacteristic, bArr, khbVar)).map(new sy6() { // from class: sgb
                    @Override // p000.sy6
                    public final Object apply(Object obj) {
                        return vgb.lambda$setupServerInitiatedCharacteristicRead$0(wjdVarCreate, (vkb) obj);
                    }
                }).doFinally(new InterfaceC7776j8() { // from class: tgb
                    @Override // p000.InterfaceC7776j8
                    public final void run() throws Throwable {
                        this.f84647a.lambda$setupServerInitiatedCharacteristicRead$1(wjdVarCreate, nw1Var, bluetoothGattCharacteristic, khbVar);
                    }
                }).mergeWith(this.f91108e.observeDisconnect()).replay(1).refCount();
                this.f91110g.put(nw1Var, new C16031z8(vkbVarRefCount, z));
                return vkbVarRefCount;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ph2 lambda$teardownModeTransformer$6(khb khbVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, r74 r74Var, byte[] bArr, xd2 xd2Var) {
        return khbVar == khb.COMPAT ? xd2Var : xd2Var.andThen(m23953p(bluetoothGattCharacteristic, r74Var, bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ph2 lambda$writeClientCharacteristicConfig$9(BluetoothGattCharacteristic bluetoothGattCharacteristic, Throwable th) throws Throwable {
        return xd2.error(new t41(bluetoothGattCharacteristic, 3, th));
    }

    @efb
    /* JADX INFO: renamed from: m */
    public static pwb<vkb<byte[]>, vkb<byte[]>> m23951m(final r74 r74Var, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr, final khb khbVar) {
        return new pwb() { // from class: qgb
            @Override // p000.pwb
            /* JADX INFO: renamed from: apply */
            public final wub apply2(vkb vkbVar) {
                return vgb.lambda$setupModeTransformer$5(khbVar, bluetoothGattCharacteristic, r74Var, bArr, vkbVar);
            }
        };
    }

    @efb
    /* JADX INFO: renamed from: o */
    public static hi2 m23952o(final r74 r74Var, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr, final khb khbVar) {
        return new hi2() { // from class: ngb
            @Override // p000.hi2
            public final ph2 apply(xd2 xd2Var) {
                return vgb.lambda$teardownModeTransformer$6(khbVar, bluetoothGattCharacteristic, r74Var, bArr, xd2Var);
            }
        };
    }

    @efb
    /* JADX INFO: renamed from: p */
    public static xd2 m23953p(final BluetoothGattCharacteristic bluetoothGattCharacteristic, r74 r74Var, byte[] bArr) {
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(f91103h);
        return descriptor == null ? xd2.error(new t41(bluetoothGattCharacteristic, 2, null)) : r74Var.m21079a(descriptor, bArr).onErrorResumeNext(new sy6() { // from class: lgb
            @Override // p000.sy6
            public final Object apply(Object obj) {
                return vgb.lambda$writeClientCharacteristicConfig$9(bluetoothGattCharacteristic, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public vkb<vkb<byte[]>> m23954n(@efb final BluetoothGattCharacteristic bluetoothGattCharacteristic, final khb khbVar, final boolean z) {
        return vkb.defer(new nfg() { // from class: rgb
            @Override // p000.nfg
            public final Object get() {
                return this.f78239a.lambda$setupServerInitiatedCharacteristicRead$2(bluetoothGattCharacteristic, z, khbVar);
            }
        });
    }
}
