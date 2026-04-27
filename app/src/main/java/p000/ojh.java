package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.mjh;
import p000.sd3;

/* JADX INFO: loaded from: classes.dex */
public class ojh {

    /* JADX INFO: renamed from: i */
    @igg({"ActionValue"})
    public static final String f67855i = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";

    /* JADX INFO: renamed from: j */
    @igg({"ActionValue"})
    public static final String f67856j = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";

    /* JADX INFO: renamed from: k */
    public static final String f67857k = "androidx.browser.trusted.extra.SHARE_TARGET";

    /* JADX INFO: renamed from: l */
    public static final String f67858l = "androidx.browser.trusted.extra.SHARE_DATA";

    /* JADX INFO: renamed from: m */
    public static final String f67859m = "androidx.browser.trusted.extra.DISPLAY_MODE";

    /* JADX INFO: renamed from: n */
    public static final String f67860n = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";

    /* JADX INFO: renamed from: a */
    @efb
    public final Uri f67861a;

    /* JADX INFO: renamed from: c */
    @hib
    public List<String> f67863c;

    /* JADX INFO: renamed from: d */
    @hib
    public Bundle f67864d;

    /* JADX INFO: renamed from: e */
    @hib
    public j9f f67865e;

    /* JADX INFO: renamed from: f */
    @hib
    public k9f f67866f;

    /* JADX INFO: renamed from: b */
    @efb
    public final sd3.C12523a f67862b = new sd3.C12523a();

    /* JADX INFO: renamed from: g */
    @efb
    public mjh f67867g = new mjh.C9373a();

    /* JADX INFO: renamed from: h */
    public int f67868h = 0;

    public ojh(@efb Uri uri) {
        this.f67861a = uri;
    }

    @efb
    public njh build(@efb vd3 vd3Var) {
        if (vd3Var == null) {
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        this.f67862b.setSession(vd3Var);
        Intent intent = this.f67862b.build().f81293a;
        intent.setData(this.f67861a);
        intent.putExtra(rjh.f78485a, true);
        if (this.f67863c != null) {
            intent.putExtra(f67856j, new ArrayList(this.f67863c));
        }
        Bundle bundle = this.f67864d;
        if (bundle != null) {
            intent.putExtra(f67855i, bundle);
        }
        List<Uri> listEmptyList = Collections.emptyList();
        k9f k9fVar = this.f67866f;
        if (k9fVar != null && this.f67865e != null) {
            intent.putExtra(f67857k, k9fVar.toBundle());
            intent.putExtra(f67858l, this.f67865e.toBundle());
            List<Uri> list = this.f67865e.f50047c;
            if (list != null) {
                listEmptyList = list;
            }
        }
        intent.putExtra(f67859m, this.f67867g.toBundle());
        intent.putExtra(f67860n, this.f67868h);
        return new njh(intent, listEmptyList);
    }

    @efb
    public sd3 buildCustomTabsIntent() {
        return this.f67862b.build();
    }

    @efb
    public mjh getDisplayMode() {
        return this.f67867g;
    }

    @efb
    public Uri getUri() {
        return this.f67861a;
    }

    @efb
    public ojh setAdditionalTrustedOrigins(@efb List<String> list) {
        this.f67863c = list;
        return this;
    }

    @efb
    public ojh setColorScheme(int i) {
        this.f67862b.setColorScheme(i);
        return this;
    }

    @efb
    public ojh setColorSchemeParams(int i, @efb pd3 pd3Var) {
        this.f67862b.setColorSchemeParams(i, pd3Var);
        return this;
    }

    @efb
    public ojh setDefaultColorSchemeParams(@efb pd3 pd3Var) {
        this.f67862b.setDefaultColorSchemeParams(pd3Var);
        return this;
    }

    @efb
    public ojh setDisplayMode(@efb mjh mjhVar) {
        this.f67867g = mjhVar;
        return this;
    }

    @efb
    public ojh setNavigationBarColor(@g92 int i) {
        this.f67862b.setNavigationBarColor(i);
        return this;
    }

    @efb
    public ojh setNavigationBarDividerColor(@g92 int i) {
        this.f67862b.setNavigationBarDividerColor(i);
        return this;
    }

    @efb
    public ojh setScreenOrientation(int i) {
        this.f67868h = i;
        return this;
    }

    @efb
    public ojh setShareParams(@efb k9f k9fVar, @efb j9f j9fVar) {
        this.f67866f = k9fVar;
        this.f67865e = j9fVar;
        return this;
    }

    @efb
    public ojh setSplashScreenParams(@efb Bundle bundle) {
        this.f67864d = bundle;
        return this;
    }

    @efb
    public ojh setToolbarColor(@g92 int i) {
        this.f67862b.setToolbarColor(i);
        return this;
    }
}
