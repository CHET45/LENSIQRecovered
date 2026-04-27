package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C1035c;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class hz4 {

    /* JADX INFO: renamed from: a */
    public final C7088b f45288a;

    /* JADX INFO: renamed from: hz4$a */
    @c5e(19)
    public static class C7087a extends C7088b {

        /* JADX INFO: renamed from: a */
        public final TextView f45289a;

        /* JADX INFO: renamed from: b */
        public final dz4 f45290b;

        /* JADX INFO: renamed from: c */
        public boolean f45291c = true;

        public C7087a(TextView textView) {
            this.f45289a = textView;
            this.f45290b = new dz4(textView);
        }

        @efb
        private InputFilter[] addEmojiInputFilterIfMissing(@efb InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f45290b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f45290b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> getEmojiInputFilterPositionArray(@efb InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof dz4) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        @efb
        private InputFilter[] removeEmojiInputFilterIfPresent(@efb InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> emojiInputFilterPositionArray = getEmojiInputFilterPositionArray(inputFilterArr);
            if (emojiInputFilterPositionArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - emojiInputFilterPositionArray.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (emojiInputFilterPositionArray.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        @hib
        private TransformationMethod unwrapForDisabled(@hib TransformationMethod transformationMethod) {
            return transformationMethod instanceof jz4 ? ((jz4) transformationMethod).getOriginalTransformationMethod() : transformationMethod;
        }

        private void updateFilters() {
            this.f45289a.setFilters(mo12669a(this.f45289a.getFilters()));
        }

        @efb
        private TransformationMethod wrapForEnabled(@hib TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof jz4) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new jz4(transformationMethod);
        }

        @Override // p000.hz4.C7088b
        @efb
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo12669a(@efb InputFilter[] inputFilterArr) {
            return !this.f45291c ? removeEmojiInputFilterIfPresent(inputFilterArr) : addEmojiInputFilterIfMissing(inputFilterArr);
        }

        @Override // p000.hz4.C7088b
        /* JADX INFO: renamed from: b */
        public void mo12670b(boolean z) {
            if (z) {
                mo12672d();
            }
        }

        @Override // p000.hz4.C7088b
        /* JADX INFO: renamed from: c */
        public void mo12671c(boolean z) {
            this.f45291c = z;
            mo12672d();
            updateFilters();
        }

        @Override // p000.hz4.C7088b
        /* JADX INFO: renamed from: d */
        public void mo12672d() {
            this.f45289a.setTransformationMethod(mo12673e(this.f45289a.getTransformationMethod()));
        }

        @Override // p000.hz4.C7088b
        @hib
        /* JADX INFO: renamed from: e */
        public TransformationMethod mo12673e(@hib TransformationMethod transformationMethod) {
            return this.f45291c ? wrapForEnabled(transformationMethod) : unwrapForDisabled(transformationMethod);
        }

        @p7e({p7e.EnumC10826a.f69934a})
        /* JADX INFO: renamed from: f */
        public void m12674f(boolean z) {
            this.f45291c = z;
        }

        @Override // p000.hz4.C7088b
        public boolean isEnabled() {
            return this.f45291c;
        }
    }

    /* JADX INFO: renamed from: hz4$b */
    public static class C7088b {
        @efb
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo12669a(@efb InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* JADX INFO: renamed from: b */
        public void mo12670b(boolean z) {
        }

        /* JADX INFO: renamed from: c */
        public void mo12671c(boolean z) {
        }

        /* JADX INFO: renamed from: d */
        public void mo12672d() {
        }

        @hib
        /* JADX INFO: renamed from: e */
        public TransformationMethod mo12673e(@hib TransformationMethod transformationMethod) {
            return transformationMethod;
        }

        public boolean isEnabled() {
            return false;
        }
    }

    /* JADX INFO: renamed from: hz4$c */
    @c5e(19)
    public static class C7089c extends C7088b {

        /* JADX INFO: renamed from: a */
        public final C7087a f45292a;

        public C7089c(TextView textView) {
            this.f45292a = new C7087a(textView);
        }

        private boolean skipBecauseEmojiCompatNotInitialized() {
            return !C1035c.isConfigured();
        }

        @Override // p000.hz4.C7088b
        @efb
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo12669a(@efb InputFilter[] inputFilterArr) {
            return skipBecauseEmojiCompatNotInitialized() ? inputFilterArr : this.f45292a.mo12669a(inputFilterArr);
        }

        @Override // p000.hz4.C7088b
        /* JADX INFO: renamed from: b */
        public void mo12670b(boolean z) {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return;
            }
            this.f45292a.mo12670b(z);
        }

        @Override // p000.hz4.C7088b
        /* JADX INFO: renamed from: c */
        public void mo12671c(boolean z) {
            if (skipBecauseEmojiCompatNotInitialized()) {
                this.f45292a.m12674f(z);
            } else {
                this.f45292a.mo12671c(z);
            }
        }

        @Override // p000.hz4.C7088b
        /* JADX INFO: renamed from: d */
        public void mo12672d() {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return;
            }
            this.f45292a.mo12672d();
        }

        @Override // p000.hz4.C7088b
        @hib
        /* JADX INFO: renamed from: e */
        public TransformationMethod mo12673e(@hib TransformationMethod transformationMethod) {
            return skipBecauseEmojiCompatNotInitialized() ? transformationMethod : this.f45292a.mo12673e(transformationMethod);
        }

        @Override // p000.hz4.C7088b
        public boolean isEnabled() {
            return this.f45292a.isEnabled();
        }
    }

    public hz4(@efb TextView textView) {
        this(textView, true);
    }

    @efb
    public InputFilter[] getFilters(@efb InputFilter[] inputFilterArr) {
        return this.f45288a.mo12669a(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.f45288a.isEnabled();
    }

    public void setAllCaps(boolean z) {
        this.f45288a.mo12670b(z);
    }

    public void setEnabled(boolean z) {
        this.f45288a.mo12671c(z);
    }

    public void updateTransformationMethod() {
        this.f45288a.mo12672d();
    }

    @hib
    public TransformationMethod wrapTransformationMethod(@hib TransformationMethod transformationMethod) {
        return this.f45288a.mo12673e(transformationMethod);
    }

    public hz4(@efb TextView textView, boolean z) {
        z7d.checkNotNull(textView, "textView cannot be null");
        if (z) {
            this.f45288a = new C7087a(textView);
        } else {
            this.f45288a = new C7089c(textView);
        }
    }
}
