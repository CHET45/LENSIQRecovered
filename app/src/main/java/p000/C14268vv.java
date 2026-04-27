package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;

/* JADX INFO: renamed from: vv */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
@e0g(parameters = 0)
@q64(message = "Duplicate cache")
public final class C14268vv {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C14268vv f92323a = new C14268vv();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final pp9<String, Typeface> f92324b = new pp9<>(16);

    /* JADX INFO: renamed from: c */
    public static final int f92325c = 8;

    private C14268vv() {
    }

    @gib
    public final String getKey(@yfb Context context, @yfb xn6 xn6Var) {
        if (!(xn6Var instanceof i6e)) {
            if (xn6Var instanceof AbstractC12286ru) {
                return ((AbstractC12286ru) xn6Var).getCacheKey();
            }
            throw new IllegalArgumentException("Unknown font type: " + xn6Var);
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(((i6e) xn6Var).getResId(), typedValue, true);
        StringBuilder sb = new StringBuilder();
        sb.append("res:");
        CharSequence charSequence = typedValue.string;
        String string = charSequence != null ? charSequence.toString() : null;
        md8.checkNotNull(string);
        sb.append(string);
        return sb.toString();
    }

    @yfb
    public final Typeface getOrCreate(@yfb Context context, @yfb xn6 xn6Var) {
        Typeface typefaceLoadBlocking;
        Typeface typeface;
        String key = getKey(context, xn6Var);
        if (key != null && (typeface = f92324b.get(key)) != null) {
            return typeface;
        }
        if (xn6Var instanceof i6e) {
            typefaceLoadBlocking = C14260vu.f92262a.create(context, ((i6e) xn6Var).getResId());
        } else {
            if (!(xn6Var instanceof AbstractC11083ps)) {
                throw new IllegalArgumentException("Unknown font type: " + xn6Var);
            }
            AbstractC11083ps abstractC11083ps = (AbstractC11083ps) xn6Var;
            typefaceLoadBlocking = abstractC11083ps.getTypefaceLoader().loadBlocking(context, abstractC11083ps);
        }
        if (typefaceLoadBlocking != null) {
            if (key != null) {
                f92324b.put(key, typefaceLoadBlocking);
            }
            return typefaceLoadBlocking;
        }
        throw new IllegalArgumentException("Unable to load font " + xn6Var);
    }
}
