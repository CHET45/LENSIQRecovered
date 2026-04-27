package p000;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class mm2 implements lf4, sf4 {

    /* JADX INFO: renamed from: a */
    public t5c<lf4> f61462a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f61463b;

    public mm2() {
    }

    /* JADX INFO: renamed from: a */
    public void m17382a(@dib t5c<lf4> set) {
        if (set == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : set.keys()) {
            if (obj instanceof lf4) {
                try {
                    ((lf4) obj).dispose();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new qm2(arrayList);
            }
            throw k75.wrapOrThrow((Throwable) arrayList.get(0));
        }
    }

    @Override // p000.sf4
    public boolean add(@cfb lf4 disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (!this.f61463b) {
            synchronized (this) {
                try {
                    if (!this.f61463b) {
                        t5c<lf4> t5cVar = this.f61462a;
                        if (t5cVar == null) {
                            t5cVar = new t5c<>();
                            this.f61462a = t5cVar;
                        }
                        t5cVar.add(disposable);
                        return true;
                    }
                } finally {
                }
            }
        }
        disposable.dispose();
        return false;
    }

    public boolean addAll(@cfb lf4... disposables) {
        Objects.requireNonNull(disposables, "disposables is null");
        if (!this.f61463b) {
            synchronized (this) {
                try {
                    if (!this.f61463b) {
                        t5c<lf4> t5cVar = this.f61462a;
                        if (t5cVar == null) {
                            t5cVar = new t5c<>(disposables.length + 1);
                            this.f61462a = t5cVar;
                        }
                        for (lf4 lf4Var : disposables) {
                            Objects.requireNonNull(lf4Var, "A Disposable in the disposables array is null");
                            t5cVar.add(lf4Var);
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        for (lf4 lf4Var2 : disposables) {
            lf4Var2.dispose();
        }
        return false;
    }

    public void clear() {
        if (this.f61463b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f61463b) {
                    return;
                }
                t5c<lf4> t5cVar = this.f61462a;
                this.f61462a = null;
                m17382a(t5cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.sf4
    public boolean delete(@cfb lf4 disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (this.f61463b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f61463b) {
                    return false;
                }
                t5c<lf4> t5cVar = this.f61462a;
                if (t5cVar != null && t5cVar.remove(disposable)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // p000.lf4
    public void dispose() {
        if (this.f61463b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f61463b) {
                    return;
                }
                this.f61463b = true;
                t5c<lf4> t5cVar = this.f61462a;
                this.f61462a = null;
                m17382a(t5cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f61463b;
    }

    @Override // p000.sf4
    public boolean remove(@cfb lf4 disposable) {
        if (!delete(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    public int size() {
        if (this.f61463b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f61463b) {
                    return 0;
                }
                t5c<lf4> t5cVar = this.f61462a;
                return t5cVar != null ? t5cVar.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public mm2(@cfb lf4... disposables) {
        Objects.requireNonNull(disposables, "disposables is null");
        this.f61462a = new t5c<>(disposables.length + 1);
        for (lf4 lf4Var : disposables) {
            Objects.requireNonNull(lf4Var, "A Disposable in the disposables array is null");
            this.f61462a.add(lf4Var);
        }
    }

    public mm2(@cfb Iterable<? extends lf4> disposables) {
        Objects.requireNonNull(disposables, "disposables is null");
        this.f61462a = new t5c<>();
        for (lf4 lf4Var : disposables) {
            Objects.requireNonNull(lf4Var, "A Disposable item in the disposables sequence is null");
            this.f61462a.add(lf4Var);
        }
    }
}
