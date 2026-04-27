package p000;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.transcommon.C4201R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class vgh extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: q */
    public static final String f91121q = "TranslationMachinePublicAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f91122a;

    /* JADX INFO: renamed from: c */
    public InterfaceC14064c f91124c;

    /* JADX INFO: renamed from: d */
    public String f91125d;

    /* JADX INFO: renamed from: e */
    public hbh f91126e;

    /* JADX INFO: renamed from: f */
    public int f91127f;

    /* JADX INFO: renamed from: g */
    public InterfaceC14063b f91128g;

    /* JADX INFO: renamed from: h */
    public int f91129h;

    /* JADX INFO: renamed from: i */
    public cbh f91130i;

    /* JADX INFO: renamed from: j */
    public boolean f91131j;

    /* JADX INFO: renamed from: n */
    public boolean f91135n;

    /* JADX INFO: renamed from: b */
    public ArrayList<ibh> f91123b = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public int f91132k = 1;

    /* JADX INFO: renamed from: l */
    public int f91133l = 2;

    /* JADX INFO: renamed from: m */
    public boolean f91134m = false;

    /* JADX INFO: renamed from: o */
    public boolean f91136o = false;

    /* JADX INFO: renamed from: p */
    public int f91137p = -1;

    /* JADX INFO: renamed from: vgh$a */
    public class ViewOnClickListenerC14062a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ibh f91138a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f91139b;

        public ViewOnClickListenerC14062a(final ibh val$bean, final int val$position) {
            this.f91138a = val$bean;
            this.f91139b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            vgh.this.f91134m = false;
            this.f91138a.setSelect(!r2.isSelect());
            vgh.this.notifyItemChanged(this.f91139b);
            vgh.this.f91128g.click(vgh.this.f91134m);
        }
    }

    /* JADX INFO: renamed from: vgh$b */
    public interface InterfaceC14063b {
        void click(boolean isAllSelect);

        void onItemChatPlayVoice(View v, int postion, hbh xfAiMessage);

        void onItemLongClick(View v, int postion, hbh xfAiMessage, boolean isEditMode);
    }

    /* JADX INFO: renamed from: vgh$c */
    public interface InterfaceC14064c {
        void click(int position);
    }

    /* JADX INFO: renamed from: vgh$d */
    public static class C14065d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public cbh f91141a;

        public C14065d(View itemView) {
            super(itemView);
        }

        public cbh getBinding() {
            return this.f91141a;
        }

        public void setBinding(cbh binding) {
            this.f91141a = binding;
        }
    }

    public vgh(Context context, RecyclerView recyclerView, fbh xfMessageDao, boolean isTopList) {
        this.f91122a = context;
        this.f91135n = isTopList;
    }

    public void addData(hbh message) {
        if (message != null) {
            this.f91136o = false;
            this.f91123b.add(new ibh(false, message));
            if (this.f91123b.size() > 1) {
                notifyItemChanged(this.f91123b.size() - 2);
            }
            notifyItemInserted(this.f91123b.size() - 1);
        }
    }

    public void clearData() {
        this.f91123b.clear();
        notifyDataSetChanged();
    }

    public ArrayList<ibh> getData() {
        return this.f91123b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f91123b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (!mc2.isEmpty(this.f91123b)) {
            hbh xfTransFreelyMessage = this.f91123b.get(position).getXfTransFreelyMessage();
            this.f91127f = xfTransFreelyMessage.getType();
            this.f91129h = xfTransFreelyMessage.getMultipleOptions();
        }
        return this.f91127f == 1 ? this.f91132k : this.f91133l;
    }

    public List<hbh> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<ibh> arrayList2 = this.f91123b;
        if (arrayList2 != null) {
            for (ibh ibhVar : arrayList2) {
                if (ibhVar.isSelect()) {
                    arrayList.add(ibhVar.getXfTransFreelyMessage());
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, @igg({"RecyclerView"}) int position) {
        ibh ibhVar = this.f91123b.get(position);
        hbh xfTransFreelyMessage = ibhVar.getXfTransFreelyMessage();
        this.f91126e = xfTransFreelyMessage;
        cbh cbhVar = ((C14065d) holder).f91141a;
        this.f91130i = cbhVar;
        if (this.f91135n) {
            cbhVar.f16200e.setText(xfTransFreelyMessage.getResult());
            this.f91130i.f16200e.setTextColor(Color.parseColor("#999999"));
        } else {
            cbhVar.f16200e.setText(xfTransFreelyMessage.getTransResult());
            this.f91130i.f16200e.setTextColor(Color.parseColor("#FFFFFF"));
        }
        this.f91130i.f16200e.setTypeface(Typeface.DEFAULT);
        this.f91130i.f16200e.setAlpha(1.0f);
        if (this.f91131j) {
            this.f91130i.f16198c.setVisibility(0);
            if (ibhVar.isSelect()) {
                this.f91130i.f16198c.setBackgroundResource(C4201R.drawable.ic_edit_select);
            } else {
                this.f91130i.f16198c.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
            }
        } else {
            this.f91130i.f16198c.setVisibility(8);
        }
        this.f91130i.f16198c.setOnClickListener(new ViewOnClickListenerC14062a(ibhVar, position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        this.f91130i = cbh.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        C14065d c14065d = new C14065d(this.f91130i.getRoot());
        c14065d.setBinding(this.f91130i);
        return c14065d;
    }

    public void removeSelectData() {
        ArrayList<ibh> arrayList = this.f91123b;
        if (arrayList != null) {
            Iterator<ibh> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().isSelect()) {
                    it.remove();
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setAllSelectState(boolean isSelect) {
        this.f91134m = isSelect;
        ArrayList<ibh> arrayList = this.f91123b;
        if (arrayList != null) {
            Iterator<ibh> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setSelect(isSelect);
            }
        }
        notifyDataSetChanged();
    }

    public void setBeginning(boolean beginning) {
        this.f91136o = beginning;
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<hbh> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<hbh> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ibh(false, it.next()));
        }
        this.f91123b.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f91131j = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setItemClickListener(InterfaceC14063b myItemClickListener) {
        this.f91128g = myItemClickListener;
    }

    public void setLightMode(boolean isTopList) {
        this.f91135n = isTopList;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(InterfaceC14064c onItemClickListener) {
        this.f91124c = onItemClickListener;
    }

    public void setScrollToPosition(int position) {
        this.f91137p = position;
    }

    public void updateChangedItemBean(hbh bean, int position) {
        this.f91123b.set(position, new ibh(false, bean));
        notifyItemChanged(position);
    }

    public void updateMessage(hbh message, int position) {
        ArrayList<ibh> arrayList = this.f91123b;
        arrayList.remove(arrayList.get(position));
        this.f91123b.add(getItemCount() - 1, new ibh(false, message));
        notifyItemChanged(position);
    }

    public void addData(int position, hbh message) {
        if (message != null) {
            this.f91136o = false;
            this.f91123b.add(position, new ibh(false, message));
            if (this.f91123b.size() > 1) {
                notifyItemChanged(this.f91123b.size() - 2);
            }
            notifyItemInserted(this.f91123b.size() - 1);
        }
    }
}
