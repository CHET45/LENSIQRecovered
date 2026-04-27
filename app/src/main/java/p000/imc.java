package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.PendingIntentCompat;

/* JADX INFO: loaded from: classes.dex */
public class imc {

    /* JADX INFO: renamed from: a */
    public final Context f47497a;

    /* JADX INFO: renamed from: b */
    public final int f47498b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Intent f47499c;

    /* JADX INFO: renamed from: d */
    public final int f47500d;

    /* JADX INFO: renamed from: e */
    @hib
    public final Bundle f47501e;

    /* JADX INFO: renamed from: f */
    @hib
    public final PendingIntent f47502f;

    /* JADX INFO: renamed from: g */
    public final boolean f47503g;

    public imc(@efb Context context, int i, @efb Intent intent, int i2, boolean z) {
        this(context, i, intent, i2, null, z);
    }

    @hib
    private PendingIntent createPendingIntent() {
        Bundle bundle = this.f47501e;
        return bundle == null ? PendingIntentCompat.getActivity(this.f47497a, this.f47498b, this.f47499c, this.f47500d, this.f47503g) : PendingIntentCompat.getActivity(this.f47497a, this.f47498b, this.f47499c, this.f47500d, bundle, this.f47503g);
    }

    @efb
    public Context getContext() {
        return this.f47497a;
    }

    public int getFlags() {
        return this.f47500d;
    }

    @efb
    public Intent getIntent() {
        return this.f47499c;
    }

    @efb
    public Bundle getOptions() {
        return this.f47501e;
    }

    @hib
    public PendingIntent getPendingIntent() {
        return this.f47502f;
    }

    public int getRequestCode() {
        return this.f47498b;
    }

    public boolean isMutable() {
        return this.f47503g;
    }

    public imc(@efb Context context, int i, @efb Intent intent, int i2, @hib Bundle bundle, boolean z) {
        this.f47497a = context;
        this.f47498b = i;
        this.f47499c = intent;
        this.f47500d = i2;
        this.f47501e = bundle;
        this.f47503g = z;
        this.f47502f = createPendingIntent();
    }
}
