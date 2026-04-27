package p000;

import android.os.Handler;
import com.google.android.exoplayer2.drm.InterfaceC3005e;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p000.koa;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class vm2<T> extends es0 {

    /* JADX INFO: renamed from: C */
    public final HashMap<T, C14166b<T>> f91712C = new HashMap<>();

    /* JADX INFO: renamed from: F */
    @hib
    public Handler f91713F;

    /* JADX INFO: renamed from: H */
    @hib
    public pdh f91714H;

    /* JADX INFO: renamed from: vm2$a */
    public final class C14165a implements koa, InterfaceC3005e {

        /* JADX INFO: renamed from: a */
        @euh
        public final T f91715a;

        /* JADX INFO: renamed from: b */
        public koa.C8476a f91716b;

        /* JADX INFO: renamed from: c */
        public InterfaceC3005e.a f91717c;

        public C14165a(@euh T t) {
            this.f91716b = vm2.this.m10216e(null);
            this.f91717c = vm2.this.m10213b(null);
            this.f91715a = t;
        }

        private boolean maybeUpdateEventDispatcher(int i, @hib vna.C14175b c14175b) {
            vna.C14175b c14175bMo2649p;
            if (c14175b != null) {
                c14175bMo2649p = vm2.this.mo2649p(this.f91715a, c14175b);
                if (c14175bMo2649p == null) {
                    return false;
                }
            } else {
                c14175bMo2649p = null;
            }
            int iMo3298r = vm2.this.mo3298r(this.f91715a, i);
            koa.C8476a c8476a = this.f91716b;
            if (c8476a.f54837a != iMo3298r || !x0i.areEqual(c8476a.f54838b, c14175bMo2649p)) {
                this.f91716b = vm2.this.m10214c(iMo3298r, c14175bMo2649p);
            }
            InterfaceC3005e.a aVar = this.f91717c;
            if (aVar.f19500a == iMo3298r && x0i.areEqual(aVar.f19501b, c14175bMo2649p)) {
                return true;
            }
            this.f91717c = vm2.this.m10212a(iMo3298r, c14175bMo2649p);
            return true;
        }

        private ega maybeUpdateMediaLoadData(ega egaVar) {
            long jMo20627q = vm2.this.mo20627q(this.f91715a, egaVar.f32947f);
            long jMo20627q2 = vm2.this.mo20627q(this.f91715a, egaVar.f32948g);
            return (jMo20627q == egaVar.f32947f && jMo20627q2 == egaVar.f32948g) ? egaVar : new ega(egaVar.f32942a, egaVar.f32943b, egaVar.f32944c, egaVar.f32945d, egaVar.f32946e, jMo20627q, jMo20627q2);
        }

        @Override // p000.koa
        public void onDownstreamFormatChanged(int i, @hib vna.C14175b c14175b, ega egaVar) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91716b.downstreamFormatChanged(maybeUpdateMediaLoadData(egaVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmKeysLoaded(int i, @hib vna.C14175b c14175b) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91717c.drmKeysLoaded();
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmKeysRemoved(int i, @hib vna.C14175b c14175b) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91717c.drmKeysRemoved();
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmKeysRestored(int i, @hib vna.C14175b c14175b) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91717c.drmKeysRestored();
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmSessionAcquired(int i, @hib vna.C14175b c14175b, int i2) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91717c.drmSessionAcquired(i2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmSessionManagerError(int i, @hib vna.C14175b c14175b, Exception exc) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91717c.drmSessionManagerError(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmSessionReleased(int i, @hib vna.C14175b c14175b) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91717c.drmSessionReleased();
            }
        }

        @Override // p000.koa
        public void onLoadCanceled(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91716b.loadCanceled(jc9Var, maybeUpdateMediaLoadData(egaVar));
            }
        }

        @Override // p000.koa
        public void onLoadCompleted(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91716b.loadCompleted(jc9Var, maybeUpdateMediaLoadData(egaVar));
            }
        }

        @Override // p000.koa
        public void onLoadError(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar, IOException iOException, boolean z) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91716b.loadError(jc9Var, maybeUpdateMediaLoadData(egaVar), iOException, z);
            }
        }

        @Override // p000.koa
        public void onLoadStarted(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91716b.loadStarted(jc9Var, maybeUpdateMediaLoadData(egaVar));
            }
        }

        @Override // p000.koa
        public void onUpstreamDiscarded(int i, @hib vna.C14175b c14175b, ega egaVar) {
            if (maybeUpdateEventDispatcher(i, c14175b)) {
                this.f91716b.upstreamDiscarded(maybeUpdateMediaLoadData(egaVar));
            }
        }
    }

    /* JADX INFO: renamed from: vm2$b */
    public static final class C14166b<T> {

        /* JADX INFO: renamed from: a */
        public final vna f91719a;

        /* JADX INFO: renamed from: b */
        public final vna.InterfaceC14176c f91720b;

        /* JADX INFO: renamed from: c */
        public final vm2<T>.C14165a f91721c;

        public C14166b(vna vnaVar, vna.InterfaceC14176c interfaceC14176c, vm2<T>.C14165a c14165a) {
            this.f91719a = vnaVar;
            this.f91720b = interfaceC14176c;
            this.f91721c = c14165a;
        }
    }

    @Override // p000.es0
    @un1
    /* JADX INFO: renamed from: g */
    public void mo3296g() {
        for (C14166b<T> c14166b : this.f91712C.values()) {
            c14166b.f91719a.disable(c14166b.f91720b);
        }
    }

    @Override // p000.es0
    @un1
    /* JADX INFO: renamed from: h */
    public void mo3297h() {
        for (C14166b<T> c14166b : this.f91712C.values()) {
            c14166b.f91719a.enable(c14166b.f91720b);
        }
    }

    @Override // p000.es0
    @un1
    /* JADX INFO: renamed from: k */
    public void mo2648k(@hib pdh pdhVar) {
        this.f91714H = pdhVar;
        this.f91713F = x0i.createHandlerForCurrentLooper();
    }

    @Override // p000.vna
    @un1
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<C14166b<T>> it = this.f91712C.values().iterator();
        while (it.hasNext()) {
            it.next().f91719a.maybeThrowSourceInfoRefreshError();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m24065n(@euh T t) {
        C14166b c14166b = (C14166b) u80.checkNotNull(this.f91712C.get(t));
        c14166b.f91719a.disable(c14166b.f91720b);
    }

    /* JADX INFO: renamed from: o */
    public final void m24066o(@euh T t) {
        C14166b c14166b = (C14166b) u80.checkNotNull(this.f91712C.get(t));
        c14166b.f91719a.enable(c14166b.f91720b);
    }

    @hib
    /* JADX INFO: renamed from: p */
    public vna.C14175b mo2649p(@euh T t, vna.C14175b c14175b) {
        return c14175b;
    }

    /* JADX INFO: renamed from: q */
    public long mo20627q(@euh T t, long j) {
        return j;
    }

    /* JADX INFO: renamed from: r */
    public int mo3298r(@euh T t, int i) {
        return i;
    }

    @Override // p000.es0
    @un1
    public void releaseSourceInternal() {
        for (C14166b<T> c14166b : this.f91712C.values()) {
            c14166b.f91719a.releaseSource(c14166b.f91720b);
            c14166b.f91719a.removeEventListener(c14166b.f91721c);
            c14166b.f91719a.removeDrmEventListener(c14166b.f91721c);
        }
        this.f91712C.clear();
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$prepareChildSource$0(@euh T t, vna vnaVar, t1h t1hVar);

    /* JADX INFO: renamed from: t */
    public final void m24067t(@euh final T t, vna vnaVar) {
        u80.checkArgument(!this.f91712C.containsKey(t));
        vna.InterfaceC14176c interfaceC14176c = new vna.InterfaceC14176c() { // from class: sm2
            @Override // p000.vna.InterfaceC14176c
            public final void onSourceInfoRefreshed(vna vnaVar2, t1h t1hVar) {
                this.f82217a.lambda$prepareChildSource$0(t, vnaVar2, t1hVar);
            }
        };
        C14165a c14165a = new C14165a(t);
        this.f91712C.put(t, new C14166b<>(vnaVar, interfaceC14176c, c14165a));
        vnaVar.addEventListener((Handler) u80.checkNotNull(this.f91713F), c14165a);
        vnaVar.addDrmEventListener((Handler) u80.checkNotNull(this.f91713F), c14165a);
        vnaVar.prepareSource(interfaceC14176c, this.f91714H, m10218i());
        if (m10219j()) {
            return;
        }
        vnaVar.disable(interfaceC14176c);
    }

    /* JADX INFO: renamed from: u */
    public final void m24068u(@euh T t) {
        C14166b c14166b = (C14166b) u80.checkNotNull(this.f91712C.remove(t));
        c14166b.f91719a.releaseSource(c14166b.f91720b);
        c14166b.f91719a.removeEventListener(c14166b.f91721c);
        c14166b.f91719a.removeDrmEventListener(c14166b.f91721c);
    }
}
