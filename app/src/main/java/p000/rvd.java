package p000;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class rvd {

    /* JADX INFO: renamed from: a */
    public qy7<ui4> f79887a = new qy7<>(Collections.emptyList(), ui4.f88039c);

    /* JADX INFO: renamed from: b */
    public qy7<ui4> f79888b = new qy7<>(Collections.emptyList(), ui4.f88040d);

    public void addReference(ci4 ci4Var, int i) {
        ui4 ui4Var = new ui4(ci4Var, i);
        this.f79887a = this.f79887a.insert(ui4Var);
        this.f79888b = this.f79888b.insert(ui4Var);
    }

    public void addReferences(qy7<ci4> qy7Var, int i) {
        Iterator<ci4> it = qy7Var.iterator();
        while (it.hasNext()) {
            addReference(it.next(), i);
        }
    }

    public boolean containsKey(ci4 ci4Var) {
        Iterator<ui4> itIteratorFrom = this.f79887a.iteratorFrom(new ui4(ci4Var, 0));
        if (itIteratorFrom.hasNext()) {
            return itIteratorFrom.next().m23368d().equals(ci4Var);
        }
        return false;
    }

    public boolean isEmpty() {
        return this.f79887a.isEmpty();
    }

    public qy7<ci4> referencesForId(int i) {
        Iterator<ui4> itIteratorFrom = this.f79888b.iteratorFrom(new ui4(ci4.empty(), i));
        qy7<ci4> qy7VarEmptyKeySet = ci4.emptyKeySet();
        while (itIteratorFrom.hasNext()) {
            ui4 next = itIteratorFrom.next();
            if (next.m23367c() != i) {
                break;
            }
            qy7VarEmptyKeySet = qy7VarEmptyKeySet.insert(next.m23368d());
        }
        return qy7VarEmptyKeySet;
    }

    public void removeAllReferences() {
        Iterator<ui4> it = this.f79887a.iterator();
        while (it.hasNext()) {
            removeReference(it.next());
        }
    }

    public void removeReference(ci4 ci4Var, int i) {
        removeReference(new ui4(ci4Var, i));
    }

    public void removeReferences(qy7<ci4> qy7Var, int i) {
        Iterator<ci4> it = qy7Var.iterator();
        while (it.hasNext()) {
            removeReference(it.next(), i);
        }
    }

    public qy7<ci4> removeReferencesForId(int i) {
        Iterator<ui4> itIteratorFrom = this.f79888b.iteratorFrom(new ui4(ci4.empty(), i));
        qy7<ci4> qy7VarEmptyKeySet = ci4.emptyKeySet();
        while (itIteratorFrom.hasNext()) {
            ui4 next = itIteratorFrom.next();
            if (next.m23367c() != i) {
                break;
            }
            qy7VarEmptyKeySet = qy7VarEmptyKeySet.insert(next.m23368d());
            removeReference(next);
        }
        return qy7VarEmptyKeySet;
    }

    private void removeReference(ui4 ui4Var) {
        this.f79887a = this.f79887a.remove(ui4Var);
        this.f79888b = this.f79888b.remove(ui4Var);
    }
}
