package p000;

import java.util.ArrayList;
import java.util.List;
import p000.dw7;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,783:1\n72#2,4:784\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n722#1:784,4\n*E\n"})
public final class fw7 {
    @yfb
    public static final dw7.C4988a group(@yfb dw7.C4988a c4988a, @yfb String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @yfb List<? extends qjc> list, @yfb qy6<? super dw7.C4988a, bth> qy6Var) {
        c4988a.addGroup(str, f, f2, f3, f4, f5, f6, f7, list);
        qy6Var.invoke(c4988a);
        c4988a.clearGroup();
        return c4988a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ dw7.C4988a group$default(dw7.C4988a c4988a, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, qy6 qy6Var, int i, Object obj) {
        c4988a.addGroup((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) != 0 ? 0.0f : f7, (i & 256) != 0 ? l3i.getEmptyPath() : list);
        qy6Var.invoke(c4988a);
        c4988a.clearGroup();
        return c4988a;
    }

    @yfb
    /* JADX INFO: renamed from: path-R_LF-3I, reason: not valid java name */
    public static final dw7.C4988a m29672pathR_LF3I(@yfb dw7.C4988a c4988a, @yfb String str, @gib he1 he1Var, float f, @gib he1 he1Var2, float f2, float f3, int i, int i2, float f4, int i3, @yfb qy6<? super wic, bth> qy6Var) {
        wic wicVar = new wic();
        qy6Var.invoke(wicVar);
        return dw7.C4988a.m28710addPathoIyEayM$default(c4988a, wicVar.getNodes(), i3, str, he1Var, f, he1Var2, f2, f3, i, i2, f4, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ dw7.C4988a m29673pathR_LF3I$default(dw7.C4988a c4988a, String str, he1 he1Var, float f, he1 he1Var2, float f2, float f3, int i, int i2, float f4, int i3, qy6 qy6Var, int i4, Object obj) {
        String str2 = (i4 & 1) != 0 ? "" : str;
        he1 he1Var3 = (i4 & 2) != 0 ? null : he1Var;
        float f5 = (i4 & 4) != 0 ? 1.0f : f;
        he1 he1Var4 = (i4 & 8) != 0 ? null : he1Var2;
        float f6 = (i4 & 16) != 0 ? 1.0f : f2;
        float f7 = (i4 & 32) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i4 & 64) != 0 ? l3i.getDefaultStrokeLineCap() : i;
        int defaultStrokeLineJoin = (i4 & 128) != 0 ? l3i.getDefaultStrokeLineJoin() : i2;
        float f8 = (i4 & 256) != 0 ? 4.0f : f4;
        int defaultFillType = (i4 & 512) != 0 ? l3i.getDefaultFillType() : i3;
        wic wicVar = new wic();
        qy6Var.invoke(wicVar);
        return dw7.C4988a.m28710addPathoIyEayM$default(c4988a, wicVar.getNodes(), defaultFillType, str2, he1Var3, f5, he1Var4, f6, f7, defaultStrokeLineCap, defaultStrokeLineJoin, f8, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }
}
