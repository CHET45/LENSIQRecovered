package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.trans.C4035R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class lgh extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: q */
    public static final String f57510q = "TranslationMachineAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f57511a;

    /* JADX INFO: renamed from: c */
    public InterfaceC8811c f57513c;

    /* JADX INFO: renamed from: d */
    public String f57514d;

    /* JADX INFO: renamed from: e */
    public dbh f57515e;

    /* JADX INFO: renamed from: f */
    public int f57516f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8810b f57517g;

    /* JADX INFO: renamed from: h */
    public int f57518h;

    /* JADX INFO: renamed from: i */
    public bbh f57519i;

    /* JADX INFO: renamed from: j */
    public boolean f57520j;

    /* JADX INFO: renamed from: n */
    public boolean f57524n;

    /* JADX INFO: renamed from: b */
    public ArrayList<ebh> f57512b = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public int f57521k = 1;

    /* JADX INFO: renamed from: l */
    public int f57522l = 2;

    /* JADX INFO: renamed from: m */
    public boolean f57523m = false;

    /* JADX INFO: renamed from: o */
    public boolean f57525o = false;

    /* JADX INFO: renamed from: p */
    public int f57526p = -1;

    /* JADX INFO: renamed from: lgh$a */
    public class ViewOnClickListenerC8809a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ebh f57527a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f57528b;

        public ViewOnClickListenerC8809a(final ebh val$bean, final int val$position) {
            this.f57527a = val$bean;
            this.f57528b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            lgh.this.f57523m = false;
            this.f57527a.setSelect(!r2.isSelect());
            lgh.this.notifyItemChanged(this.f57528b);
            lgh.this.f57517g.click(lgh.this.f57523m);
        }
    }

    /* JADX INFO: renamed from: lgh$b */
    public interface InterfaceC8810b {
        void click(boolean isAllSelect);

        void onItemChatPlayVoice(View v, int postion, dbh xfAiMessage);

        void onItemLongClick(View v, int postion, dbh xfAiMessage, boolean isEditMode);
    }

    /* JADX INFO: renamed from: lgh$c */
    public interface InterfaceC8811c {
        void click(int position);
    }

    /* JADX INFO: renamed from: lgh$d */
    public static class C8812d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public bbh f57530a;

        public C8812d(View itemView) {
            super(itemView);
        }

        public bbh getBinding() {
            return this.f57530a;
        }

        public void setBinding(bbh binding) {
            this.f57530a = binding;
        }
    }

    public lgh(Context context, RecyclerView recyclerView, uah xfMessageDao, boolean isTopList) {
        this.f57511a = context;
        this.f57524n = isTopList;
    }

    public void addData(dbh message) {
        if (message != null) {
            this.f57525o = false;
            this.f57512b.add(new ebh(false, message));
            if (this.f57512b.size() > 1) {
                notifyItemChanged(this.f57512b.size() - 2);
            }
            notifyItemInserted(this.f57512b.size() - 1);
        }
    }

    public void clearData() {
        this.f57512b.clear();
        notifyDataSetChanged();
    }

    public ArrayList<ebh> getData() {
        return this.f57512b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f57512b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (!mc2.isEmpty(this.f57512b)) {
            dbh xfTransFreelyMessage = this.f57512b.get(position).getXfTransFreelyMessage();
            this.f57516f = xfTransFreelyMessage.getType();
            this.f57518h = xfTransFreelyMessage.getMultipleOptions();
        }
        return this.f57516f == 1 ? this.f57521k : this.f57522l;
    }

    public List<dbh> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<ebh> arrayList2 = this.f57512b;
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
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, @igg({"RecyclerView"}) int position) {
        ebh ebhVar = this.f57512b.get(position);
        dbh xfTransFreelyMessage = ebhVar.getXfTransFreelyMessage();
        this.f57515e = xfTransFreelyMessage;
        bbh bbhVar = ((C8812d) holder).f57530a;
        this.f57519i = bbhVar;
        if (this.f57524n) {
            bbhVar.f13276e.setText(xfTransFreelyMessage.getResult());
            this.f57519i.f13276e.setTextColor(this.f57511a.getColor(C4035R.color.color_translation_machine_source));
        } else {
            bbhVar.f13276e.setText(xfTransFreelyMessage.getTransResult());
            this.f57519i.f13276e.setTextColor(this.f57511a.getColor(C4035R.color.color_translation_machine_trains));
        }
        this.f57519i.f13276e.setTypeface(Typeface.DEFAULT);
        this.f57519i.f13276e.setAlpha(1.0f);
        if (this.f57520j) {
            this.f57519i.f13274c.setVisibility(0);
            if (ebhVar.isSelect()) {
                this.f57519i.f13274c.setBackgroundResource(C4035R.drawable.ic_edit_select);
            } else {
                this.f57519i.f13274c.setBackgroundResource(C4035R.drawable.ic_edit_unselect);
            }
        } else {
            this.f57519i.f13274c.setVisibility(8);
        }
        this.f57519i.f13274c.setOnClickListener(new ViewOnClickListenerC8809a(ebhVar, position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        this.f57519i = bbh.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        C8812d c8812d = new C8812d(this.f57519i.getRoot());
        c8812d.setBinding(this.f57519i);
        return c8812d;
    }

    public void removeSelectData() {
        ArrayList<ebh> arrayList = this.f57512b;
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
        this.f57523m = isSelect;
        ArrayList<ebh> arrayList = this.f57512b;
        if (arrayList != null) {
            Iterator<ebh> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setSelect(isSelect);
            }
        }
        notifyDataSetChanged();
    }

    public void setBeginning(boolean beginning) {
        this.f57525o = beginning;
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<dbh> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<dbh> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ebh(false, it.next()));
        }
        this.f57512b.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f57520j = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setItemClickListener(InterfaceC8810b myItemClickListener) {
        this.f57517g = myItemClickListener;
    }

    public void setLightMode(boolean isTopList) {
        this.f57524n = isTopList;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(InterfaceC8811c onItemClickListener) {
        this.f57513c = onItemClickListener;
    }

    public void setScrollToPosition(int position) {
        this.f57526p = position;
    }

    public void updateChangedItemBean(dbh bean, int position) {
        this.f57512b.set(position, new ebh(false, bean));
        notifyItemChanged(position);
    }

    public void updateMessage(dbh message, int position) {
        ArrayList<ebh> arrayList = this.f57512b;
        arrayList.remove(arrayList.get(position));
        this.f57512b.add(getItemCount() - 1, new ebh(false, message));
        notifyItemChanged(position);
    }

    public void addData(int position, dbh message) {
        if (message != null) {
            this.f57525o = false;
            this.f57512b.add(position, new ebh(false, message));
            if (this.f57512b.size() > 1) {
                notifyItemChanged(this.f57512b.size() - 2);
            }
            notifyItemInserted(this.f57512b.size() - 1);
        }
    }
}
