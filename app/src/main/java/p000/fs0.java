package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000.joa;
import p000.nr4;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class fs0 implements una {

    /* JADX INFO: renamed from: a */
    public final ArrayList<una.InterfaceC13613c> f37592a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b */
    public final HashSet<una.InterfaceC13613c> f37593b = new HashSet<>(1);

    /* JADX INFO: renamed from: c */
    public final joa.C7994a f37594c = new joa.C7994a();

    /* JADX INFO: renamed from: d */
    public final nr4.C10020a f37595d = new nr4.C10020a();

    /* JADX INFO: renamed from: e */
    @hib
    public Looper f37596e;

    /* JADX INFO: renamed from: f */
    @hib
    public q1h f37597f;

    /* JADX INFO: renamed from: m */
    @hib
    public j0d f37598m;

    /* JADX INFO: renamed from: a */
    public final nr4.C10020a m11114a(int i, @hib una.C13612b c13612b) {
        return this.f37595d.withParameters(i, c13612b);
    }

    @Override // p000.una
    @ovh
    public final void addDrmEventListener(Handler handler, nr4 nr4Var) {
        v80.checkNotNull(handler);
        v80.checkNotNull(nr4Var);
        this.f37595d.addEventListener(handler, nr4Var);
    }

    @Override // p000.una
    @ovh
    public final void addEventListener(Handler handler, joa joaVar) {
        v80.checkNotNull(handler);
        v80.checkNotNull(joaVar);
        this.f37594c.addEventListener(handler, joaVar);
    }

    /* JADX INFO: renamed from: b */
    public final nr4.C10020a m11115b(@hib una.C13612b c13612b) {
        return this.f37595d.withParameters(0, c13612b);
    }

    /* JADX INFO: renamed from: c */
    public final joa.C7994a m11116c(int i, @hib una.C13612b c13612b) {
        return this.f37594c.withParameters(i, c13612b);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final joa.C7994a m11117d(int i, @hib una.C13612b c13612b, long j) {
        return this.f37594c.withParameters(i, c13612b);
    }

    @Override // p000.una
    @ovh
    public final void disable(una.InterfaceC13613c interfaceC13613c) {
        boolean zIsEmpty = this.f37593b.isEmpty();
        this.f37593b.remove(interfaceC13613c);
        if (zIsEmpty || !this.f37593b.isEmpty()) {
            return;
        }
        mo2506g();
    }

    /* JADX INFO: renamed from: e */
    public final joa.C7994a m11118e(@hib una.C13612b c13612b) {
        return this.f37594c.withParameters(0, c13612b);
    }

    @Override // p000.una
    @ovh
    public final void enable(una.InterfaceC13613c interfaceC13613c) {
        v80.checkNotNull(this.f37596e);
        boolean zIsEmpty = this.f37593b.isEmpty();
        this.f37593b.add(interfaceC13613c);
        if (zIsEmpty) {
            mo2507h();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public final joa.C7994a m11119f(una.C13612b c13612b, long j) {
        v80.checkNotNull(c13612b);
        return this.f37594c.withParameters(0, c13612b);
    }

    /* JADX INFO: renamed from: g */
    public void mo2506g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo2507h() {
    }

    /* JADX INFO: renamed from: i */
    public final j0d m11120i() {
        return (j0d) v80.checkStateNotNull(this.f37598m);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11121j() {
        return !this.f37593b.isEmpty();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11122k() {
        return !this.f37592a.isEmpty();
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo2508l(@hib qdh qdhVar);

    /* JADX INFO: renamed from: m */
    public final void m11123m(q1h q1hVar) {
        this.f37597f = q1hVar;
        Iterator<una.InterfaceC13613c> it = this.f37592a.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, q1hVar);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11124n(j0d j0dVar) {
        this.f37598m = j0dVar;
    }

    @Override // p000.una
    @ovh
    public final void prepareSource(una.InterfaceC13613c interfaceC13613c, @hib qdh qdhVar) {
        prepareSource(interfaceC13613c, qdhVar, j0d.f49299d);
    }

    @Override // p000.una
    @ovh
    public final void releaseSource(una.InterfaceC13613c interfaceC13613c) {
        this.f37592a.remove(interfaceC13613c);
        if (!this.f37592a.isEmpty()) {
            disable(interfaceC13613c);
            return;
        }
        this.f37596e = null;
        this.f37597f = null;
        this.f37598m = null;
        this.f37593b.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    @Override // p000.una
    @ovh
    public final void removeDrmEventListener(nr4 nr4Var) {
        this.f37595d.removeEventListener(nr4Var);
    }

    @Override // p000.una
    @ovh
    public final void removeEventListener(joa joaVar) {
        this.f37594c.removeEventListener(joaVar);
    }

    @Override // p000.una
    @ovh
    public final void prepareSource(una.InterfaceC13613c interfaceC13613c, @hib qdh qdhVar, j0d j0dVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f37596e;
        v80.checkArgument(looper == null || looper == looperMyLooper);
        this.f37598m = j0dVar;
        q1h q1hVar = this.f37597f;
        this.f37592a.add(interfaceC13613c);
        if (this.f37596e == null) {
            this.f37596e = looperMyLooper;
            this.f37593b.add(interfaceC13613c);
            mo2508l(qdhVar);
        } else if (q1hVar != null) {
            enable(interfaceC13613c);
            interfaceC13613c.onSourceInfoRefreshed(this, q1hVar);
        }
    }
}
