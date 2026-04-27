package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.AITransBean;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.bluetooth.protocol.Command;
import java.util.List;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: classes4.dex */
public class C6045g extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: e */
    public static final int f38089e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f38090f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f38091g = 2;

    /* JADX INFO: renamed from: a */
    public List<AITransBean> f38092a;

    /* JADX INFO: renamed from: b */
    public e f38093b;

    /* JADX INFO: renamed from: c */
    public Context f38094c;

    /* JADX INFO: renamed from: d */
    public int f38095d = -1;

    /* JADX INFO: renamed from: g$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f38096a;

        public a(final c val$headHolder) {
            this.f38096a = val$headHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (ModUtils.bleCore.isConnected()) {
                this.f38096a.f38100a.f81067d.setBackgroundResource(C2531R.drawable.ic_horizontal);
                this.f38096a.f38100a.f81068e.setBackgroundResource(C2531R.drawable.ic_vertical_un);
                ModUtils.sendViaBle().setCameraDirection(Command.Param.CAMERA_HORIZONTAL);
                ToastUtils.showShort(C6045g.this.f38094c.getString(C2531R.string.string_setting_success));
            }
        }
    }

    /* JADX INFO: renamed from: g$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f38098a;

        public b(final c val$headHolder) {
            this.f38098a = val$headHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (ModUtils.bleCore.isConnected()) {
                this.f38098a.f38100a.f81067d.setBackgroundResource(C2531R.drawable.ic_horizontal_un);
                this.f38098a.f38100a.f81068e.setBackgroundResource(C2531R.drawable.ic_vertical);
                ModUtils.sendViaBle().setCameraDirection(Command.Param.CAMERA_VERTICAL);
                ToastUtils.showShort(C6045g.this.f38094c.getString(C2531R.string.string_setting_success));
            }
        }
    }

    /* JADX INFO: renamed from: g$c */
    public static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public sah f38100a;

        public c(sah binding) {
            super(binding.getRoot());
            this.f38100a = binding;
        }
    }

    /* JADX INFO: renamed from: g$d */
    public static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public tah f38101a;

        public d(tah binding) {
            super(binding.getRoot());
            this.f38101a = binding;
        }
    }

    /* JADX INFO: renamed from: g$e */
    public interface e {
        void onItemClick(AITransBean tool);
    }

    /* JADX INFO: renamed from: g$f */
    public static class f extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public rah f38102a;

        public f(rah binding) {
            super(binding.getRoot());
            this.f38102a = binding;
        }
    }

    public C6045g(List<AITransBean> aiToolList, Context context) {
        this.f38092a = aiToolList;
        this.f38094c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(AITransBean aITransBean, View view) {
        e eVar = this.f38093b;
        if (eVar != null) {
            eVar.onItemClick(aITransBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$1(AITransBean aITransBean, View view) {
        e eVar = this.f38093b;
        if (eVar != null) {
            eVar.onItemClick(aITransBean);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f38092a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof c) {
            c cVar = (c) holder;
            int i = this.f38095d;
            if (i == Command.Param.CAMERA_VERTICAL) {
                cVar.f38100a.f81067d.setBackgroundResource(C2531R.drawable.ic_horizontal_un);
                cVar.f38100a.f81068e.setBackgroundResource(C2531R.drawable.ic_vertical);
            } else if (i == Command.Param.CAMERA_HORIZONTAL) {
                cVar.f38100a.f81067d.setBackgroundResource(C2531R.drawable.ic_horizontal);
                cVar.f38100a.f81068e.setBackgroundResource(C2531R.drawable.ic_vertical_un);
            } else {
                cVar.f38100a.f81067d.setBackgroundResource(C2531R.drawable.ic_horizontal_un);
                cVar.f38100a.f81068e.setBackgroundResource(C2531R.drawable.ic_vertical_un);
            }
            cVar.f38100a.f81065b.setOnClickListener(new a(cVar));
            cVar.f38100a.f81066c.setOnClickListener(new b(cVar));
            return;
        }
        if (holder instanceof d) {
            d dVar = (d) holder;
            final AITransBean aITransBean = this.f38092a.get(position);
            AITransBean aITransBean2 = this.f38092a.get(position);
            dVar.f38101a.f84101d.setText(holder.itemView.getContext().getString(aITransBean2.getText()));
            dVar.f38101a.f84099b.setBackgroundResource(aITransBean2.getIconResId());
            dVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f31397a.lambda$onBindViewHolder$0(aITransBean, view);
                }
            });
            return;
        }
        if (holder instanceof f) {
            f fVar = (f) holder;
            final AITransBean aITransBean3 = this.f38092a.get(position);
            AITransBean aITransBean4 = this.f38092a.get(position);
            fVar.f38102a.f77616d.setText(holder.itemView.getContext().getString(aITransBean4.getText()));
            fVar.f38102a.f77614b.setBackgroundResource(aITransBean4.getIconResId());
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34618a.lambda$onBindViewHolder$1(aITransBean3, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        return viewType == 0 ? new c(sah.inflate(layoutInflaterFrom, parent, false)) : viewType == 1 ? new d(tah.inflate(layoutInflaterFrom, parent, false)) : new f(rah.inflate(layoutInflaterFrom, parent, false));
    }

    public void setDirection(int direction) {
        this.f38095d = direction;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(e listener) {
        this.f38093b = listener;
    }

    public void updateData(List<AITransBean> newAiToolList) {
        this.f38092a = newAiToolList;
        notifyDataSetChanged();
    }
}
