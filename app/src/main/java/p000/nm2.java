package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class nm2 implements mf4, tf4 {

    /* JADX INFO: renamed from: a */
    public u5c<mf4> f64975a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f64976b;

    public nm2() {
    }

    /* JADX INFO: renamed from: a */
    public void m18002a(u5c<mf4> u5cVar) {
        if (u5cVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : u5cVar.keys()) {
            if (obj instanceof mf4) {
                try {
                    ((mf4) obj).dispose();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new pm2(arrayList);
            }
            throw j75.wrapOrThrow((Throwable) arrayList.get(0));
        }
    }

    @Override // p000.tf4
    public boolean add(@bfb mf4 mf4Var) {
        xjb.requireNonNull(mf4Var, "disposable is null");
        if (!this.f64976b) {
            synchronized (this) {
                try {
                    if (!this.f64976b) {
                        u5c<mf4> u5cVar = this.f64975a;
                        if (u5cVar == null) {
                            u5cVar = new u5c<>();
                            this.f64975a = u5cVar;
                        }
                        u5cVar.add(mf4Var);
                        return true;
                    }
                } finally {
                }
            }
        }
        mf4Var.dispose();
        return false;
    }

    public boolean addAll(@bfb mf4... mf4VarArr) {
        xjb.requireNonNull(mf4VarArr, "disposables is null");
        if (!this.f64976b) {
            synchronized (this) {
                try {
                    if (!this.f64976b) {
                        u5c<mf4> u5cVar = this.f64975a;
                        if (u5cVar == null) {
                            u5cVar = new u5c<>(mf4VarArr.length + 1);
                            this.f64975a = u5cVar;
                        }
                        for (mf4 mf4Var : mf4VarArr) {
                            xjb.requireNonNull(mf4Var, "A Disposable in the disposables array is null");
                            u5cVar.add(mf4Var);
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        for (mf4 mf4Var2 : mf4VarArr) {
            mf4Var2.dispose();
        }
        return false;
    }

    public void clear() {
        if (this.f64976b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f64976b) {
                    return;
                }
                u5c<mf4> u5cVar = this.f64975a;
                this.f64975a = null;
                m18002a(u5cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.tf4
    public boolean delete(@bfb mf4 mf4Var) {
        xjb.requireNonNull(mf4Var, "disposables is null");
        if (this.f64976b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f64976b) {
                    return false;
                }
                u5c<mf4> u5cVar = this.f64975a;
                if (u5cVar != null && u5cVar.remove(mf4Var)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // p000.mf4
    public void dispose() {
        if (this.f64976b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f64976b) {
                    return;
                }
                this.f64976b = true;
                u5c<mf4> u5cVar = this.f64975a;
                this.f64975a = null;
                m18002a(u5cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f64976b;
    }

    @Override // p000.tf4
    public boolean remove(@bfb mf4 mf4Var) {
        if (!delete(mf4Var)) {
            return false;
        }
        mf4Var.dispose();
        return true;
    }

    public int size() {
        if (this.f64976b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f64976b) {
                    return 0;
                }
                u5c<mf4> u5cVar = this.f64975a;
                return u5cVar != null ? u5cVar.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public nm2(@bfb mf4... mf4VarArr) {
        xjb.requireNonNull(mf4VarArr, "disposables is null");
        this.f64975a = new u5c<>(mf4VarArr.length + 1);
        for (mf4 mf4Var : mf4VarArr) {
            xjb.requireNonNull(mf4Var, "A Disposable in the disposables array is null");
            this.f64975a.add(mf4Var);
        }
    }

    public nm2(@bfb Iterable<? extends mf4> iterable) {
        xjb.requireNonNull(iterable, "disposables is null");
        this.f64975a = new u5c<>();
        for (mf4 mf4Var : iterable) {
            xjb.requireNonNull(mf4Var, "A Disposable item in the disposables sequence is null");
            this.f64975a.add(mf4Var);
        }
    }
}
