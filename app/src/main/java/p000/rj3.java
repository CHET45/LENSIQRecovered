package p000;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
@e0g(parameters = 0)
public final class rj3 {

    /* JADX INFO: renamed from: b */
    public static final int f78426b = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public Integer f78427a;

    @gib
    /* JADX INFO: renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m32154consumeZmokQxo(@yfb KeyEvent keyEvent) {
        int iM31588getUtf16CodePointZmokQxo = oq8.m31588getUtf16CodePointZmokQxo(keyEvent);
        if ((Integer.MIN_VALUE & iM31588getUtf16CodePointZmokQxo) != 0) {
            this.f78427a = Integer.valueOf(iM31588getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.f78427a;
        if (num == null) {
            return Integer.valueOf(iM31588getUtf16CodePointZmokQxo);
        }
        this.f78427a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iM31588getUtf16CodePointZmokQxo));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? Integer.valueOf(iM31588getUtf16CodePointZmokQxo) : num2;
    }
}
