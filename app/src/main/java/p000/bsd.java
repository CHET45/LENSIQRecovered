package p000;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageDao;
import com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageSelect;
import com.eyevue.glassapp.database.realtimetranslation.RealTimeMessageTb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bsd extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: q */
    public static final String f14666q = "TranslationMachineAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f14667a;

    /* JADX INFO: renamed from: c */
    public InterfaceC2036c f14669c;

    /* JADX INFO: renamed from: d */
    public String f14670d;

    /* JADX INFO: renamed from: e */
    public RealTimeMessageTb f14671e;

    /* JADX INFO: renamed from: f */
    public int f14672f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2035b f14673g;

    /* JADX INFO: renamed from: h */
    public int f14674h;

    /* JADX INFO: renamed from: i */
    public mg8 f14675i;

    /* JADX INFO: renamed from: j */
    public boolean f14676j;

    /* JADX INFO: renamed from: n */
    public boolean f14680n;

    /* JADX INFO: renamed from: b */
    public ArrayList<RealTimeMessageSelect> f14668b = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public int f14677k = 1;

    /* JADX INFO: renamed from: l */
    public int f14678l = 2;

    /* JADX INFO: renamed from: m */
    public boolean f14679m = false;

    /* JADX INFO: renamed from: o */
    public boolean f14681o = false;

    /* JADX INFO: renamed from: p */
    public int f14682p = -1;

    /* JADX INFO: renamed from: bsd$a */
    public class ViewOnClickListenerC2034a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RealTimeMessageSelect f14683a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f14684b;

        public ViewOnClickListenerC2034a(final RealTimeMessageSelect val$bean, final int val$position) {
            this.f14683a = val$bean;
            this.f14684b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            bsd.this.f14679m = false;
            this.f14683a.setSelect(!r2.isSelect());
            bsd.this.notifyItemChanged(this.f14684b);
            bsd.this.f14673g.click(bsd.this.f14679m);
        }
    }

    /* JADX INFO: renamed from: bsd$b */
    public interface InterfaceC2035b {
        void click(boolean isAllSelect);

        void onItemChatPlayVoice(View v, int postion, RealTimeMessageTb xfAiMessage);

        void onItemLongClick(View v, int postion, RealTimeMessageTb xfAiMessage, boolean isEditMode);
    }

    /* JADX INFO: renamed from: bsd$c */
    public interface InterfaceC2036c {
        void click(int position);
    }

    /* JADX INFO: renamed from: bsd$d */
    public static class C2037d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public mg8 f14686a;

        public C2037d(View itemView) {
            super(itemView);
        }

        public mg8 getBinding() {
            return this.f14686a;
        }

        public void setBinding(mg8 binding) {
            this.f14686a = binding;
        }
    }

    public bsd(Context context, RecyclerView recyclerView, RealTimeMessageDao xfMessageDao, boolean isTopList) {
        this.f14667a = context;
        this.f14680n = isTopList;
    }

    public void addData(RealTimeMessageTb message) {
        if (message != null) {
            this.f14681o = false;
            this.f14668b.add(new RealTimeMessageSelect(false, message));
            if (this.f14668b.size() > 1) {
                notifyItemChanged(this.f14668b.size() - 2);
            }
            notifyItemInserted(this.f14668b.size() - 1);
        }
    }

    public void clearData() {
        this.f14668b.clear();
        notifyDataSetChanged();
    }

    public ArrayList<RealTimeMessageSelect> getData() {
        return this.f14668b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f14668b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (!nc2.isEmpty(this.f14668b)) {
            RealTimeMessageTb xfTransFreelyMessage = this.f14668b.get(position).getXfTransFreelyMessage();
            this.f14672f = xfTransFreelyMessage.getType();
            this.f14674h = xfTransFreelyMessage.getMultipleOptions();
        }
        int i = this.f14672f;
        int i2 = this.f14677k;
        return i == i2 ? i2 : this.f14678l;
    }

    public List<RealTimeMessageTb> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<RealTimeMessageSelect> arrayList2 = this.f14668b;
        if (arrayList2 != null) {
            for (RealTimeMessageSelect realTimeMessageSelect : arrayList2) {
                if (realTimeMessageSelect.isSelect()) {
                    arrayList.add(realTimeMessageSelect.getXfTransFreelyMessage());
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, @igg({"RecyclerView"}) int position) {
        RealTimeMessageSelect realTimeMessageSelect = this.f14668b.get(position);
        RealTimeMessageTb xfTransFreelyMessage = realTimeMessageSelect.getXfTransFreelyMessage();
        this.f14671e = xfTransFreelyMessage;
        mg8 mg8Var = ((C2037d) holder).f14686a;
        this.f14675i = mg8Var;
        if (this.f14680n) {
            mg8Var.f60963e.setText(xfTransFreelyMessage.getResult());
            this.f14675i.f60963e.setTextColor(Color.parseColor("#9EA7A8"));
        } else {
            mg8Var.f60963e.setText(xfTransFreelyMessage.getTransResult());
            this.f14675i.f60963e.setTextColor(Color.parseColor("#E6EEEF"));
        }
        this.f14675i.f60963e.setTypeface(Typeface.DEFAULT);
        this.f14675i.f60963e.setAlpha(1.0f);
        this.f14675i.f60961c.setOnClickListener(new ViewOnClickListenerC2034a(realTimeMessageSelect, position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        this.f14675i = mg8.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        C2037d c2037d = new C2037d(this.f14675i.getRoot());
        c2037d.setBinding(this.f14675i);
        return c2037d;
    }

    public void removeSelectData() {
        ArrayList<RealTimeMessageSelect> arrayList = this.f14668b;
        if (arrayList != null) {
            Iterator<RealTimeMessageSelect> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().isSelect()) {
                    it.remove();
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setAllSelectState(boolean isSelect) {
        this.f14679m = isSelect;
        ArrayList<RealTimeMessageSelect> arrayList = this.f14668b;
        if (arrayList != null) {
            Iterator<RealTimeMessageSelect> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setSelect(isSelect);
            }
        }
        notifyDataSetChanged();
    }

    public void setBeginning(boolean beginning) {
        this.f14681o = beginning;
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<RealTimeMessageTb> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<RealTimeMessageTb> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RealTimeMessageSelect(false, it.next()));
        }
        this.f14668b.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f14676j = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setItemClickListener(InterfaceC2035b myItemClickListener) {
        this.f14673g = myItemClickListener;
    }

    public void setLightMode(boolean isTopList) {
        this.f14680n = isTopList;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(InterfaceC2036c onItemClickListener) {
        this.f14669c = onItemClickListener;
    }

    public void setScrollToPosition(int position) {
        this.f14682p = position;
    }

    public void updateChangedItemBean(RealTimeMessageTb bean, int position) {
        this.f14668b.set(position, new RealTimeMessageSelect(false, bean));
        notifyItemChanged(position);
    }

    public void updateMessage(RealTimeMessageTb message, int position) {
        ArrayList<RealTimeMessageSelect> arrayList = this.f14668b;
        arrayList.remove(arrayList.get(position));
        this.f14668b.add(getItemCount() - 1, new RealTimeMessageSelect(false, message));
        notifyItemChanged(position);
    }

    public void addData(int position, RealTimeMessageTb message) {
        if (message != null) {
            this.f14681o = false;
            this.f14668b.add(position, new RealTimeMessageSelect(false, message));
            if (this.f14668b.size() > 1) {
                notifyItemChanged(this.f14668b.size() - 2);
            }
            notifyItemInserted(this.f14668b.size() - 1);
        }
    }
}
