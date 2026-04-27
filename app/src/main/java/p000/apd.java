package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@dwf({"SMAP\nRandomUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RandomUtil.kt\ncom/google/firebase/util/RandomUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1#2:43\n1557#3:44\n1628#3,3:45\n*S KotlinDebug\n*F\n+ 1 RandomUtil.kt\ncom/google/firebase/util/RandomUtilKt\n*L\n34#1:44\n34#1:45,3\n*E\n"})
public final class apd {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f11551a = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    @yfb
    public static final String nextAlphanumericString(@yfb tod todVar, int i) {
        md8.checkNotNullParameter(todVar, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("invalid length: " + i).toString());
        }
        f78 f78VarUntil = kpd.until(0, i);
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(f78VarUntil, 10));
        Iterator<Integer> it = f78VarUntil.iterator();
        while (it.hasNext()) {
            ((o68) it).nextInt();
            arrayList.add(Character.valueOf(t9g.random(f11551a, todVar)));
        }
        return v82.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
