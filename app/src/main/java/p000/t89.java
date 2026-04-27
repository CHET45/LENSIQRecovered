package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class t89 implements mf4, tf4 {

    /* JADX INFO: renamed from: a */
    public List<mf4> f83975a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f83976b;

    public t89() {
    }

    /* JADX INFO: renamed from: a */
    public void m22418a(List<mf4> list) {
        if (list == null) {
            return;
        }
        Iterator<mf4> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
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
    public boolean add(mf4 mf4Var) {
        xjb.requireNonNull(mf4Var, "d is null");
        if (!this.f83976b) {
            synchronized (this) {
                try {
                    if (!this.f83976b) {
                        List linkedList = this.f83975a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f83975a = linkedList;
                        }
                        linkedList.add(mf4Var);
                        return true;
                    }
                } finally {
                }
            }
        }
        mf4Var.dispose();
        return false;
    }

    public boolean addAll(mf4... mf4VarArr) {
        xjb.requireNonNull(mf4VarArr, "ds is null");
        if (!this.f83976b) {
            synchronized (this) {
                try {
                    if (!this.f83976b) {
                        List linkedList = this.f83975a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f83975a = linkedList;
                        }
                        for (mf4 mf4Var : mf4VarArr) {
                            xjb.requireNonNull(mf4Var, "d is null");
                            linkedList.add(mf4Var);
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
        if (this.f83976b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f83976b) {
                    return;
                }
                List<mf4> list = this.f83975a;
                this.f83975a = null;
                m22418a(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.tf4
    public boolean delete(mf4 mf4Var) {
        xjb.requireNonNull(mf4Var, "Disposable item is null");
        if (this.f83976b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f83976b) {
                    return false;
                }
                List<mf4> list = this.f83975a;
                if (list != null && list.remove(mf4Var)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // p000.mf4
    public void dispose() {
        if (this.f83976b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f83976b) {
                    return;
                }
                this.f83976b = true;
                List<mf4> list = this.f83975a;
                this.f83975a = null;
                m22418a(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f83976b;
    }

    @Override // p000.tf4
    public boolean remove(mf4 mf4Var) {
        if (!delete(mf4Var)) {
            return false;
        }
        mf4Var.dispose();
        return true;
    }

    public t89(mf4... mf4VarArr) {
        xjb.requireNonNull(mf4VarArr, "resources is null");
        this.f83975a = new LinkedList();
        for (mf4 mf4Var : mf4VarArr) {
            xjb.requireNonNull(mf4Var, "Disposable item is null");
            this.f83975a.add(mf4Var);
        }
    }

    public t89(Iterable<? extends mf4> iterable) {
        xjb.requireNonNull(iterable, "resources is null");
        this.f83975a = new LinkedList();
        for (mf4 mf4Var : iterable) {
            xjb.requireNonNull(mf4Var, "Disposable item is null");
            this.f83975a.add(mf4Var);
        }
    }
}
