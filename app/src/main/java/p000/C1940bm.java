package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.common.bean.RepeatBean;
import java.util.List;

/* JADX INFO: renamed from: bm */
/* JADX INFO: loaded from: classes4.dex */
public class C1940bm extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: e */
    public static final String f14078e = "AlarmRepeatSelectAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f14079a;

    /* JADX INFO: renamed from: b */
    public b f14080b;

    /* JADX INFO: renamed from: c */
    public List<RepeatBean> f14081c;

    /* JADX INFO: renamed from: d */
    public int f14082d = -1;

    /* JADX INFO: renamed from: bm$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RepeatBean f14083a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f14084b;

        public a(final RepeatBean val$repeatBean, final int val$position) {
            this.f14083a = val$repeatBean;
            this.f14084b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            b bVar = C1940bm.this.f14080b;
            if (bVar != null) {
                bVar.click(this.f14083a);
            }
            C1940bm.this.setmSelectedPosition(this.f14084b);
        }
    }

    /* JADX INFO: renamed from: bm$b */
    public interface b {
        void click(RepeatBean repeatBean);
    }

    /* JADX INFO: renamed from: bm$c */
    public static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public tf8 f14086a;

        public c(tf8 binding) {
            super(binding.getRoot());
            this.f14086a = binding;
        }
    }

    public C1940bm(Context context) {
        this.f14079a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f14081c.size();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<RepeatBean> mData) {
        this.f14081c = mData;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(b onItemClickListener) {
        this.f14080b = onItemClickListener;
    }

    public void setmSelectedPosition(int mSelectedPosition) {
        this.f14082d = mSelectedPosition;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb c holder, int position) {
        try {
            tf8 tf8Var = holder.f14086a;
            RepeatBean repeatBean = this.f14081c.get(position);
            tf8Var.f84526c.setText(repeatBean.getRepeatStr());
            if (position == this.f14082d) {
                tf8Var.f84525b.setVisibility(0);
            } else {
                tf8Var.f84525b.setVisibility(8);
            }
            holder.itemView.setOnClickListener(new a(repeatBean, position));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public c onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return new c(tf8.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
