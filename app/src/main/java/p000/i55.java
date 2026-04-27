package p000;

import p000.x3e;

/* JADX INFO: loaded from: classes4.dex */
public final class i55 implements x3e, q3e {

    /* JADX INFO: renamed from: a */
    public final Object f45782a;

    /* JADX INFO: renamed from: b */
    @hib
    public final x3e f45783b;

    /* JADX INFO: renamed from: c */
    public volatile q3e f45784c;

    /* JADX INFO: renamed from: d */
    public volatile q3e f45785d;

    /* JADX INFO: renamed from: e */
    @xc7("requestLock")
    public x3e.EnumC14910a f45786e;

    /* JADX INFO: renamed from: f */
    @xc7("requestLock")
    public x3e.EnumC14910a f45787f;

    public i55(Object obj, @hib x3e x3eVar) {
        x3e.EnumC14910a enumC14910a = x3e.EnumC14910a.CLEARED;
        this.f45786e = enumC14910a;
        this.f45787f = enumC14910a;
        this.f45782a = obj;
        this.f45783b = x3eVar;
    }

    @xc7("requestLock")
    private boolean isValidRequest(q3e q3eVar) {
        return q3eVar.equals(this.f45784c) || (this.f45786e == x3e.EnumC14910a.FAILED && q3eVar.equals(this.f45785d));
    }

    @xc7("requestLock")
    private boolean parentCanNotifyCleared() {
        x3e x3eVar = this.f45783b;
        return x3eVar == null || x3eVar.canNotifyCleared(this);
    }

    @xc7("requestLock")
    private boolean parentCanNotifyStatusChanged() {
        x3e x3eVar = this.f45783b;
        return x3eVar == null || x3eVar.canNotifyStatusChanged(this);
    }

    @xc7("requestLock")
    private boolean parentCanSetImage() {
        x3e x3eVar = this.f45783b;
        return x3eVar == null || x3eVar.canSetImage(this);
    }

    @Override // p000.q3e
    public void begin() {
        synchronized (this.f45782a) {
            try {
                x3e.EnumC14910a enumC14910a = this.f45786e;
                x3e.EnumC14910a enumC14910a2 = x3e.EnumC14910a.RUNNING;
                if (enumC14910a != enumC14910a2) {
                    this.f45786e = enumC14910a2;
                    this.f45784c.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.x3e
    public boolean canNotifyCleared(q3e q3eVar) {
        boolean z;
        synchronized (this.f45782a) {
            try {
                z = parentCanNotifyCleared() && isValidRequest(q3eVar);
            } finally {
            }
        }
        return z;
    }

    @Override // p000.x3e
    public boolean canNotifyStatusChanged(q3e q3eVar) {
        boolean z;
        synchronized (this.f45782a) {
            try {
                z = parentCanNotifyStatusChanged() && isValidRequest(q3eVar);
            } finally {
            }
        }
        return z;
    }

    @Override // p000.x3e
    public boolean canSetImage(q3e q3eVar) {
        boolean z;
        synchronized (this.f45782a) {
            try {
                z = parentCanSetImage() && isValidRequest(q3eVar);
            } finally {
            }
        }
        return z;
    }

    @Override // p000.q3e
    public void clear() {
        synchronized (this.f45782a) {
            try {
                x3e.EnumC14910a enumC14910a = x3e.EnumC14910a.CLEARED;
                this.f45786e = enumC14910a;
                this.f45784c.clear();
                if (this.f45787f != enumC14910a) {
                    this.f45787f = enumC14910a;
                    this.f45785d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.x3e
    public x3e getRoot() {
        x3e root;
        synchronized (this.f45782a) {
            try {
                x3e x3eVar = this.f45783b;
                root = x3eVar != null ? x3eVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // p000.x3e, p000.q3e
    public boolean isAnyResourceSet() {
        boolean z;
        synchronized (this.f45782a) {
            try {
                z = this.f45784c.isAnyResourceSet() || this.f45785d.isAnyResourceSet();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.q3e
    public boolean isCleared() {
        boolean z;
        synchronized (this.f45782a) {
            try {
                x3e.EnumC14910a enumC14910a = this.f45786e;
                x3e.EnumC14910a enumC14910a2 = x3e.EnumC14910a.CLEARED;
                z = enumC14910a == enumC14910a2 && this.f45787f == enumC14910a2;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.q3e
    public boolean isComplete() {
        boolean z;
        synchronized (this.f45782a) {
            try {
                x3e.EnumC14910a enumC14910a = this.f45786e;
                x3e.EnumC14910a enumC14910a2 = x3e.EnumC14910a.SUCCESS;
                z = enumC14910a == enumC14910a2 || this.f45787f == enumC14910a2;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.q3e
    public boolean isEquivalentTo(q3e q3eVar) {
        if (!(q3eVar instanceof i55)) {
            return false;
        }
        i55 i55Var = (i55) q3eVar;
        return this.f45784c.isEquivalentTo(i55Var.f45784c) && this.f45785d.isEquivalentTo(i55Var.f45785d);
    }

    @Override // p000.q3e
    public boolean isRunning() {
        boolean z;
        synchronized (this.f45782a) {
            try {
                x3e.EnumC14910a enumC14910a = this.f45786e;
                x3e.EnumC14910a enumC14910a2 = x3e.EnumC14910a.RUNNING;
                z = enumC14910a == enumC14910a2 || this.f45787f == enumC14910a2;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.x3e
    public void onRequestFailed(q3e q3eVar) {
        synchronized (this.f45782a) {
            try {
                if (q3eVar.equals(this.f45785d)) {
                    this.f45787f = x3e.EnumC14910a.FAILED;
                    x3e x3eVar = this.f45783b;
                    if (x3eVar != null) {
                        x3eVar.onRequestFailed(this);
                    }
                    return;
                }
                this.f45786e = x3e.EnumC14910a.FAILED;
                x3e.EnumC14910a enumC14910a = this.f45787f;
                x3e.EnumC14910a enumC14910a2 = x3e.EnumC14910a.RUNNING;
                if (enumC14910a != enumC14910a2) {
                    this.f45787f = enumC14910a2;
                    this.f45785d.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.x3e
    public void onRequestSuccess(q3e q3eVar) {
        synchronized (this.f45782a) {
            try {
                if (q3eVar.equals(this.f45784c)) {
                    this.f45786e = x3e.EnumC14910a.SUCCESS;
                } else if (q3eVar.equals(this.f45785d)) {
                    this.f45787f = x3e.EnumC14910a.SUCCESS;
                }
                x3e x3eVar = this.f45783b;
                if (x3eVar != null) {
                    x3eVar.onRequestSuccess(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.q3e
    public void pause() {
        synchronized (this.f45782a) {
            try {
                x3e.EnumC14910a enumC14910a = this.f45786e;
                x3e.EnumC14910a enumC14910a2 = x3e.EnumC14910a.RUNNING;
                if (enumC14910a == enumC14910a2) {
                    this.f45786e = x3e.EnumC14910a.PAUSED;
                    this.f45784c.pause();
                }
                if (this.f45787f == enumC14910a2) {
                    this.f45787f = x3e.EnumC14910a.PAUSED;
                    this.f45785d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setRequests(q3e q3eVar, q3e q3eVar2) {
        this.f45784c = q3eVar;
        this.f45785d = q3eVar2;
    }
}
