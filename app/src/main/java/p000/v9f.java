package p000;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class v9f {
    @igg({"ApplySharedPref"})
    public static final void edit(@yfb SharedPreferences sharedPreferences, boolean z, @yfb qy6<? super SharedPreferences.Editor, bth> qy6Var) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        qy6Var.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        qy6Var.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
