package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import p000.drb;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class erb<T> extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public List<T> f33892a;

    /* JADX INFO: renamed from: b */
    public drb.AbstractC4925a f33893b;

    /* JADX INFO: renamed from: c */
    public final Context f33894c;

    /* JADX INFO: renamed from: d */
    public final int f33895d;

    /* JADX INFO: renamed from: e */
    public final int f33896e;

    /* JADX INFO: renamed from: f */
    public final int f33897f;

    /* JADX INFO: renamed from: m */
    public final LayoutInflater f33898m;

    /* JADX INFO: renamed from: erb$a */
    public class C5451a extends drb.AbstractC4925a {
        public C5451a() {
        }

        @Override // p000.drb.AbstractC4925a
        public void onChanged(drb drbVar) {
            erb.this.notifyDataSetChanged();
        }

        @Override // p000.drb.AbstractC4925a
        public void onItemRangeChanged(drb drbVar, int i, int i2) {
            erb.this.notifyDataSetChanged();
        }

        @Override // p000.drb.AbstractC4925a
        public void onItemRangeInserted(drb drbVar, int i, int i2) {
            erb.this.notifyDataSetChanged();
        }

        @Override // p000.drb.AbstractC4925a
        public void onItemRangeMoved(drb drbVar, int i, int i2, int i3) {
            erb.this.notifyDataSetChanged();
        }

        @Override // p000.drb.AbstractC4925a
        public void onItemRangeRemoved(drb drbVar, int i, int i2) {
            erb.this.notifyDataSetChanged();
        }
    }

    public erb(Context context, List<T> list, int i, int i2, int i3) {
        this.f33894c = context;
        this.f33896e = i;
        this.f33895d = i2;
        this.f33897f = i3;
        this.f33898m = i == 0 ? null : (LayoutInflater) context.getSystemService("layout_inflater");
        setList(list);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f33892a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getViewForResource(this.f33895d, i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f33892a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return getViewForResource(this.f33896e, i, view, viewGroup);
    }

    public View getViewForResource(int i, int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = i == 0 ? new TextView(this.f33894c) : this.f33898m.inflate(i, viewGroup, false);
        }
        int i3 = this.f33897f;
        TextView textView = (TextView) (i3 == 0 ? view : view.findViewById(i3));
        T t = this.f33892a.get(i2);
        textView.setText(t instanceof CharSequence ? (CharSequence) t : String.valueOf(t));
        return view;
    }

    public void setList(List<T> list) {
        List<T> list2 = this.f33892a;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof drb) {
            ((drb) list2).removeOnListChangedCallback(this.f33893b);
        }
        this.f33892a = list;
        if (list instanceof drb) {
            if (this.f33893b == null) {
                this.f33893b = new C5451a();
            }
            ((drb) this.f33892a).addOnListChangedCallback(this.f33893b);
        }
        notifyDataSetChanged();
    }
}
