package p000;

import java.util.Arrays;
import p000.sle;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
public final class ole<T> implements fme, eyd {

    /* JADX INFO: renamed from: a */
    @yfb
    public dme<T, Object> f68085a;

    /* JADX INFO: renamed from: b */
    @gib
    public sle f68086b;

    /* JADX INFO: renamed from: c */
    @yfb
    public String f68087c;

    /* JADX INFO: renamed from: d */
    public T f68088d;

    /* JADX INFO: renamed from: e */
    @yfb
    public Object[] f68089e;

    /* JADX INFO: renamed from: f */
    @gib
    public sle.InterfaceC12651a f68090f;

    /* JADX INFO: renamed from: m */
    @yfb
    public final ny6<Object> f68091m = new C10456a(this);

    /* JADX INFO: renamed from: ole$a */
    @dwf({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder$valueProvider$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
    public static final class C10456a extends tt8 implements ny6<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ole<T> f68092a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10456a(ole<T> oleVar) {
            super(0);
            this.f68092a = oleVar;
        }

        @Override // p000.ny6
        @gib
        public final Object invoke() {
            dme dmeVar = this.f68092a.f68085a;
            ole<T> oleVar = this.f68092a;
            Object obj = oleVar.f68088d;
            if (obj != null) {
                return dmeVar.save(oleVar, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public ole(@yfb dme<T, Object> dmeVar, @gib sle sleVar, @yfb String str, T t, @yfb Object[] objArr) {
        this.f68085a = dmeVar;
        this.f68086b = sleVar;
        this.f68087c = str;
        this.f68088d = t;
        this.f68089e = objArr;
    }

    private final void register() {
        sle sleVar = this.f68086b;
        if (this.f68090f == null) {
            if (sleVar != null) {
                gyd.requireCanBeSaved(sleVar, this.f68091m.invoke());
                this.f68090f = sleVar.registerProvider(this.f68087c, this.f68091m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f68090f + ") is not null").toString());
    }

    @Override // p000.fme
    public boolean canBeSaved(@yfb Object obj) {
        sle sleVar = this.f68086b;
        return sleVar == null || sleVar.canBeSaved(obj);
    }

    @gib
    public final T getValueIfInputsDidntChange(@yfb Object[] objArr) {
        if (Arrays.equals(objArr, this.f68089e)) {
            return this.f68088d;
        }
        return null;
    }

    @Override // p000.eyd
    public void onAbandoned() {
        sle.InterfaceC12651a interfaceC12651a = this.f68090f;
        if (interfaceC12651a != null) {
            interfaceC12651a.unregister();
        }
    }

    @Override // p000.eyd
    public void onForgotten() {
        sle.InterfaceC12651a interfaceC12651a = this.f68090f;
        if (interfaceC12651a != null) {
            interfaceC12651a.unregister();
        }
    }

    @Override // p000.eyd
    public void onRemembered() {
        register();
    }

    public final void update(@yfb dme<T, Object> dmeVar, @gib sle sleVar, @yfb String str, T t, @yfb Object[] objArr) {
        boolean z;
        boolean z2 = true;
        if (this.f68086b != sleVar) {
            this.f68086b = sleVar;
            z = true;
        } else {
            z = false;
        }
        if (md8.areEqual(this.f68087c, str)) {
            z2 = z;
        } else {
            this.f68087c = str;
        }
        this.f68085a = dmeVar;
        this.f68088d = t;
        this.f68089e = objArr;
        sle.InterfaceC12651a interfaceC12651a = this.f68090f;
        if (interfaceC12651a == null || !z2) {
            return;
        }
        if (interfaceC12651a != null) {
            interfaceC12651a.unregister();
        }
        this.f68090f = null;
        register();
    }
}
