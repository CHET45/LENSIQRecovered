package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class s89 implements lf4, sf4 {

    /* JADX INFO: renamed from: a */
    public List<lf4> f80945a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f80946b;

    public s89() {
    }

    /* JADX INFO: renamed from: a */
    public void m21774a(List<lf4> set) {
        if (set == null) {
            return;
        }
        Iterator<lf4> it = set.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
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
    public boolean add(lf4 d) {
        Objects.requireNonNull(d, "d is null");
        if (!this.f80946b) {
            synchronized (this) {
                try {
                    if (!this.f80946b) {
                        List linkedList = this.f80945a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f80945a = linkedList;
                        }
                        linkedList.add(d);
                        return true;
                    }
                } finally {
                }
            }
        }
        d.dispose();
        return false;
    }

    public boolean addAll(lf4... ds) {
        Objects.requireNonNull(ds, "ds is null");
        if (!this.f80946b) {
            synchronized (this) {
                try {
                    if (!this.f80946b) {
                        List linkedList = this.f80945a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f80945a = linkedList;
                        }
                        for (lf4 lf4Var : ds) {
                            Objects.requireNonNull(lf4Var, "d is null");
                            linkedList.add(lf4Var);
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        for (lf4 lf4Var2 : ds) {
            lf4Var2.dispose();
        }
        return false;
    }

    public void clear() {
        if (this.f80946b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f80946b) {
                    return;
                }
                List<lf4> list = this.f80945a;
                this.f80945a = null;
                m21774a(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.sf4
    public boolean delete(lf4 d) {
        Objects.requireNonNull(d, "Disposable item is null");
        if (this.f80946b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f80946b) {
                    return false;
                }
                List<lf4> list = this.f80945a;
                if (list != null && list.remove(d)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // p000.lf4
    public void dispose() {
        if (this.f80946b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f80946b) {
                    return;
                }
                this.f80946b = true;
                List<lf4> list = this.f80945a;
                this.f80945a = null;
                m21774a(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f80946b;
    }

    @Override // p000.sf4
    public boolean remove(lf4 d) {
        if (!delete(d)) {
            return false;
        }
        d.dispose();
        return true;
    }

    public s89(lf4... resources) {
        Objects.requireNonNull(resources, "resources is null");
        this.f80945a = new LinkedList();
        for (lf4 lf4Var : resources) {
            Objects.requireNonNull(lf4Var, "Disposable item is null");
            this.f80945a.add(lf4Var);
        }
    }

    public s89(Iterable<? extends lf4> resources) {
        Objects.requireNonNull(resources, "resources is null");
        this.f80945a = new LinkedList();
        for (lf4 lf4Var : resources) {
            Objects.requireNonNull(lf4Var, "Disposable item is null");
            this.f80945a.add(lf4Var);
        }
    }
}
