package p000;

import android.util.SparseArray;
import p000.sa9.InterfaceC12497a;

/* JADX INFO: loaded from: classes6.dex */
public class sa9<T extends InterfaceC12497a> implements qa9 {

    /* JADX INFO: renamed from: a */
    public volatile T f81042a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<T> f81043b = new SparseArray<>();

    /* JADX INFO: renamed from: c */
    public Boolean f81044c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC12498b<T> f81045d;

    /* JADX INFO: renamed from: sa9$a */
    public interface InterfaceC12497a {
        int getId();

        void onInfoValid(@efb bd1 bd1Var);
    }

    /* JADX INFO: renamed from: sa9$b */
    public interface InterfaceC12498b<T extends InterfaceC12497a> {
        T create(int i);
    }

    public sa9(InterfaceC12498b<T> interfaceC12498b) {
        this.f81045d = interfaceC12498b;
    }

    @efb
    /* JADX INFO: renamed from: a */
    public T m21793a(@efb cn4 cn4Var, @hib bd1 bd1Var) {
        T t = (T) this.f81045d.create(cn4Var.getId());
        synchronized (this) {
            try {
                if (this.f81042a == null) {
                    this.f81042a = t;
                } else {
                    this.f81043b.put(cn4Var.getId(), t);
                }
                if (bd1Var != null) {
                    t.onInfoValid(bd1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @hib
    /* JADX INFO: renamed from: b */
    public T m21794b(@efb cn4 cn4Var, @hib bd1 bd1Var) {
        T t;
        int id = cn4Var.getId();
        synchronized (this) {
            try {
                t = (this.f81042a == null || this.f81042a.getId() != id) ? null : this.f81042a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (t == null) {
            t = this.f81043b.get(id);
        }
        return (t == null && isAlwaysRecoverAssistModel()) ? (T) m21793a(cn4Var, bd1Var) : t;
    }

    @efb
    /* JADX INFO: renamed from: c */
    public T m21795c(@efb cn4 cn4Var, @hib bd1 bd1Var) {
        T t;
        int id = cn4Var.getId();
        synchronized (this) {
            try {
                if (this.f81042a == null || this.f81042a.getId() != id) {
                    t = this.f81043b.get(id);
                    this.f81043b.remove(id);
                } else {
                    t = this.f81042a;
                    this.f81042a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (t == null) {
            t = (T) this.f81045d.create(id);
            if (bd1Var != null) {
                t.onInfoValid(bd1Var);
            }
        }
        return t;
    }

    @Override // p000.qa9
    public boolean isAlwaysRecoverAssistModel() {
        Boolean bool = this.f81044c;
        return bool != null && bool.booleanValue();
    }

    @Override // p000.qa9
    public void setAlwaysRecoverAssistModel(boolean z) {
        this.f81044c = Boolean.valueOf(z);
    }

    @Override // p000.qa9
    public void setAlwaysRecoverAssistModelIfNotSet(boolean z) {
        if (this.f81044c == null) {
            this.f81044c = Boolean.valueOf(z);
        }
    }
}
