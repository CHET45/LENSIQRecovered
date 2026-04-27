package p000;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mylhyl.circledialog.CircleParams;
import com.mylhyl.circledialog.params.ItemsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class yf1 extends wf1 {
    public yf1(Context context, CircleParams circleParams) {
        super(context, circleParams);
    }

    @Override // p000.qf1
    public void buildBodyView() {
        RecyclerView.LayoutManager layoutManager;
        mo21252d();
        m21253e();
        if (this.f94062g == null) {
            ItemsParams itemsParams = this.f78142b.f24227Y;
            this.f94062g = new ia1(this.f78141a, itemsParams, this.f78142b.f24219H);
            if (itemsParams != null && itemsParams.f24340N != null && (layoutManager = itemsParams.f24338L) != null && itemsParams.f24346c > 0 && (layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).getOrientation() == 0) {
                m21249a(new ch4(this.f78141a, 0, itemsParams.f24346c));
            }
            m21249a(this.f94062g.getView());
        }
    }

    @Override // p000.wf1, p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ wh1 buildButton() {
        return super.buildButton();
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ o52 buildCloseImgView() {
        return super.buildCloseImgView();
    }

    @Override // p000.wf1, p000.qf1
    public /* bridge */ /* synthetic */ sg8 getBodyView() {
        return super.getBodyView();
    }

    @Override // p000.wf1, p000.qf1
    public /* bridge */ /* synthetic */ void refreshContent() {
        super.refreshContent();
    }

    @Override // p000.rf1, p000.qf1
    public /* bridge */ /* synthetic */ void refreshTitle() {
        super.refreshTitle();
    }
}
