package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class du2<T> implements fu2<T> {

    /* JADX INFO: renamed from: a */
    public final List<String> f30873a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public T f30874b;

    /* JADX INFO: renamed from: c */
    public hu2<T> f30875c;

    /* JADX INFO: renamed from: d */
    public InterfaceC4948a f30876d;

    /* JADX INFO: renamed from: du2$a */
    public interface InterfaceC4948a {
        void onConstraintMet(@efb List<String> workSpecIds);

        void onConstraintNotMet(@efb List<String> workSpecIds);
    }

    public du2(hu2<T> tracker) {
        this.f30875c = tracker;
    }

    private void updateCallback(@hib InterfaceC4948a callback, @hib T currentValue) {
        if (this.f30873a.isEmpty() || callback == null) {
            return;
        }
        if (currentValue == null || mo3471b(currentValue)) {
            callback.onConstraintNotMet(this.f30873a);
        } else {
            callback.onConstraintMet(this.f30873a);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3470a(@efb oqi workSpec);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo3471b(@efb T currentValue);

    public boolean isWorkSpecConstrained(@efb String workSpecId) {
        T t = this.f30874b;
        return t != null && mo3471b(t) && this.f30873a.contains(workSpecId);
    }

    @Override // p000.fu2
    public void onConstraintChanged(@hib T newValue) {
        this.f30874b = newValue;
        updateCallback(this.f30876d, newValue);
    }

    public void replace(@efb Iterable<oqi> workSpecs) {
        this.f30873a.clear();
        for (oqi oqiVar : workSpecs) {
            if (mo3470a(oqiVar)) {
                this.f30873a.add(oqiVar.f68337a);
            }
        }
        if (this.f30873a.isEmpty()) {
            this.f30875c.removeListener(this);
        } else {
            this.f30875c.addListener(this);
        }
        updateCallback(this.f30876d, this.f30874b);
    }

    public void reset() {
        if (this.f30873a.isEmpty()) {
            return;
        }
        this.f30873a.clear();
        this.f30875c.removeListener(this);
    }

    public void setCallback(@hib InterfaceC4948a callback) {
        if (this.f30876d != callback) {
            this.f30876d = callback;
            updateCallback(callback, this.f30874b);
        }
    }
}
