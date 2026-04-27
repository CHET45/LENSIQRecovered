package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.bean.TransLanguageData;
import com.watchfun.transcommon.utils.AiLangUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ntc extends RecyclerView.Adapter<C10055a> {

    /* JADX INFO: renamed from: e */
    public static final String f65657e = "PhotoLanguageAdapter";

    /* JADX INFO: renamed from: a */
    public List<TransLanguageData> f65658a;

    /* JADX INFO: renamed from: b */
    public final Context f65659b;

    /* JADX INFO: renamed from: c */
    public int f65660c = -1;

    /* JADX INFO: renamed from: d */
    public InterfaceC10056b f65661d;

    /* JADX INFO: renamed from: ntc$a */
    public static class C10055a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public lg8 f65662a;

        public C10055a(lg8 lg8Var) {
            super(lg8Var.getRoot());
            this.f65662a = lg8Var;
        }
    }

    /* JADX INFO: renamed from: ntc$b */
    public interface InterfaceC10056b {
        void click(int i, TransLanguageData transLanguageData);
    }

    public ntc(Context context) {
        this.f65659b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f65658a.size();
    }

    public List<TransLanguageData> getLanguages() {
        return this.f65658a;
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<TransLanguageData> list) {
        this.f65658a = list;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(InterfaceC10056b interfaceC10056b) {
        this.f65661d = interfaceC10056b;
    }

    public void setSelectPos(int i) {
        this.f65660c = i;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C10055a c10055a, @igg({"RecyclerView"}) int i) {
        lg8 lg8Var = c10055a.f65662a;
        TransLanguageData transLanguageData = this.f65658a.get(i);
        if (i == 0 || i == this.f65658a.size() - 1) {
            lg8Var.f57501b.setText("");
        } else {
            lg8Var.f57501b.setText(AiLangUtil.getValue(this.f65659b, transLanguageData.getKeyName()));
        }
        if (this.f65660c == i) {
            lg8Var.f57501b.setTextColor(-1);
        } else {
            lg8Var.f57501b.setTextColor(this.f65659b.getColor(C4201R.color.color_b4));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C10055a onCreateViewHolder(@efb ViewGroup viewGroup, int i) {
        lg8 lg8VarInflate = lg8.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        int height = viewGroup.getHeight();
        C10055a c10055a = new C10055a(lg8VarInflate);
        c10055a.itemView.getLayoutParams().height = height / 3;
        return c10055a;
    }
}
