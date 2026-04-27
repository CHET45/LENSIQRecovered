package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class fzf {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Object> f38086a;

    public fzf(int i) {
        this.f38086a = new ArrayList<>(i);
    }

    public void add(Object obj) {
        this.f38086a.add(obj);
    }

    public void addSpread(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f38086a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f38086a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f38086a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f38086a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f38086a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int size() {
        return this.f38086a.size();
    }

    public Object[] toArray(Object[] objArr) {
        return this.f38086a.toArray(objArr);
    }
}
