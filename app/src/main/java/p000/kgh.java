package p000;

import android.content.Context;
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
public class kgh extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: q */
    public static final String f54034q = "TranslationMachineAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f54035a;

    /* JADX INFO: renamed from: c */
    public InterfaceC8360c f54037c;

    /* JADX INFO: renamed from: d */
    public String f54038d;

    /* JADX INFO: renamed from: e */
    public dbh f54039e;

    /* JADX INFO: renamed from: f */
    public int f54040f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8359b f54041g;

    /* JADX INFO: renamed from: h */
    public int f54042h;

    /* JADX INFO: renamed from: i */
    public bbh f54043i;

    /* JADX INFO: renamed from: j */
    public boolean f54044j;

    /* JADX INFO: renamed from: n */
    public boolean f54048n;

    /* JADX INFO: renamed from: b */
    public ArrayList<ebh> f54036b = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public int f54045k = 1;

    /* JADX INFO: renamed from: l */
    public int f54046l = 2;

    /* JADX INFO: renamed from: m */
    public boolean f54047m = false;

    /* JADX INFO: renamed from: o */
    public boolean f54049o = false;

    /* JADX INFO: renamed from: p */
    public int f54050p = -1;

    /* JADX INFO: renamed from: kgh$a */
    public class ViewOnClickListenerC8358a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ebh f54051a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54052b;

        public ViewOnClickListenerC8358a(final ebh val$bean, final int val$position) {
            this.f54051a = val$bean;
            this.f54052b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            kgh.this.f54047m = false;
            this.f54051a.setSelect(!r2.isSelect());
            kgh.this.notifyItemChanged(this.f54052b);
            kgh.this.f54041g.click(kgh.this.f54047m);
        }
    }

    /* JADX INFO: renamed from: kgh$b */
    public interface InterfaceC8359b {
        void click(boolean isAllSelect);

        void onItemChatPlayVoice(View v, int postion, dbh xfAiMessage);

        void onItemLongClick(View v, int postion, dbh xfAiMessage, boolean isEditMode);
    }

    /* JADX INFO: renamed from: kgh$c */
    public interface InterfaceC8360c {
        void click(int position);
    }

    /* JADX INFO: renamed from: kgh$d */
    public static class C8361d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public bbh f54054a;

        public C8361d(View itemView) {
            super(itemView);
        }

        public bbh getBinding() {
            return this.f54054a;
        }

        public void setBinding(bbh binding) {
            this.f54054a = binding;
        }
    }

    public kgh(Context context, RecyclerView recyclerView, uah xfMessageDao, boolean isTopList) {
        this.f54035a = context;
        this.f54048n = isTopList;
    }

    public void addData(dbh message) {
        if (message != null) {
            this.f54049o = false;
            this.f54036b.add(new ebh(false, message));
            if (this.f54036b.size() > 1) {
                notifyItemChanged(this.f54036b.size() - 2);
            }
            notifyItemInserted(this.f54036b.size() - 1);
        }
    }

    public void clearData() {
        this.f54036b.clear();
        notifyDataSetChanged();
    }

    public ArrayList<ebh> getData() {
        return this.f54036b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f54036b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (!mc2.isEmpty(this.f54036b)) {
            dbh xfTransFreelyMessage = this.f54036b.get(position).getXfTransFreelyMessage();
            this.f54040f = xfTransFreelyMessage.getType();
            this.f54042h = xfTransFreelyMessage.getMultipleOptions();
        }
        return this.f54040f == 1 ? this.f54045k : this.f54046l;
    }

    public List<dbh> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<ebh> arrayList2 = this.f54036b;
        if (arrayList2 != null) {
            for (ebh ebhVar : arrayList2) {
                if (ebhVar.isSelect()) {
                    arrayList.add(ebhVar.getXfTransFreelyMessage());
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position) {
        ebh ebhVar = this.f54036b.get(position);
        dbh xfTransFreelyMessage = ebhVar.getXfTransFreelyMessage();
        this.f54039e = xfTransFreelyMessage;
        bbh bbhVar = ((C8361d) holder).f54054a;
        this.f54043i = bbhVar;
        if (this.f54048n) {
            bbhVar.f13276e.setText(xfTransFreelyMessage.getTransResult());
        } else {
            bbhVar.f13276e.setText(xfTransFreelyMessage.getResult());
        }
        this.f54043i.f13276e.setTypeface(Typeface.DEFAULT);
        this.f54043i.f13276e.setLineSpacing(0.0f, 1.3f);
        this.f54043i.f13276e.setAlpha(1.0f);
        int color = lx2.getColor(this.f54035a, C4201R.color.text_important_color);
        this.f54043i.f13276e.setTextColor(ua2.setAlphaComponent(color, 128));
        if (position == getItemCount() - 1 && !this.f54049o) {
            this.f54043i.f13276e.setTextColor(color);
        }
        if (this.f54044j) {
            this.f54043i.f13274c.setVisibility(0);
            if (ebhVar.isSelect()) {
                this.f54043i.f13274c.setBackgroundResource(C4201R.drawable.ic_edit_select);
            } else {
                this.f54043i.f13274c.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
            }
        } else {
            this.f54043i.f13274c.setVisibility(8);
        }
        this.f54043i.f13274c.setOnClickListener(new ViewOnClickListenerC8358a(ebhVar, position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        this.f54043i = bbh.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        C8361d c8361d = new C8361d(this.f54043i.getRoot());
        c8361d.setBinding(this.f54043i);
        return c8361d;
    }

    public void removeSelectData() {
        ArrayList<ebh> arrayList = this.f54036b;
        if (arrayList != null) {
            Iterator<ebh> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().isSelect()) {
                    it.remove();
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setAllSelectState(boolean isSelect) {
        this.f54047m = isSelect;
        ArrayList<ebh> arrayList = this.f54036b;
        if (arrayList != null) {
            Iterator<ebh> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setSelect(isSelect);
            }
        }
        notifyDataSetChanged();
    }

    public void setBeginning(boolean beginning) {
        this.f54049o = beginning;
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<dbh> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<dbh> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ebh(false, it.next()));
        }
        this.f54036b.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f54044j = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setItemClickListener(InterfaceC8359b myItemClickListener) {
        this.f54041g = myItemClickListener;
    }

    public void setLightMode(boolean isTopList) {
        this.f54048n = isTopList;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(InterfaceC8360c onItemClickListener) {
        this.f54037c = onItemClickListener;
    }

    public void setScrollToPosition(int position) {
        this.f54050p = position;
    }

    public void updateChangedItemBean(dbh bean, int position) {
        this.f54036b.set(position, new ebh(false, bean));
        notifyItemChanged(position);
    }

    public void updateMessage(dbh message, int position) {
        ArrayList<ebh> arrayList = this.f54036b;
        arrayList.remove(arrayList.get(position));
        this.f54036b.add(new ebh(false, message));
        notifyItemChanged(position);
    }

    public void addData(int position, dbh message) {
        if (message != null) {
            this.f54049o = false;
            this.f54036b.add(position, new ebh(false, message));
            if (this.f54036b.size() > 1) {
                notifyItemChanged(this.f54036b.size() - 2);
            }
            notifyItemInserted(this.f54036b.size() - 1);
        }
    }
}
