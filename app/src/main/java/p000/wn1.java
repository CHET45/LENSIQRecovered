package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.callvideo.bean.CallTransMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class wn1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: h */
    public static final String f94795h = "CallVideoAdapter";

    /* JADX INFO: renamed from: i */
    public static final int f94796i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f94797j = 1;

    /* JADX INFO: renamed from: a */
    public final Context f94798a;

    /* JADX INFO: renamed from: c */
    public InterfaceC14696a f94800c;

    /* JADX INFO: renamed from: e */
    public CallTransMessage f94802e;

    /* JADX INFO: renamed from: f */
    public r8h f94803f;

    /* JADX INFO: renamed from: g */
    public t8h f94804g;

    /* JADX INFO: renamed from: b */
    public ArrayList<CallTransMessage> f94799b = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public int f94801d = -1;

    /* JADX INFO: renamed from: wn1$a */
    public interface InterfaceC14696a {
        void onItemLongClick(View view, int i, CallTransMessage callTransMessage, boolean z);
    }

    /* JADX INFO: renamed from: wn1$b */
    public static class C14697b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public r8h f94805a;

        public C14697b(@efb View view) {
            super(view);
        }

        public r8h getBinding() {
            return this.f94805a;
        }

        public void setBinding(r8h r8hVar) {
            this.f94805a = r8hVar;
        }
    }

    /* JADX INFO: renamed from: wn1$c */
    public static class C14698c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public t8h f94806a;

        public C14698c(@efb View view) {
            super(view);
        }

        public t8h getBinding() {
            return this.f94806a;
        }

        public void setBinding(t8h t8hVar) {
            this.f94806a = t8hVar;
        }
    }

    public wn1(Context context) {
        this.f94798a = context;
    }

    public void addData(CallTransMessage callTransMessage) {
        if (callTransMessage != null) {
            this.f94799b.add(callTransMessage);
            notifyItemInserted(this.f94799b.size() - 1);
        }
    }

    public ArrayList<CallTransMessage> getData() {
        return this.f94799b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f94799b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (mc2.isEmpty(this.f94799b)) {
            return 0;
        }
        return this.f94799b.get(i).getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder viewHolder, int i) {
        CallTransMessage callTransMessage = this.f94799b.get(i);
        this.f94802e = callTransMessage;
        if (viewHolder instanceof C14698c) {
            t8h t8hVar = ((C14698c) viewHolder).f94806a;
            this.f94804g = t8hVar;
            t8hVar.f83999e.setText(callTransMessage.getResult());
            this.f94804g.f84000f.setText(this.f94802e.getTransResult());
            return;
        }
        if (viewHolder instanceof C14697b) {
            r8h r8hVar = ((C14697b) viewHolder).f94805a;
            this.f94803f = r8hVar;
            r8hVar.f77405e.setText(callTransMessage.getResult());
            this.f94803f.f77406f.setText(this.f94802e.getTransResult());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            this.f94804g = t8h.inflate(layoutInflaterFrom, viewGroup, false);
            C14698c c14698c = new C14698c(this.f94804g.getRoot());
            c14698c.setBinding(this.f94804g);
            return c14698c;
        }
        this.f94803f = r8h.inflate(layoutInflaterFrom, viewGroup, false);
        C14697b c14697b = new C14697b(this.f94803f.getRoot());
        c14697b.setBinding(this.f94803f);
        return c14697b;
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<CallTransMessage> list) {
        this.f94799b.addAll(list);
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(InterfaceC14696a interfaceC14696a) {
        this.f94800c = interfaceC14696a;
    }

    public void updateMessage(CallTransMessage callTransMessage, int i) {
        ArrayList<CallTransMessage> arrayList = this.f94799b;
        arrayList.remove(arrayList.get(i));
        this.f94799b.add(i, callTransMessage);
        notifyItemChanged(i);
    }
}
