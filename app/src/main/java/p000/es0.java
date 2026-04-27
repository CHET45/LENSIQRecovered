package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.InterfaceC3005e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000.koa;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class es0 implements vna {

    /* JADX INFO: renamed from: a */
    public final ArrayList<vna.InterfaceC14176c> f33945a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b */
    public final HashSet<vna.InterfaceC14176c> f33946b = new HashSet<>(1);

    /* JADX INFO: renamed from: c */
    public final koa.C8476a f33947c = new koa.C8476a();

    /* JADX INFO: renamed from: d */
    public final InterfaceC3005e.a f33948d = new InterfaceC3005e.a();

    /* JADX INFO: renamed from: e */
    @hib
    public Looper f33949e;

    /* JADX INFO: renamed from: f */
    @hib
    public t1h f33950f;

    /* JADX INFO: renamed from: m */
    @hib
    public k0d f33951m;

    /* JADX INFO: renamed from: a */
    public final InterfaceC3005e.a m10212a(int i, @hib vna.C14175b c14175b) {
        return this.f33948d.withParameters(i, c14175b);
    }

    @Override // p000.vna
    public final void addDrmEventListener(Handler handler, InterfaceC3005e interfaceC3005e) {
        u80.checkNotNull(handler);
        u80.checkNotNull(interfaceC3005e);
        this.f33948d.addEventListener(handler, interfaceC3005e);
    }

    @Override // p000.vna
    public final void addEventListener(Handler handler, koa koaVar) {
        u80.checkNotNull(handler);
        u80.checkNotNull(koaVar);
        this.f33947c.addEventListener(handler, koaVar);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC3005e.a m10213b(@hib vna.C14175b c14175b) {
        return this.f33948d.withParameters(0, c14175b);
    }

    /* JADX INFO: renamed from: c */
    public final koa.C8476a m10214c(int i, @hib vna.C14175b c14175b) {
        return this.f33947c.withParameters(i, c14175b);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final koa.C8476a m10215d(int i, @hib vna.C14175b c14175b, long j) {
        return this.f33947c.withParameters(i, c14175b);
    }

    @Override // p000.vna
    public final void disable(vna.InterfaceC14176c interfaceC14176c) {
        boolean zIsEmpty = this.f33946b.isEmpty();
        this.f33946b.remove(interfaceC14176c);
        if (zIsEmpty || !this.f33946b.isEmpty()) {
            return;
        }
        mo3296g();
    }

    /* JADX INFO: renamed from: e */
    public final koa.C8476a m10216e(@hib vna.C14175b c14175b) {
        return this.f33947c.withParameters(0, c14175b);
    }

    @Override // p000.vna
    public final void enable(vna.InterfaceC14176c interfaceC14176c) {
        u80.checkNotNull(this.f33949e);
        boolean zIsEmpty = this.f33946b.isEmpty();
        this.f33946b.add(interfaceC14176c);
        if (zIsEmpty) {
            mo3297h();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public final koa.C8476a m10217f(vna.C14175b c14175b, long j) {
        u80.checkNotNull(c14175b);
        return this.f33947c.withParameters(0, c14175b);
    }

    /* JADX INFO: renamed from: g */
    public void mo3296g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo3297h() {
    }

    /* JADX INFO: renamed from: i */
    public final k0d m10218i() {
        return (k0d) u80.checkStateNotNull(this.f33951m);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10219j() {
        return !this.f33946b.isEmpty();
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo2648k(@hib pdh pdhVar);

    /* JADX INFO: renamed from: l */
    public final void m10220l(t1h t1hVar) {
        this.f33950f = t1hVar;
        Iterator<vna.InterfaceC14176c> it = this.f33945a.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, t1hVar);
        }
    }

    @Override // p000.vna
    public final void prepareSource(vna.InterfaceC14176c interfaceC14176c, @hib pdh pdhVar) {
        prepareSource(interfaceC14176c, pdhVar, k0d.f52345b);
    }

    @Override // p000.vna
    public final void releaseSource(vna.InterfaceC14176c interfaceC14176c) {
        this.f33945a.remove(interfaceC14176c);
        if (!this.f33945a.isEmpty()) {
            disable(interfaceC14176c);
            return;
        }
        this.f33949e = null;
        this.f33950f = null;
        this.f33951m = null;
        this.f33946b.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    @Override // p000.vna
    public final void removeDrmEventListener(InterfaceC3005e interfaceC3005e) {
        this.f33948d.removeEventListener(interfaceC3005e);
    }

    @Override // p000.vna
    public final void removeEventListener(koa koaVar) {
        this.f33947c.removeEventListener(koaVar);
    }

    @Override // p000.vna
    public final void prepareSource(vna.InterfaceC14176c interfaceC14176c, @hib pdh pdhVar, k0d k0dVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f33949e;
        u80.checkArgument(looper == null || looper == looperMyLooper);
        this.f33951m = k0dVar;
        t1h t1hVar = this.f33950f;
        this.f33945a.add(interfaceC14176c);
        if (this.f33949e == null) {
            this.f33949e = looperMyLooper;
            this.f33946b.add(interfaceC14176c);
            mo2648k(pdhVar);
        } else if (t1hVar != null) {
            enable(interfaceC14176c);
            interfaceC14176c.onSourceInfoRefreshed(this, t1hVar);
        }
    }
}
