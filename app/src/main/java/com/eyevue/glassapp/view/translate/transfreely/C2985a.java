package com.eyevue.glassapp.view.translate.transfreely;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.trans.C4035R;
import com.watchfun.transcommon.C4201R;
import com.watchfun.transcommon.utils.AppUtils;
import com.watchfun.translatemodule.TranslateWebSocketManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.aah;
import p000.efb;
import p000.igg;
import p000.t9h;
import p000.v9h;
import p000.x9h;
import p000.z9h;

/* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.a */
/* JADX INFO: loaded from: classes4.dex */
public class C2985a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: t */
    public static final String f19348t = "AiTransFreelyAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f19349a;

    /* JADX INFO: renamed from: c */
    public h f19351c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f19352d;

    /* JADX INFO: renamed from: e */
    public v9h f19353e;

    /* JADX INFO: renamed from: f */
    public x9h f19354f;

    /* JADX INFO: renamed from: g */
    public String f19355g;

    /* JADX INFO: renamed from: i */
    public t9h f19357i;

    /* JADX INFO: renamed from: j */
    public String f19358j;

    /* JADX INFO: renamed from: k */
    public z9h f19359k;

    /* JADX INFO: renamed from: l */
    public int f19360l;

    /* JADX INFO: renamed from: m */
    public g f19361m;

    /* JADX INFO: renamed from: n */
    public int f19362n;

    /* JADX INFO: renamed from: o */
    public boolean f19363o;

    /* JADX INFO: renamed from: b */
    public ArrayList<aah> f19350b = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public int f19356h = -1;

    /* JADX INFO: renamed from: p */
    public int f19364p = 1;

    /* JADX INFO: renamed from: q */
    public int f19365q = 2;

    /* JADX INFO: renamed from: r */
    public boolean f19366r = false;

    /* JADX INFO: renamed from: s */
    public int f19367s = -1;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.a$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aah f19368a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f19369b;

        public a(final aah val$bean, final int val$position) {
            this.f19368a = val$bean;
            this.f19369b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (C2985a.this.f19363o) {
                C2985a.this.f19366r = false;
                this.f19368a.setSelect(!r4.isSelect());
                C2985a.this.notifyItemChanged(this.f19369b);
                C2985a.this.f19361m.click(C2985a.this.f19366r);
                return;
            }
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return;
            }
            C2985a.this.f19359k = this.f19368a.getXfTransFreelyMessage();
            C2985a.this.f19361m.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f19369b, C2985a.this.f19359k);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.a$b */
    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f19371a;

        public b(final int val$position) {
            this.f19371a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C2985a.this.setEditMode(!r0.f19363o);
            C2985a.this.f19361m.onItemLongClick(v, this.f19371a, C2985a.this.f19359k, C2985a.this.f19363o);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.a$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aah f19373a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f19374b;

        public c(final aah val$bean, final int val$position) {
            this.f19373a = val$bean;
            this.f19374b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C2985a.this.f19366r = false;
            this.f19373a.setSelect(!r2.isSelect());
            C2985a.this.notifyItemChanged(this.f19374b);
            C2985a.this.f19361m.click(C2985a.this.f19366r);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.a$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aah f19376a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f19377b;

        public d(final aah val$bean, final int val$position) {
            this.f19376a = val$bean;
            this.f19377b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (C2985a.this.f19363o) {
                C2985a.this.f19366r = false;
                this.f19376a.setSelect(!r4.isSelect());
                C2985a.this.notifyItemChanged(this.f19377b);
                C2985a.this.f19361m.click(C2985a.this.f19366r);
                return;
            }
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return;
            }
            C2985a.this.f19359k = this.f19376a.getXfTransFreelyMessage();
            C2985a.this.f19361m.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f19377b, C2985a.this.f19359k);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.a$e */
    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f19379a;

        public e(final int val$position) {
            this.f19379a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C2985a.this.setEditMode(!r0.f19363o);
            C2985a.this.f19361m.onItemLongClick(v, this.f19379a, C2985a.this.f19359k, C2985a.this.f19363o);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.a$f */
    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aah f19381a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f19382b;

        public f(final aah val$bean, final int val$position) {
            this.f19381a = val$bean;
            this.f19382b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C2985a.this.f19366r = false;
            this.f19381a.setSelect(!r2.isSelect());
            C2985a.this.notifyItemChanged(this.f19382b);
            C2985a.this.f19361m.click(C2985a.this.f19366r);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.a$g */
    public interface g {
        void click(boolean isAllSelect);

        void onItemChatPlayVoice(View v, int postion, z9h xfAiMessage);

        void onItemLongClick(View v, int postion, z9h xfAiMessage, boolean isEditMode);
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.a$h */
    public interface h {
        void click(int position);
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.a$i */
    public static class i extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public x9h f19384a;

        public i(View itemView) {
            super(itemView);
        }

        public x9h getBinding() {
            return this.f19384a;
        }

        public void setBinding(x9h binding) {
            this.f19384a = binding;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.transfreely.a$j */
    public static class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public v9h f19385a;

        public j(View itemView) {
            super(itemView);
        }

        public v9h getBinding() {
            return this.f19385a;
        }

        public void setBinding(v9h binding) {
            this.f19385a = binding;
        }
    }

    public C2985a(Context context, RecyclerView recyclerView, t9h xfMessageDao) {
        this.f19349a = context;
        this.f19357i = xfMessageDao;
        this.f19352d = recyclerView;
    }

    public void addData(z9h message) {
        if (message != null) {
            this.f19350b.add(new aah(false, message));
            notifyItemInserted(this.f19350b.size() - 1);
        }
    }

    public ArrayList<aah> getData() {
        return this.f19350b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f19350b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (!AppUtils.isEmpty(this.f19350b)) {
            z9h xfTransFreelyMessage = this.f19350b.get(position).getXfTransFreelyMessage();
            this.f19360l = xfTransFreelyMessage.getType();
            this.f19362n = xfTransFreelyMessage.getMultipleOptions();
        }
        return this.f19360l == 1 ? this.f19364p : this.f19365q;
    }

    public List<z9h> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<aah> arrayList2 = this.f19350b;
        if (arrayList2 != null) {
            for (aah aahVar : arrayList2) {
                if (aahVar.isSelect()) {
                    arrayList.add(aahVar.getXfTransFreelyMessage());
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position) {
        aah aahVar = this.f19350b.get(position);
        z9h xfTransFreelyMessage = aahVar.getXfTransFreelyMessage();
        this.f19359k = xfTransFreelyMessage;
        if (holder instanceof j) {
            v9h v9hVar = ((j) holder).f19385a;
            this.f19353e = v9hVar;
            v9hVar.f90416m.setText(xfTransFreelyMessage.getResult());
            this.f19353e.f90415f.setText(this.f19359k.getTransResult());
            if (this.f19363o) {
                this.f19353e.f90414e.setVisibility(0);
                if (aahVar.isSelect()) {
                    this.f19353e.f90414e.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f19353e.f90414e.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f19353e.f90414e.setVisibility(8);
            }
            this.f19353e.f90413d.setOnClickListener(new a(aahVar, position));
            this.f19353e.f90413d.setOnLongClickListener(new b(position));
            this.f19353e.f90414e.setOnClickListener(new c(aahVar, position));
            return;
        }
        if (holder instanceof i) {
            x9h x9hVar = ((i) holder).f19384a;
            this.f19354f = x9hVar;
            x9hVar.f97328c.setText(xfTransFreelyMessage.getResult());
            this.f19354f.f97327b.setText(this.f19359k.getTransResult());
            if (this.f19363o) {
                this.f19354f.f97332m.setVisibility(0);
                if (aahVar.isSelect()) {
                    this.f19354f.f97332m.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f19354f.f97332m.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f19354f.f97332m.setVisibility(8);
            }
            this.f19354f.f97331f.setOnClickListener(new d(aahVar, position));
            this.f19354f.f97331f.setOnLongClickListener(new e(position));
            this.f19354f.f97332m.setOnClickListener(new f(aahVar, position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == this.f19364p) {
            this.f19353e = v9h.inflate(layoutInflaterFrom, parent, false);
            j jVar = new j(this.f19353e.getRoot());
            jVar.setBinding(this.f19353e);
            return jVar;
        }
        this.f19354f = x9h.inflate(layoutInflaterFrom, parent, false);
        i iVar = new i(this.f19354f.getRoot());
        iVar.setBinding(this.f19354f);
        return iVar;
    }

    public void removeSelectData() {
        ArrayList<aah> arrayList = this.f19350b;
        if (arrayList != null) {
            Iterator<aah> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().isSelect()) {
                    it.remove();
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setAllSelectState(boolean isSelect) {
        this.f19366r = isSelect;
        ArrayList<aah> arrayList = this.f19350b;
        if (arrayList != null) {
            Iterator<aah> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setSelect(isSelect);
            }
        }
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<z9h> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<z9h> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new aah(false, it.next()));
        }
        this.f19350b.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f19363o = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setItemClickListener(g myItemClickListener) {
        this.f19361m = myItemClickListener;
    }

    public void setOnItemClickListener(h onItemClickListener) {
        this.f19351c = onItemClickListener;
    }

    public void setScrollToPosition(int position) {
        this.f19367s = position;
    }

    public void updateChangedItemBean(z9h bean, int position) {
        this.f19350b.set(position, new aah(false, bean));
        notifyItemChanged(position);
    }

    public void updateMessage(z9h message, int position) {
        ArrayList<aah> arrayList = this.f19350b;
        arrayList.remove(arrayList.get(position));
        this.f19350b.add(new aah(false, message));
        notifyItemChanged(position);
    }
}
