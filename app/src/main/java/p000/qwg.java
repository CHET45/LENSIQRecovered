package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,97:1\n65#1:98\n77#1,4:99\n93#1,3:103\n65#1,16:106\n93#1,3:122\n65#1,16:125\n93#1,3:141\n*S KotlinDebug\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n35#1:98\n35#1:99,4\n35#1:103,3\n49#1:106,16\n49#1:122,3\n58#1:125,16\n58#1:141,3\n*E\n"})
public final class qwg {

    /* JADX INFO: renamed from: qwg$a */
    @dwf({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n*L\n1#1,97:1\n*E\n"})
    public static final class C11745a extends tt8 implements oz6<CharSequence, Integer, Integer, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public static final C11745a f76217a = new C11745a();

        public C11745a() {
            super(4);
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: qwg$b */
    @dwf({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n*E\n"})
    public static final class C11746b extends tt8 implements oz6<CharSequence, Integer, Integer, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public static final C11746b f76218a = new C11746b();

        public C11746b() {
            super(4);
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: qwg$c */
    @dwf({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n*L\n1#1,97:1\n*E\n"})
    public static final class C11747c extends tt8 implements qy6<Editable, bth> {

        /* JADX INFO: renamed from: a */
        public static final C11747c f76219a = new C11747c();

        public C11747c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Editable editable) {
            invoke2(editable);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Editable editable) {
        }
    }

    /* JADX INFO: renamed from: qwg$d */
    @dwf({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n*L\n1#1,97:1\n*E\n"})
    public static final class C11748d implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Editable, bth> f76220a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ oz6<CharSequence, Integer, Integer, Integer, bth> f76221b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ oz6<CharSequence, Integer, Integer, Integer, bth> f76222c;

        /* JADX WARN: Multi-variable type inference failed */
        public C11748d(qy6<? super Editable, bth> qy6Var, oz6<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, bth> oz6Var, oz6<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, bth> oz6Var2) {
            this.f76220a = qy6Var;
            this.f76221b = oz6Var;
            this.f76222c = oz6Var2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@gib Editable editable) {
            this.f76220a.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@gib CharSequence charSequence, int i, int i2, int i3) {
            this.f76221b.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@gib CharSequence charSequence, int i, int i2, int i3) {
            this.f76222c.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    /* JADX INFO: renamed from: qwg$e */
    @dwf({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n71#2:98\n77#3:99\n*E\n"})
    public static final class C11749e implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6 f76223a;

        public C11749e(qy6 qy6Var) {
            this.f76223a = qy6Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@gib Editable editable) {
            this.f76223a.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@gib CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@gib CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: qwg$f */
    @dwf({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n78#2:98\n77#3:99\n*E\n"})
    public static final class C11750f implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ oz6 f76224a;

        public C11750f(oz6 oz6Var) {
            this.f76224a = oz6Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@gib Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@gib CharSequence charSequence, int i, int i2, int i3) {
            this.f76224a.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@gib CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: qwg$g */
    @dwf({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n*L\n1#1,97:1\n78#2:98\n71#3:99\n*E\n"})
    public static final class C11751g implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ oz6 f76225a;

        public C11751g(oz6 oz6Var) {
            this.f76225a = oz6Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@gib Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@gib CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@gib CharSequence charSequence, int i, int i2, int i3) {
            this.f76225a.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    @yfb
    public static final TextWatcher addTextChangedListener(@yfb TextView textView, @yfb oz6<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, bth> oz6Var, @yfb oz6<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, bth> oz6Var2, @yfb qy6<? super Editable, bth> qy6Var) {
        C11748d c11748d = new C11748d(qy6Var, oz6Var, oz6Var2);
        textView.addTextChangedListener(c11748d);
        return c11748d;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, oz6 oz6Var, oz6 oz6Var2, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            oz6Var = C11745a.f76217a;
        }
        if ((i & 2) != 0) {
            oz6Var2 = C11746b.f76218a;
        }
        if ((i & 4) != 0) {
            qy6Var = C11747c.f76219a;
        }
        C11748d c11748d = new C11748d(qy6Var, oz6Var, oz6Var2);
        textView.addTextChangedListener(c11748d);
        return c11748d;
    }

    @yfb
    public static final TextWatcher doAfterTextChanged(@yfb TextView textView, @yfb qy6<? super Editable, bth> qy6Var) {
        C11749e c11749e = new C11749e(qy6Var);
        textView.addTextChangedListener(c11749e);
        return c11749e;
    }

    @yfb
    public static final TextWatcher doBeforeTextChanged(@yfb TextView textView, @yfb oz6<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, bth> oz6Var) {
        C11750f c11750f = new C11750f(oz6Var);
        textView.addTextChangedListener(c11750f);
        return c11750f;
    }

    @yfb
    public static final TextWatcher doOnTextChanged(@yfb TextView textView, @yfb oz6<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, bth> oz6Var) {
        C11751g c11751g = new C11751g(oz6Var);
        textView.addTextChangedListener(c11751g);
        return c11751g;
    }
}
