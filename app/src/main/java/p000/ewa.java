package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@ph5
public final class ewa extends d1f {

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<String> f34308a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewa(@yfb List<String> list, @gib String str, @gib Throwable th) {
        super(str, th);
        md8.checkNotNullParameter(list, "missingFields");
        this.f34308a = list;
    }

    @yfb
    public final List<String> getMissingFields() {
        return this.f34308a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ewa(@yfb List<String> list, @yfb String str) {
        String str2;
        md8.checkNotNullParameter(list, "missingFields");
        md8.checkNotNullParameter(str, "serialName");
        if (list.size() == 1) {
            str2 = "Field '" + list.get(0) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(list, str2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ewa(@yfb String str, @yfb String str2) {
        this(k82.listOf(str), "Field '" + str + "' is required for type with serial name '" + str2 + "', but it was missing", null);
        md8.checkNotNullParameter(str, "missingField");
        md8.checkNotNullParameter(str2, "serialName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yjd
    public ewa(@yfb String str) {
        this(k82.listOf(str), "Field '" + str + "' is required, but it was missing", null);
        md8.checkNotNullParameter(str, "missingField");
    }
}
