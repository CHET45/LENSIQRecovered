package p000;

import android.credentials.PrepareGetCredentialResponse;
import android.os.Build;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(34)
@igg({"MissingGetterMatchingBuilder"})
public final class kad {

    /* JADX INFO: renamed from: a */
    @gib
    public final C8269b f53453a;

    /* JADX INFO: renamed from: b */
    @gib
    public final ny6<Boolean> f53454b;

    /* JADX INFO: renamed from: c */
    @gib
    public final ny6<Boolean> f53455c;

    /* JADX INFO: renamed from: d */
    @gib
    public final qy6<String, Boolean> f53456d;

    /* JADX INFO: renamed from: e */
    public final boolean f53457e;

    /* JADX INFO: renamed from: kad$a */
    @p7e({p7e.EnumC10826a.f69934a})
    public static final class C8268a {

        /* JADX INFO: renamed from: a */
        @gib
        public C8269b f53458a;

        /* JADX INFO: renamed from: b */
        @gib
        public ny6<Boolean> f53459b;

        /* JADX INFO: renamed from: c */
        @gib
        public ny6<Boolean> f53460c;

        /* JADX INFO: renamed from: d */
        @gib
        public qy6<? super String, Boolean> f53461d;

        /* JADX INFO: renamed from: e */
        @gib
        public PrepareGetCredentialResponse f53462e;

        /* JADX INFO: renamed from: kad$a$a */
        public /* synthetic */ class a extends n07 implements qy6<String, Boolean> {
            public a(Object obj) {
                super(1, obj, C8268a.class, "hasCredentialType", "hasCredentialType(Ljava/lang/String;)Z", 0);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb String str) {
                md8.checkNotNullParameter(str, "p0");
                return Boolean.valueOf(((C8268a) this.receiver).hasCredentialType(str));
            }
        }

