package p000;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import java.util.Collections;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public abstract class jf3 {
    @efb
    public List<jf3> collectDependencies() {
        return Collections.emptyList();
    }

    public abstract String convertBrIdToString(int i);

    public abstract y8i getDataBinder(DataBindingComponent dataBindingComponent, View view, int i);

    public abstract y8i getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i);

    public abstract int getLayoutId(String str);
}
