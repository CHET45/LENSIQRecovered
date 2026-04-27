package p000;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public interface wh1 {
    View getView();

    boolean isEmpty();

    void refreshText();

    void regNegativeListener(View.OnClickListener onClickListener);

    void regNeutralListener(View.OnClickListener onClickListener);

    void regPositiveListener(View.OnClickListener onClickListener);
}
