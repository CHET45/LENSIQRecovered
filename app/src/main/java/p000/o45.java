package p000;

import androidx.lifecycle.C1171x;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n13474#2,2:149\n13409#2,2:151\n13476#2:153\n13409#2,2:154\n13474#2,2:156\n13409#2,2:158\n13476#2:160\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n*L\n68#1:149,2\n71#1:151,2\n68#1:153\n88#1:154,2\n91#1:156,2\n94#1:158,2\n91#1:160\n*E\n"})
public final class o45 {
    @yfb
    @yjd
    public static final <T extends Enum<T>> lp8<T> createAnnotatedEnumSerializer(@yfb String str, @yfb T[] tArr, @yfb String[] strArr, @yfb Annotation[][] annotationArr, @gib Annotation[] annotationArr2) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(tArr, C1171x.f7958g);
        md8.checkNotNullParameter(strArr, "names");
        md8.checkNotNullParameter(annotationArr, "entryAnnotations");
        t35 t35Var = new t35(str, tArr.length);
        if (annotationArr2 != null) {
            for (Annotation annotation : annotationArr2) {
                t35Var.pushClassAnnotation(annotation);
            }
        }
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            int i3 = i2 + 1;
            String strName = (String) e80.getOrNull(strArr, i2);
            if (strName == null) {
                strName = t.name();
            }
            h1d.addElement$default(t35Var, strName, false, 2, null);
            Annotation[] annotationArr3 = (Annotation[]) e80.getOrNull(annotationArr, i2);
            if (annotationArr3 != null) {
                for (Annotation annotation2 : annotationArr3) {
                    t35Var.pushAnnotation(annotation2);
                }
            }
            i++;
            i2 = i3;
        }
        return new f45(str, tArr, t35Var);
    }

    @yfb
    @yjd
    public static final <T extends Enum<T>> lp8<T> createMarkedEnumSerializer(@yfb String str, @yfb T[] tArr, @yfb String[] strArr, @yfb Annotation[][] annotationArr) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(tArr, C1171x.f7958g);
        md8.checkNotNullParameter(strArr, "names");
        md8.checkNotNullParameter(annotationArr, "annotations");
        t35 t35Var = new t35(str, tArr.length);
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            int i3 = i2 + 1;
            String strName = (String) e80.getOrNull(strArr, i2);
            if (strName == null) {
                strName = t.name();
            }
            h1d.addElement$default(t35Var, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) e80.getOrNull(annotationArr, i2);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    t35Var.pushAnnotation(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        return new f45(str, tArr, t35Var);
    }

    @yfb
    @yjd
    public static final <T extends Enum<T>> lp8<T> createSimpleEnumSerializer(@yfb String str, @yfb T[] tArr) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(tArr, C1171x.f7958g);
        return new f45(str, tArr);
    }
}
