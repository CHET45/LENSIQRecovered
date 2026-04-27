package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,589:1\n155#1,6:593\n43#2:590\n44#2:591\n22#3:592\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n138#1:593,6\n132#1:590\n133#1:591\n133#1:592\n*E\n"})
public final class xjc {

    /* JADX INFO: renamed from: a */
    @gib
    public ArrayList<qjc> f98235a;

    /* JADX INFO: renamed from: b */
    @yfb
    public float[] f98236b = new float[64];

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList pathStringToNodes$default(xjc xjcVar, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
        }
        return xjcVar.pathStringToNodes(str, arrayList);
    }

    private final void resizeNodeData(int i) {
        float[] fArr = this.f98236b;
        if (i >= fArr.length) {
            float[] fArr2 = new float[i * 2];
            this.f98236b = fArr2;
            u70.copyInto(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public static /* synthetic */ vic toPath$default(xjc xjcVar, vic vicVar, int i, Object obj) {
        if ((i & 1) != 0) {
            vicVar = C8522ku.Path();
        }
        return xjcVar.toPath(vicVar);
    }

    @yfb
    public final xjc addPathNodes(@yfb List<? extends qjc> list) {
        ArrayList<qjc> arrayList = this.f98235a;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f98235a = arrayList;
        }
        arrayList.addAll(list);
        return this;
    }

    public final void clear() {
        ArrayList<qjc> arrayList = this.f98235a;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @yfb
    public final xjc parsePathString(@yfb String str) {
        ArrayList<qjc> arrayList = this.f98235a;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f98235a = arrayList;
        } else {
            arrayList.clear();
        }
        pathStringToNodes(str, arrayList);
        return this;
    }

    @yfb
    public final ArrayList<qjc> pathStringToNodes(@yfb String str, @yfb ArrayList<qjc> arrayList) {
        int i;
        char cCharAt;
        int i2;
        int length = str.length();
        int i3 = 0;
        while (i3 < length && md8.compare((int) str.charAt(i3), 32) <= 0) {
            i3++;
        }
        while (length > i3 && md8.compare((int) str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i4 = 0;
        while (i3 < length) {
            while (true) {
                i = i3 + 1;
                cCharAt = str.charAt(i3);
                int i5 = cCharAt | ' ';
                if ((i5 - 97) * (i5 - 122) <= 0 && i5 != 101) {
                    break;
                }
                if (i >= length) {
                    cCharAt = 0;
                    break;
                }
                i3 = i;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i4 = 0;
                    while (true) {
                        if (i >= length || md8.compare((int) str.charAt(i), 32) > 0) {
                            long jNextFloat = lp5.nextFloat(str, i, length);
                            i2 = (int) (jNextFloat >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jNextFloat & 4294967295L));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.f98236b;
                                int i6 = i4 + 1;
                                fArr[i4] = fIntBitsToFloat;
                                if (i6 >= fArr.length) {
                                    float[] fArr2 = new float[i6 * 2];
                                    this.f98236b = fArr2;
                                    u70.copyInto(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i4 = i6;
                            }
                            while (i2 < length && str.charAt(i2) == ',') {
                                i2++;
                            }
                            if (i2 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i = i2;
                        } else {
                            i++;
                        }
                    }
                    i = i2;
                }
                sjc.addPathNodes(cCharAt, arrayList, this.f98236b, i4);
            }
            i3 = i;
        }
        return arrayList;
    }

    @yfb
    public final List<qjc> toNodes() {
        ArrayList<qjc> arrayList = this.f98235a;
        return arrayList != null ? arrayList : l82.emptyList();
    }

    @yfb
    public final vic toPath(@yfb vic vicVar) {
        vic path;
        ArrayList<qjc> arrayList = this.f98235a;
        return (arrayList == null || (path = yjc.toPath(arrayList, vicVar)) == null) ? C8522ku.Path() : path;
    }
}
