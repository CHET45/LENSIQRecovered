package p000;

import android.bluetooth.BluetoothDevice;
import com.polidea.rxandroidble3.scan.ScanFilter;
import com.polidea.rxandroidble3.scan.ScanSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p000.a32;
import p000.fee;
import p000.jee;

/* JADX INFO: loaded from: classes6.dex */
public class see extends jee {

    /* JADX INFO: renamed from: r */
    @Deprecated
    public static final String f81617r = "RxBleClient";

    /* JADX INFO: renamed from: a */
    public final g42 f81618a;

    /* JADX INFO: renamed from: b */
    public final nne f81619b;

    /* JADX INFO: renamed from: c */
    public final dfe f81620c;

    /* JADX INFO: renamed from: d */
    public final une f81621d;

    /* JADX INFO: renamed from: e */
    public final ene f81622e;

    /* JADX INFO: renamed from: f */
    public final sy6<ife, pne> f81623f;

    /* JADX INFO: renamed from: g */
    public final a32.InterfaceC0030c f81624g;

    /* JADX INFO: renamed from: h */
    public final woe f81625h;

    /* JADX INFO: renamed from: i */
    public final Map<Set<UUID>, vkb<mfe>> f81626i = new HashMap();

    /* JADX INFO: renamed from: j */
    public final g91 f81627j;

    /* JADX INFO: renamed from: k */
    public final hee f81628k;

    /* JADX INFO: renamed from: l */
    public final vkb<fee.C5754b> f81629l;

    /* JADX INFO: renamed from: m */
    public final ah9 f81630m;

    /* JADX INFO: renamed from: n */
    public final gx8<m42> f81631n;

    /* JADX INFO: renamed from: o */
    public final go0 f81632o;

    /* JADX INFO: renamed from: p */
    public final qy1 f81633p;

    /* JADX INFO: renamed from: q */
    public final jy1 f81634q;

    @b28
    public see(g91 g91Var, hee heeVar, g42 g42Var, vkb<fee.C5754b> vkbVar, nne nneVar, ah9 ah9Var, gx8<m42> gx8Var, dfe dfeVar, une uneVar, ene eneVar, sy6<ife, pne> sy6Var, @w8b(a32.C0034g.f249c) woe woeVar, a32.InterfaceC0030c interfaceC0030c, go0 go0Var, qy1 qy1Var, jy1 jy1Var) {
        this.f81618a = g42Var;
        this.f81627j = g91Var;
        this.f81628k = heeVar;
        this.f81629l = vkbVar;
        this.f81619b = nneVar;
        this.f81630m = ah9Var;
        this.f81631n = gx8Var;
        this.f81620c = dfeVar;
        this.f81621d = uneVar;
        this.f81622e = eneVar;
        this.f81623f = sy6Var;
        this.f81625h = woeVar;
        this.f81624g = interfaceC0030c;
        this.f81632o = go0Var;
        this.f81633p = qy1Var;
        this.f81634q = jy1Var;
    }

    private vkb<mfe> createScanOperationApi18(@hib UUID[] uuidArr) {
        final Set<UUID> distinctSet = toDistinctSet(uuidArr);
        return this.f81618a.queue(new x39(uuidArr, this.f81628k, this.f81619b)).doFinally(new InterfaceC7776j8() { // from class: lee
            @Override // p000.InterfaceC7776j8
            public final void run() throws Throwable {
                this.f57406a.lambda$createScanOperationApi18$5(distinctSet);
            }
        }).mergeWith(m21920h()).map(new sy6() { // from class: mee
            @Override // p000.sy6
            public final Object apply(Object obj) {
                return this.f60781a.m21921i((jfe) obj);
            }
        }).doOnNext(new uu2() { // from class: nee
            @Override // p000.uu2
            public final void accept(Object obj) throws Throwable {
                see.lambda$createScanOperationApi18$6((mfe) obj);
            }
        }).share();
    }

