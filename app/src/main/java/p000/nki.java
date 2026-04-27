package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class nki extends RecyclerView.ViewHolder {
    public nki(View itemView) {
        super(itemView);
    }

    private final nki setBackgroundColor(@g92 int color) {
        this.itemView.setBackgroundColor(color);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final nki m17980a(int height) {
        if (this.itemView.getLayoutParams() == null) {
            this.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, height));
        } else {
            this.itemView.getLayoutParams().width = -1;
            this.itemView.getLayoutParams().height = height;
        }
        return this;
    }
}
