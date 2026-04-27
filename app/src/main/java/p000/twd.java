package p000;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n1797#2,3:398\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:398,3\n*E\n"})
public final class twd {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: twd$a */
    public static final class C13260a<T> implements qy6<T, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f86199a;

        public C13260a(int i) {
            this.f86199a = i;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.qy6
        public final Boolean invoke(Enum r3) {
            g36 g36Var = (g36) r3;
            return Boolean.valueOf((this.f86199a & g36Var.getMask()) == g36Var.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wv9 findNext(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new aw9(matcher, charSequence);
        }
        return null;
    }

    private static final /* synthetic */ <T extends Enum<T> & g36> Set<T> fromInt(int i) {
        md8.reifiedOperationMarker(4, "T");
        EnumSet enumSetAllOf = EnumSet.allOf(Enum.class);
        md8.checkNotNull(enumSetAllOf);
        md8.needClassReification();
        q82.retainAll(enumSetAllOf, new C13260a(i));
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        md8.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wv9 matchEntire(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new aw9(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f78 range(MatchResult matchResult) {
        return kpd.until(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toInt(Iterable<? extends g36> iterable) {
        Iterator<? extends g36> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f78 range(MatchResult matchResult, int i) {
        return kpd.until(matchResult.start(i), matchResult.end(i));
    }
}
