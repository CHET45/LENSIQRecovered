package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.platon.offlinesdk.C3880R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class cu8 extends RecyclerView.Adapter<C4506c> {

    /* JADX INFO: renamed from: d */
    public static final String f27622d = "LanguageDownloadAdapter";

    /* JADX INFO: renamed from: a */
    public List<vk4> f27623a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Context f27624b;

    /* JADX INFO: renamed from: c */
    public InterfaceC4505b f27625c;

    /* JADX INFO: renamed from: cu8$a */
    public class ViewOnClickListenerC4504a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vk4 f27626a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f27627b;

        public ViewOnClickListenerC4504a(vk4 vk4Var, int i) {
            this.f27626a = vk4Var;
            this.f27627b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (cu8.this.f27625c != null) {
                cu8.this.f27625c.onClick(this.f27626a, this.f27627b);
            }
        }
    }

    /* JADX INFO: renamed from: cu8$b */
    public interface InterfaceC4505b {
        void onClick(vk4 vk4Var, int i);
    }

    /* JADX INFO: renamed from: cu8$c */
    public class C4506c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f27629a;

        /* JADX INFO: renamed from: b */
        public TextView f27630b;

        /* JADX INFO: renamed from: c */
        public TextView f27631c;

        public C4506c(@efb View view) {
            super(view);
            this.f27629a = (TextView) view.findViewById(C3880R.id.tv_name);
            this.f27630b = (TextView) view.findViewById(C3880R.id.tv_status);
            this.f27631c = (TextView) view.findViewById(C3880R.id.tv_progress);
        }
    }

    public cu8(Context context, List<vk4> list) {
        this.f27624b = context;
        setData(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27623a.size();
    }

    public void setData(List<vk4> list) {
        this.f27623a.clear();
        this.f27623a.addAll(list);
        notifyDataSetChanged();
    }

    public void setListener(InterfaceC4505b interfaceC4505b) {
        this.f27625c = interfaceC4505b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@efb RecyclerView.ViewHolder viewHolder, int i, @efb List list) {
        onBindViewHolder((C4506c) viewHolder, i, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C4506c onCreateViewHolder(@efb ViewGroup viewGroup, int i) {
        return new C4506c(LayoutInflater.from(this.f27624b).inflate(C3880R.layout.rv_language_download, viewGroup, false));
    }

    public void onBindViewHolder(@efb C4506c c4506c, int i, @efb List<Object> list) {
        super.onBindViewHolder(c4506c, i, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C4506c c4506c, int i) {
        vk4 vk4Var = this.f27623a.get(i);
        c4506c.f27629a.setText(vk4Var.getName());
        c4506c.f27631c.setText(vk4Var.getProgress() + yv7.f103133a);
        if (vk4Var.getDownloadStatus() == zm4.DOWNLOADING) {
            c4506c.f27630b.setText(this.f27624b.getString(C3880R.string.download_status_downloading));
        } else if (vk4Var.getDownloadStatus() == zm4.SUCCESS) {
            c4506c.f27630b.setText(this.f27624b.getString(C3880R.string.download_status_success));
        } else if (vk4Var.getDownloadStatus() == zm4.FAILED) {
            c4506c.f27630b.setText(this.f27624b.getString(C3880R.string.download_status_fail));
        } else if (vk4Var.getDownloadStatus() == zm4.UNZIPING) {
            c4506c.f27630b.setText(this.f27624b.getString(C3880R.string.download_status_unziping));
        } else {
            c4506c.f27630b.setText(this.f27624b.getString(C3880R.string.download_status_not_start));
        }
        c4506c.f27630b.setOnClickListener(new ViewOnClickListenerC4504a(vk4Var, i));
    }
}
