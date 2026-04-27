package p000;

import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import p000.tte;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eu0<T extends tte, VH extends BaseViewHolder> extends is0<T, VH> {

    /* JADX INFO: renamed from: I */
    public final int f34023I;

    @yn8
    public eu0(@uw8 int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    @Override // p000.mt0
    /* JADX INFO: renamed from: j */
    public boolean mo10228j(int i) {
        return super.mo10228j(i) || i == -99;
    }

    /* JADX INFO: renamed from: t */
    public abstract void m10229t(@yfb VH vh, @yfb T t);

    /* JADX INFO: renamed from: u */
    public void m10230u(@yfb VH vh, @yfb T t, @yfb List<Object> list) {
        md8.checkParameterIsNotNull(vh, "helper");
        md8.checkParameterIsNotNull(t, "item");
        md8.checkParameterIsNotNull(list, "payloads");
    }

    /* JADX INFO: renamed from: v */
    public final void m10231v(@uw8 int i) {
        m13360s(-100, i);
    }

    public /* synthetic */ eu0(int i, List list, int i2, jt3 jt3Var) {
        this(i, (i2 & 2) != 0 ? null : list);
    }

    @Override // p000.mt0, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        onBindViewHolder((BaseViewHolder) viewHolder, i, (List<Object>) list);
    }

    @yn8
    public eu0(@uw8 int i, @gib List<T> list) {
        super(list);
        this.f34023I = i;
        m13360s(-99, i);
    }

    @Override // p000.mt0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@yfb VH vh, int i) {
        md8.checkParameterIsNotNull(vh, "holder");
        if (vh.getItemViewType() == -99) {
            m10229t(vh, getItem(i - getHeaderLayoutCount()));
        } else {
            super.onBindViewHolder((BaseViewHolder) vh, i);
        }
    }

    public eu0(@uw8 int i, @uw8 int i2, @gib List<T> list) {
        this(i, list);
        m10231v(i2);
    }

    @Override // p000.mt0
    public void onBindViewHolder(@yfb VH vh, int i, @yfb List<Object> list) {
        md8.checkParameterIsNotNull(vh, "holder");
        md8.checkParameterIsNotNull(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder((BaseViewHolder) vh, i);
        } else if (vh.getItemViewType() == -99) {
            m10230u(vh, getItem(i - getHeaderLayoutCount()), list);
        } else {
            super.onBindViewHolder((BaseViewHolder) vh, i, list);
        }
    }

    public /* synthetic */ eu0(int i, int i2, List list, int i3, jt3 jt3Var) {
        this(i, i2, (i3 & 4) != 0 ? null : list);
    }
}
