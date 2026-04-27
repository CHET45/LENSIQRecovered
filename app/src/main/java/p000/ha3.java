package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import p000.p7e;
import p000.xa3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ha3 extends BaseAdapter implements Filterable, xa3.InterfaceC15012a {

    /* JADX INFO: renamed from: H */
    @Deprecated
    public static final int f42983H = 1;

    /* JADX INFO: renamed from: L */
    public static final int f42984L = 2;

    /* JADX INFO: renamed from: C */
    @p7e({p7e.EnumC10826a.f69935b})
    public xa3 f42985C;

    /* JADX INFO: renamed from: F */
    @p7e({p7e.EnumC10826a.f69935b})
    public FilterQueryProvider f42986F;

    /* JADX INFO: renamed from: a */
    @p7e({p7e.EnumC10826a.f69935b})
    public boolean f42987a;

    /* JADX INFO: renamed from: b */
    @p7e({p7e.EnumC10826a.f69935b})
    public boolean f42988b;

    /* JADX INFO: renamed from: c */
    @p7e({p7e.EnumC10826a.f69935b})
    public Cursor f42989c;

    /* JADX INFO: renamed from: d */
    @p7e({p7e.EnumC10826a.f69935b})
    public Context f42990d;

    /* JADX INFO: renamed from: e */
    @p7e({p7e.EnumC10826a.f69935b})
    public int f42991e;

    /* JADX INFO: renamed from: f */
    @p7e({p7e.EnumC10826a.f69935b})
    public C6762a f42992f;

    /* JADX INFO: renamed from: m */
    @p7e({p7e.EnumC10826a.f69935b})
    public DataSetObserver f42993m;

    /* JADX INFO: renamed from: ha3$a */
    public class C6762a extends ContentObserver {
        public C6762a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            ha3.this.m12296c();
        }
    }

    /* JADX INFO: renamed from: ha3$b */
    public class C6763b extends DataSetObserver {
        public C6763b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ha3 ha3Var = ha3.this;
            ha3Var.f42987a = true;
            ha3Var.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ha3 ha3Var = ha3.this;
            ha3Var.f42987a = false;
            ha3Var.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public ha3(Context context, Cursor cursor) {
        m12294a(context, cursor, 1);
    }

    /* JADX INFO: renamed from: a */
    public void m12294a(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.f42988b = true;
        } else {
            this.f42988b = false;
        }
        boolean z = cursor != null;
        this.f42989c = cursor;
        this.f42987a = z;
        this.f42990d = context;
        this.f42991e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f42992f = new C6762a();
            this.f42993m = new C6763b();
        } else {
            this.f42992f = null;
            this.f42993m = null;
        }
        if (z) {
            C6762a c6762a = this.f42992f;
            if (c6762a != null) {
                cursor.registerContentObserver(c6762a);
            }
            DataSetObserver dataSetObserver = this.f42993m;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public void m12295b(Context context, Cursor cursor, boolean z) {
        m12294a(context, cursor, z ? 1 : 2);
    }

    public abstract void bindView(View view, Context context, Cursor cursor);

    /* JADX INFO: renamed from: c */
    public void m12296c() {
        Cursor cursor;
        if (!this.f42988b || (cursor = this.f42989c) == null || cursor.isClosed()) {
            return;
        }
        this.f42987a = this.f42989c.requery();
    }

    public void changeCursor(Cursor cursor) {
        Cursor cursorSwapCursor = swapCursor(cursor);
        if (cursorSwapCursor != null) {
            cursorSwapCursor.close();
        }
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f42987a || (cursor = this.f42989c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // p000.xa3.InterfaceC15012a
    public Cursor getCursor() {
        return this.f42989c;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f42987a) {
            return null;
        }
        this.f42989c.moveToPosition(i);
        if (view == null) {
            view = newDropDownView(this.f42990d, this.f42989c, viewGroup);
        }
        bindView(view, this.f42990d, this.f42989c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f42985C == null) {
            this.f42985C = new xa3(this);
        }
        return this.f42985C;
    }

    public FilterQueryProvider getFilterQueryProvider() {
        return this.f42986F;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f42987a || (cursor = this.f42989c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f42989c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f42987a && (cursor = this.f42989c) != null && cursor.moveToPosition(i)) {
            return this.f42989c.getLong(this.f42991e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f42987a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f42989c.moveToPosition(i)) {
            if (view == null) {
                view = newView(this.f42990d, this.f42989c, viewGroup);
            }
            bindView(view, this.f42990d, this.f42989c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return newView(context, cursor, viewGroup);
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewGroup);

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f42986F;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f42989c;
    }

    public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) {
        this.f42986F = filterQueryProvider;
    }

    public Cursor swapCursor(Cursor cursor) {
        Cursor cursor2 = this.f42989c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C6762a c6762a = this.f42992f;
            if (c6762a != null) {
                cursor2.unregisterContentObserver(c6762a);
            }
            DataSetObserver dataSetObserver = this.f42993m;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f42989c = cursor;
        if (cursor != null) {
            C6762a c6762a2 = this.f42992f;
            if (c6762a2 != null) {
                cursor.registerContentObserver(c6762a2);
            }
            DataSetObserver dataSetObserver2 = this.f42993m;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f42991e = cursor.getColumnIndexOrThrow("_id");
            this.f42987a = true;
            notifyDataSetChanged();
        } else {
            this.f42991e = -1;
            this.f42987a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public ha3(Context context, Cursor cursor, boolean z) {
        m12294a(context, cursor, z ? 1 : 2);
    }

    public ha3(Context context, Cursor cursor, int i) {
        m12294a(context, cursor, i);
    }
}