        /* JADX INFO: renamed from: kad$a$b */
        public /* synthetic */ class b extends n07 implements ny6<Boolean> {
            public b(Object obj) {
                super(0, obj, C8268a.class, "hasAuthenticationResults", "hasAuthenticationResults()Z", 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                return Boolean.valueOf(((C8268a) this.receiver).hasAuthenticationResults());
            }
        }

        /* JADX INFO: renamed from: kad$a$c */
        public /* synthetic */ class c extends n07 implements ny6<Boolean> {
            public c(Object obj) {
                super(0, obj, C8268a.class, "hasRemoteResults", "hasRemoteResults()Z", 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                return Boolean.valueOf(((C8268a) this.receiver).hasRemoteResults());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @j5e("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
        public final boolean hasAuthenticationResults() {
            PrepareGetCredentialResponse prepareGetCredentialResponse = this.f53462e;
            md8.checkNotNull(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasAuthenticationResults();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @j5e("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
        public final boolean hasCredentialType(String str) {
            PrepareGetCredentialResponse prepareGetCredentialResponse = this.f53462e;
            md8.checkNotNull(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasCredentialResults(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @j5e("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
        public final boolean hasRemoteResults() {
            PrepareGetCredentialResponse prepareGetCredentialResponse = this.f53462e;
            md8.checkNotNull(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasRemoteResults();
        }

        @yfb
        public final kad build() {
            return new kad(this.f53458a, this.f53459b, this.f53460c, this.f53461d, false, null);
        }

        @yfb
        public final C8268a setFrameworkResponse(@gib PrepareGetCredentialResponse prepareGetCredentialResponse) {
            this.f53462e = prepareGetCredentialResponse;
            if (prepareGetCredentialResponse != null) {
                this.f53461d = new a(this);
                this.f53460c = new b(this);
                this.f53459b = new c(this);
            }
            return this;
        }

        @yfb
        public final C8268a setPendingGetCredentialHandle(@yfb C8269b c8269b) {
            md8.checkNotNullParameter(c8269b, "handle");
            this.f53458a = c8269b;
            return this;
        }
    }

    /* JADX INFO: renamed from: kad$b */
    @c5e(34)
    public static final class C8269b {

        /* JADX INFO: renamed from: a */
        @gib
        public final PrepareGetCredentialResponse.PendingGetCredentialHandle f53463a;

        public C8269b(@gib PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle) {
            this.f53463a = pendingGetCredentialHandle;
            if (Build.VERSION.SDK_INT >= 34) {
                md8.checkNotNull(pendingGetCredentialHandle);
            }
        }

        @gib
        @p7e({p7e.EnumC10826a.f69935b})
        public final PrepareGetCredentialResponse.PendingGetCredentialHandle getFrameworkHandle() {
            return this.f53463a;
        }
    }

    /* JADX INFO: renamed from: kad$c */
    @fdi
    public static final class C8270c {

        /* JADX INFO: renamed from: a */
        @gib
        public ny6<Boolean> f53464a;

        /* JADX INFO: renamed from: b */
        @gib
        public ny6<Boolean> f53465b;

        /* JADX INFO: renamed from: c */
        @gib
        public qy6<? super String, Boolean> f53466c;

        @yfb
        public final kad build() {
            return new kad(null, this.f53464a, this.f53465b, this.f53466c, true, null);
        }

        @yfb
        @fdi
        public final C8270c setCredentialTypeDelegate(@yfb qy6<? super String, Boolean> qy6Var) {
            md8.checkNotNullParameter(qy6Var, "handler");
            this.f53466c = qy6Var;
            return this;
        }

        @yfb
        @fdi
        public final C8270c setHasAuthResultsDelegate(@yfb ny6<Boolean> ny6Var) {
            md8.checkNotNullParameter(ny6Var, "handler");
            this.f53465b = ny6Var;
            return this;
        }

        @yfb
        @fdi
        public final C8270c setHasRemoteResultsDelegate(@yfb ny6<Boolean> ny6Var) {
            md8.checkNotNullParameter(ny6Var, "handler");
            this.f53464a = ny6Var;
            return this;
        }
    }

    public /* synthetic */ kad(C8269b c8269b, ny6 ny6Var, ny6 ny6Var2, qy6 qy6Var, boolean z, jt3 jt3Var) {
        this(c8269b, ny6Var, ny6Var2, qy6Var, z);
    }

    @gib
    public final qy6<String, Boolean> getCredentialTypeDelegate() {
        return this.f53456d;
    }

    @gib
    public final ny6<Boolean> getHasAuthResultsDelegate() {
        return this.f53455c;
    }

    @gib
    public final ny6<Boolean> getHasRemoteResultsDelegate() {
        return this.f53454b;
    }

    @gib
    public final C8269b getPendingGetCredentialHandle() {
        return this.f53453a;
    }

    @j5e("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public final boolean hasAuthenticationResults() {
        ny6<Boolean> ny6Var = this.f53455c;
        if (ny6Var != null) {
            return ny6Var.invoke().booleanValue();
        }
        return false;
    }

    @j5e("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public final boolean hasCredentialResults(@yfb String str) {
        md8.checkNotNullParameter(str, "credentialType");
        qy6<String, Boolean> qy6Var = this.f53456d;
        if (qy6Var != null) {
            return qy6Var.invoke(str).booleanValue();
        }
        return false;
    }

    @j5e("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public final boolean hasRemoteResults() {
        ny6<Boolean> ny6Var = this.f53454b;
        if (ny6Var != null) {
            return ny6Var.invoke().booleanValue();
        }
        return false;
    }

    public final boolean isNullHandlesForTest() {
        return this.f53457e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private kad(C8269b c8269b, ny6<Boolean> ny6Var, ny6<Boolean> ny6Var2, qy6<? super String, Boolean> qy6Var, boolean z) {
        this.f53453a = c8269b;
        this.f53454b = ny6Var;
        this.f53455c = ny6Var2;
        this.f53456d = qy6Var;
        this.f53457e = z;
        if (Build.VERSION.SDK_INT < 34 || z) {
            return;
        }
        md8.checkNotNull(c8269b);
    }
}
