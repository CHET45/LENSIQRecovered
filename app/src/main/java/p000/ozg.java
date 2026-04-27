package p000;

import p000.x3e;

/* JADX INFO: loaded from: classes4.dex */
public class ozg implements x3e, q3e {

    /* JADX INFO: renamed from: a */
    @hib
    public final x3e f69290a;

    /* JADX INFO: renamed from: b */
    public final Object f69291b;

    /* JADX INFO: renamed from: c */
    public volatile q3e f69292c;

    /* JADX INFO: renamed from: d */
    public volatile q3e f69293d;

    /* JADX INFO: renamed from: e */
    @xc7("requestLock")
    public x3e.EnumC14910a f69294e;

    /* JADX INFO: renamed from: f */
    @xc7("requestLock")
    public x3e.EnumC14910a f69295f;

    /* JADX INFO: renamed from: g */
    @xc7("requestLock")
    public boolean f69296g;

    public ozg(Object obj, @hib x3e x3eVar) {
        x3e.EnumC14910a enumC14910a = x3e.EnumC14910a.CLEARED;
        this.f69294e = enumC14910a;
        this.f69295f = enumC14910a;
        this.f69291b = obj;
        this.f69290a = x3eVar;
    }

    @xc7("requestLock")
    private boolean parentCanNotifyCleared() {
        x3e x3eVar = this.f69290a;
        return x3eVar == null || x3eVar.canNotifyCleared(this);
    }

    @xc7("requestLock")
    private boolean parentCanNotifyStatusChanged() {
        x3e x3eVar = this.f69290a;
        return x3eVar == null || x3eVar.canNotifyStatusChanged(this);
    }

    @xc7("requestLock")
    private boolean parentCanSetImage() {
        x3e x3eVar = this.f69290a;
        return x3eVar == null || x3eVar.canSetImage(this);
    }

    @Override // p000.q3e
    public void begin() {
        synchronized (this.f69291b) {
            try {
                this.f69296g = true;
                try {
                    if (this.f69294e != x3e.EnumC14910a.SUCCESS) {
                        x3e.EnumC14910a enumC14910a = this.f69295f;
                        x3e.EnumC14910a enumC14910a2 = x3e.EnumC14910a.RUNNING;
                        if (enumC14910a != enumC14910a2) {
                            this.f69295f = enumC14910a2;
                            this.f69293d.begin();
                        }
                    }
                    if (this.f69296g) {
                        x3e.EnumC14910a enumC14910a3 = this.f69294e;
                        x3e.EnumC14910a enumC14910a4 = x3e.EnumC14910a.RUNNING;
                        if (enumC14910a3 != enumC14910a4) {
                            this.f69294e = enumC14910a4;
                            this.f69292c.begin();
                        }
                    }
                    this.f69296g = false;
                } catch (Throwable th) {
                    this.f69296g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.x3e
    public boolean canNotifyCleared(q3e q3eVar) {
        boolean z;
        synchronized (this.f69291b) {
            try {
                z = parentCanNotifyCleared() && q3eVar.equals(this.f69292c) && this.f69294e != x3e.EnumC14910a.PAUSED;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.x3e
    public boolean canNotifyStatusChanged(q3e q3eVar) {
        boolean z;
        synchronized (this.f69291b) {
            try {
                z = parentCanNotifyStatusChanged() && q3eVar.equals(this.f69292c) && !isAnyResourceSet();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.x3e
    public boolean canSetImage(q3e q3eVar) {
        boolean z;
        synchronized (this.f69291b) {
            try {
                z = parentCanSetImage() && (q3eVar.equals(this.f69292c) || this.f69294e != x3e.EnumC14910a.SUCCESS);
            } finally {
            }
        }
        return z;
    }

    @Override // p000.q3e
    public void clear() {
        synchronized (this.f69291b) {
            this.f69296g = false;
            x3e.EnumC14910a enumC14910a = x3e.EnumC14910a.CLEARED;
            this.f69294e = enumC14910a;
            this.f69295f = enumC14910a;
            this.f69293d.clear();
            this.f69292c.clear();
        }
    }

    @Override // p000.x3e
    public x3e getRoot() {
        x3e root;
        synchronized (this.f69291b) {
            try {
                x3e x3eVar = this.f69290a;
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
        synchronized (this.f69291b) {
            try {
                z = this.f69293d.isAnyResourceSet() || this.f69292c.isAnyResourceSet();
            } finally {
            }
        }
        return z;
    }

    @Override // p000.q3e
    public boolean isCleared() {
        boolean z;
        synchronized (this.f69291b) {
            z = this.f69294e == x3e.EnumC14910a.CLEARED;
        }
        return z;
    }

    @Override // p000.q3e
    public boolean isComplete() {
        boolean z;
        synchronized (this.f69291b) {
            z = this.f69294e == x3e.EnumC14910a.SUCCESS;
        }
        return z;
    }

    @Override // p000.q3e
    public boolean isEquivalentTo(q3e q3eVar) {
        if (!(q3eVar instanceof ozg)) {
            return false;
        }
        ozg ozgVar = (ozg) q3eVar;
        if (this.f69292c == null) {
            if (ozgVar.f69292c != null) {
                return false;
            }
        } else if (!this.f69292c.isEquivalentTo(ozgVar.f69292c)) {
            return false;
        }
        if (this.f69293d == null) {
            if (ozgVar.f69293d != null) {
                return false;
            }
        } else if (!this.f69293d.isEquivalentTo(ozgVar.f69293d)) {
            return false;
        }
        return true;
    }

    @Override // p000.q3e
    public boolean isRunning() {
        boolean z;
        synchronized (this.f69291b) {
            z = this.f69294e == x3e.EnumC14910a.RUNNING;
        }
        return z;
    }

    @Override // p000.x3e
    public void onRequestFailed(q3e q3eVar) {
        synchronized (this.f69291b) {
            try {
                if (!q3eVar.equals(this.f69292c)) {
                    this.f69295f = x3e.EnumC14910a.FAILED;
                    return;
                }
                this.f69294e = x3e.EnumC14910a.FAILED;
                x3e x3eVar = this.f69290a;
                if (x3eVar != null) {
                    x3eVar.onRequestFailed(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.x3e
    public void onRequestSuccess(q3e q3eVar) {
        synchronized (this.f69291b) {
            try {
                if (q3eVar.equals(this.f69293d)) {
                    this.f69295f = x3e.EnumC14910a.SUCCESS;
                    return;
                }
                this.f69294e = x3e.EnumC14910a.SUCCESS;
                x3e x3eVar = this.f69290a;
                if (x3eVar != null) {
                    x3eVar.onRequestSuccess(this);
                }
                if (!this.f69295f.m24951a()) {
                    this.f69293d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.q3e
    public void pause() {
        synchronized (this.f69291b) {
            try {
                if (!this.f69295f.m24951a()) {
                    this.f69295f = x3e.EnumC14910a.PAUSED;
                    this.f69293d.pause();
                }
                if (!this.f69294e.m24951a()) {
                    this.f69294e = x3e.EnumC14910a.PAUSED;
                    this.f69292c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setRequests(q3e q3eVar, q3e q3eVar2) {
        this.f69292c = q3eVar;
        this.f69293d = q3eVar2;
    }
}
