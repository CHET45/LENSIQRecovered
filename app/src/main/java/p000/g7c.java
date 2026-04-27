package p000;

import p000.z24;

/* JADX INFO: loaded from: classes5.dex */
public class g7c<T> implements eid<T>, z24<T> {

    /* JADX INFO: renamed from: c */
    public static final z24.InterfaceC15937a<Object> f38962c = new z24.InterfaceC15937a() { // from class: d7c
        @Override // p000.z24.InterfaceC15937a
        public final void handle(eid eidVar) {
            g7c.lambda$static$0(eidVar);
        }
    };

    /* JADX INFO: renamed from: d */
    public static final eid<Object> f38963d = new eid() { // from class: e7c
        @Override // p000.eid
        public final Object get() {
            return g7c.lambda$static$1();
        }
    };

    /* JADX INFO: renamed from: a */
    @xc7("this")
    public z24.InterfaceC15937a<T> f38964a;

    /* JADX INFO: renamed from: b */
    public volatile eid<T> f38965b;

    private g7c(z24.InterfaceC15937a<T> interfaceC15937a, eid<T> eidVar) {
        this.f38964a = interfaceC15937a;
        this.f38965b = eidVar;
    }

    /* JADX INFO: renamed from: d */
    public static <T> g7c<T> m11426d() {
        return new g7c<>(f38962c, f38963d);
    }

    /* JADX INFO: renamed from: e */
    public static <T> g7c<T> m11427e(eid<T> eidVar) {
        return new g7c<>(null, eidVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(eid eidVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$1() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$whenAvailable$2(z24.InterfaceC15937a interfaceC15937a, z24.InterfaceC15937a interfaceC15937a2, eid eidVar) {
        interfaceC15937a.handle(eidVar);
        interfaceC15937a2.handle(eidVar);
    }

    /* JADX INFO: renamed from: f */
    public void m11428f(eid<T> eidVar) {
        z24.InterfaceC15937a<T> interfaceC15937a;
        if (this.f38965b != f38963d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC15937a = this.f38964a;
            this.f38964a = null;
            this.f38965b = eidVar;
        }
        interfaceC15937a.handle(eidVar);
    }

    @Override // p000.eid
    public T get() {
        return this.f38965b.get();
    }

    @Override // p000.z24
    public void whenAvailable(@efb final z24.InterfaceC15937a<T> interfaceC15937a) {
        eid<T> eidVar;
        eid<T> eidVar2;
        eid<T> eidVar3 = this.f38965b;
        eid<Object> eidVar4 = f38963d;
        if (eidVar3 != eidVar4) {
            interfaceC15937a.handle(eidVar3);
            return;
        }
        synchronized (this) {
            eidVar = this.f38965b;
            if (eidVar != eidVar4) {
                eidVar2 = eidVar;
            } else {
                final z24.InterfaceC15937a<T> interfaceC15937a2 = this.f38964a;
                this.f38964a = new z24.InterfaceC15937a() { // from class: f7c
                    @Override // p000.z24.InterfaceC15937a
                    public final void handle(eid eidVar5) {
                        g7c.lambda$whenAvailable$2(interfaceC15937a2, interfaceC15937a, eidVar5);
                    }
                };
                eidVar2 = null;
            }
        }
        if (eidVar2 != null) {
            interfaceC15937a.handle(eidVar);
        }
    }
}
