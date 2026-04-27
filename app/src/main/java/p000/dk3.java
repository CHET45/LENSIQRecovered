package p000;

import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2:135\n36#2,3:136\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135\n131#1:136,3\n*E\n"})
public final class dk3 {

    /* JADX INFO: renamed from: a */
    public static final int f29863a = 1;

    private static final void checkDebugMetadataVersion(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    private static final ck3 getDebugMetadataAnnotation(tq0 tq0Var) {
        return (ck3) tq0Var.getClass().getAnnotation(ck3.class);
    }

    private static final int getLabel(tq0 tq0Var) {
        try {
            Field declaredField = tq0Var.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(tq0Var);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @gib
    @jjf(version = "1.3")
    @xn8(name = "getSpilledVariableFieldMapping")
    public static final String[] getSpilledVariableFieldMapping(@yfb tq0 tq0Var) {
        md8.checkNotNullParameter(tq0Var, "<this>");
        ck3 debugMetadataAnnotation = getDebugMetadataAnnotation(tq0Var);
        if (debugMetadataAnnotation == null) {
            return null;
        }
        checkDebugMetadataVersion(1, debugMetadataAnnotation.m4016v());
        ArrayList arrayList = new ArrayList();
        int label = getLabel(tq0Var);
        int[] iArrM4011i = debugMetadataAnnotation.m4011i();
        int length = iArrM4011i.length;
        for (int i = 0; i < length; i++) {
            if (iArrM4011i[i] == label) {
                arrayList.add(debugMetadataAnnotation.m4015s()[i]);
                arrayList.add(debugMetadataAnnotation.m4014n()[i]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @gib
    @jjf(version = "1.3")
    @xn8(name = "getStackTraceElement")
    public static final StackTraceElement getStackTraceElement(@yfb tq0 tq0Var) {
        String strM4009c;
        md8.checkNotNullParameter(tq0Var, "<this>");
        ck3 debugMetadataAnnotation = getDebugMetadataAnnotation(tq0Var);
        if (debugMetadataAnnotation == null) {
            return null;
        }
        checkDebugMetadataVersion(1, debugMetadataAnnotation.m4016v());
        int label = getLabel(tq0Var);
        int i = label < 0 ? -1 : debugMetadataAnnotation.m4012l()[label];
        String moduleName = xxa.f99633a.getModuleName(tq0Var);
        if (moduleName == null) {
            strM4009c = debugMetadataAnnotation.m4009c();
        } else {
            strM4009c = moduleName + '/' + debugMetadataAnnotation.m4009c();
        }
        return new StackTraceElement(strM4009c, debugMetadataAnnotation.m4013m(), debugMetadataAnnotation.m4010f(), i);
    }
}
