package p000;

import android.view.View;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,92:1\n48#2:93\n49#2,4:103\n116#3,2:94\n33#3,6:96\n118#3:102\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n39#1:93\n39#1:103,4\n39#1:94,2\n39#1:96,6\n39#1:102\n*E\n"})
public final class p9i {

    /* JADX INFO: renamed from: a */
    public static final int f70129a = tagKey("ViewAdapter");

    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public static final <T extends h8i> T getOrAddAdapter(@yfb View view, int i, @yfb ny6<? extends T> ny6Var) {
        h8i h8iVar;
        qra viewAdapter = getViewAdapter(view);
        List<h8i> adapters = viewAdapter.getAdapters();
        int size = adapters.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                h8iVar = null;
                break;
            }
            h8iVar = adapters.get(i2);
            if (h8iVar.getId() == i) {
                break;
            }
            i2++;
        }
        T t = h8iVar instanceof h8i ? (T) h8iVar : null;
        if (t != null) {
            return t;
        }
        T tInvoke = ny6Var.invoke();
        viewAdapter.getAdapters().add(tInvoke);
        return tInvoke;
    }

    @yfb
    public static final qra getViewAdapter(@yfb View view) {
        int i = f70129a;
        Object tag = view.getTag(i);
        qra qraVar = tag instanceof qra ? (qra) tag : null;
        if (qraVar != null) {
            return qraVar;
        }
        qra qraVar2 = new qra();
        view.setTag(i, qraVar2);
        return qraVar2;
    }

    @gib
    public static final qra getViewAdapterIfExists(@yfb View view) {
        Object tag = view.getTag(f70129a);
        if (tag instanceof qra) {
            return (qra) tag;
        }
        return null;
    }

    public static final int tagKey(@yfb String str) {
        return str.hashCode() | 50331648;
    }
}
