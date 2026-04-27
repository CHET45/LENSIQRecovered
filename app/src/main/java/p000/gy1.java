package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.mw9;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@erh
@p7e({p7e.EnumC10826a.f69935b})
public class gy1<T extends mw9<T>> {

    /* JADX INFO: renamed from: a */
    public final Map<Integer, T> f41776a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Set<Integer> f41777b = new HashSet();

    /* JADX INFO: renamed from: c */
    public InterfaceC6645b f41778c;

    /* JADX INFO: renamed from: d */
    public boolean f41779d;

    /* JADX INFO: renamed from: e */
    public boolean f41780e;

    /* JADX INFO: renamed from: gy1$a */
    public class C6644a implements mw9.InterfaceC9572a<T> {
        public C6644a() {
        }

        @Override // p000.mw9.InterfaceC9572a
        public void onCheckedChanged(T t, boolean z) {
            if (!z) {
                gy1 gy1Var = gy1.this;
                if (!gy1Var.uncheckInternal(t, gy1Var.f41780e)) {
                    return;
                }
            } else if (!gy1.this.checkInternal(t)) {
                return;
            }
            gy1.this.onCheckedStateChanged();
        }
    }

    /* JADX INFO: renamed from: gy1$b */
    public interface InterfaceC6645b {
        void onCheckedStateChanged(@efb Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInternal(@efb mw9<T> mw9Var) {
        int id = mw9Var.getId();
        if (this.f41777b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.f41776a.get(Integer.valueOf(getSingleCheckedId()));
        if (t != null) {
            uncheckInternal(t, false);
        }
        boolean zAdd = this.f41777b.add(Integer.valueOf(id));
        if (!mw9Var.isChecked()) {
            mw9Var.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedStateChanged() {
        InterfaceC6645b interfaceC6645b = this.f41778c;
        if (interfaceC6645b != null) {
            interfaceC6645b.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncheckInternal(@efb mw9<T> mw9Var, boolean z) {
        int id = mw9Var.getId();
        if (!this.f41777b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.f41777b.size() == 1 && this.f41777b.contains(Integer.valueOf(id))) {
            mw9Var.setChecked(true);
            return false;
        }
        boolean zRemove = this.f41777b.remove(Integer.valueOf(id));
        if (mw9Var.isChecked()) {
            mw9Var.setChecked(false);
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t) {
        this.f41776a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            checkInternal(t);
        }
        t.setInternalOnCheckedChangeListener(new C6644a());
    }

    public void check(@kr7 int i) {
        T t = this.f41776a.get(Integer.valueOf(i));
        if (t != null && checkInternal(t)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean zIsEmpty = this.f41777b.isEmpty();
        Iterator<T> it = this.f41776a.values().iterator();
        while (it.hasNext()) {
            uncheckInternal(it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        onCheckedStateChanged();
    }

    @efb
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.f41777b);
    }

    @efb
    public List<Integer> getCheckedIdsSortedByChildOrder(@efb ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof mw9) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @kr7
    public int getSingleCheckedId() {
        if (!this.f41779d || this.f41777b.isEmpty()) {
            return -1;
        }
        return this.f41777b.iterator().next().intValue();
    }

    public boolean isSelectionRequired() {
        return this.f41780e;
    }

    public boolean isSingleSelection() {
        return this.f41779d;
    }

    public void removeCheckable(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.f41776a.remove(Integer.valueOf(t.getId()));
        this.f41777b.remove(Integer.valueOf(t.getId()));
    }

    public void setOnCheckedStateChangeListener(@hib InterfaceC6645b interfaceC6645b) {
        this.f41778c = interfaceC6645b;
    }

    public void setSelectionRequired(boolean z) {
        this.f41780e = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f41779d != z) {
            this.f41779d = z;
            clearCheck();
        }
    }

    public void uncheck(@kr7 int i) {
        T t = this.f41776a.get(Integer.valueOf(i));
        if (t != null && uncheckInternal(t, this.f41780e)) {
            onCheckedStateChanged();
        }
    }
}