    private void guardBluetoothAdapterAvailable() {
        if (!this.f81628k.hasBluetoothAdapter()) {
            throw new UnsupportedOperationException("RxAndroidBle library needs a BluetoothAdapter to be available in the system to work. If this is a test on an emulator then you can use 'https://github.com/Polidea/RxAndroidBle/tree/master/mockrxandroidble'");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$bluetoothAdapterOffExceptionObservable$3(fee.C5754b c5754b) throws Throwable {
        return c5754b != fee.C5754b.f36313c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z9a lambda$bluetoothAdapterOffExceptionObservable$4(fee.C5754b c5754b) throws Throwable {
        return r4a.error(new m51(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createScanOperationApi18$5(Set set) throws Throwable {
        synchronized (this.f81626i) {
            this.f81626i.remove(set);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createScanOperationApi18$6(mfe mfeVar) throws Throwable {
        kfe.m14726i("%s", mfeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scanBleDevices$0(pne pneVar) throws Throwable {
        if (kfe.getShouldLogScannedPeripherals()) {
            kfe.m14726i("%s", pneVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wub lambda$scanBleDevices$1(ScanSettings scanSettings, ScanFilter[] scanFilterArr) throws Throwable {
        this.f81622e.verify(scanSettings.shouldCheckLocationProviderState());
        tne tneVarBuild = this.f81621d.build(scanSettings, scanFilterArr);
        return this.f81618a.queue(tneVarBuild.f85403a).unsubscribeOn(this.f81625h).compose(tneVarBuild.f85404b).map(this.f81623f).doOnNext(new uu2() { // from class: qee
            @Override // p000.uu2
            public final void accept(Object obj) throws Throwable {
                see.lambda$scanBleDevices$0((pne) obj);
            }
        }).mergeWith(m21920h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wub lambda$scanBleDevices$2(UUID[] uuidArr) throws Throwable {
        this.f81622e.verify(true);
        return m21922j(uuidArr);
    }

    private Set<UUID> toDistinctSet(@hib UUID[] uuidArr) {
        if (uuidArr == null) {
            uuidArr = new UUID[0];
        }
        return new HashSet(Arrays.asList(uuidArr));
    }

    public void finalize() throws Throwable {
        this.f81624g.onFinalize();
        super.finalize();
    }

    @Override // p000.jee
    public go0 getBackgroundScanner() {
        return this.f81632o;
    }

    @Override // p000.jee
    public yee getBleDevice(@efb String str) {
        guardBluetoothAdapterAvailable();
        return this.f81620c.getBleDevice(str);
    }

    @Override // p000.jee
    public Set<yee> getBondedDevices() {
        guardBluetoothAdapterAvailable();
        HashSet hashSet = new HashSet();
        Iterator<BluetoothDevice> it = this.f81628k.getBondedDevices().iterator();
        while (it.hasNext()) {
            hashSet.add(getBleDevice(it.next().getAddress()));
        }
        return hashSet;
    }

    @Override // p000.jee
    public Set<yee> getConnectedPeripherals() {
        HashSet hashSet = new HashSet();
        Iterator<BluetoothDevice> it = this.f81627j.getConnectedPeripherals().iterator();
        while (it.hasNext()) {
            hashSet.add(getBleDevice(it.next().getAddress()));
        }
        return hashSet;
    }

    @Override // p000.jee
    public String[] getRecommendedConnectRuntimePermissions() {
        return this.f81634q.getRecommendedConnectRuntimePermissions();
    }

    @Override // p000.jee
    public String[] getRecommendedScanRuntimePermissions() {
        return this.f81633p.getRecommendedScanRuntimePermissions();
    }

    @Override // p000.jee
    public jee.EnumC7881a getState() {
        return !this.f81628k.hasBluetoothAdapter() ? jee.EnumC7881a.BLUETOOTH_NOT_AVAILABLE : !this.f81630m.isLocationPermissionOk() ? jee.EnumC7881a.LOCATION_PERMISSION_NOT_GRANTED : !this.f81628k.isBluetoothEnabled() ? jee.EnumC7881a.BLUETOOTH_NOT_ENABLED : !this.f81630m.isLocationProviderOk() ? jee.EnumC7881a.LOCATION_SERVICES_NOT_ENABLED : jee.EnumC7881a.READY;
    }

    /* JADX INFO: renamed from: h */
    public <T> vkb<T> m21920h() {
        return this.f81629l.filter(new n8d() { // from class: oee
            @Override // p000.n8d
            public final boolean test(Object obj) {
                return see.lambda$bluetoothAdapterOffExceptionObservable$3((fee.C5754b) obj);
            }
        }).firstElement().flatMap(new sy6() { // from class: pee
            @Override // p000.sy6
            public final Object apply(Object obj) {
                return see.lambda$bluetoothAdapterOffExceptionObservable$4((fee.C5754b) obj);
            }
        }).toObservable();
    }

    /* JADX INFO: renamed from: i */
    public mfe m21921i(jfe jfeVar) {
        return new mfe(getBleDevice(jfeVar.getBluetoothDevice().getAddress()), jfeVar.getRssi(), jfeVar.getScanRecord());
    }

    @Override // p000.jee
    public boolean isConnectRuntimePermissionGranted() {
        return this.f81634q.isConnectRuntimePermissionGranted();
    }

    @Override // p000.jee
    public boolean isScanRuntimePermissionGranted() {
        return this.f81633p.isScanRuntimePermissionGranted();
    }

    /* JADX INFO: renamed from: j */
    public vkb<mfe> m21922j(@hib UUID[] uuidArr) {
        vkb<mfe> vkbVarCreateScanOperationApi18;
        Set<UUID> distinctSet = toDistinctSet(uuidArr);
        synchronized (this.f81626i) {
            try {
                vkbVarCreateScanOperationApi18 = this.f81626i.get(distinctSet);
                if (vkbVarCreateScanOperationApi18 == null) {
                    vkbVarCreateScanOperationApi18 = createScanOperationApi18(uuidArr);
                    this.f81626i.put(distinctSet, vkbVarCreateScanOperationApi18);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vkbVarCreateScanOperationApi18;
    }

    @Override // p000.jee
    public vkb<jee.EnumC7881a> observeStateChanges() {
        return this.f81631n.get();
    }

    @Override // p000.jee
    public vkb<pne> scanBleDevices(final ScanSettings scanSettings, final ScanFilter... scanFilterArr) {
        return vkb.defer(new nfg() { // from class: kee
            @Override // p000.nfg
            public final Object get() {
                return this.f53807a.lambda$scanBleDevices$1(scanSettings, scanFilterArr);
            }
        });
    }

    @Override // p000.jee
    @Deprecated
    public vkb<mfe> scanBleDevices(@hib final UUID... uuidArr) {
        return vkb.defer(new nfg() { // from class: ree
            @Override // p000.nfg
            public final Object get() {
                return this.f78114a.lambda$scanBleDevices$2(uuidArr);
            }
        });
    }
}
