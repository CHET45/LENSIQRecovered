package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.haibin.calendarview.AbstractC3802a;
import com.haibin.calendarview.C3803b;
import com.haibin.calendarview.DefaultYearView;
import com.haibin.calendarview.YearView;

/* JADX INFO: loaded from: classes5.dex */
public final class jti extends AbstractC3802a<wya> {

    /* JADX INFO: renamed from: f */
    public C3803b f51816f;

    /* JADX INFO: renamed from: g */
    public int f51817g;

    /* JADX INFO: renamed from: h */
    public int f51818h;

    /* JADX INFO: renamed from: jti$a */
    public static class C8082a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public YearView f51819a;

        public C8082a(View view, C3803b c3803b) {
            super(view);
            YearView yearView = (YearView) view;
            this.f51819a = yearView;
            yearView.setup(c3803b);
        }
    }

    public jti(Context context) {
        super(context);
    }

    @Override // com.haibin.calendarview.AbstractC3802a
    /* JADX INFO: renamed from: f */
    public RecyclerView.ViewHolder mo6970f(ViewGroup viewGroup, int i) {
        View defaultYearView;
        if (TextUtils.isEmpty(this.f51816f.m7010Y())) {
            defaultYearView = new DefaultYearView(this.f23851e);
        } else {
            try {
                defaultYearView = (YearView) this.f51816f.m7009X().getConstructor(Context.class).newInstance(this.f23851e);
            } catch (Exception e) {
                e.printStackTrace();
                defaultYearView = new DefaultYearView(this.f23851e);
            }
        }
        defaultYearView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        return new C8082a(defaultYearView, this.f51816f);
    }

    @Override // com.haibin.calendarview.AbstractC3802a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo6969e(RecyclerView.ViewHolder viewHolder, wya wyaVar, int i) {
        YearView yearView = ((C8082a) viewHolder).f51819a;
        yearView.m6951a(wyaVar.m24857d(), wyaVar.m24856c());
        yearView.m6952b(this.f51817g, this.f51818h);
    }

    /* JADX INFO: renamed from: h */
    public final void m14304h(int i, int i2) {
        this.f51817g = i;
        this.f51818h = i2;
    }

    /* JADX INFO: renamed from: i */
    public final void m14305i(C3803b c3803b) {
        this.f51816f = c3803b;
    }
}
