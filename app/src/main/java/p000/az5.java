package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public final class az5 {

    /* JADX INFO: renamed from: h */
    public static final String f12220h = "google_api_key";

    /* JADX INFO: renamed from: i */
    public static final String f12221i = "google_app_id";

    /* JADX INFO: renamed from: j */
    public static final String f12222j = "firebase_database_url";

    /* JADX INFO: renamed from: k */
    public static final String f12223k = "ga_trackingId";

    /* JADX INFO: renamed from: l */
    public static final String f12224l = "gcm_defaultSenderId";

    /* JADX INFO: renamed from: m */
    public static final String f12225m = "google_storage_bucket";

    /* JADX INFO: renamed from: n */
    public static final String f12226n = "project_id";

    /* JADX INFO: renamed from: a */
    public final String f12227a;

    /* JADX INFO: renamed from: b */
    public final String f12228b;

    /* JADX INFO: renamed from: c */
    public final String f12229c;

    /* JADX INFO: renamed from: d */
    public final String f12230d;

    /* JADX INFO: renamed from: e */
    public final String f12231e;

    /* JADX INFO: renamed from: f */
    public final String f12232f;

    /* JADX INFO: renamed from: g */
    public final String f12233g;

    /* JADX INFO: renamed from: az5$b */
    public static final class C1671b {

        /* JADX INFO: renamed from: a */
        public String f12234a;

        /* JADX INFO: renamed from: b */
        public String f12235b;

        /* JADX INFO: renamed from: c */
        public String f12236c;

        /* JADX INFO: renamed from: d */
        public String f12237d;

        /* JADX INFO: renamed from: e */
        public String f12238e;

        /* JADX INFO: renamed from: f */
        public String f12239f;

        /* JADX INFO: renamed from: g */
        public String f12240g;

        public C1671b() {
        }

        @efb
        public az5 build() {
            return new az5(this.f12235b, this.f12234a, this.f12236c, this.f12237d, this.f12238e, this.f12239f, this.f12240g);
        }

        @efb
        public C1671b setApiKey(@efb String str) {
            this.f12234a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        @efb
        public C1671b setApplicationId(@efb String str) {
            this.f12235b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        @efb
        public C1671b setDatabaseUrl(@hib String str) {
            this.f12236c = str;
            return this;
        }

        @efb
        @KeepForSdk
        public C1671b setGaTrackingId(@hib String str) {
            this.f12237d = str;
            return this;
        }

        @efb
        public C1671b setGcmSenderId(@hib String str) {
            this.f12238e = str;
            return this;
        }

        @efb
        public C1671b setProjectId(@hib String str) {
            this.f12240g = str;
            return this;
        }

        @efb
        public C1671b setStorageBucket(@hib String str) {
            this.f12239f = str;
            return this;
        }

        public C1671b(@efb az5 az5Var) {
            this.f12235b = az5Var.f12228b;
            this.f12234a = az5Var.f12227a;
            this.f12236c = az5Var.f12229c;
            this.f12237d = az5Var.f12230d;
            this.f12238e = az5Var.f12231e;
            this.f12239f = az5Var.f12232f;
            this.f12240g = az5Var.f12233g;
        }
    }

    @hib
    public static az5 fromResource(@efb Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString(f12221i);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new az5(string, stringResourceValueReader.getString(f12220h), stringResourceValueReader.getString(f12222j), stringResourceValueReader.getString(f12223k), stringResourceValueReader.getString(f12224l), stringResourceValueReader.getString(f12225m), stringResourceValueReader.getString(f12226n));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof az5)) {
            return false;
        }
        az5 az5Var = (az5) obj;
        return Objects.equal(this.f12228b, az5Var.f12228b) && Objects.equal(this.f12227a, az5Var.f12227a) && Objects.equal(this.f12229c, az5Var.f12229c) && Objects.equal(this.f12230d, az5Var.f12230d) && Objects.equal(this.f12231e, az5Var.f12231e) && Objects.equal(this.f12232f, az5Var.f12232f) && Objects.equal(this.f12233g, az5Var.f12233g);
    }

    @efb
    public String getApiKey() {
        return this.f12227a;
    }

    @efb
    public String getApplicationId() {
        return this.f12228b;
    }

    @hib
    public String getDatabaseUrl() {
        return this.f12229c;
    }

    @hib
    @KeepForSdk
    public String getGaTrackingId() {
        return this.f12230d;
    }

    @hib
    public String getGcmSenderId() {
        return this.f12231e;
    }

    @hib
    public String getProjectId() {
        return this.f12233g;
    }

    @hib
    public String getStorageBucket() {
        return this.f12232f;
    }

    public int hashCode() {
        return Objects.hashCode(this.f12228b, this.f12227a, this.f12229c, this.f12230d, this.f12231e, this.f12232f, this.f12233g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f12228b).add("apiKey", this.f12227a).add("databaseUrl", this.f12229c).add("gcmSenderId", this.f12231e).add("storageBucket", this.f12232f).add("projectId", this.f12233g).toString();
    }

    private az5(@efb String str, @efb String str2, @hib String str3, @hib String str4, @hib String str5, @hib String str6, @hib String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f12228b = str;
        this.f12227a = str2;
        this.f12229c = str3;
        this.f12230d = str4;
        this.f12231e = str5;
        this.f12232f = str6;
        this.f12233g = str7;
    }
}
