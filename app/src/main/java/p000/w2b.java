package p000;

import java.util.ArrayList;
import java.util.List;
import p000.C9041lz;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n235#2,3:155\n33#2,4:158\n238#2,2:162\n38#2:164\n240#2:165\n151#2,3:166\n33#2,4:169\n154#2,2:173\n38#2:175\n156#2:176\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n*L\n142#1:155,3\n142#1:158,4\n142#1:162,2\n142#1:164\n142#1:165\n142#1:166,3\n142#1:169,4\n142#1:173,2\n142#1:175\n142#1:176\n*E\n"})
public final class w2b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C9041lz.c<ewc>> getLocalPlaceholders(List<C9041lz.c<ewc>> list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C9041lz.c<ewc> cVar = list.get(i3);
            C9041lz.c<ewc> cVar2 = cVar;
            if (C9611mz.intersect(i, i2, cVar2.getStart(), cVar2.getEnd())) {
                arrayList.add(cVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C9041lz.c cVar3 = (C9041lz.c) arrayList.get(i4);
            if (i > cVar3.getStart() || cVar3.getEnd() > i2) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new C9041lz.c(cVar3.getItem(), cVar3.getStart() - i, cVar3.getEnd() - i));
        }
        return arrayList2;
    }
}
