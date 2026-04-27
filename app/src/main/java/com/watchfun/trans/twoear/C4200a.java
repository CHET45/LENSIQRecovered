package com.watchfun.trans.twoear;

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
import p000.efb;
import p000.gah;
import p000.igg;
import p000.mah;
import p000.mc2;
import p000.nch;
import p000.pch;
import p000.qch;

/* JADX INFO: renamed from: com.watchfun.trans.twoear.a */
/* JADX INFO: loaded from: classes6.dex */
public class C4200a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: s */
    public static final String f25887s = "AiTransTwoEarAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f25888a;

    /* JADX INFO: renamed from: c */
    public g f25890c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f25891d;

    /* JADX INFO: renamed from: e */
    public mah f25892e;

    /* JADX INFO: renamed from: f */
    public gah f25893f;

    /* JADX INFO: renamed from: g */
    public String f25894g;

    /* JADX INFO: renamed from: i */
    public nch f25896i;

    /* JADX INFO: renamed from: j */
    public String f25897j;

    /* JADX INFO: renamed from: k */
    public pch f25898k;

    /* JADX INFO: renamed from: l */
    public int f25899l;

    /* JADX INFO: renamed from: m */
    public int f25900m;

    /* JADX INFO: renamed from: n */
    public boolean f25901n;

    /* JADX INFO: renamed from: b */
    public ArrayList<qch> f25889b = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public int f25895h = -1;

    /* JADX INFO: renamed from: o */
    public int f25902o = 1;

    /* JADX INFO: renamed from: p */
    public int f25903p = 2;

    /* JADX INFO: renamed from: q */
    public boolean f25904q = false;

    /* JADX INFO: renamed from: r */
    public int f25905r = -1;

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.a$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qch f25906a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25907b;

        public a(final qch val$bean, final int val$position) {
            this.f25906a = val$bean;
            this.f25907b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!C4200a.this.f25901n) {
                if (TranslateWebSocketManager.getInstance().isAsring()) {
                    return;
                }
                C4200a.this.f25898k = this.f25906a.getXfTransTwoEarMessage();
                C4200a.this.f25890c.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25907b, C4200a.this.f25898k);
                return;
            }
            C4200a.this.f25904q = false;
            this.f25906a.setSelect(!r4.isSelect());
            C4200a.this.notifyItemChanged(this.f25907b);
            C4200a c4200a = C4200a.this;
            c4200a.f25890c.click(c4200a.f25904q);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.a$b */
    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25909a;

        public b(final int val$position) {
            this.f25909a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C4200a.this.setEditMode(!r0.f25901n);
            C4200a c4200a = C4200a.this;
            c4200a.f25890c.onItemLongClick(v, this.f25909a, c4200a.f25898k, C4200a.this.f25901n);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.a$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qch f25911a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25912b;

        public c(final qch val$bean, final int val$position) {
            this.f25911a = val$bean;
            this.f25912b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C4200a.this.f25904q = false;
            this.f25911a.setSelect(!r2.isSelect());
            C4200a.this.notifyItemChanged(this.f25912b);
            C4200a c4200a = C4200a.this;
            c4200a.f25890c.click(c4200a.f25904q);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.a$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qch f25914a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25915b;

        public d(final qch val$bean, final int val$position) {
            this.f25914a = val$bean;
            this.f25915b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!C4200a.this.f25901n) {
                if (TranslateWebSocketManager.getInstance().isAsring()) {
                    return;
                }
                C4200a.this.f25898k = this.f25914a.getXfTransTwoEarMessage();
                C4200a.this.f25890c.onItemChatPlayVoice(v.findViewById(C4035R.id.receive_img_voice_btn), this.f25915b, C4200a.this.f25898k);
                return;
            }
            C4200a.this.f25904q = false;
            this.f25914a.setSelect(!r4.isSelect());
            C4200a.this.notifyItemChanged(this.f25915b);
            C4200a c4200a = C4200a.this;
            c4200a.f25890c.click(c4200a.f25904q);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.a$e */
    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25917a;

        public e(final int val$position) {
            this.f25917a = val$position;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            if (TranslateWebSocketManager.getInstance().isAsring()) {
                return false;
            }
            C4200a.this.setEditMode(!r0.f25901n);
            C4200a c4200a = C4200a.this;
            c4200a.f25890c.onItemLongClick(v, this.f25917a, c4200a.f25898k, C4200a.this.f25901n);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.a$f */
    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qch f25919a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25920b;

        public f(final qch val$bean, final int val$position) {
            this.f25919a = val$bean;
            this.f25920b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C4200a.this.f25904q = false;
            this.f25919a.setSelect(!r2.isSelect());
            C4200a.this.notifyItemChanged(this.f25920b);
            C4200a c4200a = C4200a.this;
            c4200a.f25890c.click(c4200a.f25904q);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.a$g */
    public interface g {
        void click(boolean isAllSelect);

        void onItemChatPlayVoice(View v, int postion, pch xfAiMessage);

        void onItemLongClick(View v, int postion, pch xfAiMessage, boolean isEditMode);
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.a$h */
    public static class h extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public gah f25922a;

        public h(View itemView) {
            super(itemView);
        }

        public gah getBinding() {
            return this.f25922a;
        }

        public void setBinding(gah binding) {
            this.f25922a = binding;
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.twoear.a$i */
    public static class i extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public mah f25923a;

        public i(View itemView) {
            super(itemView);
        }

        public mah getBinding() {
            return this.f25923a;
        }

        public void setBinding(mah binding) {
            this.f25923a = binding;
        }
    }

    public C4200a(Context context, RecyclerView recyclerView, nch xfMessageDao) {
        this.f25888a = context;
        this.f25896i = xfMessageDao;
        this.f25891d = recyclerView;
    }

    public void addData(pch message) {
        if (message != null) {
            this.f25889b.add(new qch(false, message));
            notifyItemInserted(this.f25889b.size() - 1);
        }
    }

    public ArrayList<qch> getData() {
        return this.f25889b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25889b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (!mc2.isEmpty(this.f25889b)) {
            pch xfTransTwoEarMessage = this.f25889b.get(position).getXfTransTwoEarMessage();
            this.f25899l = xfTransTwoEarMessage.getType();
            this.f25900m = xfTransTwoEarMessage.getMultipleOptions();
        }
        return this.f25899l == 1 ? this.f25902o : this.f25903p;
    }

    public List<pch> getSelectData() {
        ArrayList arrayList = new ArrayList();
        ArrayList<qch> arrayList2 = this.f25889b;
        if (arrayList2 != null) {
            for (qch qchVar : arrayList2) {
                if (qchVar.isSelect()) {
                    arrayList.add(qchVar.getXfTransTwoEarMessage());
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position) {
        qch qchVar = this.f25889b.get(position);
        pch xfTransTwoEarMessage = qchVar.getXfTransTwoEarMessage();
        this.f25898k = xfTransTwoEarMessage;
        if (holder instanceof i) {
            mah mahVar = ((i) holder).f25923a;
            this.f25892e = mahVar;
            mahVar.f60369m.setText(xfTransTwoEarMessage.getResult());
            this.f25892e.f60368f.setText(this.f25898k.getTransResult());
            if (this.f25901n) {
                this.f25892e.f60367e.setVisibility(0);
                if (qchVar.isSelect()) {
                    this.f25892e.f60367e.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f25892e.f60367e.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f25892e.f60367e.setVisibility(8);
            }
            this.f25892e.f60366d.setOnClickListener(new a(qchVar, position));
            this.f25892e.f60366d.setOnLongClickListener(new b(position));
            this.f25892e.f60367e.setOnClickListener(new c(qchVar, position));
            return;
        }
        if (holder instanceof h) {
            gah gahVar = ((h) holder).f25922a;
            this.f25893f = gahVar;
            gahVar.f39163c.setText(xfTransTwoEarMessage.getResult());
            this.f25893f.f39162b.setText(this.f25898k.getTransResult());
            if (this.f25901n) {
                this.f25893f.f39167m.setVisibility(0);
                if (qchVar.isSelect()) {
                    this.f25893f.f39167m.setBackgroundResource(C4201R.drawable.ic_edit_select);
                } else {
                    this.f25893f.f39167m.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
                }
            } else {
                this.f25893f.f39167m.setVisibility(8);
            }
            this.f25893f.f39166f.setOnClickListener(new d(qchVar, position));
            this.f25893f.f39166f.setOnLongClickListener(new e(position));
            this.f25893f.f39167m.setOnClickListener(new f(qchVar, position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == this.f25902o) {
            this.f25892e = mah.inflate(layoutInflaterFrom, parent, false);
            i iVar = new i(this.f25892e.getRoot());
            iVar.setBinding(this.f25892e);
            return iVar;
        }
        this.f25893f = gah.inflate(layoutInflaterFrom, parent, false);
        h hVar = new h(this.f25893f.getRoot());
        hVar.setBinding(this.f25893f);
        return hVar;
    }

    public void removeSelectData() {
        ArrayList<qch> arrayList = this.f25889b;
        if (arrayList != null) {
            Iterator<qch> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().isSelect()) {
                    it.remove();
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setAllSelectState(boolean isSelect) {
        this.f25904q = isSelect;
        ArrayList<qch> arrayList = this.f25889b;
        if (arrayList != null) {
            Iterator<qch> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setSelect(isSelect);
            }
        }
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<pch> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<pch> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new qch(false, it.next()));
        }
        this.f25889b.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f25901n = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(g onItemClickListener) {
        this.f25890c = onItemClickListener;
    }

    public void setScrollToPosition(int position) {
        this.f25905r = position;
    }

    public void updateChangedItemBean(pch bean, int position) {
        this.f25889b.set(position, new qch(false, bean));
        notifyItemChanged(position);
    }

    public void updateMessage(pch message, int position) {
        ArrayList<qch> arrayList = this.f25889b;
        arrayList.remove(arrayList.get(position));
        this.f25889b.add(new qch(false, message));
        notifyItemChanged(position);
    }
}
