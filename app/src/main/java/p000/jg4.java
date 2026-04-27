package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p002ui.C0693R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.zle;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n1855#2,2:191\n215#3,2:193\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n172#1:191,2\n181#1:193,2\n*E\n"})
public final class jg4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Class<? extends Object>[] f50466a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: jg4$a */
    public static final class C7895a extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f50467a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zle f50468b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f50469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7895a(boolean z, zle zleVar, String str) {
            super(0);
            this.f50467a = z;
            this.f50468b = zleVar;
            this.f50469c = str;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f50467a) {
                this.f50468b.unregisterSavedStateProvider(this.f50469c);
            }
        }
    }

    /* JADX INFO: renamed from: jg4$b */
    public static final class C7896b extends tt8 implements qy6<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C7896b f50470a = new C7896b();

        public C7896b() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb Object obj) {
            return Boolean.valueOf(jg4.canBeSavedToBundle(obj));
        }
    }

    @yfb
    public static final hg4 DisposableSaveableStateRegistry(@yfb View view, @yfb bme bmeVar) {
        Object parent = view.getParent();
        md8.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(C0693R.id.compose_view_saveable_id_tag);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return DisposableSaveableStateRegistry(strValueOf, bmeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle DisposableSaveableStateRegistry$lambda$0(sle sleVar) {
        return toBundle(sleVar.performSave());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canBeSavedToBundle(Object obj) {
        if (obj instanceof ptf) {
            ptf ptfVar = (ptf) obj;
            if (ptfVar.getPolicy() != stf.neverEqualPolicy() && ptfVar.getPolicy() != stf.structuralEqualityPolicy() && ptfVar.getPolicy() != stf.referentialEqualityPolicy()) {
                return false;
            }
            T value = ptfVar.getValue();
            if (value == 0) {
                return true;
            }
            return canBeSavedToBundle(value);
        }
        if ((obj instanceof uy6) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : f50466a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle toBundle(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> toMap(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            md8.checkNotNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }

    @yfb
    public static final hg4 DisposableSaveableStateRegistry(@yfb String str, @yfb bme bmeVar) {
        boolean z;
        String str2 = sle.class.getSimpleName() + ':' + str;
        zle savedStateRegistry = bmeVar.getSavedStateRegistry();
        Bundle bundleConsumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str2);
        final sle sleVarSaveableStateRegistry = ule.SaveableStateRegistry(bundleConsumeRestoredStateForKey != null ? toMap(bundleConsumeRestoredStateForKey) : null, C7896b.f50470a);
        try {
            savedStateRegistry.registerSavedStateProvider(str2, new zle.InterfaceC16181c() { // from class: ig4
                @Override // p000.zle.InterfaceC16181c
                public final Bundle saveState() {
                    return jg4.DisposableSaveableStateRegistry$lambda$0(sleVarSaveableStateRegistry);
                }
            });
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new hg4(sleVarSaveableStateRegistry, new C7895a(z, savedStateRegistry, str2));
    }
}
