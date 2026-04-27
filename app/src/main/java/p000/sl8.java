package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({})
@ph5
@t0f
@nmg(allowedTargets = {EnumC12373rz.f80142d})
@Retention(RetentionPolicy.RUNTIME)
public @interface sl8 {

    /* JADX INFO: renamed from: sl8$a */
    public /* synthetic */ class C12647a implements sl8 {

        /* JADX INFO: renamed from: w0 */
        public final /* synthetic */ String[] f82176w0;

        public C12647a(@yfb String[] strArr) {
            md8.checkNotNullParameter(strArr, "names");
            this.f82176w0 = strArr;
        }

        @Override // p000.sl8
        public final /* synthetic */ String[] names() {
            return this.f82176w0;
        }
    }

    String[] names();
}
