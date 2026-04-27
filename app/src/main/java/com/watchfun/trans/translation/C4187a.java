package com.watchfun.trans.translation;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.watchfun.trans.C4035R;
import com.watchfun.transcommon.C4201R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.ach;
import p000.bch;
import p000.d1h;
import p000.efb;
import p000.igg;
import p000.jbh;
import p000.lx2;

/* JADX INFO: renamed from: com.watchfun.trans.translation.a */
/* JADX INFO: loaded from: classes6.dex */
public class C4187a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a */
    public Context f25851a;

    /* JADX INFO: renamed from: c */
    public b f25853c;

    /* JADX INFO: renamed from: d */
    public ach f25854d;

    /* JADX INFO: renamed from: e */
    public boolean f25855e;

    /* JADX INFO: renamed from: g */
    public jbh f25857g;

    /* JADX INFO: renamed from: b */
    public List<bch> f25852b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f25856f = false;

    /* JADX INFO: renamed from: com.watchfun.trans.translation.a$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bch f25858a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25859b;

        public a(final bch val$transMachineRecordSelect, final int val$position) {
            this.f25858a = val$transMachineRecordSelect;
            this.f25859b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            C4187a.this.f25856f = false;
            this.f25858a.setSelect(!r2.isSelect());
            C4187a.this.notifyItemChanged(this.f25859b);
            C4187a.this.f25853c.click(C4187a.this.f25856f);
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.a$b */
    public interface b {
        void click(boolean isAllSelect);

        void onItemClick(jbh record);

        void onShareClick(jbh record);
    }

    /* JADX INFO: renamed from: com.watchfun.trans.translation.a$c */
    public static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public ach f25861a;

        public c(@efb View itemView) {
            super(itemView);
        }

        public ach getBinding() {
            return this.f25861a;
        }

        public void setBinding(ach binding) {
            this.f25861a = binding;
        }
    }

    public C4187a(Context context) {
        this.f25851a = context;
    }

    private float dpToPx(int dp) {
        return dp * this.f25851a.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(bch bchVar, int i, jbh jbhVar, View view) {
        if (this.f25855e) {
            this.f25856f = false;
            bchVar.setSelect(!bchVar.isSelect());
            notifyItemChanged(i);
            this.f25853c.click(this.f25856f);
            return;
        }
        b bVar = this.f25853c;
        if (bVar != null) {
            bVar.onItemClick(jbhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$1(bch bchVar, int i, jbh jbhVar, View view) {
        if (this.f25855e) {
            this.f25856f = false;
            bchVar.setSelect(!bchVar.isSelect());
            notifyItemChanged(i);
            this.f25853c.click(this.f25856f);
            return;
        }
        b bVar = this.f25853c;
        if (bVar != null) {
            bVar.onShareClick(jbhVar);
        }
    }

    private void setItemBackground(View itemView, int position) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(lx2.getColor(this.f25851a, R.color.white));
        float fDpToPx = dpToPx(12);
        if (getItemCount() == 1) {
            gradientDrawable.setCornerRadii(new float[]{fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx});
        } else if (position == 0) {
            gradientDrawable.setCornerRadii(new float[]{fDpToPx, fDpToPx, fDpToPx, fDpToPx, 0.0f, 0.0f, 0.0f, 0.0f});
        } else if (position == getItemCount() - 1) {
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fDpToPx, fDpToPx, fDpToPx, fDpToPx});
        } else {
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        itemView.setBackground(gradientDrawable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25852b.size();
    }

    public List<jbh> getSelectData() {
        ArrayList arrayList = new ArrayList();
        List<bch> list = this.f25852b;
        if (list != null) {
            for (bch bchVar : list) {
                if (bchVar.isSelect()) {
                    arrayList.add(bchVar.getTransMachineRecord());
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @igg({"RecyclerView"})
    public void onBindViewHolder(@efb RecyclerView.ViewHolder holder, final int position) {
        ach achVar = ((c) holder).f25861a;
        final bch bchVar = this.f25852b.get(position);
        final jbh transMachineRecord = bchVar.getTransMachineRecord();
        achVar.f1108m.setText(transMachineRecord.getName());
        achVar.f1107f.setText(d1h.formatLongToDate(transMachineRecord.getTime()));
        achVar.f1101C.setText(d1h.formatLongToTime(transMachineRecord.getDuration()));
        Log.e("testtest", "onBindViewHolder ---> " + transMachineRecord.getSourceVoicePath());
        if (TextUtils.isEmpty(transMachineRecord.getSourceVoicePath())) {
            achVar.f1104c.setVisibility(0);
            ComponentCallbacks2C2485a.with(this.f25851a).asGif().load(Integer.valueOf(C4035R.drawable.ic_loading_gif)).into(achVar.f1104c);
            achVar.f1108m.setTextColor(this.f25851a.getResources().getColor(C4035R.color.color_gray_aeaeb2));
            achVar.f1107f.setTextColor(this.f25851a.getResources().getColor(C4035R.color.color_gray_aeaeb2));
            achVar.f1101C.setTextColor(this.f25851a.getResources().getColor(C4035R.color.color_gray_aeaeb2));
        } else {
            achVar.f1104c.setVisibility(8);
            achVar.f1108m.setTextColor(this.f25851a.getResources().getColor(C4035R.color.color_black_33));
            achVar.f1107f.setTextColor(this.f25851a.getResources().getColor(C4035R.color.color_black_33));
            achVar.f1101C.setTextColor(this.f25851a.getResources().getColor(C4035R.color.color_black_33));
        }
        if (this.f25855e) {
            achVar.f1106e.setVisibility(0);
            if (bchVar.isSelect()) {
                achVar.f1106e.setBackgroundResource(C4201R.drawable.ic_edit_select);
            } else {
                achVar.f1106e.setBackgroundResource(C4201R.drawable.ic_edit_unselect);
            }
        } else {
            achVar.f1106e.setVisibility(8);
        }
        setItemBackground(holder.itemView, position);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: nbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f63933a.lambda$onBindViewHolder$0(bchVar, position, transMachineRecord, view);
            }
        });
        achVar.f1105d.setOnClickListener(new View.OnClickListener() { // from class: obh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67104a.lambda$onBindViewHolder$1(bchVar, position, transMachineRecord, view);
            }
        });
        achVar.f1106e.setOnClickListener(new a(bchVar, position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public RecyclerView.ViewHolder onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        this.f25854d = ach.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        c cVar = new c(this.f25854d.getRoot());
        cVar.setBinding(this.f25854d);
        return cVar;
    }

    public void removeSelectData() {
        List<bch> list = this.f25852b;
        if (list != null) {
            Iterator<bch> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().isSelect()) {
                    it.remove();
                }
            }
            notifyDataSetChanged();
        }
    }

    public void setAllSelectState(boolean isSelect) {
        this.f25856f = isSelect;
        List<bch> list = this.f25852b;
        if (list != null) {
            Iterator<bch> it = list.iterator();
            while (it.hasNext()) {
                it.next().setSelect(isSelect);
            }
        }
        notifyDataSetChanged();
    }

    @igg({"NotifyDataSetChanged"})
    public void setData(List<jbh> list) {
        this.f25852b.clear();
        ArrayList arrayList = new ArrayList();
        Iterator<jbh> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new bch(false, it.next()));
        }
        this.f25852b.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setEditMode(boolean editMode) {
        this.f25855e = editMode;
        if (!editMode) {
            setAllSelectState(false);
        }
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(b listener) {
        this.f25853c = listener;
    }
}
