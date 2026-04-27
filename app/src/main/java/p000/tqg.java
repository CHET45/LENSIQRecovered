package p000;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class tqg {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f85623a;

    /* JADX INFO: renamed from: b */
    @hib
    public final LottieAnimationView f85624b;

    /* JADX INFO: renamed from: c */
    @hib
    public final go9 f85625c;

    /* JADX INFO: renamed from: d */
    public boolean f85626d;

    @fdi
    public tqg() {
        this.f85623a = new HashMap();
        this.f85626d = true;
        this.f85624b = null;
        this.f85625c = null;
    }

    private void invalidate() {
        LottieAnimationView lottieAnimationView = this.f85624b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        go9 go9Var = this.f85625c;
        if (go9Var != null) {
            go9Var.invalidateSelf();
        }
    }

    public String getText(String str, String str2) {
        return getText(str2);
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public final String getTextInternal(String str, String str2) {
        if (this.f85626d && this.f85623a.containsKey(str2)) {
            return this.f85623a.get(str2);
        }
        String text = getText(str, str2);
        if (this.f85626d) {
            this.f85623a.put(str2, text);
        }
        return text;
    }

    public void invalidateAllText() {
        this.f85623a.clear();
        invalidate();
    }

    public void invalidateText(String str) {
        this.f85623a.remove(str);
        invalidate();
    }

    public void setCacheText(boolean z) {
        this.f85626d = z;
    }

    public void setText(String str, String str2) {
        this.f85623a.put(str, str2);
        invalidate();
    }

    public String getText(String str) {
        return str;
    }

    public tqg(LottieAnimationView lottieAnimationView) {
        this.f85623a = new HashMap();
        this.f85626d = true;
        this.f85624b = lottieAnimationView;
        this.f85625c = null;
    }

    public tqg(go9 go9Var) {
        this.f85623a = new HashMap();
        this.f85626d = true;
        this.f85625c = go9Var;
        this.f85624b = null;
    }
}
