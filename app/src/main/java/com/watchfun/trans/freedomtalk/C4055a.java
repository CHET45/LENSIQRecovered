package com.watchfun.trans.freedomtalk;

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
import p000.bx6;
import p000.dx6;
import p000.efb;
import p000.ex6;
import p000.gah;
import p000.igg;
import p000.mah;

/* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.a */
/* JADX INFO: loaded from: classes6.dex */
public class C4055a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: s */
    public static final String f25355s = "AiFreedomTalkAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f25356a;

    /* JADX INFO: renamed from: c */
    public g f25358c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f25359d;

    /* JADX INFO: renamed from: e */
    public mah f25360e;

    /* JADX INFO: renamed from: f */
    public gah f25361f;

    /* JADX INFO: renamed from: g */
    public String f25362g;

    /* JADX INFO: renamed from: i */
    public bx6 f25364i;

    /* JADX INFO: renamed from: j */
    public String f25365j;

    /* JADX INFO: renamed from: k */
    public dx6 f25366k;

    /* JADX INFO: renamed from: l */
    public int f25367l;

    /* JADX INFO: renamed from: m */
    public boolean f25368m;

    /* JADX INFO: renamed from: n */
    public int f25369n;

    /* JADX INFO: renamed from: b */
    public ArrayList<ex6> f25357b = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public int f25363h = -1;

    /* JADX INFO: renamed from: o */
    public int f25370o = 1;

    /* JADX INFO: renamed from: p */
    public int f25371p = 2;

    /* JADX INFO: renamed from: q */
    public boolean f25372q = false;

    /* JADX INFO: renamed from: r */
    public int f25373r = -1;

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.a$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ex6 f25374a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25375b;

        public a(final ex6 val$bean, final int val$position) {
            this.f25374a = val$bean;
            this.f25375b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!C4055a.this.f25368m) {
                C4055a.this.f25366k = this.f25374a.getFreedomTalkMessage();
                C4055a.this.f25358c.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25375b, C4055a.this.f25366k);
            } else {
                C4055a.this.f25372q = false;
                this.f25374a.setSelect(!r4.isSelect());
                C4055a.this.notifyItemChanged(this.f25375b);
                C4055a c4055a = C4055a.this;
                c4055a.f25358c.click(c4055a.f25372q);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.a$b */
    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25377a;

        public b(final int val$position) {
            this.f25377a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C4055a.this.setEditMode(!r0.f25368m);
            C4055a.this.f25358c.onItemLongClick(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25377a, C4055a.this.f25366k, C4055a.this.f25368m);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.a$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ex6 f25379a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25380b;

        public c(final ex6 val$bean, final int val$position) {
            this.f25379a = val$bean;
            this.f25380b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C4055a.this.f25372q = false;
            this.f25379a.setSelect(!r2.isSelect());
            C4055a.this.notifyItemChanged(this.f25380b);
            C4055a c4055a = C4055a.this;
            c4055a.f25358c.click(c4055a.f25372q);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.a$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ex6 f25382a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25383b;

        public d(final ex6 val$bean, final int val$position) {
            this.f25382a = val$bean;
            this.f25383b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!C4055a.this.f25368m) {
                C4055a.this.f25366k = this.f25382a.getFreedomTalkMessage();
                C4055a.this.f25358c.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25383b, C4055a.this.f25366k);
            } else {
                C4055a.this.f25372q = false;
                this.f25382a.setSelect(!r4.isSelect());
                C4055a.this.notifyItemChanged(this.f25383b);
                C4055a c4055a = C4055a.this;
                c4055a.f25358c.click(c4055a.f25372q);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.a$e */
    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25385a;

        public e(final int val$position) {
            this.f25385a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C4055a.this.setEditMode(!r0.f25368m);
            C4055a.this.f25358c.onItemLongClick(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25385a, C4055a.this.f25366k, C4055a.this.f25368m);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.a$f */
    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ex6 f25387a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25388b;

        public f(final ex6 val$bean, final int val$position) {
            this.f25387a = val$bean;
            this.f25388b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C4055a.this.f25372q = false;
            this.f25387a.setSelect(!r2.isSelect());
            C4055a.this.notifyItemChanged(this.f25388b);
            C4055a c4055a = C4055a.this;
            c4055a.f25358c.click(c4055a.f25372q);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.a$g */
    public interface g {
        void click(boolean isAllSelect);

        void onItemChatPlayVoice(View v, int postion, dx6 xfAiMessage);

        void onItemLongClick(View v, int postion, dx6 xfAiMessage, boolean isEditMode);
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.a$h */
    public static class h extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public gah f25390a;

        public h(View itemView) {
            super(itemView);
        }

        public gah getBinding() {
            return this.f25390a;
        }

        public void setBinding(gah binding) {
            this.f25390a = binding;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.freedomtalk.a$i */
    public static class i extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public mah f25391a;

        public i(View itemView) {
            super(itemView);
        }

        public mah getBinding() {
            return this.f25391a;
        }

        public void setBinding(mah binding) {
            this.f25391a = binding;
        }
    }

    public C4055a(Context context, RecyclerView recyclerView, bx6 xfMessageDao) {
        this.f25356a = context;
        this.f25364i = xfMessageDao;
        this.f25359d = recyclerView;
    }

    public void addData(dx6 message) {
        if (message != null) {
            this.f25357b.add(new ex6(false, message));
            notifyItemInserted(this.f25357b.size() - 1);
        }
    }

    public ArrayList<ex6> getData() {
        return this.f25357b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25357b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (!AppUtils.isEmpty(this.f25357b)) {
            dx6 freedomTalkMessage = this.f25357b.get(position).getFreedomTalkMessage();
            this.f25367l = freedomTalkMessage.getType();
            this.f25369n = freedomTalkMessage.getMultipleOptions();
        }
        return this.f25367l == 1 ? this.f25370o : this.f25371p;
    }

    public List<dx6> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<ex6> arrayList2 = this.f25357b;
        if (arrayList2 != null) {
            for (ex6 ex6Var : arrayList2) {
                if (ex6Var.isSelect()) {
                    arrayList.add(ex6Var.getFreedomTalkMessage());
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position) {
        ex6 ex6Var = this.f25357b.get(position);
        dx6 freedomTalkMessage = ex6Var.getFreedomTalkMessage();
        this.f25366k = freedomTalkMessage;
        if (holder instanceof i) {
            mah mahVar = ((i) holder).f25391a;
            this.f25360e = mahVar;
            mahVar.f60369m.setText(freedomTalkMessage.getResult());
            this.f25360e.f60368f.setText(this.f25366k.getTransResult());
            if (this.f25368m) {
                this.f25360e.f60367e.setVisibility(0);
                if (ex6Var.isSelect()) {
                    this.f25360e.f60367e.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f25360e.f60367e.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f25360e.f60367e.setVisibility(8);
            }
            this.f25360e.f60366d.setOnClickListener(new a(ex6Var, position));
            this.f25360e.f60366d.setOnLongClickListener(new b(position));
            this.f25360e.f60367e.setOnClickListener(new c(ex6Var, position));
            return;
        }
        if (holder instanceof h) {
            gah gahVar = ((h) holder).f25390a;
            this.f25361f = gahVar;
            gahVar.f39163c.setText(freedomTalkMessage.getResult());
            this.f25361f.f39162b.setText(this.f25366k.getTransResult());
            if (this.f25368m) {
                this.f25361f.f39167m.setVisibility(0);
                if (ex6Var.isSelect()) {
                    this.f25361f.f39167m.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f25361f.f39167m.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f25361f.f39167m.setVisibility(8);
            }
            this.f25361f.f39166f.setOnClickListener(new d(ex6Var, position));
            this.f25361f.f39166f.setOnLongClickListener(new e(position));
            this.f25361f.f39167m.setOnClickListener(new f(ex6Var, position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == this.f25370o) {
            this.f25360e = mah.inflate(layoutInflaterFrom, parent, false);
            i iVar = new i(this.f25360e.getRoot());
            iVar.setBinding(this.f25360e);
            return iVar;
        }
        this.f25361f = gah.inflate(layoutInflaterFrom, parent, false);
        h hVar = new h(this.f25361f.getRoot());
        hVar.setBinding(this.f25361f);
        return hVar;
    }

    public void removeSelectData() {
        ArrayList<ex6> arrayList = this.f25357b;
        if (arrayList != null) {
            Iterator<ex6> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().isSelect()) {
                    it.remove();
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setAllSelectState(boolean isSelect) {
        this.f25372q = isSelect;
        ArrayList<ex6> arrayList = this.f25357b;
        if (arrayList != null) {
            Iterator<ex6> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setSelect(isSelect);
            }
        }
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<dx6> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<dx6> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ex6(false, it.next()));
        }
        this.f25357b.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f25368m = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(g onItemClickListener) {
        this.f25358c = onItemClickListener;
    }

    public void setScrollToPosition(int position) {
        this.f25373r = position;
    }

    public void updateChangedItemBean(dx6 bean, int position) {
        this.f25357b.set(position, new ex6(false, bean));
        notifyItemChanged(position);
    }

    public void updateMessage(dx6 message, int position) {
        ArrayList<ex6> arrayList = this.f25357b;
        arrayList.remove(arrayList.get(position));
        this.f25357b.add(position, new ex6(false, message));
        notifyItemChanged(position);
    }
}
