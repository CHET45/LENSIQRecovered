package p000;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import p000.p7e;

/* JADX INFO: renamed from: nh */
/* JADX INFO: loaded from: classes3.dex */
@x21({@w21(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AdapterView.class), @w21(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = AdapterView.class)})
@oe8({@ne8(attribute = "android:selectedItemPosition", type = AdapterView.class), @ne8(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = AdapterView.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class C9871nh {

    /* JADX INFO: renamed from: nh$a */
    public interface a {
        void onItemSelected(AdapterView<?> adapterView, View view, int i, long j);
    }

    /* JADX INFO: renamed from: nh$b */
    public static class b implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a */
        public final a f64495a;

        /* JADX INFO: renamed from: b */
        public final c f64496b;

        /* JADX INFO: renamed from: c */
        public final me8 f64497c;

        public b(a aVar, c cVar, me8 me8Var) {
            this.f64495a = aVar;
            this.f64496b = cVar;
            this.f64497c = me8Var;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            a aVar = this.f64495a;
            if (aVar != null) {
                aVar.onItemSelected(adapterView, view, i, j);
            }
            me8 me8Var = this.f64497c;
            if (me8Var != null) {
                me8Var.onChange();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            c cVar = this.f64496b;
            if (cVar != null) {
                cVar.onNothingSelected(adapterView);
            }
            me8 me8Var = this.f64497c;
            if (me8Var != null) {
                me8Var.onChange();
            }
        }
    }

    /* JADX INFO: renamed from: nh$c */
    public interface c {
        void onNothingSelected(AdapterView<?> adapterView);
    }

    @q21(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    public static void setOnItemSelectedListener(AdapterView adapterView, a aVar, c cVar, me8 me8Var) {
        if (aVar == null && cVar == null && me8Var == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new b(aVar, cVar, me8Var));
        }
    }

    @q21({"android:selectedItemPosition"})
    public static void setSelectedItemPosition(AdapterView adapterView, int i) {
        if (adapterView.getSelectedItemPosition() != i) {
            adapterView.setSelection(i);
        }
    }

    @q21({"android:selection"})
    public static void setSelection(AdapterView adapterView, int i) {
        setSelectedItemPosition(adapterView, i);
    }

    @q21({"android:selection", "android:adapter"})
    public static void setSelection(AdapterView adapterView, int i, Adapter adapter) {
        setSelectedItemPosition(adapterView, i, adapter);
    }

    @q21({"android:selectedItemPosition", "android:adapter"})
    public static void setSelectedItemPosition(AdapterView adapterView, int i, Adapter adapter) {
        if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
            adapterView.setSelection(i);
        } else if (adapterView.getSelectedItemPosition() != i) {
            adapterView.setSelection(i);
        }
    }
}
