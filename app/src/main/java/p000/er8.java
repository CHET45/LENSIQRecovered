package p000;

import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
public class er8 {

    /* JADX INFO: renamed from: er8$a */
    public interface InterfaceC5445a {
        int get(int i);
    }

    /* JADX INFO: renamed from: er8$b */
    public interface InterfaceC5446b {
        int get(String str);
    }

    public static void main(String[] strArr) {
        parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static wmh parse(String str, InterfaceC5446b interfaceC5446b, InterfaceC5445a interfaceC5445a) {
        wmh wmhVar = new wmh();
        try {
            vk1 vk1Var = wk1.parse(str);
            int size = vk1Var.size();
            for (int i = 0; i < size; i++) {
                tk1 tk1Var = (tk1) vk1Var.get(i);
                String strContent = tk1Var.content();
                sk1 value = tk1Var.getValue();
                int i2 = interfaceC5446b.get(strContent);
                if (i2 == -1) {
                    System.err.println("unknown type " + strContent);
                } else {
                    int i3 = interfaceC5445a.get(i2);
                    if (i3 == 1) {
                        wmhVar.add(i2, vk1Var.getBoolean(i));
                    } else if (i3 == 2) {
                        wmhVar.add(i2, value.getInt());
                        System.out.println("parse " + strContent + " INT_MASK > " + value.getInt());
                    } else if (i3 == 4) {
                        wmhVar.add(i2, value.getFloat());
                        System.out.println("parse " + strContent + " FLOAT_MASK > " + value.getFloat());
                    } else if (i3 == 8) {
                        wmhVar.add(i2, value.content());
                        System.out.println("parse " + strContent + " STRING_MASK > " + value.content());
                    }
                }
            }
        } catch (xk1 e) {
            e.printStackTrace();
        }
        return wmhVar;
    }

    public static wmh parseAttributes(String str) {
        return parse(str, new InterfaceC5446b() { // from class: cr8
            @Override // p000.er8.InterfaceC5446b
            public final int get(String str2) {
                return ymh.InterfaceC15722a.getId(str2);
            }
        }, new InterfaceC5445a() { // from class: dr8
            @Override // p000.er8.InterfaceC5445a
            public final int get(int i) {
                return ymh.InterfaceC15722a.getType(i);
            }
        });
    }
}
