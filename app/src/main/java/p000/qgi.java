package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.C2531R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class qgi extends RecyclerView.Adapter<C11476a> {

    /* JADX INFO: renamed from: b */
    public static final String f74398b = "VpAdapter";

    /* JADX INFO: renamed from: a */
    public List<Integer> f74399a = Arrays.asList(Integer.valueOf(C2531R.drawable.img_add_glasses_0), Integer.valueOf(C2531R.drawable.img_add_glasses_1), Integer.valueOf(C2531R.drawable.img_add_glasses_2));

    /* JADX INFO: renamed from: qgi$a */
    public static class C11476a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public pg8 f74400a;

        public C11476a(pg8 binding) {
            super(binding.getRoot());
            this.f74400a = binding;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 999;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C11476a holder, int position) {
        ImageView imageView = holder.f74400a.f70706b;
        List<Integer> list = this.f74399a;
        imageView.setBackgroundResource(list.get(position % list.size()).intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C11476a onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return new C11476a(pg8.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
