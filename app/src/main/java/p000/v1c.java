package p000;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:116,2\n*E\n"})
public abstract class v1c {

    @yfb
    private final CopyOnWriteArrayList<cq1> cancellables = new CopyOnWriteArrayList<>();

    @gib
    private ny6<bth> enabledChangedCallback;
    private boolean isEnabled;

    public v1c(boolean z) {
        this.isEnabled = z;
    }

    @xn8(name = "addCancellable")
    public final void addCancellable(@yfb cq1 cq1Var) {
        md8.checkNotNullParameter(cq1Var, "cancellable");
        this.cancellables.add(cq1Var);
    }

    @gib
    public final ny6<bth> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @ir9
    public void handleOnBackCancelled() {
    }

    @ir9
    public abstract void handleOnBackPressed();

    @ir9
    public void handleOnBackProgressed(@yfb on0 on0Var) {
        md8.checkNotNullParameter(on0Var, "backEvent");
    }

    @ir9
    public void handleOnBackStarted(@yfb on0 on0Var) {
        md8.checkNotNullParameter(on0Var, "backEvent");
    }

    @ir9
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @ir9
    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((cq1) it.next()).cancel();
        }
    }

    @xn8(name = "removeCancellable")
    public final void removeCancellable(@yfb cq1 cq1Var) {
        md8.checkNotNullParameter(cq1Var, "cancellable");
        this.cancellables.remove(cq1Var);
    }

    @ir9
    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        ny6<bth> ny6Var = this.enabledChangedCallback;
        if (ny6Var != null) {
            ny6Var.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(@gib ny6<bth> ny6Var) {
        this.enabledChangedCallback = ny6Var;
    }
}
