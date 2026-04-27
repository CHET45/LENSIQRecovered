package p000;

import p000.fee;

/* JADX INFO: loaded from: classes6.dex */
@is2
public class fe4 implements ge4, he4 {

    /* JADX INFO: renamed from: a */
    public final q01<c51> f36270a;

    /* JADX INFO: renamed from: b */
    public final vkb<c51> f36271b;

    /* JADX INFO: renamed from: c */
    public final vkb<Object> f36272c;

    /* JADX INFO: renamed from: fe4$a */
    public class C5743a implements uu2<Throwable> {
        public C5743a() {
        }

        @Override // p000.uu2
        public void accept(Throwable th) {
            kfe.m14725e(th, "Failed to monitor adapter state.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: fe4$b */
    public class C5744b implements uu2<c51> {
        public C5744b() {
        }

        @Override // p000.uu2
        public void accept(c51 c51Var) {
            kfe.m14728v("An exception received, indicating that the adapter has became unusable.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: fe4$c */
    public class C5745c implements sy6<Boolean, c51> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f36275a;

        public C5745c(String str) {
            this.f36275a = str;
        }

        @Override // p000.sy6
        public c51 apply(Boolean bool) {
            return b51.adapterDisabled(this.f36275a);
        }
    }

    /* JADX INFO: renamed from: fe4$d */
    public class C5746d implements InterfaceC7776j8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ lf4 f36277a;

        public C5746d(lf4 lf4Var) {
            this.f36277a = lf4Var;
        }

        @Override // p000.InterfaceC7776j8
        public void run() {
            this.f36277a.dispose();
        }
    }

    /* JADX INFO: renamed from: fe4$e */
    public class C5747e implements sy6<c51, wub<?>> {
        public C5747e() {
        }

        @Override // p000.sy6
        public wub<?> apply(c51 c51Var) {
            return vkb.error(c51Var);
        }
    }

    /* JADX INFO: renamed from: fe4$f */
    public class C5748f implements n8d<Boolean> {
        @Override // p000.n8d
        public boolean test(Boolean bool) {
            return !bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: fe4$g */
    public class C5749g implements sy6<fee.C5754b, Boolean> {
        @Override // p000.sy6
        public Boolean apply(fee.C5754b c5754b) {
            return Boolean.valueOf(c5754b.isUsable());
        }
    }

    @b28
    public fe4(@w8b(x84.f97163a) String str, hee heeVar, vkb<fee.C5754b> vkbVar) {
        q01<c51> q01VarCreate = q01.create();
        this.f36270a = q01VarCreate;
        vkb<c51> vkbVarAutoConnect = q01VarCreate.firstElement().toObservable().doOnTerminate(new C5746d(awaitAdapterNotUsable(heeVar, vkbVar).map(new C5745c(str)).doOnNext(new C5744b()).subscribe(q01VarCreate, new C5743a()))).replay().autoConnect(0);
        this.f36271b = vkbVarAutoConnect;
        this.f36272c = vkbVarAutoConnect.flatMap(new C5747e());
    }

    private static vkb<Boolean> awaitAdapterNotUsable(hee heeVar, vkb<fee.C5754b> vkbVar) {
        return vkbVar.map(new C5749g()).startWithItem(Boolean.valueOf(heeVar.isBluetoothEnabled())).filter(new C5748f());
    }

    @Override // p000.he4
    public <T> vkb<T> asErrorOnlyObservable() {
        return (vkb<T>) this.f36272c;
    }

    @Override // p000.he4
    public vkb<c51> asValueOnlyObservable() {
        return this.f36271b;
    }

    @Override // p000.ge4
    public void onDisconnectedException(b51 b51Var) {
        this.f36270a.accept(b51Var);
    }

    @Override // p000.ge4
    public void onGattConnectionStateException(h51 h51Var) {
        this.f36270a.accept(h51Var);
    }
}
