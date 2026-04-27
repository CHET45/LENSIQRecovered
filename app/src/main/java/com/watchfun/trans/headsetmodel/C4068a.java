package com.watchfun.trans.headsetmodel;

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

/* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.a */
/* JADX INFO: loaded from: classes6.dex */
public class C4068a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: t */
    public static final String f25420t = "AiTransAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f25421a;

    /* JADX INFO: renamed from: c */
    public g f25423c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f25424d;

    /* JADX INFO: renamed from: e */
    public oah f25425e;

    /* JADX INFO: renamed from: f */
    public gah f25426f;

    /* JADX INFO: renamed from: g */
    public String f25427g;

    /* JADX INFO: renamed from: i */
    public cah f25429i;

    /* JADX INFO: renamed from: j */
    public String f25430j;

    /* JADX INFO: renamed from: k */
    public bah f25431k;

    /* JADX INFO: renamed from: l */
    public int f25432l;

    /* JADX INFO: renamed from: m */
    public boolean f25433m;

    /* JADX INFO: renamed from: n */
    public int f25434n;

    /* JADX INFO: renamed from: b */
    public ArrayList<eah> f25422b = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public int f25428h = -1;

    /* JADX INFO: renamed from: o */
    public int f25435o = 1;

    /* JADX INFO: renamed from: p */
    public int f25436p = 2;

    /* JADX INFO: renamed from: r */
    public boolean f25438r = false;

    /* JADX INFO: renamed from: s */
    public int f25439s = -1;

    /* JADX INFO: renamed from: q */
    public int f25437q = vfe.getInstance().getInt("SP_KEY_PROJECT_TYPE", -1);

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.a$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eah f25440a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25441b;

        public a(final eah val$bean, final int val$position) {
            this.f25440a = val$bean;
            this.f25441b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!C4068a.this.f25433m) {
                if (TranslateWebSocketManager.getInstance().isAsring()) {
                    return;
                }
                C4068a.this.f25431k = this.f25440a.getXfAiMessage();
                C4068a.this.f25423c.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25441b, C4068a.this.f25431k);
                return;
            }
            C4068a.this.f25438r = false;
            this.f25440a.setSelect(!r4.isSelect());
            C4068a.this.notifyItemChanged(this.f25441b);
            C4068a c4068a = C4068a.this;
            c4068a.f25423c.click(c4068a.f25438r);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.a$b */
    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25443a;

        public b(final int val$position) {
            this.f25443a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C4068a.this.setEditMode(!r0.f25433m);
            C4068a.this.f25423c.onItemLongClick(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25443a, C4068a.this.f25431k, C4068a.this.f25433m);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.a$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eah f25445a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25446b;

        public c(final eah val$bean, final int val$position) {
            this.f25445a = val$bean;
            this.f25446b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C4068a.this.f25438r = false;
            this.f25445a.setSelect(!r2.isSelect());
            C4068a.this.notifyItemChanged(this.f25446b);
            C4068a c4068a = C4068a.this;
            c4068a.f25423c.click(c4068a.f25438r);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.a$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eah f25448a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25449b;

        public d(final eah val$bean, final int val$position) {
            this.f25448a = val$bean;
            this.f25449b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!C4068a.this.f25433m) {
                if (TranslateWebSocketManager.getInstance().isAsring()) {
                    return;
                }
                C4068a.this.f25431k = this.f25448a.getXfAiMessage();
                C4068a.this.f25423c.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25449b, C4068a.this.f25431k);
                return;
            }
            C4068a.this.f25438r = false;
            this.f25448a.setSelect(!r4.isSelect());
            C4068a.this.notifyItemChanged(this.f25449b);
            C4068a c4068a = C4068a.this;
            c4068a.f25423c.click(c4068a.f25438r);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.a$e */
    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25451a;

        public e(final int val$position) {
            this.f25451a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C4068a.this.setEditMode(!r0.f25433m);
            C4068a.this.f25423c.onItemLongClick(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25451a, C4068a.this.f25431k, C4068a.this.f25433m);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.a$f */
    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ eah f25453a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25454b;

        public f(final eah val$bean, final int val$position) {
            this.f25453a = val$bean;
            this.f25454b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C4068a.this.f25438r = false;
            this.f25453a.setSelect(!r2.isSelect());
            C4068a.this.notifyItemChanged(this.f25454b);
            C4068a c4068a = C4068a.this;
            c4068a.f25423c.click(c4068a.f25438r);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.a$g */
    public interface g {
        void click(boolean isAllSelect);

        void onItemChatPlayVoice(View v, int postion, bah xfAiMessage);

        void onItemLongClick(View v, int postion, bah xfAiMessage, boolean isEditMode);
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.a$h */
    public static class h extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public gah f25456a;

        public h(View itemView) {
            super(itemView);
        }

        public gah getBinding() {
            return this.f25456a;
        }

        public void setBinding(gah binding) {
            this.f25456a = binding;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.headsetmodel.a$i */
    public static class i extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public oah f25457a;

        public i(View itemView) {
            super(itemView);
        }

        public oah getBinding() {
            return this.f25457a;
        }

        public void setBinding(oah binding) {
            this.f25457a = binding;
        }
    }

    public C4068a(Context context, RecyclerView recyclerView, cah xfMessageDao) {
        this.f25421a = context;
        this.f25429i = xfMessageDao;
        this.f25424d = recyclerView;
    }

    public void addData(bah message) {
        if (message != null) {
            this.f25422b.add(new eah(false, message));
            notifyItemInserted(this.f25422b.size() - 1);
        }
    }

    public ArrayList<eah> getData() {
        return this.f25422b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25422b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (!mc2.isEmpty(this.f25422b)) {
            bah xfAiMessage = this.f25422b.get(position).getXfAiMessage();
            this.f25432l = xfAiMessage.getType();
            this.f25434n = xfAiMessage.getMultipleOptions();
        }
        return this.f25432l == 1 ? this.f25435o : this.f25436p;
    }

    public List<bah> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<eah> arrayList2 = this.f25422b;
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
        eah eahVar = this.f25422b.get(position);
        bah xfAiMessage = eahVar.getXfAiMessage();
        this.f25431k = xfAiMessage;
        if (holder instanceof i) {
            oah oahVar = ((i) holder).f25457a;
            this.f25425e = oahVar;
            oahVar.f67022m.setText(xfAiMessage.getResult());
            this.f25425e.f67021f.setText(this.f25431k.getTransResult());
            if (this.f25433m) {
                this.f25425e.f67020e.setVisibility(0);
                if (eahVar.isSelect()) {
                    this.f25425e.f67020e.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f25425e.f67020e.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f25425e.f67020e.setVisibility(8);
            }
            this.f25425e.f67019d.setOnClickListener(new a(eahVar, position));
            this.f25425e.f67019d.setOnLongClickListener(new b(position));
            this.f25425e.f67020e.setOnClickListener(new c(eahVar, position));
            return;
        }
        if (holder instanceof h) {
            gah gahVar = ((h) holder).f25456a;
            this.f25426f = gahVar;
            if (this.f25437q == 2) {
                gahVar.f39164d.setImageResource(C4201R.drawable.ic_glasses);
            } else {
                gahVar.f39164d.setImageResource(C4201R.drawable.ic_ear);
            }
            this.f25426f.f39163c.setText(this.f25431k.getResult());
            this.f25426f.f39162b.setText(this.f25431k.getTransResult());
            if (this.f25433m) {
                this.f25426f.f39167m.setVisibility(0);
                if (eahVar.isSelect()) {
                    this.f25426f.f39167m.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f25426f.f39167m.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f25426f.f39167m.setVisibility(8);
            }
            this.f25426f.f39166f.setOnClickListener(new d(eahVar, position));
            this.f25426f.f39166f.setOnLongClickListener(new e(position));
            this.f25426f.f39167m.setOnClickListener(new f(eahVar, position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == this.f25435o) {
            this.f25425e = oah.inflate(layoutInflaterFrom, parent, false);
            i iVar = new i(this.f25425e.getRoot());
            iVar.setBinding(this.f25425e);
            return iVar;
        }
        this.f25426f = gah.inflate(layoutInflaterFrom, parent, false);
        h hVar = new h(this.f25426f.getRoot());
        hVar.setBinding(this.f25426f);
        return hVar;
    }

    public void removeSelectData() {
        ArrayList<eah> arrayList = this.f25422b;
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
        this.f25438r = isSelect;
        ArrayList<eah> arrayList = this.f25422b;
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
        this.f25422b.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f25433m = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(g onItemClickListener) {
        this.f25423c = onItemClickListener;
    }

    public void setScrollToPosition(int position) {
        this.f25439s = position;
    }

    public void updateChangedItemBean(bah bean, int position) {
        this.f25422b.set(position, new eah(false, bean));
        notifyItemChanged(position);
    }

    public void updateMessage(bah message, int position) {
        ArrayList<eah> arrayList = this.f25422b;
        arrayList.remove(arrayList.get(position));
        this.f25422b.add(new eah(false, message));
        notifyItemChanged(position);
    }
}
