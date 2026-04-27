package p000;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p000.joa;
import p000.nr4;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class um2<T> extends fs0 {

    /* JADX INFO: renamed from: C */
    public final HashMap<T, C13597b<T>> f88460C = new HashMap<>();

    /* JADX INFO: renamed from: F */
    @hib
    public Handler f88461F;

    /* JADX INFO: renamed from: H */
    @hib
    public qdh f88462H;

    /* JADX INFO: renamed from: um2$a */
    public final class C13596a implements joa, nr4 {

        /* JADX INFO: renamed from: a */
        @fuh
        public final T f88463a;

        /* JADX INFO: renamed from: b */
        public joa.C7994a f88464b;

        /* JADX INFO: renamed from: c */
        public nr4.C10020a f88465c;

        public C13596a(@fuh T t) {
            this.f88464b = um2.this.m11118e(null);
            this.f88465c = um2.this.m11115b(null);
            this.f88463a = t;
        }

        private boolean maybeUpdateEventDispatcher(int i, @hib una.C13612b c13612b) {
            una.C13612b c13612bMo2509r;
            if (c13612b != null) {
                c13612bMo2509r = um2.this.mo2509r(this.f88463a, c13612b);
                if (c13612bMo2509r == null) {
                    return false;
                }
            } else {
                c13612bMo2509r = null;
            }
            int iMo2510t = um2.this.mo2510t(this.f88463a, i);
            joa.C7994a c7994a = this.f88464b;
            if (c7994a.f51350a != iMo2510t || !Objects.equals(c7994a.f51351b, c13612bMo2509r)) {
                this.f88464b = um2.this.m11116c(iMo2510t, c13612bMo2509r);
            }
            nr4.C10020a c10020a = this.f88465c;
            if (c10020a.f65360a == iMo2510t && Objects.equals(c10020a.f65361b, c13612bMo2509r)) {
                return true;
            }
            this.f88465c = um2.this.m11114a(iMo2510t, c13612bMo2509r);
            return true;
        }

        private fga maybeUpdateMediaLoadData(fga fgaVar, @hib una.C13612b c13612b) {
            long jMo10177s = um2.this.mo10177s(this.f88463a, fgaVar.f36531f, c13612b);
            long jMo10177s2 = um2.this.mo10177s(this.f88463a, fgaVar.f36532g, c13612b);
            return (jMo10177s == fgaVar.f36531f && jMo10177s2 == fgaVar.f36532g) ? fgaVar : new fga(fgaVar.f36526a, fgaVar.f36527b, fgaVar.f36528c, fgaVar.f36529d, fgaVar.f36530e, jMo10177s, jMo10177s2);
        }

        @Override // p000.joa
        public void onDownstreamFormatChanged(int i, @hib una.C13612b c13612b, fga fgaVar) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88464b.downstreamFormatChanged(maybeUpdateMediaLoadData(fgaVar, c13612b));
            }
        }

        @Override // p000.nr4
        public void onDrmKeysLoaded(int i, @hib una.C13612b c13612b) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88465c.drmKeysLoaded();
            }
        }

        @Override // p000.nr4
        public void onDrmKeysRemoved(int i, @hib una.C13612b c13612b) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88465c.drmKeysRemoved();
            }
        }

        @Override // p000.nr4
        public void onDrmKeysRestored(int i, @hib una.C13612b c13612b) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88465c.drmKeysRestored();
            }
        }

        @Override // p000.nr4
        public void onDrmSessionAcquired(int i, @hib una.C13612b c13612b, int i2) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88465c.drmSessionAcquired(i2);
            }
        }

        @Override // p000.nr4
        public void onDrmSessionManagerError(int i, @hib una.C13612b c13612b, Exception exc) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88465c.drmSessionManagerError(exc);
            }
        }

        @Override // p000.nr4
        public void onDrmSessionReleased(int i, @hib una.C13612b c13612b) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88465c.drmSessionReleased();
            }
        }

        @Override // p000.joa
        public void onLoadCanceled(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88464b.loadCanceled(kc9Var, maybeUpdateMediaLoadData(fgaVar, c13612b));
            }
        }

        @Override // p000.joa
        public void onLoadCompleted(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88464b.loadCompleted(kc9Var, maybeUpdateMediaLoadData(fgaVar, c13612b));
            }
        }

        @Override // p000.joa
        public void onLoadError(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar, IOException iOException, boolean z) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88464b.loadError(kc9Var, maybeUpdateMediaLoadData(fgaVar, c13612b), iOException, z);
            }
        }

        @Override // p000.joa
        public void onLoadStarted(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar, int i2) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88464b.loadStarted(kc9Var, maybeUpdateMediaLoadData(fgaVar, c13612b), i2);
            }
        }

        @Override // p000.joa
        public void onUpstreamDiscarded(int i, @hib una.C13612b c13612b, fga fgaVar) {
            if (maybeUpdateEventDispatcher(i, c13612b)) {
                this.f88464b.upstreamDiscarded(maybeUpdateMediaLoadData(fgaVar, c13612b));
            }
        }
    }

    /* JADX INFO: renamed from: um2$b */
    public static final class C13597b<T> {

        /* JADX INFO: renamed from: a */
        public final una f88467a;

        /* JADX INFO: renamed from: b */
        public final una.InterfaceC13613c f88468b;

        /* JADX INFO: renamed from: c */
        public final um2<T>.C13596a f88469c;

        public C13597b(una unaVar, una.InterfaceC13613c interfaceC13613c, um2<T>.C13596a c13596a) {
            this.f88467a = unaVar;
            this.f88468b = interfaceC13613c;
            this.f88469c = c13596a;
        }
    }

    @Override // p000.fs0
    @un1
    /* JADX INFO: renamed from: g */
    public void mo2506g() {
        for (C13597b<T> c13597b : this.f88460C.values()) {
            c13597b.f88467a.disable(c13597b.f88468b);
        }
    }

    @Override // p000.fs0
    @un1
    /* JADX INFO: renamed from: h */
    public void mo2507h() {
        for (C13597b<T> c13597b : this.f88460C.values()) {
            c13597b.f88467a.enable(c13597b.f88468b);
        }
    }

    @Override // p000.fs0
    @un1
    /* JADX INFO: renamed from: l */
    public void mo2508l(@hib qdh qdhVar) {
        this.f88462H = qdhVar;
        this.f88461F = t0i.createHandlerForCurrentLooper();
    }

    @Override // p000.una
    @un1
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<C13597b<T>> it = this.f88460C.values().iterator();
        while (it.hasNext()) {
            it.next().f88467a.maybeThrowSourceInfoRefreshError();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m23427p(@fuh T t) {
        C13597b c13597b = (C13597b) v80.checkNotNull(this.f88460C.get(t));
        c13597b.f88467a.disable(c13597b.f88468b);
    }

    /* JADX INFO: renamed from: q */
    public final void m23428q(@fuh T t) {
        C13597b c13597b = (C13597b) v80.checkNotNull(this.f88460C.get(t));
        c13597b.f88467a.enable(c13597b.f88468b);
    }

    @hib
    /* JADX INFO: renamed from: r */
    public una.C13612b mo2509r(@fuh T t, una.C13612b c13612b) {
        return c13612b;
    }

    @Override // p000.fs0
    @un1
    public void releaseSourceInternal() {
        for (C13597b<T> c13597b : this.f88460C.values()) {
            c13597b.f88467a.releaseSource(c13597b.f88468b);
            c13597b.f88467a.removeEventListener(c13597b.f88469c);
            c13597b.f88467a.removeDrmEventListener(c13597b.f88469c);
        }
        this.f88460C.clear();
    }

    /* JADX INFO: renamed from: s */
    public long mo10177s(@fuh T t, long j, @hib una.C13612b c13612b) {
        return j;
    }

    /* JADX INFO: renamed from: t */
    public int mo2510t(@fuh T t, int i) {
        return i;
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$prepareChildSource$0(@fuh T t, una unaVar, q1h q1hVar);

    /* JADX INFO: renamed from: v */
    public final void m23429v(@fuh final T t, una unaVar) {
        v80.checkArgument(!this.f88460C.containsKey(t));
        una.InterfaceC13613c interfaceC13613c = new una.InterfaceC13613c() { // from class: tm2
            @Override // p000.una.InterfaceC13613c
            public final void onSourceInfoRefreshed(una unaVar2, q1h q1hVar) {
                this.f85304a.lambda$prepareChildSource$0(t, unaVar2, q1hVar);
            }
        };
        C13596a c13596a = new C13596a(t);
        this.f88460C.put(t, new C13597b<>(unaVar, interfaceC13613c, c13596a));
        unaVar.addEventListener((Handler) v80.checkNotNull(this.f88461F), c13596a);
        unaVar.addDrmEventListener((Handler) v80.checkNotNull(this.f88461F), c13596a);
        unaVar.prepareSource(interfaceC13613c, this.f88462H, m11120i());
        if (m11121j()) {
            return;
        }
        unaVar.disable(interfaceC13613c);
    }

    /* JADX INFO: renamed from: w */
    public final void m23430w(@fuh T t) {
        C13597b c13597b = (C13597b) v80.checkNotNull(this.f88460C.remove(t));
        c13597b.f88467a.releaseSource(c13597b.f88468b);
        c13597b.f88467a.removeEventListener(c13597b.f88469c);
        c13597b.f88467a.removeDrmEventListener(c13597b.f88469c);
    }
}
