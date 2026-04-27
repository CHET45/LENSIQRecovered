package com.eyevue.glassapp.view.translate.headsetmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.trans.C4035R;
import com.watchfun.transcommon.C4201R;
import com.watchfun.translatemodule.TranslateWebSocketManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.bah;
import p000.cah;
import p000.eah;
import p000.efb;
import p000.gah;
import p000.igg;
import p000.mc2;
import p000.oah;
import p000.vfe;

/* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.a */
/* JADX INFO: loaded from: classes4.dex */
public class C2938a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: t */
    public static final String f19196t = "AiTransAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f19197a;

    /* JADX INFO: renamed from: c */
    public g f19199c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f19200d;

    /* JADX INFO: renamed from: e */
    public oah f19201e;

    /* JADX INFO: renamed from: f */
    public gah f19202f;

    /* JADX INFO: renamed from: g */
    public String f19203g;

    /* JADX INFO: renamed from: i */
    public cah f19205i;

    /* JADX INFO: renamed from: j */
    public String f19206j;

    /* JADX INFO: renamed from: k */
    public bah f19207k;

    /* JADX INFO: renamed from: l */
    public int f19208l;

    /* JADX INFO: renamed from: m */
    public boolean f19209m;

    /* JADX INFO: renamed from: n */
    public int f19210n;

    /* JADX INFO: renamed from: b */
    public ArrayList<eah> f19198b = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public int f19204h = -1;

    /* JADX INFO: renamed from: o */
    public int f19211o = 1;

    /* JADX INFO: renamed from: p */
    public int f19212p = 2;

    /* JADX INFO: renamed from: r */
    public boolean f19214r = false;

    /* JADX INFO: renamed from: s */
    public int f19215s = -1;

    /* JADX INFO: renamed from: q */
    public int f19213q = vfe.getInstance().getInt("SP_KEY_PROJECT_TYPE", -1);

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.a$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eah f19216a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f19217b;

        public a(final eah val$bean, final int val$position) {
            this.f19216a = val$bean;
            this.f19217b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!C2938a.this.f19209m) {
                if (TranslateWebSocketManager.getInstance().isAsring()) {
                    return;
                }
                C2938a.this.f19207k = this.f19216a.getXfAiMessage();
                C2938a.this.f19199c.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f19217b, C2938a.this.f19207k);
                return;
            }
            C2938a.this.f19214r = false;
            this.f19216a.setSelect(!r4.isSelect());
            C2938a.this.notifyItemChanged(this.f19217b);
            C2938a c2938a = C2938a.this;
            c2938a.f19199c.click(c2938a.f19214r);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.a$b */
    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f19219a;

        public b(final int val$position) {
            this.f19219a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C2938a.this.setEditMode(!r0.f19209m);
            C2938a.this.f19199c.onItemLongClick(v.findViewById(C4035R.id.receive_img_voice_btn), this.f19219a, C2938a.this.f19207k, C2938a.this.f19209m);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.a$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eah f19221a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f19222b;

        public c(final eah val$bean, final int val$position) {
            this.f19221a = val$bean;
            this.f19222b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C2938a.this.f19214r = false;
            this.f19221a.setSelect(!r2.isSelect());
            C2938a.this.notifyItemChanged(this.f19222b);
            C2938a c2938a = C2938a.this;
            c2938a.f19199c.click(c2938a.f19214r);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.a$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eah f19224a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f19225b;

        public d(final eah val$bean, final int val$position) {
            this.f19224a = val$bean;
            this.f19225b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!C2938a.this.f19209m) {
                if (TranslateWebSocketManager.getInstance().isAsring()) {
                    return;
                }
                C2938a.this.f19207k = this.f19224a.getXfAiMessage();
                C2938a.this.f19199c.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f19225b, C2938a.this.f19207k);
                return;
            }
            C2938a.this.f19214r = false;
            this.f19224a.setSelect(!r4.isSelect());
            C2938a.this.notifyItemChanged(this.f19225b);
            C2938a c2938a = C2938a.this;
            c2938a.f19199c.click(c2938a.f19214r);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.a$e */
    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f19227a;

        public e(final int val$position) {
            this.f19227a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C2938a.this.setEditMode(!r0.f19209m);
            C2938a.this.f19199c.onItemLongClick(v.findViewById(C4035R.id.receive_img_voice_btn), this.f19227a, C2938a.this.f19207k, C2938a.this.f19209m);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.a$f */
    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eah f19229a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f19230b;

        public f(final eah val$bean, final int val$position) {
            this.f19229a = val$bean;
            this.f19230b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C2938a.this.f19214r = false;
            this.f19229a.setSelect(!r2.isSelect());
            C2938a.this.notifyItemChanged(this.f19230b);
            C2938a c2938a = C2938a.this;
            c2938a.f19199c.click(c2938a.f19214r);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.a$g */
    public interface g {
        void click(boolean isAllSelect);

        void onItemChatPlayVoice(View v, int postion, bah xfAiMessage);

        void onItemLongClick(View v, int postion, bah xfAiMessage, boolean isEditMode);
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.a$h */
    public static class h extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public gah f19232a;

        public h(View itemView) {
            super(itemView);
        }

        public gah getBinding() {
            return this.f19232a;
        }

        public void setBinding(gah binding) {
            this.f19232a = binding;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.headsetmodel.a$i */
    public static class i extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public oah f19233a;

        public i(View itemView) {
            super(itemView);
        }

        public oah getBinding() {
            return this.f19233a;
        }

        public void setBinding(oah binding) {
            this.f19233a = binding;
        }
    }

    public C2938a(Context context, RecyclerView recyclerView, cah xfMessageDao) {
        this.f19197a = context;
        this.f19205i = xfMessageDao;
        this.f19200d = recyclerView;
    }

    public void addData(bah message) {
        if (message != null) {
            this.f19198b.add(new eah(false, message));
            notifyItemInserted(this.f19198b.size() - 1);
        }
    }

    public ArrayList<eah> getData() {
        return this.f19198b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f19198b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (!mc2.isEmpty(this.f19198b)) {
            bah xfAiMessage = this.f19198b.get(position).getXfAiMessage();
            this.f19208l = xfAiMessage.getType();
            this.f19210n = xfAiMessage.getMultipleOptions();
        }
        return this.f19208l == 1 ? this.f19211o : this.f19212p;
    }

    public List<bah> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<eah> arrayList2 = this.f19198b;
        if (arrayList2 != null) {
            for (eah eahVar : arrayList2) {
                if (eahVar.isSelect()) {
                    arrayList.add(eahVar.getXfAiMessage());
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position) {
        eah eahVar = this.f19198b.get(position);
        bah xfAiMessage = eahVar.getXfAiMessage();
        this.f19207k = xfAiMessage;
        if (holder instanceof i) {
            oah oahVar = ((i) holder).f19233a;
            this.f19201e = oahVar;
            oahVar.f67022m.setText(xfAiMessage.getResult());
            this.f19201e.f67021f.setText(this.f19207k.getTransResult());
            if (this.f19209m) {
                this.f19201e.f67020e.setVisibility(0);
                if (eahVar.isSelect()) {
                    this.f19201e.f67020e.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f19201e.f67020e.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f19201e.f67020e.setVisibility(8);
            }
            this.f19201e.f67019d.setOnClickListener(new a(eahVar, position));
            this.f19201e.f67019d.setOnLongClickListener(new b(position));
            this.f19201e.f67020e.setOnClickListener(new c(eahVar, position));
            return;
        }
        if (holder instanceof h) {
            gah gahVar = ((h) holder).f19232a;
            this.f19202f = gahVar;
            if (this.f19213q == 2) {
                gahVar.f39164d.setImageResource(C4201R.drawable.ic_glasses);
            } else {
                gahVar.f39164d.setImageResource(C4201R.drawable.ic_ear);
            }
            this.f19202f.f39163c.setText(this.f19207k.getResult());
            this.f19202f.f39162b.setText(this.f19207k.getTransResult());
            if (this.f19209m) {
                this.f19202f.f39167m.setVisibility(0);
                if (eahVar.isSelect()) {
                    this.f19202f.f39167m.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f19202f.f39167m.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f19202f.f39167m.setVisibility(8);
            }
            this.f19202f.f39166f.setOnClickListener(new d(eahVar, position));
            this.f19202f.f39166f.setOnLongClickListener(new e(position));
            this.f19202f.f39167m.setOnClickListener(new f(eahVar, position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == this.f19211o) {
            this.f19201e = oah.inflate(layoutInflaterFrom, parent, false);
            i iVar = new i(this.f19201e.getRoot());
            iVar.setBinding(this.f19201e);
            return iVar;
        }
        this.f19202f = gah.inflate(layoutInflaterFrom, parent, false);
        h hVar = new h(this.f19202f.getRoot());
        hVar.setBinding(this.f19202f);
        return hVar;
    }

    public void removeSelectData() {
        ArrayList<eah> arrayList = this.f19198b;
        if (arrayList != null) {
            Iterator<eah> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().isSelect()) {
                    it.remove();
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setAllSelectState(boolean isSelect) {
        this.f19214r = isSelect;
        ArrayList<eah> arrayList = this.f19198b;
        if (arrayList != null) {
            Iterator<eah> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setSelect(isSelect);
            }
        }
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<bah> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<bah> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new eah(false, it.next()));
        }
        this.f19198b.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f19209m = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(g onItemClickListener) {
        this.f19199c = onItemClickListener;
    }

    public void setScrollToPosition(int position) {
        this.f19215s = position;
    }

    public void updateChangedItemBean(bah bean, int position) {
        this.f19198b.set(position, new eah(false, bean));
        notifyItemChanged(position);
    }

    public void updateMessage(bah message, int position) {
        ArrayList<eah> arrayList = this.f19198b;
        arrayList.remove(arrayList.get(position));
        this.f19198b.add(new eah(false, message));
        notifyItemChanged(position);
    }
}
