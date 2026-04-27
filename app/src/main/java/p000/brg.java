package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class brg {

    /* JADX INFO: renamed from: c */
    public float f14623c;

    /* JADX INFO: renamed from: f */
    @hib
    public iqg f14626f;

    /* JADX INFO: renamed from: a */
    public final TextPaint f14621a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final kqg f14622b = new C2024a();

    /* JADX INFO: renamed from: d */
    public boolean f14624d = true;

    /* JADX INFO: renamed from: e */
    @hib
    public WeakReference<InterfaceC2025b> f14625e = new WeakReference<>(null);

    /* JADX INFO: renamed from: brg$a */
    public class C2024a extends kqg {
        public C2024a() {
        }

        @Override // p000.kqg
        public void onFontRetrievalFailed(int i) {
            brg.this.f14624d = true;
            InterfaceC2025b interfaceC2025b = (InterfaceC2025b) brg.this.f14625e.get();
            if (interfaceC2025b != null) {
                interfaceC2025b.onTextSizeChange();
            }
        }

        @Override // p000.kqg
        public void onFontRetrieved(@efb Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            brg.this.f14624d = true;
            InterfaceC2025b interfaceC2025b = (InterfaceC2025b) brg.this.f14625e.get();
            if (interfaceC2025b != null) {
                interfaceC2025b.onTextSizeChange();
            }
        }
    }

    /* JADX INFO: renamed from: brg$b */
    public interface InterfaceC2025b {
        @efb
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public brg(@hib InterfaceC2025b interfaceC2025b) {
        setDelegate(interfaceC2025b);
    }

    private float calculateTextWidth(@hib CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f14621a.measureText(charSequence, 0, charSequence.length());
    }

    @hib
    public iqg getTextAppearance() {
        return this.f14626f;
    }

    @efb
    public TextPaint getTextPaint() {
        return this.f14621a;
    }

    public float getTextWidth(String str) {
        if (!this.f14624d) {
            return this.f14623c;
        }
        float fCalculateTextWidth = calculateTextWidth(str);
        this.f14623c = fCalculateTextWidth;
        this.f14624d = false;
        return fCalculateTextWidth;
    }

    public boolean isTextWidthDirty() {
        return this.f14624d;
    }

    public void setDelegate(@hib InterfaceC2025b interfaceC2025b) {
        this.f14625e = new WeakReference<>(interfaceC2025b);
    }

    public void setTextAppearance(@hib iqg iqgVar, Context context) {
        if (this.f14626f != iqgVar) {
            this.f14626f = iqgVar;
            if (iqgVar != null) {
                iqgVar.updateMeasureState(context, this.f14621a, this.f14622b);
                InterfaceC2025b interfaceC2025b = this.f14625e.get();
                if (interfaceC2025b != null) {
                    this.f14621a.drawableState = interfaceC2025b.getState();
                }
                iqgVar.updateDrawState(context, this.f14621a, this.f14622b);
                this.f14624d = true;
            }
            InterfaceC2025b interfaceC2025b2 = this.f14625e.get();
            if (interfaceC2025b2 != null) {
                interfaceC2025b2.onTextSizeChange();
                interfaceC2025b2.onStateChange(interfaceC2025b2.getState());
            }
        }
    }

    public void setTextWidthDirty(boolean z) {
        this.f14624d = z;
    }

    public void updateTextPaintDrawState(Context context) {
        this.f14626f.updateDrawState(context, this.f14621a, this.f14622b);
    }
}
