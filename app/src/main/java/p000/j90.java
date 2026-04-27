package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class j90 extends PasswordTransformationMethod {

    /* JADX INFO: renamed from: j90$a */
    public class C7812a implements CharSequence {

        /* JADX INFO: renamed from: a */
        public CharSequence f49946a;

        public C7812a(CharSequence source) {
            this.f49946a = source;
        }

        @Override // java.lang.CharSequence
        public char charAt(int index) {
            return (char) 8226;
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f49946a.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int start, int end) {
            return this.f49946a.subSequence(start, end);
        }
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence source, View view) {
        return new C7812a(source);
    }
}
