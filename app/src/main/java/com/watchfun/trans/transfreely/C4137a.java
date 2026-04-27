package com.watchfun.trans.transfreely;

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

/* JADX INFO: renamed from: com.watchfun.trans.transfreely.a */
/* JADX INFO: loaded from: classes6.dex */
public class C4137a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: t */
    public static final String f25655t = "AiTransFreelyAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f25656a;

    /* JADX INFO: renamed from: c */
    public h f25658c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f25659d;

    /* JADX INFO: renamed from: e */
    public v9h f25660e;

    /* JADX INFO: renamed from: f */
    public x9h f25661f;

    /* JADX INFO: renamed from: g */
    public String f25662g;

    /* JADX INFO: renamed from: i */
    public t9h f25664i;

    /* JADX INFO: renamed from: j */
    public String f25665j;

    /* JADX INFO: renamed from: k */
    public z9h f25666k;

    /* JADX INFO: renamed from: l */
    public int f25667l;

    /* JADX INFO: renamed from: m */
    public g f25668m;

    /* JADX INFO: renamed from: n */
    public int f25669n;

    /* JADX INFO: renamed from: o */
    public boolean f25670o;

    /* JADX INFO: renamed from: b */
    public ArrayList<aah> f25657b = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public int f25663h = -1;

    /* JADX INFO: renamed from: p */
    public int f25671p = 1;

    /* JADX INFO: renamed from: q */
    public int f25672q = 2;

    /* JADX INFO: renamed from: r */
    public boolean f25673r = false;

    /* JADX INFO: renamed from: s */
    public int f25674s = -1;

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.a$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aah f25675a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25676b;

        public a(final aah val$bean, final int val$position) {
            this.f25675a = val$bean;
            this.f25676b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (C4137a.this.f25670o) {
                C4137a.this.f25673r = false;
                this.f25675a.setSelect(!r4.isSelect());
                C4137a.this.notifyItemChanged(this.f25676b);
                C4137a.this.f25668m.click(C4137a.this.f25673r);
                return;
            }
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return;
            }
            C4137a.this.f25666k = this.f25675a.getXfTransFreelyMessage();
            C4137a.this.f25668m.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25676b, C4137a.this.f25666k);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.a$b */
    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25678a;

        public b(final int val$position) {
            this.f25678a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C4137a.this.setEditMode(!r0.f25670o);
            C4137a.this.f25668m.onItemLongClick(v, this.f25678a, C4137a.this.f25666k, C4137a.this.f25670o);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.a$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aah f25680a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25681b;

        public c(final aah val$bean, final int val$position) {
            this.f25680a = val$bean;
            this.f25681b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C4137a.this.f25673r = false;
            this.f25680a.setSelect(!r2.isSelect());
            C4137a.this.notifyItemChanged(this.f25681b);
            C4137a.this.f25668m.click(C4137a.this.f25673r);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.a$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aah f25683a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25684b;

        public d(final aah val$bean, final int val$position) {
            this.f25683a = val$bean;
            this.f25684b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (C4137a.this.f25670o) {
                C4137a.this.f25673r = false;
                this.f25683a.setSelect(!r4.isSelect());
                C4137a.this.notifyItemChanged(this.f25684b);
                C4137a.this.f25668m.click(C4137a.this.f25673r);
                return;
            }
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return;
            }
            C4137a.this.f25666k = this.f25683a.getXfTransFreelyMessage();
            C4137a.this.f25668m.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25684b, C4137a.this.f25666k);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.a$e */
    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25686a;

        public e(final int val$position) {
            this.f25686a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C4137a.this.setEditMode(!r0.f25670o);
            C4137a.this.f25668m.onItemLongClick(v, this.f25686a, C4137a.this.f25666k, C4137a.this.f25670o);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.a$f */
    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aah f25688a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25689b;

        public f(final aah val$bean, final int val$position) {
            this.f25688a = val$bean;
            this.f25689b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C4137a.this.f25673r = false;
            this.f25688a.setSelect(!r2.isSelect());
            C4137a.this.notifyItemChanged(this.f25689b);
            C4137a.this.f25668m.click(C4137a.this.f25673r);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.a$g */
    public interface g {
        void click(boolean isAllSelect);

        void onItemChatPlayVoice(View v, int postion, z9h xfAiMessage);

        void onItemLongClick(View v, int postion, z9h xfAiMessage, boolean isEditMode);
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.a$h */
    public interface h {
        void click(int position);
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.a$i */
    public static class i extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public x9h f25691a;

        public i(View itemView) {
            super(itemView);
        }

        public x9h getBinding() {
            return this.f25691a;
        }

        public void setBinding(x9h binding) {
            this.f25691a = binding;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.transfreely.a$j */
    public static class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public v9h f25692a;

        public j(View itemView) {
            super(itemView);
        }

        public v9h getBinding() {
            return this.f25692a;
        }

        public void setBinding(v9h binding) {
            this.f25692a = binding;
        }
    }

    public C4137a(Context context, RecyclerView recyclerView, t9h xfMessageDao) {
        this.f25656a = context;
        this.f25664i = xfMessageDao;
        this.f25659d = recyclerView;
    }

    public void addData(z9h message) {
        if (message != null) {
            this.f25657b.add(new aah(false, message));
            notifyItemInserted(this.f25657b.size() - 1);
        }
    }

    public ArrayList<aah> getData() {
        return this.f25657b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25657b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (!AppUtils.isEmpty(this.f25657b)) {
            z9h xfTransFreelyMessage = this.f25657b.get(position).getXfTransFreelyMessage();
            this.f25667l = xfTransFreelyMessage.getType();
            this.f25669n = xfTransFreelyMessage.getMultipleOptions();
        }
        return this.f25667l == 1 ? this.f25671p : this.f25672q;
    }

    public List<z9h> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<aah> arrayList2 = this.f25657b;
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
        aah aahVar = this.f25657b.get(position);
        z9h xfTransFreelyMessage = aahVar.getXfTransFreelyMessage();
        this.f25666k = xfTransFreelyMessage;
        if (holder instanceof j) {
            v9h v9hVar = ((j) holder).f25692a;
            this.f25660e = v9hVar;
            v9hVar.f90416m.setText(xfTransFreelyMessage.getResult());
            this.f25660e.f90415f.setText(this.f25666k.getTransResult());
            if (this.f25670o) {
                this.f25660e.f90414e.setVisibility(0);
                if (aahVar.isSelect()) {
                    this.f25660e.f90414e.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f25660e.f90414e.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f25660e.f90414e.setVisibility(8);
            }
            this.f25660e.f90413d.setOnClickListener(new a(aahVar, position));
            this.f25660e.f90413d.setOnLongClickListener(new b(position));
            this.f25660e.f90414e.setOnClickListener(new c(aahVar, position));
            return;
        }
        if (holder instanceof i) {
            x9h x9hVar = ((i) holder).f25691a;
            this.f25661f = x9hVar;
            x9hVar.f97328c.setText(xfTransFreelyMessage.getResult());
            this.f25661f.f97327b.setText(this.f25666k.getTransResult());
            if (this.f25670o) {
                this.f25661f.f97332m.setVisibility(0);
                if (aahVar.isSelect()) {
                    this.f25661f.f97332m.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f25661f.f97332m.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f25661f.f97332m.setVisibility(8);
            }
            this.f25661f.f97331f.setOnClickListener(new d(aahVar, position));
            this.f25661f.f97331f.setOnLongClickListener(new e(position));
            this.f25661f.f97332m.setOnClickListener(new f(aahVar, position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == this.f25671p) {
            this.f25660e = v9h.inflate(layoutInflaterFrom, parent, false);
            j jVar = new j(this.f25660e.getRoot());
            jVar.setBinding(this.f25660e);
            return jVar;
        }
        this.f25661f = x9h.inflate(layoutInflaterFrom, parent, false);
        i iVar = new i(this.f25661f.getRoot());
        iVar.setBinding(this.f25661f);
        return iVar;
    }

    public void removeSelectData() {
        ArrayList<aah> arrayList = this.f25657b;
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
        this.f25673r = isSelect;
        ArrayList<aah> arrayList = this.f25657b;
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
        this.f25657b.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f25670o = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setItemClickListener(g myItemClickListener) {
        this.f25668m = myItemClickListener;
    }

    public void setOnItemClickListener(h onItemClickListener) {
        this.f25658c = onItemClickListener;
    }

    public void setScrollToPosition(int position) {
        this.f25674s = position;
    }

    public void updateChangedItemBean(z9h bean, int position) {
        this.f25657b.set(position, new aah(false, bean));
        notifyItemChanged(position);
    }

    public void updateMessage(z9h message, int position) {
        ArrayList<aah> arrayList = this.f25657b;
        arrayList.remove(arrayList.get(position));
        this.f25657b.add(new aah(false, message));
        notifyItemChanged(position);
    }
}
