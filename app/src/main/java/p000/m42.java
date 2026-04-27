package p000;

import java.util.concurrent.TimeUnit;
import p000.a32;
import p000.fee;
import p000.jee;

/* JADX INFO: loaded from: classes6.dex */
public class m42 extends vkb<jee.EnumC7881a> {

    /* JADX INFO: renamed from: a */
    public final hee f59858a;

    /* JADX INFO: renamed from: b */
    public final vkb<fee.C5754b> f59859b;

    /* JADX INFO: renamed from: c */
    public final vkb<Boolean> f59860c;

    /* JADX INFO: renamed from: d */
    public final ah9 f59861d;

    /* JADX INFO: renamed from: e */
    public final woe f59862e;

    /* JADX INFO: renamed from: m42$a */
    public class C9132a implements sy6<Long, Boolean> {
        @Override // p000.sy6
        public Boolean apply(Long l) {
            return Boolean.valueOf(l.longValue() == 0);
        }
    }

    /* JADX INFO: renamed from: m42$b */
    public class C9133b implements n8d<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ah9 f59863a;

        public C9133b(ah9 ah9Var) {
            this.f59863a = ah9Var;
        }

        @Override // p000.n8d
        public boolean test(Long l) {
            return !this.f59863a.isLocationPermissionOk();
        }
    }

    /* JADX INFO: renamed from: m42$c */
    public class C9134c implements sy6<fee.C5754b, vkb<jee.EnumC7881a>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vkb f59864a;

        /* JADX INFO: renamed from: m42$c$a */
        public class a implements sy6<Boolean, jee.EnumC7881a> {
            public a() {
            }

            @Override // p000.sy6
            public jee.EnumC7881a apply(Boolean bool) {
                return bool.booleanValue() ? jee.EnumC7881a.READY : jee.EnumC7881a.LOCATION_SERVICES_NOT_ENABLED;
            }
        }

        public C9134c(vkb vkbVar) {
            this.f59864a = vkbVar;
        }

        @Override // p000.sy6
        public vkb<jee.EnumC7881a> apply(fee.C5754b c5754b) {
            return c5754b != fee.C5754b.f36313c ? vkb.just(jee.EnumC7881a.BLUETOOTH_NOT_ENABLED) : this.f59864a.map(new a());
        }
    }

    /* JADX INFO: renamed from: m42$d */
    public class C9135d implements sy6<Boolean, vkb<jee.EnumC7881a>> {
        public C9135d() {
        }

        @Override // p000.sy6
        public vkb<jee.EnumC7881a> apply(Boolean bool) {
            m42 m42Var = m42.this;
            vkb<jee.EnumC7881a> vkbVarDistinctUntilChanged = m42.m16609a(m42Var.f59858a, m42Var.f59859b, m42Var.f59860c).distinctUntilChanged();
            return bool.booleanValue() ? vkbVarDistinctUntilChanged.skip(1L) : vkbVarDistinctUntilChanged;
        }
    }

    @b28
    public m42(hee heeVar, vkb<fee.C5754b> vkbVar, @w8b(a32.C0032e.f244a) vkb<Boolean> vkbVar2, ah9 ah9Var, @w8b(a32.C0034g.f248b) woe woeVar) {
        this.f59858a = heeVar;
        this.f59859b = vkbVar;
        this.f59860c = vkbVar2;
        this.f59861d = ah9Var;
        this.f59862e = woeVar;
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static vkb<jee.EnumC7881a> m16609a(hee heeVar, vkb<fee.C5754b> vkbVar, vkb<Boolean> vkbVar2) {
        return vkbVar.startWithItem(heeVar.isBluetoothEnabled() ? fee.C5754b.f36313c : fee.C5754b.f36314d).switchMap(new C9134c(vkbVar2));
    }

    @efb
    private static kjf<Boolean> checkPermissionUntilGranted(ah9 ah9Var, woe woeVar) {
        return vkb.interval(0L, 1L, TimeUnit.SECONDS, woeVar).takeWhile(new C9133b(ah9Var)).count().map(new C9132a());
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super jee.EnumC7881a> pxbVar) {
        if (this.f59858a.hasBluetoothAdapter()) {
            checkPermissionUntilGranted(this.f59861d, this.f59862e).flatMapObservable(new C9135d()).subscribe(pxbVar);
        } else {
            pxbVar.onSubscribe(lf4.empty());
            pxbVar.onComplete();
        }
    }
}
