package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.aichat.C3994a;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.p012ai.AiModelBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: wk */
/* JADX INFO: loaded from: classes6.dex */
public class C14651wk extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a */
    public zde f94451a;

    /* JADX INFO: renamed from: b */
    public List<AiModelBean> f94452b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C3994a.c f94453c;

    /* JADX INFO: renamed from: wk$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f94454a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AiModelBean f94455b;

        public a(int i, AiModelBean aiModelBean) {
            this.f94454a = i;
            this.f94455b = aiModelBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C14651wk.this.f94453c != null) {
                C14651wk.this.f94453c.onItemClick(this.f94454a, this.f94455b);
            }
        }
    }

    /* JADX INFO: renamed from: wk$b */
    public static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public zde f94457a;

        public b(View view) {
            super(view);
        }

        public zde getBinding() {
            return this.f94457a;
        }

        public void setBinding(zde zdeVar) {
            this.f94457a = zdeVar;
        }
    }

    public C14651wk(C3994a.c cVar) {
        this.f94453c = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f94452b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof b) {
            this.f94451a = ((b) viewHolder).f94457a;
            AiModelBean aiModelBean = this.f94452b.get(i);
            this.f94451a.f104867e.setText(aiModelBean.getEnglishName());
            this.f94451a.getRoot().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            if (aiModelBean.isSelected()) {
                this.f94451a.f104865c.setImageResource(C4201R.mipmap.ic_ai_model_selected);
            } else {
                this.f94451a.f104865c.setImageDrawable(null);
            }
            this.f94451a.getRoot().setOnClickListener(new a(i, aiModelBean));
            if (i == this.f94452b.size() - 1) {
                this.f94451a.f104864b.setVisibility(8);
            } else {
                this.f94451a.f104864b.setVisibility(0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup viewGroup, int i) {
        this.f94451a = zde.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        b bVar = new b(this.f94451a.getRoot());
        bVar.setBinding(this.f94451a);
        return bVar;
    }

    @igg({"NotifyDataSetChanged"})
    public void setDatas(List<AiModelBean> list) {
        this.f94452b.clear();
        this.f94452b.addAll(list);
        notifyDataSetChanged();
    }
}
