package p000;

import android.view.View;
import p000.zoi;

/* JADX INFO: loaded from: classes.dex */
@ia8
public interface zoi {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C16205a f105633a = C16205a.f105634a;

    /* JADX INFO: renamed from: zoi$a */
    public static final class C16205a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C16205a f105634a = new C16205a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final zoi f105635b = new zoi() { // from class: yoi
            @Override // p000.zoi
            public final wsd createRecomposer(View view) {
                return zoi.C16205a.LifecycleAware$lambda$0(view);
            }
        };

        private C16205a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wsd LifecycleAware$lambda$0(View view) {
            return bpi.createLifecycleAwareWindowRecomposer$default(view, null, null, 3, null);
        }

        public static /* synthetic */ void getLifecycleAware$annotations() {
        }

        @yfb
        public final zoi getLifecycleAware() {
            return f105635b;
        }
    }

    @yfb
    wsd createRecomposer(@yfb View view);
}
