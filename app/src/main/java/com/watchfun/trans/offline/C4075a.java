package com.watchfun.trans.offline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.trans.C4035R;
import java.util.ArrayList;
import java.util.List;
import p000.c1i;
import p000.efb;
import p000.vk4;
import p000.yv7;
import p000.zm4;

/* JADX INFO: renamed from: com.watchfun.trans.offline.a */
/* JADX INFO: loaded from: classes6.dex */
public class C4075a extends RecyclerView.Adapter<d> {

    /* JADX INFO: renamed from: d */
    public static final String f25484d = "LanguageDownloadAdapter";

    /* JADX INFO: renamed from: a */
    public List<vk4> f25485a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Context f25486b;

    /* JADX INFO: renamed from: c */
    public c f25487c;

    /* JADX INFO: renamed from: com.watchfun.trans.offline.a$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vk4 f25488a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25489b;

        public a(final vk4 val$bean, final int val$position) {
            this.f25488a = val$bean;
            this.f25489b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if ((this.f25488a.getDownloadStatus() == null || this.f25488a.getDownloadStatus() == zm4.NOT_START || this.f25488a.getDownloadStatus() == zm4.FAILED) && C4075a.this.f25487c != null) {
                C4075a.this.f25487c.onDownload(this.f25488a, this.f25489b);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.offline.a$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vk4 f25491a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25492b;

        public b(final vk4 val$bean, final int val$position) {
            this.f25491a = val$bean;
            this.f25492b = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (C4075a.this.f25487c != null) {
                C4075a.this.f25487c.onRedownload(this.f25491a, this.f25492b);
            }
        }
    }

    /* JADX INFO: renamed from: com.watchfun.trans.offline.a$c */
    public interface c {
        void onDownload(vk4 bean, int pos);

        void onRedownload(vk4 bean, int pos);
    }

    /* JADX INFO: renamed from: com.watchfun.trans.offline.a$d */
    public class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f25495a;

        /* JADX INFO: renamed from: b */
        public TextView f25496b;

        /* JADX INFO: renamed from: c */
        public TextView f25497c;

        /* JADX INFO: renamed from: d */
        public TextView f25498d;

        /* JADX INFO: renamed from: e */
        public TextView f25499e;

        /* JADX INFO: renamed from: f */
        public View f25500f;

        /* JADX INFO: renamed from: m */
        public View f25501m;

        public d(@efb View itemView) {
            super(itemView);
            this.f25495a = (TextView) itemView.findViewById(C4035R.id.tv_name);
            this.f25496b = (TextView) itemView.findViewById(C4035R.id.tv_size);
            this.f25497c = (TextView) itemView.findViewById(C4035R.id.tv_status);
            this.f25498d = (TextView) itemView.findViewById(C4035R.id.tv_progress);
            this.f25499e = (TextView) itemView.findViewById(C4035R.id.tv_redownload);
            this.f25500f = itemView.findViewById(C4035R.id.divider);
            this.f25501m = itemView.findViewById(C4035R.id.ll_right);
        }
    }

    public C4075a(Context context, List<vk4> languageDownloadBeans) {
        this.f25486b = context;
        setData(languageDownloadBeans);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25485a.size();
    }

    public void setData(List<vk4> beans) {
        this.f25485a = beans;
        notifyDataSetChanged();
    }

    public void setListener(c listener) {
        this.f25487c = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@efb RecyclerView.ViewHolder holder, int position, @efb List payloads) {
        onBindViewHolder((d) holder, position, (List<Object>) payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public d onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return new d(LayoutInflater.from(this.f25486b).inflate(C4035R.layout.rv_language_download, parent, false));
    }

    public void onBindViewHolder(@efb d holder, int position, @efb List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb d holder, int position) {
        vk4 vk4Var = this.f25485a.get(position);
        holder.f25495a.setText(vk4Var.getName());
        holder.f25496b.setText(vk4Var.getSize());
        ViewGroup.LayoutParams layoutParams = holder.f25497c.getLayoutParams();
        layoutParams.width = -2;
        holder.f25497c.setLayoutParams(layoutParams);
        if (vk4Var.getDownloadStatus() == zm4.DOWNLOADING) {
            holder.f25497c.setText(this.f25486b.getString(C4035R.string.download_status_downloading));
            holder.f25497c.setPadding(0, 0, 0, 0);
            holder.f25497c.setBackgroundDrawable(null);
            holder.f25497c.setTextColor(this.f25486b.getColor(C4035R.color.color_black_33));
            holder.f25498d.setVisibility(0);
            holder.f25498d.setText(String.format(this.f25486b.getString(C4035R.string.download_progress), Integer.valueOf(vk4Var.getProgress())) + yv7.f103133a);
            holder.f25499e.setVisibility(8);
        } else if (vk4Var.getDownloadStatus() == zm4.SUCCESS) {
            layoutParams.width = c1i.dip2Px(this.f25486b, 100);
            holder.f25497c.setLayoutParams(layoutParams);
            holder.f25497c.setText(this.f25486b.getString(C4035R.string.download_status_success));
            holder.f25497c.setPadding(c1i.dip2Px(this.f25486b, 12), c1i.dip2Px(this.f25486b, 9), c1i.dip2Px(this.f25486b, 12), c1i.dip2Px(this.f25486b, 9));
            holder.f25497c.setBackgroundResource(C4035R.drawable.ic_download_finish);
            holder.f25497c.setTextColor(this.f25486b.getColor(C4035R.color.color_gray_d9));
            holder.f25498d.setVisibility(8);
            holder.f25499e.setVisibility(8);
        } else if (vk4Var.getDownloadStatus() == zm4.FAILED) {
            holder.f25497c.setText(this.f25486b.getString(C4035R.string.download_status_fail));
            holder.f25497c.setPadding(0, 0, 0, 0);
            holder.f25497c.setTextColor(this.f25486b.getColor(C4035R.color.color_red_ff3b30));
            holder.f25497c.setBackgroundDrawable(null);
            holder.f25498d.setVisibility(8);
            holder.f25499e.setVisibility(0);
        } else if (vk4Var.getDownloadStatus() == zm4.UNZIPING) {
            holder.f25497c.setText(this.f25486b.getString(C4035R.string.download_status_unziping));
            holder.f25497c.setPadding(0, 0, 0, 0);
            holder.f25497c.setTextColor(this.f25486b.getColor(C4035R.color.color_black_33));
            holder.f25497c.setBackgroundDrawable(null);
            holder.f25498d.setVisibility(8);
            holder.f25499e.setVisibility(8);
        } else {
            layoutParams.width = c1i.dip2Px(this.f25486b, 100);
            holder.f25497c.setLayoutParams(layoutParams);
            holder.f25497c.setText(this.f25486b.getString(C4035R.string.download_status_not_start));
            holder.f25497c.setPadding(c1i.dip2Px(this.f25486b, 12), c1i.dip2Px(this.f25486b, 9), c1i.dip2Px(this.f25486b, 12), c1i.dip2Px(this.f25486b, 9));
            holder.f25497c.setBackgroundResource(C4035R.drawable.ic_download_not_start);
            holder.f25497c.setTextColor(this.f25486b.getColor(C4035R.color.color_download));
            holder.f25498d.setVisibility(8);
            holder.f25499e.setVisibility(8);
        }
        if (position == this.f25485a.size() - 1) {
            holder.f25500f.setVisibility(8);
        } else {
            holder.f25500f.setVisibility(0);
        }
        holder.f25501m.setOnClickListener(new a(vk4Var, position));
        holder.f25499e.setOnClickListener(new b(vk4Var, position));
    }
}
