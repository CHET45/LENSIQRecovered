package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.voicenotes.database.VoiceNotesBean;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class nfi extends RecyclerView.Adapter<C9866c> {

    /* JADX INFO: renamed from: e */
    public static final String f64451e = "VoiceNotesAdapter";

    /* JADX INFO: renamed from: a */
    public List<VoiceNotesBean> f64452a;

    /* JADX INFO: renamed from: b */
    public final Context f64453b;

    /* JADX INFO: renamed from: c */
    public InterfaceC9865b f64454c;

    /* JADX INFO: renamed from: d */
    public InterfaceC9864a f64455d;

    /* JADX INFO: renamed from: nfi$a */
    public interface InterfaceC9864a {
        void onItemClick(int i);
    }

    /* JADX INFO: renamed from: nfi$b */
    public interface InterfaceC9865b {
        void onItemLongClick(int i);
    }

    /* JADX INFO: renamed from: nfi$c */
    public static class C9866c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public bg8 f64456a;

        public C9866c(bg8 bg8Var) {
            super(bg8Var.getRoot());
            this.f64456a = bg8Var;
        }
    }

    public nfi(Context context) {
        this.f64453b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        this.f64455d.onItemClick(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onBindViewHolder$1(int i, View view) {
        this.f64454c.onItemLongClick(i);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f64452a.size();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<VoiceNotesBean> list) {
        this.f64452a = list;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(InterfaceC9864a interfaceC9864a) {
        this.f64455d = interfaceC9864a;
    }

    public void setOnItemLongClickListener(InterfaceC9865b interfaceC9865b) {
        this.f64454c = interfaceC9865b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C9866c c9866c, final int i) {
        try {
            bg8 bg8Var = c9866c.f64456a;
            VoiceNotesBean voiceNotesBean = this.f64452a.get(i);
            if (!TextUtils.isEmpty(voiceNotesBean.getTitle())) {
                bg8Var.f13683e.setText(voiceNotesBean.getTitle());
            }
            if (TextUtils.isEmpty(voiceNotesBean.getContent())) {
                bg8Var.f13680b.setText(this.f64453b.getString(C4201R.string.string_empty_content));
            } else {
                bg8Var.f13680b.setText(voiceNotesBean.getContent());
            }
            if (!TextUtils.isEmpty(voiceNotesBean.getCreateTime())) {
                bg8Var.f13681c.setText(AppUtils.getCollectTime(Long.parseLong(voiceNotesBean.getCreateTime())));
                bg8Var.f13682d.setText(AppUtils.secondsToHMS(voiceNotesBean.getRecordTime()));
            }
            if (this.f64455d != null) {
                yi9.m26090d(f64451e, "onBindViewHolder mOnItemClickListener: " + i);
                c9866c.itemView.setOnClickListener(new View.OnClickListener() { // from class: lfi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f57487a.lambda$onBindViewHolder$0(i, view);
                    }
                });
            }
            if (this.f64454c != null) {
                yi9.m26090d(f64451e, "onBindViewHolder mOnItemLongClickListener: " + i);
                c9866c.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: mfi
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return this.f60904a.lambda$onBindViewHolder$1(i, view);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C9866c onCreateViewHolder(@efb ViewGroup viewGroup, int i) {
        return new C9866c(bg8.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
