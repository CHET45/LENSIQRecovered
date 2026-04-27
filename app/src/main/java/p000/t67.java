package p000;

import android.content.Context;
import android.opengl.GLES20;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import p000.y67;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class t67 {

    /* JADX INFO: renamed from: f */
    public static final int f83783f = 35815;

    /* JADX INFO: renamed from: a */
    public final int f83784a;

    /* JADX INFO: renamed from: b */
    public final C12922a[] f83785b;

    /* JADX INFO: renamed from: c */
    public final C12923b[] f83786c;

    /* JADX INFO: renamed from: d */
    public final Map<String, C12922a> f83787d;

    /* JADX INFO: renamed from: e */
    public final Map<String, C12923b> f83788e;

    /* JADX INFO: renamed from: t67$a */
    public static final class C12922a {

        /* JADX INFO: renamed from: a */
        public final String f83789a;

        /* JADX INFO: renamed from: b */
        public final int f83790b;

        /* JADX INFO: renamed from: c */
        public final int f83791c;

        /* JADX INFO: renamed from: d */
        @hib
        public Buffer f83792d;

        /* JADX INFO: renamed from: e */
        public int f83793e;

        private C12922a(String str, int i, int i2) {
            this.f83789a = str;
            this.f83790b = i;
            this.f83791c = i2;
        }

        public static C12922a create(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, t67.getCStringLength(bArr));
            return new C12922a(str, i2, t67.getAttributeLocation(i, str));
        }

        public void bind() throws y67.C15503b {
            Buffer buffer = (Buffer) u80.checkNotNull(this.f83792d, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.f83791c, this.f83793e, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.f83790b);
            y67.checkGlError();
        }

        public void setBuffer(float[] fArr, int i) {
            this.f83792d = y67.createBuffer(fArr);
            this.f83793e = i;
        }
    }

    /* JADX INFO: renamed from: t67$b */
    public static final class C12923b {

        /* JADX INFO: renamed from: a */
        public final String f83794a;

        /* JADX INFO: renamed from: b */
        public final int f83795b;

        /* JADX INFO: renamed from: c */
        public final int f83796c;

        /* JADX INFO: renamed from: d */
        public final float[] f83797d = new float[16];

        /* JADX INFO: renamed from: e */
        public int f83798e;

        /* JADX INFO: renamed from: f */
        public int f83799f;

        /* JADX INFO: renamed from: g */
        public int f83800g;

        private C12923b(String str, int i, int i2) {
            this.f83794a = str;
            this.f83795b = i;
            this.f83796c = i2;
        }

        public static C12923b create(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, t67.getCStringLength(bArr));
            return new C12923b(str, t67.getUniformLocation(i, str), iArr2[0]);
        }

        public void bind() throws y67.C15503b {
            switch (this.f83796c) {
                case 5124:
                    GLES20.glUniform1i(this.f83795b, this.f83798e);
                    return;
                case 5126:
                    GLES20.glUniform1fv(this.f83795b, 1, this.f83797d, 0);
                    y67.checkGlError();
                    return;
                case 35664:
                    GLES20.glUniform2fv(this.f83795b, 1, this.f83797d, 0);
                    y67.checkGlError();
                    return;
                case 35665:
                    GLES20.glUniform3fv(this.f83795b, 1, this.f83797d, 0);
                    y67.checkGlError();
                    return;
                case 35675:
                    GLES20.glUniformMatrix3fv(this.f83795b, 1, false, this.f83797d, 0);
                    y67.checkGlError();
                    return;
                case 35676:
                    GLES20.glUniformMatrix4fv(this.f83795b, 1, false, this.f83797d, 0);
                    y67.checkGlError();
                    return;
                case 35678:
                case 35815:
                case 36198:
                    if (this.f83799f == 0) {
                        throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                    }
                    GLES20.glActiveTexture(this.f83800g + 33984);
                    y67.checkGlError();
                    y67.bindTexture(this.f83796c == 35678 ? 3553 : 36197, this.f83799f);
                    GLES20.glUniform1i(this.f83795b, this.f83800g);
                    y67.checkGlError();
                    return;
                default:
                    throw new IllegalStateException("Unexpected uniform type: " + this.f83796c);
            }
        }

        public void setFloat(float f) {
            this.f83797d[0] = f;
        }

        public void setFloats(float[] fArr) {
            System.arraycopy(fArr, 0, this.f83797d, 0, fArr.length);
        }

        public void setInt(int i) {
            this.f83798e = i;
        }

        public void setSamplerTexId(int i, int i2) {
            this.f83799f = i;
            this.f83800g = i2;
        }
    }

    public t67(Context context, String str, String str2) throws IOException, y67.C15503b {
        this(loadAsset(context, str), loadAsset(context, str2));
    }

    private static void addShader(int i, int i2, String str) throws y67.C15503b {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        y67.checkGlException(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        y67.checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getAttributeLocation(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCStringLength(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    private static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return x0i.fromUtf8Bytes(x0i.toByteArray(inputStreamOpen));
        } finally {
            x0i.closeQuietly(inputStreamOpen);
        }
    }

    public void bindAttributesAndUniforms() throws y67.C15503b {
        for (C12922a c12922a : this.f83785b) {
            c12922a.bind();
        }
        for (C12923b c12923b : this.f83786c) {
            c12923b.bind();
        }
    }

    public void delete() throws y67.C15503b {
        GLES20.glDeleteProgram(this.f83784a);
        y67.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(String str) throws y67.C15503b {
        int attributeLocation = getAttributeLocation(str);
        GLES20.glEnableVertexAttribArray(attributeLocation);
        y67.checkGlError();
        return attributeLocation;
    }

    public void setBufferAttribute(String str, float[] fArr, int i) {
        ((C12922a) u80.checkNotNull(this.f83787d.get(str))).setBuffer(fArr, i);
    }

    public void setFloatUniform(String str, float f) {
        ((C12923b) u80.checkNotNull(this.f83788e.get(str))).setFloat(f);
    }

    public void setFloatsUniform(String str, float[] fArr) {
        ((C12923b) u80.checkNotNull(this.f83788e.get(str))).setFloats(fArr);
    }

    public void setIntUniform(String str, int i) {
        ((C12923b) u80.checkNotNull(this.f83788e.get(str))).setInt(i);
    }

    public void setSamplerTexIdUniform(String str, int i, int i2) {
        ((C12923b) u80.checkNotNull(this.f83788e.get(str))).setSamplerTexId(i, i2);
    }

    public void use() throws y67.C15503b {
        GLES20.glUseProgram(this.f83784a);
        y67.checkGlError();
    }

    public t67(String str, String str2) throws y67.C15503b {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f83784a = iGlCreateProgram;
        y67.checkGlError();
        addShader(iGlCreateProgram, 35633, str);
        addShader(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        y67.checkGlException(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f83787d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f83785b = new C12922a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            C12922a c12922aCreate = C12922a.create(this.f83784a, i);
            this.f83785b[i] = c12922aCreate;
            this.f83787d.put(c12922aCreate.f83789a, c12922aCreate);
        }
        this.f83788e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f83784a, 35718, iArr3, 0);
        this.f83786c = new C12923b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C12923b c12923bCreate = C12923b.create(this.f83784a, i2);
            this.f83786c[i2] = c12923bCreate;
            this.f83788e.put(c12923bCreate.f83794a, c12923bCreate);
        }
        y67.checkGlError();
    }

    private int getAttributeLocation(String str) {
        return getAttributeLocation(this.f83784a, str);
    }

    public int getUniformLocation(String str) {
        return getUniformLocation(this.f83784a, str);
    }
}
