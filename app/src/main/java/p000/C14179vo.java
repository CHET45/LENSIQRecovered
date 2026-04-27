package p000;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: vo */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,143:1\n151#2,3:144\n33#2,4:147\n154#2,2:151\n38#2:153\n156#2:154\n37#3,2:155\n26#4:157\n26#4:158\n26#4:159\n26#4:160\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n94#1:144,3\n94#1:147,4\n94#1:151,2\n94#1:153\n94#1:154\n94#1:155,2\n107#1:157\n108#1:158\n109#1:159\n110#1:160\n*E\n"})
public final class C14179vo {
    @c5e(26)
    @ug5
    public static final void performAutofill(@yfb C13118to c13118to, @yfb SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            hm0 hm0Var = hm0.f44100a;
            if (hm0Var.isText(autofillValue)) {
                c13118to.getAutofillTree().performAutofill(iKeyAt, hm0Var.textValue(autofillValue).toString());
            } else {
                if (hm0Var.isDate(autofillValue)) {
                    throw new wfb("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (hm0Var.isList(autofillValue)) {
                    throw new wfb("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (hm0Var.isToggle(autofillValue)) {
                    throw new wfb("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @c5e(26)
    @ug5
    public static final void populateViewStructure(@yfb C13118to c13118to, @yfb ViewStructure viewStructure) {
        int iAddChildCount = gm0.f40161a.addChildCount(viewStructure, c13118to.getAutofillTree().getChildren().size());
        for (Map.Entry<Integer, lm0> entry : c13118to.getAutofillTree().getChildren().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            lm0 value = entry.getValue();
            gm0 gm0Var = gm0.f40161a;
            ViewStructure viewStructureNewChild = gm0Var.newChild(viewStructure, iAddChildCount);
            if (viewStructureNewChild != null) {
                hm0 hm0Var = hm0.f44100a;
                AutofillId autofillId = hm0Var.getAutofillId(viewStructure);
                md8.checkNotNull(autofillId);
                hm0Var.setAutofillId(viewStructureNewChild, autofillId, iIntValue);
                gm0Var.setId(viewStructureNewChild, iIntValue, c13118to.getView().getContext().getPackageName(), null, null);
                hm0Var.setAutofillType(viewStructureNewChild, nv2.f65777b.m31250getTextA48pgw8());
                List<nm0> autofillTypes = value.getAutofillTypes();
                ArrayList arrayList = new ArrayList(autofillTypes.size());
                int size = autofillTypes.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(C13631uo.getAndroidType(autofillTypes.get(i)));
                }
                hm0Var.setAutofillHints(viewStructureNewChild, (String[]) arrayList.toArray(new String[0]));
                rud boundingBox = value.getBoundingBox();
                if (boundingBox == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int iRound = Math.round(boundingBox.getLeft());
                    int iRound2 = Math.round(boundingBox.getTop());
                    int iRound3 = Math.round(boundingBox.getRight());
                    gm0.f40161a.setDimens(viewStructureNewChild, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(boundingBox.getBottom()) - iRound2);
                }
            }
            iAddChildCount++;
        }
    }
}
