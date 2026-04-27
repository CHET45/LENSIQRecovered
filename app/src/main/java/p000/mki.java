package p000;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mki<T> extends RecyclerView.Adapter<nki> {

    /* JADX INFO: renamed from: d */
    public static final int f61270d = -234234;

    /* JADX INFO: renamed from: e */
    public static final int f61271e = -23674632;

    /* JADX INFO: renamed from: a */
    public int f61272a = 120;

    /* JADX INFO: renamed from: b */
    public int f61273b = 2;

    /* JADX INFO: renamed from: c */
    public hvd<T> f61274c;

    /* JADX INFO: renamed from: a */
    public final int m17363a(int position) {
        if (position < this.f61273b) {
            return 0;
        }
        int iMo9239d = mo9239d();
        int i = this.f61273b;
        return position >= iMo9239d + i ? mo9239d() - 1 : position - i;
    }

    /* JADX INFO: renamed from: b */
    public int m17364b() {
        return this.f61272a;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo9238c(T t);

    /* JADX INFO: renamed from: d */
    public abstract int mo9239d();

    /* JADX INFO: renamed from: e */
    public abstract T mo9240e(int position);

    /* JADX INFO: renamed from: f */
    public abstract void mo17365f(@efb nki holder, int position, T t);

    /* JADX INFO: renamed from: g */
    public abstract nki mo17366g(@efb ViewGroup parent, int viewType);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final int getItemCount() {
        return mo9239d() + (this.f61273b * 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final int getItemViewType(int position) {
        return position < this.f61273b ? f61270d : position > (getItemCount() + (-1)) - this.f61273b ? f61271e : getWheelItemViewType(position - 1);
    }

    public hvd<T> getPicker() {
        return this.f61274c;
    }

    public int getWheelItemViewType(int position) {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo17367h(RecyclerView.ViewHolder holder, float progress);

    /* JADX INFO: renamed from: i */
    public abstract void mo9241i(RecyclerView.ViewHolder holder, int position, T t);

    /* JADX INFO: renamed from: j */
    public void m17368j(hvd<T> picker, int itemHeight, int itemMaxShowSize) {
        this.f61272a = itemHeight;
        this.f61273b = (itemMaxShowSize - 1) / 2;
        this.f61274c = picker;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final void onBindViewHolder(@efb nki viewHolder, int position) {
        if (getItemViewType(position) == -23674632 || getItemViewType(position) == -234234) {
            return;
        }
        int iM17363a = m17363a(position);
        mo17365f(viewHolder, iM17363a, mo9240e(iM17363a));
        this.f61274c.m12632f(viewHolder.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    @Deprecated
    public final nki onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return viewType == -234234 ? new nki(new LinearLayout(parent.getContext())).m17980a(this.f61272a) : viewType == -23674632 ? new nki(new LinearLayout(parent.getContext())).m17980a(this.f61272a) : mo17366g(parent, viewType).m17980a(this.f61272a);
    }
}
