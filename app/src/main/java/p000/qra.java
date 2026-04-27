package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,92:1\n116#2,2:93\n33#2,6:95\n118#2:101\n33#2,6:102\n33#2,6:108\n33#2,6:114\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n48#1:93,2\n48#1:95,6\n48#1:101\n56#1:102,6\n60#1:108,6\n64#1:114,6\n*E\n"})
@e0g(parameters = 0)
public final class qra implements h8i {

    /* JADX INFO: renamed from: c */
    public static final int f75383c = 8;

    /* JADX INFO: renamed from: a */
    public final int f75384a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<h8i> f75385b = new ArrayList();

    @Override // p000.h8i
    public void didInsert(@yfb View view, @yfb ViewGroup viewGroup) {
        List<h8i> list = this.f75385b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didInsert(view, viewGroup);
        }
    }

    @Override // p000.h8i
    public void didUpdate(@yfb View view, @yfb ViewGroup viewGroup) {
        List<h8i> list = this.f75385b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didUpdate(view, viewGroup);
        }
    }

    @yfb
    public final <T extends h8i> T get(int i, @yfb ny6<? extends T> ny6Var) {
        h8i h8iVar;
        List<h8i> adapters = getAdapters();
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
        getAdapters().add(tInvoke);
        return tInvoke;
    }

    @yfb
    public final List<h8i> getAdapters() {
        return this.f75385b;
    }

    @Override // p000.h8i
    public int getId() {
        return this.f75384a;
    }

    @Override // p000.h8i
    public void willInsert(@yfb View view, @yfb ViewGroup viewGroup) {
        List<h8i> list = this.f75385b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).willInsert(view, viewGroup);
        }
    }
}
