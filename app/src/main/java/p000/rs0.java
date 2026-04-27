package p000;

import p000.tkb;

/* JADX INFO: loaded from: classes3.dex */
public class rs0 implements tkb {

    /* JADX INFO: renamed from: a */
    public transient agd f79182a;

    @Override // p000.tkb
    public void addOnPropertyChangedCallback(@efb tkb.AbstractC13084a abstractC13084a) {
        synchronized (this) {
            try {
                if (this.f79182a == null) {
                    this.f79182a = new agd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f79182a.add(abstractC13084a);
    }

    public void notifyChange() {
        synchronized (this) {
            try {
                agd agdVar = this.f79182a;
                if (agdVar == null) {
                    return;
                }
                agdVar.notifyCallbacks(this, 0, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyPropertyChanged(int i) {
        synchronized (this) {
            try {
                agd agdVar = this.f79182a;
                if (agdVar == null) {
                    return;
                }
                agdVar.notifyCallbacks(this, i, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.tkb
    public void removeOnPropertyChangedCallback(@efb tkb.AbstractC13084a abstractC13084a) {
        synchronized (this) {
            try {
                agd agdVar = this.f79182a;
                if (agdVar == null) {
                    return;
                }
                agdVar.remove(abstractC13084a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
