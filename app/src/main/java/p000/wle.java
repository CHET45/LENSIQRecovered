package p000;

import android.os.Bundle;
import androidx.lifecycle.C1126a0;
import androidx.lifecycle.C1171x;
import java.util.Map;
import p000.zle;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n215#2,2:227\n1#3:229\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n147#1:227,2\n*E\n"})
public final class wle implements zle.InterfaceC16181c {

    /* JADX INFO: renamed from: a */
    @yfb
    public final zle f94652a;

    /* JADX INFO: renamed from: b */
    public boolean f94653b;

    /* JADX INFO: renamed from: c */
    @gib
    public Bundle f94654c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final fx8 f94655d;

    /* JADX INFO: renamed from: wle$a */
    public static final class C14674a extends tt8 implements ny6<xle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ nai f94656a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14674a(nai naiVar) {
            super(0);
            this.f94656a = naiVar;
        }

        @Override // p000.ny6
        @yfb
        public final xle invoke() {
            return C1126a0.getSavedStateHandlesVM(this.f94656a);
        }
    }

    public wle(@yfb zle zleVar, @yfb nai naiVar) {
        md8.checkNotNullParameter(zleVar, "savedStateRegistry");
        md8.checkNotNullParameter(naiVar, "viewModelStoreOwner");
        this.f94652a = zleVar;
        this.f94655d = hz8.lazy(new C14674a(naiVar));
    }

    private final xle getViewModel() {
        return (xle) this.f94655d.getValue();
    }

    @gib
    public final Bundle consumeRestoredStateForKey(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        performRestore();
        Bundle bundle = this.f94654c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f94654c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f94654c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f94654c = null;
        }
        return bundle2;
    }

    public final void performRestore() {
        if (this.f94653b) {
            return;
        }
        Bundle bundleConsumeRestoredStateForKey = this.f94652a.consumeRestoredStateForKey(C1126a0.f7771b);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f94654c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleConsumeRestoredStateForKey != null) {
            bundle.putAll(bundleConsumeRestoredStateForKey);
        }
        this.f94654c = bundle;
        this.f94653b = true;
        getViewModel();
    }

    @Override // p000.zle.InterfaceC16181c
    @yfb
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f94654c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, C1171x> entry : getViewModel().getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle bundleSaveState = entry.getValue().savedStateProvider().saveState();
            if (!md8.areEqual(bundleSaveState, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleSaveState);
            }
        }
        this.f94653b = false;
        return bundle;
    }
}
