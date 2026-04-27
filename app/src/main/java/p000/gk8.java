package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@j18
@ph5
@nmg(allowedTargets = {EnumC12373rz.f80139a})
@Retention(RetentionPolicy.RUNTIME)
public @interface gk8 {

    /* JADX INFO: renamed from: gk8$a */
    public /* synthetic */ class C6358a implements gk8 {

        /* JADX INFO: renamed from: w0 */
        public final /* synthetic */ String f40017w0;

        public C6358a(@yfb String str) {
            md8.checkNotNullParameter(str, "discriminator");
            this.f40017w0 = str;
        }

        @Override // p000.gk8
        public final /* synthetic */ String discriminator() {
            return this.f40017w0;
        }
    }

    String discriminator();
}
