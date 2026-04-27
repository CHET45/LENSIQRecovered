package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;

/* JADX INFO: loaded from: classes4.dex */
public class rgi extends RecyclerView.Adapter<C12085a> {

    /* JADX INFO: renamed from: b */
    public static final String f78276b = "VpPositionAdapter";

    /* JADX INFO: renamed from: a */
    public int f78277a = 0;

    /* JADX INFO: renamed from: rgi$a */
    public static class C12085a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public qg8 f78278a;

        public C12085a(qg8 binding) {
            super(binding.getRoot());
            this.f78278a = binding;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 3;
    }

    public void setSelectPosition(int selectPosition) {
        this.f78277a = selectPosition;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C12085a holder, int position) {
        if (position == this.f78277a % 3) {
            holder.f78278a.f74381b.setBackgroundResource(C2531R.drawable.bg_d9d9d9_999);
        } else {
            holder.f78278a.f74381b.setBackgroundResource(C2531R.drawable.bg_d9d9d9_70_999);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C12085a onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return new C12085a(qg8.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
