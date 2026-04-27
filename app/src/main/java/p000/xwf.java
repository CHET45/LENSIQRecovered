package p000;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class xwf extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    @efb
    public final Class<?> f99594a;

    /* JADX INFO: renamed from: b */
    @efb
    public final List<C15338a> f99595b;

    /* JADX INFO: renamed from: xwf$a */
    public static class C15338a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a */
        public final Object f99596a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f99597b = new AtomicInteger(0);

        public C15338a(Object obj) {
            this.f99596a = obj;
        }

        private boolean isEmojiSpan(Object obj) {
            return obj instanceof fz4;
        }

        /* JADX INFO: renamed from: a */
        public final void m25526a() {
            this.f99597b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f99596a).afterTextChanged(editable);
        }

        /* JADX INFO: renamed from: b */
        public final void m25527b() {
            this.f99597b.decrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f99596a).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f99597b.get() <= 0 || !isEmojiSpan(obj)) {
                ((SpanWatcher) this.f99596a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[PHI: r11
  0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
            /*
                r8 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r8.f99597b
                int r0 = r0.get()
                if (r0 <= 0) goto Lf
                boolean r0 = r8.isEmojiSpan(r10)
                if (r0 == 0) goto Lf
                return
            Lf:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L1e
                r0 = 0
                if (r11 <= r12) goto L19
                r11 = r0
            L19:
                if (r13 <= r14) goto L1e
                r4 = r11
                r6 = r0
                goto L20
            L1e:
                r4 = r11
                r6 = r13
            L20:
                java.lang.Object r11 = r8.f99596a
                r1 = r11
                android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
                r2 = r9
                r3 = r10
                r5 = r12
                r7 = r14
                r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.xwf.C15338a.onSpanChanged(android.text.Spannable, java.lang.Object, int, int, int, int):void");
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f99597b.get() <= 0 || !isEmojiSpan(obj)) {
                ((SpanWatcher) this.f99596a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f99596a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public xwf(@efb Class<?> cls) {
        this.f99595b = new ArrayList();
        z7d.checkNotNull(cls, "watcherClass cannot be null");
        this.f99594a = cls;
    }

    private void blockWatchers() {
        for (int i = 0; i < this.f99595b.size(); i++) {
            this.f99595b.get(i).m25526a();
        }
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public static xwf create(@efb Class<?> cls, @efb CharSequence charSequence) {
        return new xwf(cls, charSequence);
    }

    private void fireWatchers() {
        for (int i = 0; i < this.f99595b.size(); i++) {
            this.f99595b.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    private C15338a getWatcherFor(Object obj) {
        for (int i = 0; i < this.f99595b.size(); i++) {
            C15338a c15338a = this.f99595b.get(i);
            if (c15338a.f99596a == obj) {
                return c15338a;
            }
        }
        return null;
    }

    private boolean isWatcher(@hib Object obj) {
        return obj != null && isWatcher(obj.getClass());
    }

    private void unblockwatchers() {
        for (int i = 0; i < this.f99595b.size(); i++) {
            this.f99595b.get(i).m25527b();
        }
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public void beginBatchEdit() {
        blockWatchers();
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public void endBatchEdit() {
        unblockwatchers();
        fireWatchers();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@hib Object obj) {
        C15338a watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@hib Object obj) {
        C15338a watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@hib Object obj) {
        C15338a watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @igg({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, @efb Class<T> cls) {
        if (!isWatcher((Class<?>) cls)) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        C15338a[] c15338aArr = (C15338a[]) super.getSpans(i, i2, C15338a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c15338aArr.length));
        for (int i3 = 0; i3 < c15338aArr.length; i3++) {
            tArr[i3] = c15338aArr[i3].f99596a;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, @hib Class cls) {
        if (cls == null || isWatcher((Class<?>) cls)) {
            cls = C15338a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@hib Object obj) {
        C15338a watcherFor;
        if (isWatcher(obj)) {
            watcherFor = getWatcherFor(obj);
            if (watcherFor != null) {
                obj = watcherFor;
            }
        } else {
            watcherFor = null;
        }
        super.removeSpan(obj);
        if (watcherFor != null) {
            this.f99595b.remove(watcherFor);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@hib Object obj, int i, int i2, int i3) {
        if (isWatcher(obj)) {
            C15338a c15338a = new C15338a(obj);
            this.f99595b.add(c15338a);
            obj = c15338a;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @igg({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new xwf(this.f99594a, this, i, i2);
    }

    private boolean isWatcher(@efb Class<?> cls) {
        return this.f99594a == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @igg({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @igg({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @igg({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        blockWatchers();
        super.replace(i, i2, charSequence);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @igg({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public xwf(@efb Class<?> cls, @efb CharSequence charSequence) {
        super(charSequence);
        this.f99595b = new ArrayList();
        z7d.checkNotNull(cls, "watcherClass cannot be null");
        this.f99594a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @igg({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        blockWatchers();
        super.replace(i, i2, charSequence, i3, i4);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @efb
    public SpannableStringBuilder append(@igg({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @efb
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public xwf(@efb Class<?> cls, @efb CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f99595b = new ArrayList();
        z7d.checkNotNull(cls, "watcherClass cannot be null");
        this.f99594a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @efb
    public SpannableStringBuilder append(@igg({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @igg({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
